package org.telegram.ui.Components.Crop;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.SystemClock;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.core.graphics.ColorUtils;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.audioinfo.mp3.ID3v1Genre$EnumUnboxingLocalUtility;
import org.telegram.ui.BubbleActivity;
import org.telegram.ui.Charts.BaseChartView;

public final class CropAreaView extends ViewGroup {
    public int activeControl;
    public final RectF actualRect;
    public AnimatorSet animator;
    public final Paint bitmapPaint;
    public final RectF bottomEdge;
    public final RectF bottomLeftCorner;
    public float bottomPadding;
    public final RectF bottomRightCorner;
    public Bitmap circleBitmap;
    public final Paint dimPaint;
    public boolean dimVisibile;
    public final Paint eraserPaint;
    public float frameAlpha;
    public final Paint framePaint;
    public boolean frameVisible;
    public boolean freeform;
    public ObjectAnimator gridAnimator;
    public float gridProgress;
    public int gridType;
    public final Paint handlePaint;
    public final boolean inBubbleMode;
    public final AccelerateDecelerateInterpolator interpolator;
    public boolean isDragging;
    public long lastUpdateTime;
    public float left;
    public final RectF leftEdge;
    public final Paint linePaint;
    public AreaViewListener listener;
    public float lockAspectRatio;
    public float minWidth;
    public float overrideDimAlpha;
    public float overrideFrameAlpha;
    public int previousGridType;
    public int previousX;
    public int previousY;
    public final RectF rightEdge;
    public float rotate;
    public float scale;
    public final Paint shadowPaint;
    public final float sidePadding;
    public int size;
    public String subtitle;
    public StaticLayout subtitleLayout;
    public TextPaint subtitlePaint;
    public final RectF targetRect;
    public final RectF tempRect;
    public float top;
    public final RectF topEdge;
    public final RectF topLeftCorner;
    public float topPadding;
    public final RectF topRightCorner;
    public float tx;
    public float ty;

    public interface AreaViewListener {
    }

    public CropAreaView(Context context) {
        super(context);
        this.topLeftCorner = new RectF();
        this.topRightCorner = new RectF();
        this.bottomLeftCorner = new RectF();
        this.bottomRightCorner = new RectF();
        this.topEdge = new RectF();
        this.leftEdge = new RectF();
        this.bottomEdge = new RectF();
        this.rightEdge = new RectF();
        this.actualRect = new RectF();
        this.tempRect = new RectF();
        this.overrideDimAlpha = -1.0f;
        this.frameAlpha = 1.0f;
        this.overrideFrameAlpha = -1.0f;
        this.interpolator = new AccelerateDecelerateInterpolator();
        this.freeform = true;
        this.targetRect = new RectF();
        this.rotate = 0.0f;
        this.scale = 1.0f;
        this.tx = 0.0f;
        this.ty = 0.0f;
        this.inBubbleMode = context instanceof BubbleActivity;
        this.frameVisible = true;
        this.dimVisibile = true;
        this.sidePadding = AndroidUtilities.dp(16.0f);
        this.minWidth = AndroidUtilities.dp(32.0f);
        this.gridType = 1;
        Paint paint = new Paint();
        this.dimPaint = paint;
        paint.setColor(2130706432);
        Paint paint2 = new Paint();
        this.shadowPaint = paint2;
        Paint.Style style = Paint.Style.FILL;
        paint2.setStyle(style);
        paint2.setColor(436207616);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        Paint paint3 = new Paint();
        this.linePaint = paint3;
        paint3.setStyle(style);
        paint3.setColor(-1);
        paint3.setStrokeWidth(AndroidUtilities.dp(1.0f));
        Paint paint4 = new Paint();
        this.handlePaint = paint4;
        paint4.setStyle(style);
        paint4.setColor(-1);
        Paint paint5 = new Paint();
        this.framePaint = paint5;
        paint5.setStyle(style);
        paint5.setColor(-1291845633);
        Paint paint6 = new Paint(1);
        this.eraserPaint = paint6;
        paint6.setColor(0);
        paint6.setStyle(style);
        paint6.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint7 = new Paint(2);
        this.bitmapPaint = paint7;
        paint7.setColor(-1);
        setWillNotDraw(false);
    }

