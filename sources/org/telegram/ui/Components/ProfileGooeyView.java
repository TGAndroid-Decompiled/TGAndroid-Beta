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
import androidx.core.math.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public class ProfileGooeyView extends FrameLayout {
    private final Paint blackPaint;
    private float blurIntensity;
    private boolean enabled;
    private final Impl impl;
    private float intensity;
    public NotchInfoUtils.NotchInfo notchInfo;
    private final Path path;
    private float pullProgress;

    interface Drawer {
        void draw(Canvas canvas);
    }

    private interface Impl {

        public abstract class CC {
            public static void $default$onSizeChanged(Impl impl, int i, int i2) {
            }

            public static void $default$setBlurIntensity(Impl impl, float f) {
            }

            public static void $default$setIntensity(Impl impl, float f) {
            }
        }

        void draw(Drawer drawer, Canvas canvas);

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
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.getDevicePerformanceClass() >= 1) {
            this.impl = new GPUImpl(SharedConfig.getDevicePerformanceClass() == 2 ? 1.0f : 1.5f);
        } else {
            this.impl = new CPUImpl();
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
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

    public void setIntensity(float f) {
        this.intensity = f;
        this.impl.setIntensity(f);
        invalidate();
    }

    public void setPullProgress(float f) {
        this.pullProgress = f;
        invalidate();
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

    @Override
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        NotchInfoUtils.NotchInfo info = NotchInfoUtils.getInfo(getContext());
        this.notchInfo = info;
        if ((info != null && info.gravity != 17) || getWidth() > getHeight()) {
            this.notchInfo = null;
        }
        this.impl.onSizeChanged(i, i2);
    }

    @Override
    public void draw(Canvas canvas) {
        if (!this.enabled) {
            super.draw(canvas);
        } else {
            this.impl.draw(new Drawer() {
                @Override
                public final void draw(Canvas canvas2) {
                    ProfileGooeyView.$r8$lambda$qmHZWXVSu8tfF83AWRtDJcRnU8Q(this.f$0, canvas2);
                }
            }, canvas);
        }
    }

    public static void $r8$lambda$qmHZWXVSu8tfF83AWRtDJcRnU8Q(ProfileGooeyView profileGooeyView, Canvas canvas) {
        profileGooeyView.getClass();
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(32.0f));
        super.draw(canvas);
        canvas.restore();
    }

    private final class CPUImpl implements Impl {
        private Bitmap bitmap;
        private Canvas bitmapCanvas;
        private int bitmapOrigH;
        private int bitmapOrigW;
        private final Paint bitmapPaint;
        private final Paint bitmapPaint2;
        private int optimizedH;
        private int optimizedW;
        private final float scaleConst;

        @Override
        public void setBlurIntensity(float f) {
            Impl.CC.$default$setBlurIntensity(this, f);
        }

        @Override
        public void setIntensity(float f) {
            Impl.CC.$default$setIntensity(this, f);
        }

        private CPUImpl() {
            Paint paint = new Paint();
            this.bitmapPaint = paint;
            Paint paint2 = new Paint();
            this.bitmapPaint2 = paint2;
            this.scaleConst = 6.0f;
            paint.setFlags(7);
            paint.setFilterBitmap(true);
            paint2.setFlags(7);
            paint2.setFilterBitmap(true);
            paint2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
            paint.setColorFilter(new ColorMatrixColorFilter(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 60.0f, -7500.0f}));
        }

        @Override
        public void onSizeChanged(int i, int i2) {
            Bitmap bitmap = this.bitmap;
            if (bitmap != null) {
                bitmap.recycle();
                this.bitmap = null;
            }
            this.optimizedW = Math.min(AndroidUtilities.dp(120.0f), i);
            int iMin = Math.min(AndroidUtilities.dp(220.0f), i2);
            this.optimizedH = iMin;
            this.bitmapOrigW = this.optimizedW;
            int iDp = iMin + AndroidUtilities.dp(32.0f);
            this.bitmapOrigH = iDp;
            this.bitmap = Bitmap.createBitmap((int) (this.bitmapOrigW / 6.0f), (int) (iDp / 6.0f), Bitmap.Config.ARGB_8888);
            this.bitmapCanvas = new Canvas(this.bitmap);
        }

        @Override
        public void draw(Drawer drawer, Canvas canvas) {
            int i;
            Bitmap bitmap = this.bitmap;
            if (bitmap == null || bitmap.isRecycled()) {
                return;
            }
            int iClamp = (int) ((1.0f - ((MathUtils.clamp(ProfileGooeyView.this.blurIntensity, 0.2f, 0.3f) - 0.2f) / 0.10000001f)) * 255.0f);
            float width = (ProfileGooeyView.this.getWidth() - this.optimizedW) / 2.0f;
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            if (iClamp != 255) {
                this.bitmap.eraseColor(0);
                this.bitmapCanvas.save();
                this.bitmapCanvas.scale(this.bitmap.getWidth() / this.bitmapOrigW, this.bitmap.getHeight() / this.bitmapOrigH);
                float f = -width;
                this.bitmapCanvas.translate(f, 0.0f);
                drawer.draw(this.bitmapCanvas);
                this.bitmapCanvas.restore();
                this.bitmapCanvas.save();
                this.bitmapCanvas.scale(this.bitmap.getWidth() / this.bitmapOrigW, this.bitmap.getHeight() / this.bitmapOrigH);
                if (ProfileGooeyView.this.notchInfo == null) {
                    this.bitmapCanvas.drawRect(0.0f, 0.0f, this.optimizedW, AndroidUtilities.dp(32.0f), ProfileGooeyView.this.blackPaint);
                } else {
                    this.bitmapCanvas.save();
                    this.bitmapCanvas.translate(f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView profileGooeyView = ProfileGooeyView.this;
                    NotchInfoUtils.NotchInfo notchInfo = profileGooeyView.notchInfo;
                    if (notchInfo.isLikelyCircle) {
                        float fMin = Math.min(notchInfo.bounds.width(), ProfileGooeyView.this.notchInfo.bounds.height()) / 2.0f;
                        Canvas canvas2 = this.bitmapCanvas;
                        float fCenterX = ProfileGooeyView.this.notchInfo.bounds.centerX();
                        RectF rectF = ProfileGooeyView.this.notchInfo.bounds;
                        canvas2.drawCircle(fCenterX, rectF.bottom - (rectF.width() / 2.0f), fMin, ProfileGooeyView.this.blackPaint);
                    } else if (notchInfo.isAccurate) {
                        this.bitmapCanvas.drawPath(notchInfo.path, profileGooeyView.blackPaint);
                    } else {
                        float fMax = Math.max(notchInfo.bounds.width(), ProfileGooeyView.this.notchInfo.bounds.height()) / 2.0f;
                        Canvas canvas3 = this.bitmapCanvas;
                        ProfileGooeyView profileGooeyView2 = ProfileGooeyView.this;
                        canvas3.drawRoundRect(profileGooeyView2.notchInfo.bounds, fMax, fMax, profileGooeyView2.blackPaint);
                    }
                    this.bitmapCanvas.restore();
                }
                this.bitmapCanvas.restore();
                Utilities.stackBlurBitmap(this.bitmap, (int) ((ProfileGooeyView.this.intensity * 2.0f) / 6.0f));
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
                drawer.draw(canvas);
                if (i != 255) {
                    canvas.restore();
                }
            }
            canvas.restore();
        }
    }

    private final class GPUImpl implements Impl {
        private final Paint blackNodePaint;
        private final RenderNode blurNode;
        private final RenderNode effectNode;
        private final RenderNode effectNotchNode;
        private final float factorMult;
        private final Paint filter;
        private final RenderNode node;
        private final RectF temp;
        private final RectF whole;
        private final RectF wholeOptimized;

        @Override
        public void onSizeChanged(int i, int i2) {
            Impl.CC.$default$onSizeChanged(this, i, i2);
        }

        private GPUImpl(float f) {
            this.filter = new Paint(1);
            this.node = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("render");
            this.effectNotchNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("effectNotch");
            this.effectNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("effect");
            this.blurNode = BotFullscreenButtons$$ExternalSyntheticApiModelOutline9.m("blur");
            this.whole = new RectF();
            this.temp = new RectF();
            Paint paint = new Paint();
            this.blackNodePaint = paint;
            this.wholeOptimized = new RectF();
            this.factorMult = f;
            paint.setColor(-16777216);
            paint.setBlendMode(BlendMode.SRC_IN);
        }

        @Override
        public void setIntensity(float f) {
            RenderNode renderNode = this.effectNode;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f, f, tileMode));
            this.effectNotchNode.setRenderEffect(RenderEffect.createBlurEffect(f, f, tileMode));
            this.filter.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
        }

        @Override
        public void setBlurIntensity(float f) {
            if (f != 0.0f) {
                this.blurNode.setRenderEffect(RenderEffect.createBlurEffect((ProfileGooeyView.this.intensity * f) / this.factorMult, (f * ProfileGooeyView.this.intensity) / this.factorMult, Shader.TileMode.DECAL));
            } else {
                this.blurNode.setRenderEffect(null);
            }
        }

        @Override
        public void draw(Drawer drawer, Canvas canvas) {
            Paint paint;
            float f;
            if (canvas.isHardwareAccelerated()) {
                this.whole.set(0.0f, 0.0f, ProfileGooeyView.this.getWidth(), ProfileGooeyView.this.getHeight());
                if (ProfileGooeyView.this.getChildCount() > 0) {
                    View childAt = ProfileGooeyView.this.getChildAt(0);
                    float width = childAt.getWidth() * childAt.getScaleX();
                    float height = childAt.getHeight() * childAt.getScaleY();
                    float x = childAt.getX();
                    float y = childAt.getY();
                    this.wholeOptimized.set(x, y, width + x, height + y);
                    NotchInfoUtils.NotchInfo notchInfo = ProfileGooeyView.this.notchInfo;
                    if (notchInfo != null) {
                        this.wholeOptimized.union(notchInfo.bounds);
                    }
                    this.wholeOptimized.inset(-AndroidUtilities.dp(20.0f), -AndroidUtilities.dp(20.0f));
                    this.wholeOptimized.intersect(this.whole);
                    this.wholeOptimized.top = 0.0f;
                } else {
                    this.wholeOptimized.set(this.whole);
                }
                this.wholeOptimized.bottom += AndroidUtilities.dp(32.0f);
                int iCeil = (int) Math.ceil(this.wholeOptimized.width());
                int iCeil2 = (int) Math.ceil(this.wholeOptimized.height());
                RectF rectF = this.wholeOptimized;
                float f2 = rectF.left;
                float f3 = rectF.top;
                this.node.setPosition(0, 0, iCeil, iCeil2);
                this.blurNode.setPosition(0, 0, iCeil, iCeil2);
                this.effectNode.setPosition(0, 0, iCeil, iCeil2);
                this.effectNotchNode.setPosition(0, 0, iCeil, iCeil2);
                float f4 = iCeil;
                float f5 = iCeil2;
                this.wholeOptimized.set(0.0f, 0.0f, f4, f5);
                RecordingCanvas recordingCanvasBeginRecording = this.node.beginRecording();
                float f6 = -f2;
                float f7 = -f3;
                recordingCanvasBeginRecording.translate(f6, f7);
                int iIlerp = (int) ((1.0f - AndroidUtilities.ilerp(ProfileGooeyView.this.pullProgress, 0.5f, 1.0f)) * 255.0f);
                int iClamp = MathUtils.clamp(iIlerp, 0, 255);
                drawer.draw(recordingCanvasBeginRecording);
                this.node.endRecording();
                float f8 = (this.factorMult / 4.0f) + 1.0f;
                float f9 = ProfileGooeyView.this.blurIntensity * 0.5f;
                float f10 = this.factorMult;
                float f11 = f8 + (f9 * f10) + ((f10 - 1.0f) * 2.0f);
                RecordingCanvas recordingCanvasBeginRecording2 = this.blurNode.beginRecording();
                float f12 = 1.0f / f11;
                recordingCanvasBeginRecording2.scale(f12, f12, 0.0f, 0.0f);
                recordingCanvasBeginRecording2.drawRenderNode(this.node);
                this.blurNode.endRecording();
                float f13 = this.factorMult + 2.0f;
                RecordingCanvas recordingCanvasBeginRecording3 = this.effectNode.beginRecording();
                float f14 = 1.0f / f13;
                recordingCanvasBeginRecording3.scale(f14, f14, 0.0f, 0.0f);
                if (iClamp < 255) {
                    recordingCanvasBeginRecording3.saveLayer(this.wholeOptimized, null);
                    recordingCanvasBeginRecording3.drawRenderNode(this.node);
                    recordingCanvasBeginRecording3.drawRect(this.wholeOptimized, this.blackNodePaint);
                    recordingCanvasBeginRecording3.restore();
                }
                float fLerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dp(7.0f) * f13, 0.0f, 0.5f, ProfileGooeyView.this.pullProgress);
                if (ProfileGooeyView.this.getChildCount() > 0) {
                    View childAt2 = ProfileGooeyView.this.getChildAt(0);
                    float x2 = (childAt2.getX() + ((childAt2.getWidth() * childAt2.getScaleX()) / 2.0f)) - f2;
                    float y2 = ((childAt2.getY() + ((childAt2.getHeight() * childAt2.getScaleY()) / 2.0f)) + AndroidUtilities.dp(32.0f)) - f3;
                    float width2 = (childAt2.getWidth() / 2.0f) * childAt2.getScaleX();
                    ProfileGooeyView.this.path.rewind();
                    ProfileGooeyView.this.path.moveTo(x2 - width2, y2 - (((float) Math.cos(0.7853981633974483d)) * width2));
                    ProfileGooeyView.this.path.lineTo(x2, (y2 - width2) - (0.25f * fLerp));
                    ProfileGooeyView.this.path.lineTo(x2 + width2, y2 - (((float) Math.cos(0.7853981633974483d)) * width2));
                    ProfileGooeyView.this.path.close();
                    recordingCanvasBeginRecording3.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                }
                if (iClamp > 0) {
                    if (iClamp != 255) {
                        recordingCanvasBeginRecording3.saveLayerAlpha(this.wholeOptimized, iClamp);
                    }
                    recordingCanvasBeginRecording3.drawRenderNode(this.node);
                    if (iClamp != 255) {
                        recordingCanvasBeginRecording3.restore();
                    }
                }
                this.effectNode.endRecording();
                RecordingCanvas recordingCanvasBeginRecording4 = this.effectNotchNode.beginRecording();
                recordingCanvasBeginRecording4.scale(f14, f14, 0.0f, 0.0f);
                if (ProfileGooeyView.this.notchInfo == null) {
                    paint = null;
                    recordingCanvasBeginRecording4.drawRect(0.0f, 0.0f, f4, AndroidUtilities.dp(32.0f), ProfileGooeyView.this.blackPaint);
                    ProfileGooeyView.this.path.rewind();
                    ProfileGooeyView.this.path.moveTo((f4 - fLerp) / 2.0f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView.this.path.lineTo(f4 / 2.0f, AndroidUtilities.dp(32.0f) + fLerp);
                    ProfileGooeyView.this.path.lineTo((f4 + fLerp) / 2.0f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView.this.path.close();
                    recordingCanvasBeginRecording4.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                } else {
                    recordingCanvasBeginRecording4.translate(f6, f7);
                    recordingCanvasBeginRecording4.translate(0.0f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView profileGooeyView = ProfileGooeyView.this;
                    NotchInfoUtils.NotchInfo notchInfo2 = profileGooeyView.notchInfo;
                    if (notchInfo2.isLikelyCircle) {
                        float fMin = Math.min(notchInfo2.bounds.width(), ProfileGooeyView.this.notchInfo.bounds.height()) / 2.0f;
                        RectF rectF2 = ProfileGooeyView.this.notchInfo.bounds;
                        float fWidth = rectF2.bottom - (rectF2.width() / 2.0f);
                        recordingCanvasBeginRecording4.drawCircle(ProfileGooeyView.this.notchInfo.bounds.centerX(), fWidth, fMin, ProfileGooeyView.this.blackPaint);
                        ProfileGooeyView.this.path.rewind();
                        float f15 = fLerp / 2.0f;
                        ProfileGooeyView.this.path.moveTo(ProfileGooeyView.this.notchInfo.bounds.centerX() - f15, fWidth);
                        ProfileGooeyView.this.path.lineTo(ProfileGooeyView.this.notchInfo.bounds.centerX(), fMin + fWidth + fLerp);
                        ProfileGooeyView.this.path.lineTo(ProfileGooeyView.this.notchInfo.bounds.centerX() + f15, fWidth);
                        ProfileGooeyView.this.path.close();
                        recordingCanvasBeginRecording4.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                    } else if (notchInfo2.isAccurate) {
                        recordingCanvasBeginRecording4.drawPath(notchInfo2.path, profileGooeyView.blackPaint);
                    } else {
                        float fMax = Math.max(notchInfo2.bounds.width(), ProfileGooeyView.this.notchInfo.bounds.height()) / 2.0f;
                        this.temp.set(ProfileGooeyView.this.notchInfo.bounds);
                        recordingCanvasBeginRecording4.drawRoundRect(this.temp, fMax, fMax, ProfileGooeyView.this.blackPaint);
                        ProfileGooeyView.this.path.rewind();
                        float f16 = fLerp / 2.0f;
                        ProfileGooeyView.this.path.moveTo(this.temp.centerX() - f16, this.temp.bottom);
                        ProfileGooeyView.this.path.lineTo(this.temp.centerX(), this.temp.bottom + fLerp);
                        ProfileGooeyView.this.path.lineTo(this.temp.centerX() + f16, this.temp.bottom);
                        ProfileGooeyView.this.path.close();
                        recordingCanvasBeginRecording4.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                    }
                    paint = null;
                }
                this.effectNotchNode.endRecording();
                canvas.save();
                canvas.translate(f2, f3 - AndroidUtilities.dp(32.0f));
                NotchInfoUtils.NotchInfo notchInfo3 = ProfileGooeyView.this.notchInfo;
                if (notchInfo3 != null) {
                    canvas.clipRect(0.0f, notchInfo3.bounds.top, f4, f5);
                }
                canvas.saveLayer(this.wholeOptimized, this.filter);
                canvas.scale(f13, f13);
                canvas.drawRenderNode(this.effectNotchNode);
                canvas.drawRenderNode(this.effectNode);
                canvas.restore();
                int iClamp2 = MathUtils.clamp((iIlerp * 3) / 4, 0, 255);
                if (iClamp2 < 255) {
                    canvas.saveLayer(this.wholeOptimized, paint);
                    if (ProfileGooeyView.this.blurIntensity != 0.0f) {
                        canvas.saveLayer(this.wholeOptimized, this.filter);
                        f = f11;
                        canvas.scale(f, f);
                        canvas.drawRenderNode(this.blurNode);
                        canvas.restore();
                    } else {
                        f = f11;
                        canvas.drawRenderNode(this.node);
                    }
                    canvas.drawRect(this.wholeOptimized, this.blackNodePaint);
                    canvas.restore();
                }
                if (iClamp2 > 0) {
                    if (iClamp2 != 255) {
                        canvas.saveLayerAlpha(this.wholeOptimized, iClamp2);
                    }
                    if (ProfileGooeyView.this.blurIntensity != 0.0f) {
                        canvas.saveLayer(this.wholeOptimized, this.filter);
                        canvas.scale(f, f);
                        canvas.drawRenderNode(this.blurNode);
                        canvas.restore();
                    } else {
                        canvas.drawRenderNode(this.node);
                    }
                    if (iClamp2 != 255) {
                        canvas.restore();
                    }
                }
                f = f11;
                canvas.restore();
            }
        }
    }
}
