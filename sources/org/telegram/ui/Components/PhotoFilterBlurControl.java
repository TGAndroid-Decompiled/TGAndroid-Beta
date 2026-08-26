package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RectF;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import com.google.android.gms.internal.mlkit_language_id_common.zzjd;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Emoji$EmojiSpan$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline0;
import org.telegram.messenger.ImageReceiver$$ExternalSyntheticOutline1;
import org.telegram.messenger.audioinfo.mp3.ID3v1Genre$EnumUnboxingLocalUtility;
import org.telegram.ui.BubbleActivity;

public final class PhotoFilterBlurControl extends FrameLayout {
    public static final float BlurInsetProximity = AndroidUtilities.dp(20.0f);
    public static final float BlurViewCenterInset = AndroidUtilities.dp(30.0f);
    public static final float BlurViewRadiusInset = AndroidUtilities.dp(30.0f);
    public int activeControl;
    public final Size actualAreaSize;
    public float angle;
    public final Paint arcPaint;
    public final RectF arcRect;
    public PointF centerPoint;
    public boolean checkForMoving;
    public boolean checkForZooming;
    public PhotoFilterLinearBlurControlDelegate delegate;
    public float falloff;
    public final boolean inBubbleMode;
    public boolean isMoving;
    public boolean isZooming;
    public final Paint paint;
    public float pointerScale;
    public float pointerStartX;
    public float pointerStartY;
    public float size;
    public PointF startCenterPoint;
    public float startDistance;
    public float startPointerDistance;
    public float startRadius;
    public int type;

    public interface PhotoFilterLinearBlurControlDelegate {
    }

    public PhotoFilterBlurControl(Context context) {
        super(context);
        this.startCenterPoint = new PointF();
        this.actualAreaSize = new Size();
        this.centerPoint = new PointF(0.5f, 0.5f);
        this.falloff = 0.15f;
        this.size = 0.35f;
        this.arcRect = new RectF();
        this.pointerScale = 1.0f;
        this.checkForMoving = true;
        Paint paint = new Paint(1);
        this.paint = paint;
        Paint paint2 = new Paint(1);
        this.arcPaint = paint2;
        setWillNotDraw(false);
        paint.setColor(-1);
        paint2.setColor(-1);
        paint2.setStrokeWidth(AndroidUtilities.dp(2.0f));
        paint2.setStyle(Paint.Style.STROKE);
        this.inBubbleMode = context instanceof BubbleActivity;
    }

    private PointF getActualCenterPoint() {
        float width = getWidth();
        Size size = this.actualAreaSize;
        float f = size.width;
        float f2 = (this.centerPoint.x * f) + ((width - f) / 2.0f);
        int i = !this.inBubbleMode ? AndroidUtilities.statusBarHeight : 0;
        float height = getHeight();
        float f3 = size.height;
        float fM = ImageReceiver$$ExternalSyntheticOutline0.m(height, f3, 2.0f, i);
        float f4 = size.width;
        return new PointF(f2, (this.centerPoint.y * f4) + ImageReceiver$$ExternalSyntheticOutline1.m(f4, f3, 2.0f, fM));
    }

    private float getActualInnerRadius() {
        Size size = this.actualAreaSize;
        return Math.min(size.width, size.height) * this.falloff;
    }

    private float getActualOuterRadius() {
        Size size = this.actualAreaSize;
        return Math.min(size.width, size.height) * this.size;
    }