    public static void constrainRectByHeight(RectF rectF, float f) {
        float fHeight = rectF.height();
        rectF.right = rectF.left + (f * fHeight);
        rectF.bottom = rectF.top + fHeight;
    }

    public static void constrainRectByWidth(RectF rectF, float f) {
        float fWidth = rectF.width();
        rectF.right = rectF.left + fWidth;
        rectF.bottom = rectF.top + (fWidth / f);
    }

    private float getGridProgress() {
        return this.gridProgress;
    }

    private void setCropBottom(float f) {
        this.actualRect.bottom = f;
        invalidate();
    }

    private void setCropLeft(float f) {
        this.actualRect.left = f;
        invalidate();
    }

    private void setCropRight(float f) {
        this.actualRect.right = f;
        invalidate();
    }

    private void setCropTop(float f) {
        this.actualRect.top = f;
        invalidate();
    }

    private void setGridProgress(float f) {
        this.gridProgress = f;
        invalidate();
    }

    public final void calculateRect(RectF rectF, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6 = !this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0;
        float measuredHeight = ((getMeasuredHeight() - this.bottomPadding) - this.topPadding) - f6;
        float measuredWidth = getMeasuredWidth() / measuredHeight;
        float fMin = Math.min(getMeasuredWidth(), measuredHeight);
        float f7 = this.sidePadding * 2.0f;
        float f8 = fMin - f7;
        float measuredWidth2 = getMeasuredWidth() - f7;
        float f9 = measuredHeight - f7;
        float measuredWidth3 = getMeasuredWidth() / 2.0f;
        float f10 = (measuredHeight / 2.0f) + f6 + this.topPadding;
        if (Math.abs(1.0f - f) < 1.0E-4d) {
            float f11 = f8 / 2.0f;
            f5 = measuredWidth3 - f11;
            f4 = f10 - f11;
            f2 = measuredWidth3 + f11;
            f3 = f10 + f11;
        } else if (f - measuredWidth <= 1.0E-4d) {
            float f12 = f9 * f;
            if (f12 > measuredWidth2) {
                float f13 = measuredWidth2 / 2.0f;
                float f14 = measuredWidth3 - f13;
                float f15 = (measuredWidth2 / f) / 2.0f;
                float f16 = f10 - f15;
                f2 = measuredWidth3 + f13;
                f3 = f10 + f15;
                f4 = f16;
                f5 = f14;
            } else {
                float f17 = f12 / 2.0f;
                f5 = measuredWidth3 - f17;
                float f18 = f9 / 2.0f;
                float f19 = f10 - f18;
                f2 = measuredWidth3 + f17;
                f3 = f10 + f18;
                f4 = f19;
            }
        } else {
            float f110 = measuredWidth2 / 2.0f;
            float f111 = measuredWidth3 - f110;
            float f112 = (measuredWidth2 / f) / 2.0f;
            float f113 = f10 - f112;
            f2 = measuredWidth3 + f110;
            f3 = f10 + f112;
            f4 = f113;
            f5 = f111;
        }
        rectF.set(f5, f4, f2, f3);
    }

    public float getAspectRatio() {
        RectF rectF = this.actualRect;
        return (rectF.right - rectF.left) / (rectF.bottom - rectF.top);
    }

    public float getCropBottom() {
        return this.actualRect.bottom;
    }

    public float getCropCenterX() {
        RectF rectF = this.actualRect;
        return (rectF.left + rectF.right) / 2.0f;
    }

    public float getCropCenterY() {
        RectF rectF = this.actualRect;
        return (rectF.top + rectF.bottom) / 2.0f;
    }

    public float getCropHeight() {
        RectF rectF = this.actualRect;
        return rectF.bottom - rectF.top;
    }

    public float getCropLeft() {
        return this.actualRect.left;
    }

    public float getCropRight() {
        return this.actualRect.right;
    }

    public float getCropTop() {
        return this.actualRect.top;
    }

    public float getCropWidth() {
        RectF rectF = this.actualRect;
        return rectF.right - rectF.left;
    }

    public Interpolator getInterpolator() {
        return this.interpolator;
    }

    public float getLockAspectRatio() {
        return this.lockAspectRatio;
    }

