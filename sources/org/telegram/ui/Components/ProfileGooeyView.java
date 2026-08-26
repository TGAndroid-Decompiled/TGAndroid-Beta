package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RecordingCanvas;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.os.Build;
import android.view.View;
import android.widget.FrameLayout;
import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import androidx.core.math.MathUtils;
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public final class ProfileGooeyView extends FrameLayout {
    public final Paint blackPaint;
    public float blurIntensity;
    public boolean enabled;
    public final Impl impl;
    public float intensity;
    public NotchInfoUtils.NotchInfo notchInfo;
    public final Path path;
    public float pullProgress;

    public final class CPUImpl implements Impl {
        public Bitmap bitmap;
        public Canvas bitmapCanvas;
        public int bitmapOrigH;
        public int bitmapOrigW;
        public final Paint bitmapPaint;
        public final Paint bitmapPaint2;
        public int optimizedH;
        public int optimizedW;

        public CPUImpl() {
            Paint paint = new Paint();
            this.bitmapPaint = paint;
            Paint paint2 = new Paint();
            this.bitmapPaint2 = paint2;
            paint.setFlags(7);
            paint.setFilterBitmap(true);
            paint2.setFlags(7);
            paint2.setFilterBitmap(true);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            paint.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60.0f, -7500.0f}));
        }

        @Override
        public final void draw(ProfileGooeyView$$ExternalSyntheticLambda0 profileGooeyView$$ExternalSyntheticLambda0, Canvas canvas) {
            int i;
            Bitmap bitmap = this.bitmap;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            ProfileGooeyView profileGooeyView = ProfileGooeyView.this;
            int iClamp = (int) ((1.0f - ((MathUtils.clamp(profileGooeyView.blurIntensity, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (profileGooeyView.getWidth() - this.optimizedW) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            ProfileGooeyView profileGooeyView2 = (ProfileGooeyView) profileGooeyView$$ExternalSyntheticLambda0.f$0;
            if (iClamp != 255) {
                this.bitmap.eraseColor(0);
                this.bitmapCanvas.save();
                this.bitmapCanvas.scale(this.bitmap.getWidth() / this.bitmapOrigW, this.bitmap.getHeight() / this.bitmapOrigH);
                float f = -width;
                this.bitmapCanvas.translate(f, 0.0f);
                profileGooeyView2.lambda$draw$0(this.bitmapCanvas);
                this.bitmapCanvas.restore();
                this.bitmapCanvas.save();
                this.bitmapCanvas.scale(this.bitmap.getWidth() / this.bitmapOrigW, this.bitmap.getHeight() / this.bitmapOrigH);
                NotchInfoUtils.NotchInfo notchInfo = profileGooeyView.notchInfo;
                Paint paint = profileGooeyView.blackPaint;
                if (notchInfo != null) {
                    this.bitmapCanvas.save();
                    this.bitmapCanvas.translate(f, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo2 = profileGooeyView.notchInfo;
                    if (notchInfo2.isLikelyCircle) {
                        float fMin = Math.min(notchInfo2.bounds.width(), profileGooeyView.notchInfo.bounds.height()) / 2.0f;
                        Canvas canvas2 = this.bitmapCanvas;
                        float fCenterX = profileGooeyView.notchInfo.bounds.centerX();
                        RectF rectF = profileGooeyView.notchInfo.bounds;
                        canvas2.drawCircle(fCenterX, rectF.bottom - (rectF.width() / 2.0f), fMin, paint);
                    } else if (notchInfo2.isAccurate) {
                        this.bitmapCanvas.drawPath(notchInfo2.path, paint);
                    } else {
                        float fMax = Math.max(notchInfo2.bounds.width(), profileGooeyView.notchInfo.bounds.height()) / 2.0f;
                        this.bitmapCanvas.drawRoundRect(profileGooeyView.notchInfo.bounds, fMax, fMax, paint);
                    }
                    this.bitmapCanvas.restore();
                } else {
                    this.bitmapCanvas.drawRect(0.0f, 0.0f, this.optimizedW, AndroidUtilities.dp(32.0f), paint);
                }
                this.bitmapCanvas.restore();
                Utilities.stackBlurBitmap(this.bitmap, (int) ((profileGooeyView.intensity * 2.0f) / 6.0f));
                canvas.save();
                canvas.translate(width, 0.0f);
                canvas.saveLayer(0.0f, 0.0f, this.bitmapOrigW, this.bitmapOrigH, null);
                canvas.scale(this.bitmapOrigW / this.bitmap.getWidth(), this.bitmapOrigH / this.bitmap.getHeight());
                canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, this.bitmapPaint);
                canvas.drawBitmap(this.bitmap, 0.0f, 0.0f, this.bitmapPaint2);
                canvas.restore();
                canvas.restore();
            }
            if (iClamp != 0) {
                if (iClamp != 255) {
                    i = iClamp;
                    canvas.saveLayerAlpha(width, 0.0f, width + this.optimizedW, this.optimizedH, i);
                } else {
                    i = iClamp;
                }
                profileGooeyView2.lambda$draw$0(canvas);
                if (i != 255) {
                    canvas.restore();
                }
            }
            canvas.restore();
        }

        @Override
        public final void onSizeChanged(int i, int i2) {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.bitmap = null;
            }
            this.optimizedW = Math.min(AndroidUtilities.dp(120.0f), i);
            int iMin = Math.min(AndroidUtilities.dp(220.0f), i2);
            this.optimizedH = iMin;
            this.bitmapOrigW = this.optimizedW;
            int iDp = AndroidUtilities.dp(32.0f) + iMin;
            this.bitmapOrigH = iDp;
            this.bitmap = Bitmap.createBitmap((int) (this.bitmapOrigW / 6.0f), (int) (iDp / 6.0f), Bitmap.Config.ARGB_8888);
            this.bitmapCanvas = new Canvas(this.bitmap);
        }

        @Override
        public final void setBlurIntensity(float f) {
        }

        @Override
        public final void setIntensity(float f) {
        }
    }

    public final class GPUImpl implements Impl {
        public final Paint blackNodePaint;
        public final float factorMult;
        public final RectF wholeOptimized;
        public final Paint filter = new Paint(1);
        public final RenderNode node = new RenderNode("render");
        public final RenderNode effectNotchNode = new RenderNode("effectNotch");
        public final RenderNode effectNode = new RenderNode("effect");
        public final RenderNode blurNode = new RenderNode("blur");
        public final RectF whole = new RectF();
        public final RectF temp = new RectF();

        public GPUImpl(float f) {
            Paint paint = new Paint();
            this.blackNodePaint = paint;
            this.wholeOptimized = new RectF();
            this.factorMult = f;
            paint.setColor(-16777216);
            paint.setBlendMode(BlendMode.SRC_IN);
        }

        @Override
        public final void draw(ProfileGooeyView$$ExternalSyntheticLambda0 profileGooeyView$$ExternalSyntheticLambda0, Canvas canvas) {
            float f;
            float f2;
            Paint paint;
            float f3;
            if (canvas.isHardwareAccelerated()) {
                RectF rectF = this.whole;
                ProfileGooeyView profileGooeyView = ProfileGooeyView.this;
                rectF.set(0.0f, 0.0f, profileGooeyView.getWidth(), profileGooeyView.getHeight());
                int childCount = profileGooeyView.getChildCount();
                RectF rectF2 = this.wholeOptimized;
                if (childCount > 0) {
                    View childAt = profileGooeyView.getChildAt(0);
                    float scaleX = childAt.getScaleX() * childAt.getWidth();
                    float scaleY = childAt.getScaleY() * childAt.getHeight();
                    float x = childAt.getX();
                    float y = childAt.getY();
                    rectF2.set(x, y, scaleX + x, scaleY + y);
                    NotchInfoUtils.NotchInfo notchInfo = profileGooeyView.notchInfo;
                    if (notchInfo != null) {
                        rectF2.union(notchInfo.bounds);
                    }
                    rectF2.inset(-AndroidUtilities.dp(20.0f), -AndroidUtilities.dp(20.0f));
                    rectF2.intersect(rectF);
                    rectF2.top = 0.0f;
                } else {
                    rectF2.set(rectF);
                }
                rectF2.bottom += AndroidUtilities.dp(32.0f);
                int iCeil = (int) Math.ceil(rectF2.width());
                int iCeil2 = (int) Math.ceil(rectF2.height());
                float f4 = rectF2.left;
                float f5 = rectF2.top;
                this.node.setPosition(0, 0, iCeil, iCeil2);
                this.blurNode.setPosition(0, 0, iCeil, iCeil2);
                this.effectNode.setPosition(0, 0, iCeil, iCeil2);
                this.effectNotchNode.setPosition(0, 0, iCeil, iCeil2);
                float f6 = iCeil;
                float f7 = iCeil2;
                rectF2.set(0.0f, 0.0f, f6, f7);
                RecordingCanvas recordingCanvasBeginRecording = this.node.beginRecording();
                float f8 = -f4;
                float f9 = -f5;
                recordingCanvasBeginRecording.translate(f8, f9);
                int iIlerp = (int) ((1.0f - AndroidUtilities.ilerp(profileGooeyView.pullProgress, 0.5f, 1.0f)) * 255.0f);
                int iClamp = MathUtils.clamp(iIlerp, 0, 255);
                ((ProfileGooeyView) profileGooeyView$$ExternalSyntheticLambda0.f$0).lambda$draw$0(recordingCanvasBeginRecording);
                this.node.endRecording();
                float f10 = this.factorMult;
                float fM = DiffUtil.m(f10, 1.0f, 2.0f, SurfaceContainer$$ExternalSyntheticOutline0.m(profileGooeyView.blurIntensity, 0.5f, f10, (f10 / 4.0f) + 1.0f));
                RecordingCanvas recordingCanvasBeginRecording2 = this.blurNode.beginRecording();
                float f11 = 1.0f / fM;
                recordingCanvasBeginRecording2.scale(f11, f11, 0.0f, 0.0f);
                recordingCanvasBeginRecording2.drawRenderNode(this.node);
                this.blurNode.endRecording();
                float f12 = f10 + 2.0f;
                RecordingCanvas recordingCanvasBeginRecording3 = this.effectNode.beginRecording();
                float f13 = 1.0f / f12;
                recordingCanvasBeginRecording3.scale(f13, f13, 0.0f, 0.0f);
                Paint paint2 = this.blackNodePaint;
                if (iClamp < 255) {
                    recordingCanvasBeginRecording3.saveLayer(rectF2, null);
                    recordingCanvasBeginRecording3.drawRenderNode(this.node);
                    recordingCanvasBeginRecording3.drawRect(rectF2, paint2);
                    recordingCanvasBeginRecording3.restore();
                }
                float fLerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dp(7.0f) * f12, 0.0f, 0.5f, profileGooeyView.pullProgress);
                int childCount2 = profileGooeyView.getChildCount();
                Paint paint3 = profileGooeyView.blackPaint;
                Path path = profileGooeyView.path;
                if (childCount2 > 0) {
                    View childAt2 = profileGooeyView.getChildAt(0);
                    f = fLerp;
                    float scaleX2 = (((childAt2.getScaleX() * childAt2.getWidth()) / 2.0f) + childAt2.getX()) - f4;
                    float scaleY2 = ((((childAt2.getScaleY() * childAt2.getHeight()) / 2.0f) + childAt2.getY()) + AndroidUtilities.dp(32.0f)) - f5;
                    float scaleX3 = childAt2.getScaleX() * (childAt2.getWidth() / 2.0f);
                    path.rewind();
                    path.moveTo(scaleX2 - scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
                    path.lineTo(scaleX2, (scaleY2 - scaleX3) - (0.25f * f));
                    path.lineTo(scaleX2 + scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
                    path.close();
                    recordingCanvasBeginRecording3.drawPath(path, paint3);
                } else {
                    f = fLerp;
                }
                if (iClamp > 0) {
                    if (iClamp != 255) {
                        recordingCanvasBeginRecording3.saveLayerAlpha(rectF2, iClamp);
                    }
                    recordingCanvasBeginRecording3.drawRenderNode(this.node);
                    if (iClamp != 255) {
                        recordingCanvasBeginRecording3.restore();
                    }
                }
                this.effectNode.endRecording();
                RecordingCanvas recordingCanvasBeginRecording4 = this.effectNotchNode.beginRecording();
                recordingCanvasBeginRecording4.scale(f13, f13, 0.0f, 0.0f);
                if (profileGooeyView.notchInfo != null) {
                    recordingCanvasBeginRecording4.translate(f8, f9);
                    recordingCanvasBeginRecording4.translate(0.0f, AndroidUtilities.dp(32.0f));
                    NotchInfoUtils.NotchInfo notchInfo2 = profileGooeyView.notchInfo;
                    if (notchInfo2.isLikelyCircle) {
                        float fMin = Math.min(notchInfo2.bounds.width(), profileGooeyView.notchInfo.bounds.height()) / 2.0f;
                        RectF rectF3 = profileGooeyView.notchInfo.bounds;
                        float fWidth = rectF3.bottom - (rectF3.width() / 2.0f);
                        recordingCanvasBeginRecording4.drawCircle(profileGooeyView.notchInfo.bounds.centerX(), fWidth, fMin, paint3);
                        path.rewind();
                        float f14 = f / 2.0f;
                        path.moveTo(profileGooeyView.notchInfo.bounds.centerX() - f14, fWidth);
                        path.lineTo(profileGooeyView.notchInfo.bounds.centerX(), fMin + fWidth + f);
                        path.lineTo(profileGooeyView.notchInfo.bounds.centerX() + f14, fWidth);
                        path.close();
                        recordingCanvasBeginRecording4.drawPath(path, paint3);
                    } else if (notchInfo2.isAccurate) {
                        recordingCanvasBeginRecording4.drawPath(notchInfo2.path, paint3);
                    } else {
                        float fMax = Math.max(notchInfo2.bounds.width(), profileGooeyView.notchInfo.bounds.height()) / 2.0f;
                        RectF rectF4 = this.temp;
                        rectF4.set(profileGooeyView.notchInfo.bounds);
                        recordingCanvasBeginRecording4.drawRoundRect(rectF4, fMax, fMax, paint3);
                        path.rewind();
                        float f15 = f / 2.0f;
                        path.moveTo(rectF4.centerX() - f15, rectF4.bottom);
                        path.lineTo(rectF4.centerX(), rectF4.bottom + f);
                        path.lineTo(rectF4.centerX() + f15, rectF4.bottom);
                        path.close();
                        recordingCanvasBeginRecording4.drawPath(path, paint3);
                    }
                    f2 = f6;
                    paint = null;
                } else {
                    f2 = f6;
                    paint = null;
                    recordingCanvasBeginRecording4.drawRect(0.0f, 0.0f, f2, AndroidUtilities.dp(32.0f), paint3);
                    path.rewind();
                    path.moveTo((f2 - f) / 2.0f, AndroidUtilities.dp(32.0f));
                    path.lineTo(f2 / 2.0f, AndroidUtilities.dp(32.0f) + f);
                    path.lineTo((f2 + f) / 2.0f, AndroidUtilities.dp(32.0f));
                    path.close();
                    recordingCanvasBeginRecording4.drawPath(path, paint3);
                }
                this.effectNotchNode.endRecording();
                canvas.save();
                canvas.translate(f4, f5 - AndroidUtilities.dp(32.0f));
                NotchInfoUtils.NotchInfo notchInfo3 = profileGooeyView.notchInfo;
                if (notchInfo3 != null) {
                    canvas.clipRect(0.0f, notchInfo3.bounds.top, f2, f7);
                }
                Paint paint4 = this.filter;
                canvas.saveLayer(rectF2, paint4);
                canvas.scale(f12, f12);
                canvas.drawRenderNode(this.effectNotchNode);
                canvas.drawRenderNode(this.effectNode);
                canvas.restore();
                int iClamp2 = MathUtils.clamp((iIlerp * 3) / 4, 0, 255);
                if (iClamp2 < 255) {
                    canvas.saveLayer(rectF2, paint);
                    if (profileGooeyView.blurIntensity != 0.0f) {
                        canvas.saveLayer(rectF2, paint4);
                        f3 = fM;
                        canvas.scale(f3, f3);
                        canvas.drawRenderNode(this.blurNode);
                        canvas.restore();
                    } else {
                        f3 = fM;
                        canvas.drawRenderNode(this.node);
                    }
                    canvas.drawRect(rectF2, paint2);
                    canvas.restore();
                } else {
                    f3 = fM;
                }
                if (iClamp2 > 0) {
                    if (iClamp2 != 255) {
                        canvas.saveLayerAlpha(rectF2, iClamp2);
                    }
                    if (profileGooeyView.blurIntensity != 0.0f) {
                        canvas.saveLayer(rectF2, paint4);
                        canvas.scale(f3, f3);
                        canvas.drawRenderNode(this.blurNode);
                        canvas.restore();
                    } else {
                        canvas.drawRenderNode(this.node);
                    }
                    if (iClamp2 != 255) {
                        canvas.restore();
                    }
                }
                canvas.restore();
            }
        }

        @Override
        public final void onSizeChanged(int i, int i2) {
        }

        @Override
        public final void setBlurIntensity(float f) {
            if (f == 0.0f) {
                this.blurNode.setRenderEffect(null);
                return;
            }
            RenderNode renderNode = this.blurNode;
            float f2 = (f * ProfileGooeyView.this.intensity) / this.factorMult;
            Shader.TileMode unused = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f2, f2, Shader.TileMode.DECAL));
        }

        @Override
        public final void setIntensity(float f) {
            RenderNode renderNode = this.effectNode;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP));
            this.effectNotchNode.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP));
            this.filter.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
        }
    }

    public interface Impl {
        void draw(ProfileGooeyView$$ExternalSyntheticLambda0 profileGooeyView$$ExternalSyntheticLambda0, Canvas canvas);

        void onSizeChanged(int i, int i2);

        void setBlurIntensity(float f);

        void setIntensity(float f);
    }

    public ProfileGooeyView(Context context) {
        super(context);
        Paint paint = new Paint(1);
        this.blackPaint = paint;
        this.path = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT < 31 || SharedConfig.getDevicePerformanceClass() < 1) {
            this.impl = new CPUImpl();
        } else {
            this.impl = new GPUImpl(SharedConfig.getDevicePerformanceClass() == 2 ? 1.0f : 1.5f);
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    @Override
    public final void draw(Canvas canvas) {
        if (!this.enabled) {
            super.draw(canvas);
        } else {
            this.impl.draw(new ProfileGooeyView$$ExternalSyntheticLambda0(this, 0), canvas);
        }
    }

    public float getAvatarEndScale() {
        float fMin;
        int iDp;
        NotchInfoUtils.NotchInfo notchInfo = this.notchInfo;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            fMin = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            iDp = AndroidUtilities.dp(100.0f);
        } else {
            fMin = Math.min(notchInfo.bounds.width(), this.notchInfo.bounds.height());
            iDp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, fMin / iDp);
    }

    public final void lambda$draw$0(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(32.0f));
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.notchInfo = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.notchInfo = null;
        }
        this.impl.onSizeChanged(i, i2);
    }

    public void setBlurIntensity(float f) {
        this.blurIntensity = f;
        this.impl.setBlurIntensity(f);
        invalidate();
    }

    public void setGooeyEnabled(boolean z) {
        if (this.enabled == z) {
            return;
        }
        this.enabled = z;
        invalidate();
    }

    public void setIntensity(float f) {
        this.intensity = f;
        this.impl.setIntensity(f);
        invalidate();
    }

    public void setPullProgress(float f) {
        this.pullProgress = f;
        invalidate();
    }
}