    public final void handlePan(int i, MotionEvent motionEvent) {
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        PointF actualCenterPoint = getActualCenterPoint();
        float f = x - actualCenterPoint.x;
        float f2 = y - actualCenterPoint.y;
        float fSqrt = (float) Math.sqrt((f2 * f2) + (f * f));
        Size size = this.actualAreaSize;
        float fMin = Math.min(size.width, size.height);
        float f3 = this.falloff * fMin;
        float f4 = this.size * fMin;
        float fAbs = (float) Math.abs((Math.sin(((double) ((this.angle * 3.1415927f) / 180.0f)) + 1.5707963267948966d) * ((double) f2)) + (Math.cos(((double) ((this.angle * 3.1415927f) / 180.0f)) + 1.5707963267948966d) * ((double) f)));
        if (i == 1) {
            this.pointerStartX = motionEvent.getX();
            this.pointerStartY = motionEvent.getY();
            boolean z = Math.abs(f4 - f3) < BlurInsetProximity;
            float f5 = BlurViewRadiusInset;
            float f6 = z ? 0.0f : f5;
            float f7 = z ? 0.0f : f5;
            int i2 = this.type;
            float f8 = BlurViewCenterInset;
            if (i2 != 0) {
                if (i2 == 1) {
                    if (fSqrt < f8) {
                        this.activeControl = 2;
                        this.startCenterPoint = actualCenterPoint;
                        return;
                    }
                    if (fSqrt > f3 - f5 && fSqrt < f6 + f3) {
                        this.activeControl = 3;
                        this.startDistance = fSqrt;
                        this.startRadius = f3;
                        return;
                    } else {
                        if (fSqrt <= f4 - f7 || fSqrt >= f5 + f4) {
                            return;
                        }
                        this.activeControl = 4;
                        this.startDistance = fSqrt;
                        this.startRadius = f4;
                        return;
                    }
                }
                return;
            }
            if (fSqrt < f8) {
                this.activeControl = 2;
                this.startCenterPoint = actualCenterPoint;
                return;
            }
            float f9 = f3 - f5;
            if (fAbs > f9 && fAbs < f6 + f3) {
                this.activeControl = 3;
                this.startDistance = fAbs;
                this.startRadius = f3;
                return;
            } else if (fAbs > f4 - f7 && fAbs < f4 + f5) {
                this.activeControl = 4;
                this.startDistance = fAbs;
                this.startRadius = f4;
                return;
            } else {
                if (fAbs <= f9 || fAbs >= f4 + f5) {
                    this.activeControl = 6;
                    return;
                }
                return;
            }
        }
        if (i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                this.activeControl = 1;
                return;
            }
            return;
        }
        int i3 = this.type;
        boolean z2 = this.inBubbleMode;
        if (i3 == 0) {
            int iOrdinal = ID3v1Genre$EnumUnboxingLocalUtility.ordinal(this.activeControl);
            if (iOrdinal == 1) {
                float f10 = x - this.pointerStartX;
                float f11 = y - this.pointerStartY;
                float width = (getWidth() - size.width) / 2.0f;
                int i4 = !z2 ? AndroidUtilities.statusBarHeight : 0;
                float height = getHeight();
                float f12 = size.height;
                float fM = ImageReceiver$$ExternalSyntheticOutline0.m(height, f12, 2.0f, i4);
                PointF pointF = new PointF(Math.max(width, Math.min(size.width + width, this.startCenterPoint.x + f10)), Math.max(fM, Math.min(f12 + fM, this.startCenterPoint.y + f11)));
                float f13 = pointF.x - width;
                float f14 = size.width;
                this.centerPoint = new PointF(f13 / f14, (((f14 - size.height) / 2.0f) + (pointF.y - fM)) / f14);
            } else if (iOrdinal == 2) {
                this.falloff = Math.min(Math.max(0.1f, (this.startRadius + (fAbs - this.startDistance)) / fMin), this.size - 0.02f);
            } else if (iOrdinal == 3) {
                this.size = Math.max(this.falloff + 0.02f, (this.startRadius + (fAbs - this.startDistance)) / fMin);
            } else if (iOrdinal == 5) {
                float f15 = x - this.pointerStartX;
                float f16 = y - this.pointerStartY;
                boolean z3 = x > actualCenterPoint.x;
                boolean z4 = y > actualCenterPoint.y;
                boolean z5 = Math.abs(f16) > Math.abs(f15);
                this.angle = (((((float) Math.sqrt((f16 * f16) + (f15 * f15))) * ((((z3 || z4 ? !z3 || z4 ? !(z3 && z4) ? !(!z5 ? f15 < 0.0f : f16 < 0.0f) : !(!z5 ? f15 < 0.0f : f16 > 0.0f) : !z5 ? f15 > 0.0f : f16 > 0.0f : !z5 ? f15 > 0.0f : f16 < 0.0f) ? 0 : 1) * 2) - 1)) / 3.1415927f) / 1.15f) + this.angle;
                this.pointerStartX = x;
                this.pointerStartY = y;
            }
        } else if (i3 == 1) {
            int iOrdinal2 = ID3v1Genre$EnumUnboxingLocalUtility.ordinal(this.activeControl);
            if (iOrdinal2 == 1) {
                float f17 = x - this.pointerStartX;
                float f18 = y - this.pointerStartY;
                float width2 = (getWidth() - size.width) / 2.0f;
                int i5 = !z2 ? AndroidUtilities.statusBarHeight : 0;
                float height2 = getHeight();
                float f19 = size.height;
                float fM2 = ImageReceiver$$ExternalSyntheticOutline0.m(height2, f19, 2.0f, i5);
                PointF pointF2 = new PointF(Math.max(width2, Math.min(size.width + width2, this.startCenterPoint.x + f17)), Math.max(fM2, Math.min(f19 + fM2, this.startCenterPoint.y + f18)));
                float f20 = pointF2.x - width2;
                float f21 = size.width;
                this.centerPoint = new PointF(f20 / f21, (((f21 - size.height) / 2.0f) + (pointF2.y - fM2)) / f21);
            } else if (iOrdinal2 == 2) {
                this.falloff = Math.min(Math.max(0.1f, (this.startRadius + (fSqrt - this.startDistance)) / fMin), this.size - 0.02f);
            } else if (iOrdinal2 == 3) {
                this.size = Math.max(this.falloff + 0.02f, (this.startRadius + (fSqrt - this.startDistance)) / fMin);
            }
        }
        invalidate();
        PhotoFilterLinearBlurControlDelegate photoFilterLinearBlurControlDelegate = this.delegate;
        if (photoFilterLinearBlurControlDelegate != null) {
            PointF pointF3 = this.centerPoint;
            float f22 = this.falloff;
            float f23 = this.size;
            float fM3 = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(this.angle, 3.1415927f, 180.0f, 1.5707964f);
            PhotoFilterView photoFilterView = ((PhotoFilterView$$ExternalSyntheticLambda0) photoFilterLinearBlurControlDelegate).f$0;
            photoFilterView.blurExcludeSize = f23;
            photoFilterView.blurExcludePoint = pointF3;
            photoFilterView.blurExcludeBlurSize = f22;
            photoFilterView.blurAngle = fM3;
            FilterGLThread filterGLThread = photoFilterView.eglThread;
            if (filterGLThread != null) {
                filterGLThread.requestRender(false, false, false);
            }
        }
    }

    public final void handlePinch(int i, MotionEvent motionEvent) {
        float fSqrt;
        float fSqrt2 = 0.0f;
        if (i == 1) {
            if (motionEvent.getPointerCount() != 2) {
                fSqrt = 0.0f;
            } else {
                float x = motionEvent.getX(0);
                float y = motionEvent.getY(0);
                float x2 = x - motionEvent.getX(1);
                float y2 = y - motionEvent.getY(1);
                fSqrt = (float) Math.sqrt((y2 * y2) + (x2 * x2));
            }
            this.startPointerDistance = fSqrt;
            this.pointerScale = 1.0f;
            this.activeControl = 5;
        } else if (i != 2) {
            if (i == 3 || i == 4 || i == 5) {
                this.activeControl = 1;
                return;
            }
            return;
        }
        if (motionEvent.getPointerCount() == 2) {
            float x3 = motionEvent.getX(0);
            float y3 = motionEvent.getY(0);
            float x4 = x3 - motionEvent.getX(1);
            float y4 = y3 - motionEvent.getY(1);
            fSqrt2 = (float) Math.sqrt((y4 * y4) + (x4 * x4));
        }
        float fM = zzjd.m(fSqrt2 - this.startPointerDistance, AndroidUtilities.density, 0.01f, this.pointerScale);
        this.pointerScale = fM;
        float fMax = Math.max(0.1f, this.falloff * fM);
        this.falloff = fMax;
        this.size = Math.max(fMax + 0.02f, this.size * this.pointerScale);
        this.pointerScale = 1.0f;
        this.startPointerDistance = fSqrt2;
        invalidate();
        PhotoFilterLinearBlurControlDelegate photoFilterLinearBlurControlDelegate = this.delegate;
        if (photoFilterLinearBlurControlDelegate != null) {
            PointF pointF = this.centerPoint;
            float f = this.falloff;
            float f2 = this.size;
            float fM2 = Emoji$EmojiSpan$$ExternalSyntheticOutline0.m(this.angle, 3.1415927f, 180.0f, 1.5707964f);
            PhotoFilterView photoFilterView = ((PhotoFilterView$$ExternalSyntheticLambda0) photoFilterLinearBlurControlDelegate).f$0;
            photoFilterView.blurExcludeSize = f2;
            photoFilterView.blurExcludePoint = pointF;
            photoFilterView.blurExcludeBlurSize = f;
            photoFilterView.blurAngle = fM2;
            FilterGLThread filterGLThread = photoFilterView.eglThread;
            if (filterGLThread != null) {
                filterGLThread.requestRender(false, false, false);
            }
        }
    }

    @Override
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Paint paint2;
        Canvas canvas2 = canvas;
        super.onDraw(canvas);
        PointF actualCenterPoint = getActualCenterPoint();
        float actualInnerRadius = getActualInnerRadius();
        float actualOuterRadius = getActualOuterRadius();
        canvas2.translate(actualCenterPoint.x, actualCenterPoint.y);
        int i = this.type;
        int i2 = 0;
        Paint paint3 = this.paint;
        if (i == 0) {
            canvas2.rotate(this.angle);
            float fDp = AndroidUtilities.dp(6.0f);
            float fDp2 = AndroidUtilities.dp(12.0f);
            float fDp3 = AndroidUtilities.dp(1.5f);
            for (int i3 = 0; i3 < 30; i3++) {
                float f = fDp2 + fDp;
                float f2 = i3 * f;
                float f3 = -actualInnerRadius;
                float f4 = f2 + fDp2;
                float f5 = fDp3 - actualInnerRadius;
                canvas2.drawRect(f2, f3, f4, f5, paint3);
                float f6 = ((-i3) * f) - fDp;
                float f7 = f6 - fDp2;
                canvas2 = canvas;
                canvas2.drawRect(f7, f3, f6, f5, paint3);
                float f8 = fDp3 + actualInnerRadius;
                canvas2.drawRect(f2, actualInnerRadius, f4, f8, paint3);
                canvas2.drawRect(f7, actualInnerRadius, f6, f8, paint3);
            }
            float fDp4 = AndroidUtilities.dp(6.0f);
            while (i2 < 64) {
                float f9 = fDp4 + fDp;
                float f10 = i2 * f9;
                float f11 = -actualOuterRadius;
                float f12 = fDp4 + f10;
                float f13 = fDp3 - actualOuterRadius;
                canvas.drawRect(f10, f11, f12, f13, paint3);
                float f14 = ((-i2) * f9) - fDp;
                float f15 = f14 - fDp4;
                canvas.drawRect(f15, f11, f14, f13, paint3);
                float f16 = fDp3 + actualOuterRadius;
                canvas.drawRect(f10, actualOuterRadius, f12, f16, paint3);
                canvas.drawRect(f15, actualOuterRadius, f14, f16, paint3);
                i2++;
            }
            paint = paint3;
        } else {
            paint = paint3;
            if (i == 1) {
                RectF rectF = this.arcRect;
                float f17 = -actualInnerRadius;
                rectF.set(f17, f17, actualInnerRadius, actualInnerRadius);
                int i4 = 0;
                while (true) {
                    paint2 = this.arcPaint;
                    if (i4 >= 22) {
                        break;
                    }
                    canvas.drawArc(rectF, 16.35f * i4, 10.2f, false, paint2);
                    i4++;
                }
                float f18 = -actualOuterRadius;
                rectF.set(f18, f18, actualOuterRadius, actualOuterRadius);
                while (i2 < 64) {
                    canvas.drawArc(rectF, 5.62f * i2, 3.6f, false, paint2);
                    i2++;
                }
            }
        }
        canvas.drawCircle(0.0f, 0.0f, AndroidUtilities.dp(8.0f), paint);
    }

    @Override
    public final boolean onTouchEvent(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.PhotoFilterBlurControl.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setDelegate(PhotoFilterLinearBlurControlDelegate photoFilterLinearBlurControlDelegate) {
        this.delegate = photoFilterLinearBlurControlDelegate;
    }

    public void setType(int i) {
        this.type = i;
        invalidate();
    }
}