    public RectF getTargetRectToFill() {
        float aspectRatio = getAspectRatio();
        RectF rectF = this.targetRect;
        calculateRect(rectF, aspectRatio);
        return rectF;
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int i;
        float f;
        float f2;
        int i2;
        boolean z = this.freeform;
        Paint paint = this.dimPaint;
        if (z) {
            int iDp = AndroidUtilities.dp(2.0f / this.scale);
            int iDp2 = AndroidUtilities.dp(16.0f / this.scale);
            int iDp3 = AndroidUtilities.dp(3.0f / this.scale);
            RectF rectF = this.actualRect;
            float f3 = rectF.left;
            int i3 = ((int) f3) - iDp;
            float f4 = rectF.top;
            int i4 = ((int) f4) - iDp;
            int i5 = iDp * 2;
            int i6 = ((int) (rectF.right - f3)) + i5;
            int i7 = i5 + ((int) (rectF.bottom - f4));
            canvas.save();
            canvas.translate(this.tx, this.ty);
            float f5 = this.scale;
            float f6 = (i6 / 2) + i3;
            float f7 = (i7 / 2) + i4;
            canvas.scale(f5, f5, f6, f7);
            canvas.rotate(this.rotate, f6, f7);
            if (this.dimVisibile) {
                int i8 = (-getWidth()) * 4;
                int i9 = (-getHeight()) * 4;
                int width = getWidth() * 4;
                f2 = 255.0f;
                int height = getHeight() * 4;
                f = 0.0f;
                float f8 = this.overrideDimAlpha;
                if (f8 >= 0.0f) {
                    paint.setAlpha((int) (f8 * 255.0f));
                } else {
                    paint.setAlpha((int) (255.0f - (this.frameAlpha * 127.0f)));
                }
                float f9 = i8;
                float f10 = width;
                i = i3;
                canvas.drawRect(f9, i9, f10, 0.0f, paint);
                canvas.drawRect(f9, 0.0f, 0.0f, getHeight(), paint);
                canvas.drawRect(getWidth(), 0.0f, f10, getHeight(), paint);
                canvas.drawRect(f9, getHeight(), f10, height, paint);
                float f11 = i4 + iDp;
                canvas.drawRect(0.0f, 0.0f, getWidth(), f11, paint);
                float f12 = (i4 + i7) - iDp;
                canvas.drawRect(0.0f, f11, i + iDp, f12, paint);
                canvas.drawRect((i + i6) - iDp, f11, getWidth(), f12, paint);
                canvas.drawRect(0.0f, f12, getWidth(), getHeight(), paint);
            } else {
                i = i3;
                f = 0.0f;
                f2 = 255.0f;
            }
            if (!this.frameVisible) {
                return;
            }
            int i10 = iDp3 - iDp;
            int i11 = iDp3 * 2;
            int i12 = i6 - i11;
            int i13 = i7 - i11;
            int i14 = this.gridType;
            if (i14 == 1 && this.gridProgress > f) {
                i14 = this.previousGridType;
            }
            float f13 = this.overrideFrameAlpha;
            Paint paint2 = this.framePaint;
            Paint paint3 = this.linePaint;
            Paint paint4 = this.shadowPaint;
            Paint paint5 = this.handlePaint;
            if (f13 >= f) {
                paint4.setAlpha((int) (this.gridProgress * 26.0f * f13));
                paint3.setAlpha((int) (this.gridProgress * 178.0f * this.overrideFrameAlpha));
                paint2.setAlpha((int) (this.overrideFrameAlpha * 178.0f));
                paint5.setAlpha((int) (this.overrideFrameAlpha * f2));
            } else {
                paint4.setAlpha((int) (this.gridProgress * 26.0f * this.frameAlpha));
                paint3.setAlpha((int) (this.gridProgress * 178.0f * this.frameAlpha));
                paint2.setAlpha((int) (this.frameAlpha * 178.0f));
                paint5.setAlpha((int) (this.frameAlpha * f2));
            }
            int i15 = i + i10;
            float f14 = i15;
            int i16 = i4 + i10;
            float f15 = i16;
            int i17 = i + i6;
            int i18 = i17 - i10;
            float f16 = i18;
            float f17 = i16 + iDp;
            int i19 = i14;
            canvas.drawRect(f14, f15, f16, f17, paint2);
            int i20 = i7 + i4;
            int i21 = i20 - i10;
            float f18 = i21;
            canvas.drawRect(f14, f15, i15 + iDp, f18, paint2);
            canvas.drawRect(f14, i21 - iDp, f16, f18, paint2);
            canvas.drawRect(i18 - iDp, f15, f16, f18, paint2);
            int i22 = 0;
            while (true) {
                int i23 = 3;
                if (i22 >= 3) {
                    break;
                }
                int i24 = 2;
                if (i19 == 2) {
                    int i25 = 1;
                    while (i25 < 4) {
                        if (i22 == i24 && i25 == i23) {
                            i2 = i25;
                        } else {
                            int i26 = i + iDp3;
                            int i27 = i12 / 3;
                            float f19 = (i27 * i22) + ((i27 / 3) * i25) + i26;
                            int i28 = i4 + iDp3;
                            int i29 = i25;
                            float f20 = i28;
                            float f21 = i28 + i13;
                            i2 = i29;
                            canvas.drawLine(f19, f20, f19, f21, paint4);
                            canvas.drawLine(f19, f20, f19, f21, paint3);
                            int i30 = i13 / 3;
                            float f22 = i26;
                            float f23 = (i30 * i22) + ((i30 / 3) * i2) + i28;
                            float f24 = i26 + i12;
                            canvas.drawLine(f22, f23, f24, f23, paint4);
                            canvas.drawLine(f22, f23, f24, f23, paint3);
                        }
                        i25 = i2 + 1;
                        i24 = 2;
                        i23 = 3;
                    }
                } else if (i19 == 3 && i22 > 0) {
                    int i31 = i + iDp3;
                    float f25 = ((i12 / 3) * i22) + i31;
                    int i32 = i4 + iDp3;
                    float f26 = i32;
                    float f27 = i32 + i13;
                    canvas.drawLine(f25, f26, f25, f27, paint4);
                    canvas.drawLine(f25, f26, f25, f27, paint3);
                    float f28 = i31;
                    float f29 = ((i13 / 3) * i22) + i32;
                    float f30 = i31 + i12;
                    canvas.drawLine(f28, f29, f30, f29, paint4);
                    canvas.drawLine(f28, f29, f30, f29, paint3);
                }
                i22++;
            }
            float f31 = i;
            float f32 = i4;
            float f33 = i + iDp2;
            float f34 = i4 + iDp3;
            canvas.drawRect(f31, f32, f33, f34, paint5);
            float f35 = i + iDp3;
            float f36 = i4 + iDp2;
            canvas.drawRect(f31, f32, f35, f36, paint5);
            float f37 = i17 - iDp2;
            float f38 = i17;
            canvas.drawRect(f37, f32, f38, f34, paint5);
            float f39 = i17 - iDp3;
            canvas.drawRect(f39, f32, f38, f36, paint5);
            float f40 = i20 - iDp3;
            float f41 = i20;
            canvas.drawRect(f31, f40, f33, f41, paint5);
            float f42 = i20 - iDp2;
            canvas.drawRect(f31, f42, f35, f41, paint5);
            canvas.drawRect(f37, f40, f38, f41, paint5);
            canvas.drawRect(f39, f42, f38, f41, paint5);
            canvas.restore();
        } else {
            float measuredWidth = getMeasuredWidth();
            float f43 = this.sidePadding;
            float f44 = f43 * 2.0f;
            float f45 = measuredWidth - f44;
            float measuredHeight = getMeasuredHeight() - this.bottomPadding;
            boolean z2 = this.inBubbleMode;
            float f46 = ((measuredHeight - (!z2 ? AndroidUtilities.statusBarHeight : 0)) - this.topPadding) - f44;
            this.size = (int) Math.min(f45, f46);
            Bitmap bitmap = this.circleBitmap;
            if (bitmap == null || bitmap.getWidth() != this.size) {
                Bitmap bitmap2 = this.circleBitmap;
                boolean z3 = bitmap2 != null;
                if (bitmap2 != null) {
                    bitmap2.recycle();
                    this.circleBitmap = null;
                }
                try {
                    int i33 = this.size;
                    this.circleBitmap = Bitmap.createBitmap(i33, i33, Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(this.circleBitmap);
                    float f47 = this.size;
                    try {
                        canvas2.drawRect(0.0f, 0.0f, f47, f47, paint);
                        paint = paint;
                        int i34 = this.size;
                        canvas2.drawCircle(i34 / 2, i34 / 2, i34 / 2, this.eraserPaint);
                        canvas2.setBitmap(null);
                        if (!z3) {
                            this.frameAlpha = 0.0f;
                            this.lastUpdateTime = SystemClock.elapsedRealtime();
                        }
                    } catch (Throwable unused) {
                        paint = paint;
                    }
                } catch (Throwable unused2) {
                }
            }
            if (this.circleBitmap != null) {
                Paint paint6 = this.bitmapPaint;
                paint6.setAlpha((int) (this.frameAlpha * 255.0f));
                paint.setAlpha((int) (this.frameAlpha * 127.0f));
                float f48 = this.size;
                float fM = ImageReceiver$$ExternalSyntheticOutline0.m(f45, f48, 2.0f, f43);
                this.left = fM;
                float fM2 = ImageReceiver$$ExternalSyntheticOutline0.m(f46, f48, 2.0f, f43) + (!z2 ? AndroidUtilities.statusBarHeight : 0);
                this.top = fM2;
                float f49 = fM2 + f48;
                canvas.drawRect(0.0f, 0.0f, getWidth(), (int) this.top, paint);
                float f50 = (int) f49;
                canvas.drawRect(0.0f, (int) this.top, (int) this.left, f50, paint);
                canvas.drawRect((int) (fM + f48), (int) this.top, getWidth(), f50, paint);
                canvas.drawRect(0.0f, f50, getWidth(), getHeight(), paint);
                canvas.drawBitmap(this.circleBitmap, (int) this.left, (int) this.top, paint6);
                if (getMeasuredHeight() > getMeasuredWidth() && this.subtitleLayout != null) {
                    canvas.save();
                    canvas.translate(getMeasuredWidth() / 2.0f, f49 + AndroidUtilities.dp(16.0f));
                    this.subtitleLayout.draw(canvas);
                    canvas.restore();
                }
            }
        }
        if (this.frameAlpha < 1.0f) {
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            long j = jElapsedRealtime - this.lastUpdateTime;
            if (j > 17) {
                j = 17;
            }
            this.lastUpdateTime = jElapsedRealtime;
            float f51 = (j / 180.0f) + this.frameAlpha;
            this.frameAlpha = f51;
            if (f51 > 1.0f) {
                this.frameAlpha = 1.0f;
            }
            invalidate();
        }
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        if (this.isDragging) {
            return false;
        }
        return super.onInterceptTouchEvent(motionEvent);
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        updateSubtitle();
    }

    @Override
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int x = (int) (motionEvent.getX() - ((ViewGroup) getParent()).getX());
        int y = (int) (motionEvent.getY() - ((ViewGroup) getParent()).getY());
        float f = !this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0) {
            if (actionMasked == 1 || actionMasked == 3) {
                this.isDragging = false;
                updateStatusShow(false);
                if (this.activeControl != 1) {
                    this.activeControl = 1;
                    AreaViewListener areaViewListener = this.listener;
                    if (areaViewListener != null) {
                        CropView cropView = (CropView) areaViewListener;
                        CropAreaView cropAreaView = cropView.areaView;
                        cropAreaView.setGridType(1, true);
                        cropView.fillAreaView(cropAreaView.getTargetRectToFill());
                    }
                }
                return false;
            }
            if (actionMasked == 2 && this.activeControl != 1) {
                RectF rectF = this.tempRect;
                rectF.set(this.actualRect);
                float f2 = x - this.previousX;
                float f3 = y - this.previousY;
                this.previousX = x;
                this.previousY = y;
                boolean z = Math.abs(f2) > Math.abs(f3);
                switch (ID3v1Genre$EnumUnboxingLocalUtility.ordinal(this.activeControl)) {
                    case 1:
                        rectF.left += f2;
                        rectF.top += f3;
                        if (this.lockAspectRatio > 0.0f) {
                            float fWidth = rectF.width();
                            float fHeight = rectF.height();
                            if (z) {
                                constrainRectByWidth(rectF, this.lockAspectRatio);
                            } else {
                                constrainRectByHeight(rectF, this.lockAspectRatio);
                            }
                            rectF.left -= rectF.width() - fWidth;
                            rectF.top -= rectF.width() - fHeight;
                        }
                        break;
                    case 2:
                        rectF.right += f2;
                        rectF.top += f3;
                        if (this.lockAspectRatio > 0.0f) {
                            float fHeight2 = rectF.height();
                            if (z) {
                                constrainRectByWidth(rectF, this.lockAspectRatio);
                            } else {
                                constrainRectByHeight(rectF, this.lockAspectRatio);
                            }
                            rectF.top -= rectF.width() - fHeight2;
                        }
                        break;
                    case 3:
                        rectF.left += f2;
                        rectF.bottom += f3;
                        if (this.lockAspectRatio > 0.0f) {
                            float fWidth2 = rectF.width();
                            if (z) {
                                constrainRectByWidth(rectF, this.lockAspectRatio);
                            } else {
                                constrainRectByHeight(rectF, this.lockAspectRatio);
                            }
                            rectF.left -= rectF.width() - fWidth2;
                        }
                        break;
                    case 4:
                        rectF.right += f2;
                        rectF.bottom += f3;
                        float f4 = this.lockAspectRatio;
                        if (f4 > 0.0f) {
                            if (!z) {
                                float fHeight3 = rectF.height();
                                rectF.right = rectF.left + (f4 * fHeight3);
                                rectF.bottom = rectF.top + fHeight3;
                            } else {
                                float fWidth3 = rectF.width();
                                rectF.right = rectF.left + fWidth3;
                                rectF.bottom = rectF.top + (fWidth3 / f4);
                            }
                        }
                        break;
                    case 5:
                        rectF.top += f3;
                        float f5 = this.lockAspectRatio;
                        if (f5 > 0.0f) {
                            float fHeight4 = rectF.height();
                            rectF.right = rectF.left + (f5 * fHeight4);
                            rectF.bottom = rectF.top + fHeight4;
                        }
                        break;
                    case 6:
                        rectF.left += f2;
                        float f6 = this.lockAspectRatio;
                        if (f6 > 0.0f) {
                            float fWidth4 = rectF.width();
                            rectF.right = rectF.left + fWidth4;
                            rectF.bottom = rectF.top + (fWidth4 / f6);
                        }
                        break;
                    case 7:
                        rectF.bottom += f3;
                        float f7 = this.lockAspectRatio;
                        if (f7 > 0.0f) {
                            float fHeight5 = rectF.height();
                            rectF.right = rectF.left + (f7 * fHeight5);
                            rectF.bottom = rectF.top + fHeight5;
                        }
                        break;
                    case 8:
                        rectF.right += f2;
                        float f8 = this.lockAspectRatio;
                        if (f8 > 0.0f) {
                            float fWidth5 = rectF.width();
                            rectF.right = rectF.left + fWidth5;
                            rectF.bottom = rectF.top + (fWidth5 / f8);
                        }
                        break;
                }
                float f9 = rectF.left;
                float f10 = this.sidePadding;
                if (f9 < f10) {
                    float f11 = this.lockAspectRatio;
                    if (f11 > 0.0f) {
                        rectF.bottom = ImageReceiver$$ExternalSyntheticOutline0.m(rectF.right, f10, f11, rectF.top);
                    }
                    rectF.left = f10;
                } else if (rectF.right > getWidth() - f10) {
                    rectF.right = getWidth() - f10;
                    if (this.lockAspectRatio > 0.0f) {
                        rectF.bottom = (rectF.width() / this.lockAspectRatio) + rectF.top;
                    }
                }
                float f12 = f + this.topPadding + f10;
                float f13 = this.bottomPadding + f10;
                if (rectF.top < f12) {
                    float f14 = this.lockAspectRatio;
                    if (f14 > 0.0f) {
                        rectF.right = DiffUtil.m(rectF.bottom, f12, f14, rectF.left);
                    }
                    rectF.top = f12;
                } else if (rectF.bottom > getHeight() - f13) {
                    rectF.bottom = getHeight() - f13;
                    if (this.lockAspectRatio > 0.0f) {
                        rectF.right = (rectF.height() * this.lockAspectRatio) + rectF.left;
                    }
                }
                float fWidth6 = rectF.width();
                float f15 = this.minWidth;
                if (fWidth6 < f15) {
                    rectF.right = rectF.left + f15;
                }
                float fHeight6 = rectF.height();
                float f16 = this.minWidth;
                if (fHeight6 < f16) {
                    rectF.bottom = rectF.top + f16;
                }
                float f17 = this.lockAspectRatio;
                if (f17 > 0.0f) {
                    if (f17 < 1.0f) {
                        float fWidth7 = rectF.width();
                        float f18 = this.minWidth;
                        if (fWidth7 <= f18) {
                            rectF.right = rectF.left + f18;
                            rectF.bottom = (rectF.width() / this.lockAspectRatio) + rectF.top;
                        }
                    } else {
                        float fHeight7 = rectF.height();
                        float f19 = this.minWidth;
                        if (fHeight7 <= f19) {
                            rectF.bottom = rectF.top + f19;
                            rectF.right = (rectF.height() * this.lockAspectRatio) + rectF.left;
                        }
                    }
                }
                setActualRect(rectF);
                AreaViewListener areaViewListener2 = this.listener;
                if (areaViewListener2 != null) {
                    CropView cropView2 = (CropView) areaViewListener2;
                    CropAreaView cropAreaView2 = cropView2.areaView;
                    cropAreaView2.setGridType(3, false);
                    RectF rectF2 = cropView2.previousAreaRect;
                    float fCenterX = rectF2.centerX() - cropAreaView2.getCropCenterX();
                    float fCenterY = rectF2.centerY() - cropAreaView2.getCropCenterY();
                    CropView.CropState cropState = cropView2.state;
                    if (cropState != null) {
                        CropView.CropState.access$600(cropState, fCenterX, fCenterY);
                    }
                    cropView2.updateMatrix(false);
                    rectF2.set(cropAreaView2.actualRect);
                    cropView2.fitContentInBounds(true, false, false, false);
                    return true;
                }
            }
            return false;
        }
        if (!this.freeform) {
            this.activeControl = 1;
            return false;
        }
        float f20 = x;
        float f21 = y;
        if (this.topLeftCorner.contains(f20, f21)) {
            this.activeControl = 2;
        } else if (this.topRightCorner.contains(f20, f21)) {
            this.activeControl = 3;
        } else if (this.bottomLeftCorner.contains(f20, f21)) {
            this.activeControl = 4;
        } else if (this.bottomRightCorner.contains(f20, f21)) {
            this.activeControl = 5;
        } else if (this.leftEdge.contains(f20, f21)) {
            this.activeControl = 7;
        } else if (this.topEdge.contains(f20, f21)) {
            this.activeControl = 6;
        } else if (this.rightEdge.contains(f20, f21)) {
            this.activeControl = 9;
        } else {
            if (!this.bottomEdge.contains(f20, f21)) {
                this.activeControl = 1;
                return false;
            }
            this.activeControl = 8;
        }
        this.previousX = x;
        this.previousY = y;
        setGridType(3, false);
        this.isDragging = true;
        updateStatusShow(true);
        AreaViewListener areaViewListener3 = this.listener;
        if (areaViewListener3 != null) {
            CropView cropView3 = (CropView) areaViewListener3;
            cropView3.previousAreaRect.set(cropView3.areaView.actualRect);
            cropView3.rotationStartScale = 0.0f;
            CropView.CropViewListener cropViewListener = cropView3.listener;
            if (cropViewListener != null) {
                cropViewListener.onChange(false);
                return true;
            }
        }
        return true;
    }

    public void setActualRect(float f) {
        calculateRect(this.actualRect, f);
        updateTouchAreas();
        invalidate();
    }

    public final void setBitmap(int i, int i2, boolean z, boolean z2) {
        this.freeform = z2;
        float f = z ? i2 / i : i / i2;
        if (!z2) {
            f = 1.0f;
            this.lockAspectRatio = 1.0f;
        }
        setActualRect(f);
    }

    public void setBottomPadding(float f) {
        this.bottomPadding = f;
    }

    public void setDimAlpha(float f) {
        this.overrideDimAlpha = f;
    }

    public void setDimVisibility(boolean z) {
        this.dimVisibile = z;
    }

    public void setFrameAlpha(float f) {
        this.overrideFrameAlpha = f;
    }

    public void setFreeform(boolean z) {
        this.freeform = z;
    }

    public final void setGridType(int i, boolean z) {
        ObjectAnimator objectAnimator = this.gridAnimator;
        if (objectAnimator != null && (!z || this.gridType != i)) {
            objectAnimator.cancel();
            this.gridAnimator = null;
        }
        int i2 = this.gridType;
        if (i2 == i) {
            return;
        }
        this.previousGridType = i2;
        this.gridType = i;
        float f = i == 1 ? 0.0f : 1.0f;
        if (!z) {
            this.gridProgress = f;
            invalidate();
            return;
        }
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, "gridProgress", this.gridProgress, f);
        this.gridAnimator = objectAnimatorOfFloat;
        objectAnimatorOfFloat.setDuration(200L);
        this.gridAnimator.addListener(new BaseChartView.AnonymousClass4(this, 4));
        if (i == 1) {
            this.gridAnimator.setStartDelay(200L);
        }
        this.gridAnimator.start();
    }

    public void setIsVideo(boolean z) {
        this.minWidth = AndroidUtilities.dp(z ? 64.0f : 32.0f);
    }

    public void setListener(AreaViewListener areaViewListener) {
        this.listener = areaViewListener;
    }

    public void setLockedAspectRatio(float f) {
        this.lockAspectRatio = f;
    }

    public void setSubtitle(String str) {
        this.subtitle = str;
        if (getMeasuredWidth() > 0) {
            updateSubtitle();
        }
    }

    public void setTopPadding(float f) {
        this.topPadding = f;
    }

    public final void updateStatusShow(boolean z) {
        try {
            View decorView = ((Activity) getContext()).getWindow().getDecorView();
            int systemUiVisibility = decorView.getSystemUiVisibility();
            decorView.setSystemUiVisibility(z ? systemUiVisibility | 4 : systemUiVisibility & (-5));
        } catch (Exception unused) {
        }
    }

    public final void updateSubtitle() {
        if (this.subtitle == null) {
            this.subtitleLayout = null;
            return;
        }
        if (this.subtitlePaint == null) {
            TextPaint textPaint = new TextPaint();
            this.subtitlePaint = textPaint;
            textPaint.setColor(ColorUtils.setAlphaComponent(-1, 120));
            this.subtitlePaint.setTextSize(AndroidUtilities.dp(13.0f));
            this.subtitlePaint.setTextAlign(Paint.Align.CENTER);
        }
        this.subtitleLayout = new StaticLayout(this.subtitle, this.subtitlePaint, getMeasuredWidth() - AndroidUtilities.dp(120.0f), Layout.Alignment.ALIGN_NORMAL, 1.0f, 0.0f, false);
    }

    public final void updateTouchAreas() {
        int iDp = AndroidUtilities.dp(16.0f);
        RectF rectF = this.topLeftCorner;
        RectF rectF2 = this.actualRect;
        float f = rectF2.left;
        float f2 = iDp;
        float f3 = rectF2.top;
        rectF.set(f - f2, f3 - f2, f + f2, f3 + f2);
        RectF rectF3 = this.topRightCorner;
        float f4 = rectF2.right;
        float f5 = rectF2.top;
        rectF3.set(f4 - f2, f5 - f2, f4 + f2, f5 + f2);
        RectF rectF4 = this.bottomLeftCorner;
        float f6 = rectF2.left;
        float f7 = rectF2.bottom;
        rectF4.set(f6 - f2, f7 - f2, f6 + f2, f7 + f2);
        RectF rectF5 = this.bottomRightCorner;
        float f8 = rectF2.right;
        float f9 = rectF2.bottom;
        rectF5.set(f8 - f2, f9 - f2, f8 + f2, f9 + f2);
        RectF rectF6 = this.topEdge;
        float f10 = rectF2.left + f2;
        float f11 = rectF2.top;
        rectF6.set(f10, f11 - f2, rectF2.right - f2, f11 + f2);
        RectF rectF7 = this.leftEdge;
        float f12 = rectF2.left;
        rectF7.set(f12 - f2, rectF2.top + f2, f12 + f2, rectF2.bottom - f2);
        RectF rectF8 = this.rightEdge;
        float f13 = rectF2.right;
        rectF8.set(f13 - f2, rectF2.top + f2, f13 + f2, rectF2.bottom - f2);
        RectF rectF9 = this.bottomEdge;
        float f14 = rectF2.left + f2;
        float f15 = rectF2.bottom;
        rectF9.set(f14, f15 - f2, rectF2.right - f2, f15 + f2);
    }

    public void setActualRect(RectF rectF) {
        this.actualRect.set(rectF);
        updateTouchAreas();
        invalidate();
    }
}
