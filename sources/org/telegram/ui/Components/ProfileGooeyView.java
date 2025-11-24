package org.telegram.ui.Components;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.LinearGradient;
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
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticApiModelOutline9;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public class ProfileGooeyView extends FrameLayout {
    private final Paint blackPaint;
    private float blurIntensity;
    private boolean enabled;
    private final Paint fadeToBottom;
    private final Paint fadeToTop;
    private final Impl impl;
    private float intensity;
    public NotchInfoUtils.NotchInfo notchInfo;
    private final Path path;
    private float pullProgress;

    public interface Drawer {
        void draw(Canvas canvas);
    }

    public interface Impl {

        public abstract class CC {
            public static void $default$release(Impl impl) {
            }
        }

        void draw(Drawer drawer, Canvas canvas);

        void onSizeChanged(int i, int i2);

        void release();

        void setBlurIntensity(float f);

        void setIntensity(float f);
    }

    public ProfileGooeyView(Context context) {
        super(context);
        this.fadeToTop = new Paint(1);
        this.fadeToBottom = new Paint(1);
        Paint paint = new Paint(1);
        this.blackPaint = paint;
        this.path = new Path();
        paint.setColor(-16777216);
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.getDevicePerformanceClass() >= 1) {
            this.impl = new GPUImpl(SharedConfig.getDevicePerformanceClass() == 2 ? 1.0f : 1.5f);
        } else if (SharedConfig.getDevicePerformanceClass() >= 2) {
            this.impl = new CPUImpl();
        } else {
            this.impl = new NoopImpl();
        }
        setIntensity(15.0f);
        setBlurIntensity(0.0f);
        setWillNotDraw(false);
    }

    public float getAvatarEndScale() {
        float min;
        int dp;
        NotchInfoUtils.NotchInfo notchInfo = this.notchInfo;
        if (notchInfo == null) {
            return 0.8f;
        }
        if (notchInfo.isLikelyCircle) {
            min = notchInfo.bounds.width() - AndroidUtilities.dp(2.0f);
            dp = AndroidUtilities.dp(100.0f);
        } else {
            min = Math.min(notchInfo.bounds.width(), this.notchInfo.bounds.height());
            dp = AndroidUtilities.dp(100.0f);
        }
        return Math.min(0.8f, min / dp);
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
        Paint paint = this.fadeToTop;
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        paint.setXfermode(new PorterDuffXfermode(mode));
        Paint paint2 = this.fadeToTop;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        paint2.setShader(new LinearGradient(getWidth() / 2.0f, 0.0f, getWidth() / 2.0f, AndroidUtilities.dp(50.0f), new int[]{-16777216, -1}, new float[]{0.15f, 1.0f}, tileMode));
        this.fadeToBottom.setXfermode(new PorterDuffXfermode(mode));
        this.fadeToBottom.setShader(new LinearGradient(getWidth() / 2.0f, 0.0f, getWidth() / 2.0f, AndroidUtilities.dp(50.0f), new int[]{-1, -16777216}, new float[]{0.25f, 1.0f}, tileMode));
    }

    @Override
    public void draw(Canvas canvas) {
        if (!this.enabled) {
            super.draw(canvas);
        } else {
            this.impl.draw(new Drawer() {
                @Override
                public final void draw(Canvas canvas2) {
                    ProfileGooeyView.this.lambda$draw$0(canvas2);
                }
            }, canvas);
        }
    }

    public void lambda$draw$0(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(32.0f));
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.impl.release();
    }

    private static final class NoopImpl implements Impl {
        @Override
        public void onSizeChanged(int i, int i2) {
        }

        @Override
        public void release() {
            Impl.CC.$default$release(this);
        }

        @Override
        public void setBlurIntensity(float f) {
        }

        @Override
        public void setIntensity(float f) {
        }

        private NoopImpl() {
        }

        @Override
        public void draw(Drawer drawer, Canvas canvas) {
            canvas.save();
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            drawer.draw(canvas);
            canvas.restore();
        }
    }

    private final class CPUImpl implements Impl {
        private final Canvas[] bitmapCanvas;
        private final Paint bitmapPaint;
        private final Bitmap[] bitmaps;
        private final Paint filter;
        private int optimizedH;

        @Override
        public void setBlurIntensity(float f) {
        }

        private CPUImpl() {
            this.filter = new Paint(1);
            this.bitmaps = new Bitmap[2];
            this.bitmapCanvas = new Canvas[2];
            this.bitmapPaint = new Paint(5);
        }

        @Override
        public void setIntensity(float f) {
            this.filter.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 4.0f * f, f * (-500.0f)}));
        }

        @Override
        public void onSizeChanged(int i, int i2) {
            for (Bitmap bitmap : this.bitmaps) {
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            int min = Math.min(AndroidUtilities.dp(280.0f), i2);
            this.optimizedH = min;
            Bitmap[] bitmapArr = this.bitmaps;
            int dp = min + AndroidUtilities.dp(32.0f);
            Bitmap.Config config = Bitmap.Config.ARGB_8888;
            bitmapArr[0] = Bitmap.createBitmap(i, dp, config);
            this.bitmapCanvas[0] = new Canvas(this.bitmaps[0]);
            this.bitmaps[1] = Bitmap.createBitmap(i / 4, this.optimizedH / 4, config);
            this.bitmapCanvas[1] = new Canvas(this.bitmaps[1]);
        }

        int getHeight() {
            return this.optimizedH;
        }

        @Override
        public void draw(Drawer drawer, Canvas canvas) {
            if (this.bitmaps[0] == null) {
                return;
            }
            for (int i = 0; i < 2; i++) {
                this.bitmaps[i].eraseColor(0);
            }
            drawer.draw(this.bitmapCanvas[0]);
            float width = this.bitmaps[1].getWidth() / this.bitmaps[0].getWidth();
            float width2 = this.bitmaps[1].getWidth() / this.bitmaps[0].getWidth();
            this.bitmapCanvas[1].save();
            this.bitmapCanvas[1].scale(width, width2);
            this.bitmapCanvas[1].drawBitmap(this.bitmaps[0], 0.0f, 0.0f, (Paint) null);
            if (ProfileGooeyView.this.notchInfo == null) {
                this.bitmapCanvas[1].drawRect(0.0f, 0.0f, r1.getWidth(), AndroidUtilities.dp(32.0f), ProfileGooeyView.this.blackPaint);
            } else {
                this.bitmapCanvas[1].translate(0.0f, AndroidUtilities.dp(32.0f));
                ProfileGooeyView profileGooeyView = ProfileGooeyView.this;
                NotchInfoUtils.NotchInfo notchInfo = profileGooeyView.notchInfo;
                if (notchInfo.isLikelyCircle) {
                    float min = Math.min(notchInfo.bounds.width(), ProfileGooeyView.this.notchInfo.bounds.height()) / 2.0f;
                    Canvas canvas2 = this.bitmapCanvas[1];
                    float centerX = ProfileGooeyView.this.notchInfo.bounds.centerX();
                    RectF rectF = ProfileGooeyView.this.notchInfo.bounds;
                    canvas2.drawCircle(centerX, rectF.bottom - (rectF.width() / 2.0f), min, ProfileGooeyView.this.blackPaint);
                } else if (notchInfo.isAccurate) {
                    this.bitmapCanvas[1].drawPath(notchInfo.path, profileGooeyView.blackPaint);
                } else {
                    float max = Math.max(notchInfo.bounds.width(), ProfileGooeyView.this.notchInfo.bounds.height()) / 2.0f;
                    Canvas canvas3 = this.bitmapCanvas[1];
                    ProfileGooeyView profileGooeyView2 = ProfileGooeyView.this;
                    canvas3.drawRoundRect(profileGooeyView2.notchInfo.bounds, max, max, profileGooeyView2.blackPaint);
                }
            }
            this.bitmapCanvas[1].restore();
            Utilities.stackBlurBitmap(this.bitmaps[1], (int) (ProfileGooeyView.this.intensity / 2.0f));
            canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
            canvas.save();
            canvas.saveLayer(0.0f, 0.0f, ProfileGooeyView.this.getWidth(), getHeight(), null);
            canvas.saveLayer(0.0f, 0.0f, ProfileGooeyView.this.getWidth(), getHeight(), this.filter);
            float f = 1.0f / width;
            float f2 = 1.0f / width2;
            canvas.scale(f, f2);
            canvas.drawBitmap(this.bitmaps[1], 0.0f, 0.0f, this.bitmapPaint);
            canvas.restore();
            canvas.drawRect(0.0f, 0.0f, ProfileGooeyView.this.getWidth(), getHeight(), ProfileGooeyView.this.fadeToBottom);
            canvas.restore();
            canvas.saveLayer(0.0f, 0.0f, ProfileGooeyView.this.getWidth(), getHeight(), null);
            canvas.saveLayer(0.0f, 0.0f, ProfileGooeyView.this.getWidth(), getHeight(), this.filter);
            float clamp = (MathUtils.clamp(ProfileGooeyView.this.blurIntensity, 0.22f, 0.24f) - 0.22f) / 0.019999996f;
            this.bitmapPaint.setAlpha((int) (clamp * 255.0f));
            canvas.scale(f, f2);
            canvas.drawBitmap(this.bitmaps[1], 0.0f, 0.0f, this.bitmapPaint);
            canvas.restore();
            if (clamp != 1.0f) {
                this.bitmapPaint.setAlpha((int) ((1.0f - clamp) * 255.0f));
                canvas.drawBitmap(this.bitmaps[0], 0.0f, 0.0f, this.bitmapPaint);
            }
            canvas.drawRect(0.0f, 0.0f, ProfileGooeyView.this.getWidth(), getHeight(), ProfileGooeyView.this.fadeToTop);
            canvas.restore();
            canvas.restore();
        }

        @Override
        public void release() {
            for (Bitmap bitmap : this.bitmaps) {
                if (bitmap != null) {
                    bitmap.recycle();
                }
            }
            Arrays.fill(this.bitmaps, (Object) null);
            Arrays.fill(this.bitmapCanvas, (Object) null);
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
        }

        @Override
        public void release() {
            Impl.CC.$default$release(this);
        }

        private GPUImpl(float f) {
            BlendMode blendMode;
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
            blendMode = BlendMode.SRC_IN;
            paint.setBlendMode(blendMode);
        }

        @Override
        public void setIntensity(float f) {
            RenderEffect createBlurEffect;
            RenderEffect createBlurEffect2;
            RenderNode renderNode = this.effectNode;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            createBlurEffect = RenderEffect.createBlurEffect(f, f, tileMode);
            renderNode.setRenderEffect(createBlurEffect);
            RenderNode renderNode2 = this.effectNotchNode;
            createBlurEffect2 = RenderEffect.createBlurEffect(f, f, tileMode);
            renderNode2.setRenderEffect(createBlurEffect2);
            this.filter.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
        }

        @Override
        public void setBlurIntensity(float f) {
            Shader.TileMode tileMode;
            RenderEffect createBlurEffect;
            if (f == 0.0f) {
                this.blurNode.setRenderEffect(null);
                return;
            }
            RenderNode renderNode = this.blurNode;
            float f2 = (ProfileGooeyView.this.intensity * f) / this.factorMult;
            float f3 = (f * ProfileGooeyView.this.intensity) / this.factorMult;
            tileMode = Shader.TileMode.DECAL;
            createBlurEffect = RenderEffect.createBlurEffect(f2, f3, tileMode);
            renderNode.setRenderEffect(createBlurEffect);
        }

        @Override
        public void draw(Drawer drawer, Canvas canvas) {
            RecordingCanvas beginRecording;
            RecordingCanvas beginRecording2;
            RecordingCanvas beginRecording3;
            float f;
            float f2;
            float f3;
            float f4;
            RecordingCanvas beginRecording4;
            float f5;
            float f6;
            float f7;
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
                    RectF rectF = this.wholeOptimized;
                    rectF.top = 0.0f;
                    rectF.bottom += AndroidUtilities.dp(32.0f);
                } else {
                    this.wholeOptimized.set(this.whole);
                    this.wholeOptimized.bottom += AndroidUtilities.dp(32.0f);
                }
                int ceil = (int) Math.ceil(this.wholeOptimized.width());
                int ceil2 = (int) Math.ceil(this.wholeOptimized.height());
                RectF rectF2 = this.wholeOptimized;
                float f8 = rectF2.left;
                float f9 = rectF2.top;
                this.node.setPosition(0, 0, ceil, ceil2);
                this.blurNode.setPosition(0, 0, ceil, ceil2);
                this.effectNode.setPosition(0, 0, ceil, ceil2);
                this.effectNotchNode.setPosition(0, 0, ceil, ceil2);
                float f10 = ceil;
                float f11 = ceil2;
                this.wholeOptimized.set(0.0f, 0.0f, f10, f11);
                beginRecording = this.node.beginRecording();
                float f12 = -f8;
                float f13 = -f9;
                beginRecording.translate(f12, f13);
                float ilerp = 1.0f - AndroidUtilities.ilerp(ProfileGooeyView.this.pullProgress, 0.5f, 1.0f);
                drawer.draw(beginRecording);
                this.node.endRecording();
                float f14 = (this.factorMult / 4.0f) + 1.0f;
                float f15 = ProfileGooeyView.this.blurIntensity * 0.5f;
                float f16 = this.factorMult;
                float f17 = f14 + (f15 * f16) + ((f16 - 1.0f) * 2.0f);
                beginRecording2 = this.blurNode.beginRecording();
                float f18 = 1.0f / f17;
                beginRecording2.scale(f18, f18, 0.0f, 0.0f);
                beginRecording2.drawRenderNode(this.node);
                this.blurNode.endRecording();
                float f19 = this.factorMult + 2.0f;
                beginRecording3 = this.effectNode.beginRecording();
                float f20 = 1.0f / f19;
                beginRecording3.scale(f20, f20, 0.0f, 0.0f);
                if (ilerp < 1.0f) {
                    beginRecording3.saveLayer(this.wholeOptimized, null);
                    beginRecording3.drawRenderNode(this.node);
                    beginRecording3.drawRect(this.wholeOptimized, this.blackNodePaint);
                    beginRecording3.restore();
                }
                float lerp = AndroidUtilities.lerp(0.0f, AndroidUtilities.dp(7.0f) * f19, 0.0f, 0.5f, ProfileGooeyView.this.pullProgress);
                if (ProfileGooeyView.this.getChildCount() > 0) {
                    View childAt2 = ProfileGooeyView.this.getChildAt(0);
                    float x2 = (childAt2.getX() + ((childAt2.getWidth() * childAt2.getScaleX()) / 2.0f)) - f8;
                    f4 = f19;
                    f3 = f17;
                    float y2 = ((childAt2.getY() + ((childAt2.getHeight() * childAt2.getScaleY()) / 2.0f)) + AndroidUtilities.dp(32.0f)) - f9;
                    float width2 = (childAt2.getWidth() / 2.0f) * childAt2.getScaleX();
                    ProfileGooeyView.this.path.rewind();
                    f = f11;
                    f2 = f9;
                    ProfileGooeyView.this.path.moveTo(x2 - width2, y2 - (((float) Math.cos(0.7853981633974483d)) * width2));
                    ProfileGooeyView.this.path.lineTo(x2, (y2 - width2) - (0.25f * lerp));
                    ProfileGooeyView.this.path.lineTo(x2 + width2, y2 - (((float) Math.cos(0.7853981633974483d)) * width2));
                    ProfileGooeyView.this.path.close();
                    beginRecording3.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                } else {
                    f = f11;
                    f2 = f9;
                    f3 = f17;
                    f4 = f19;
                }
                beginRecording3.saveLayerAlpha(this.wholeOptimized, (int) (ilerp * 255.0f));
                beginRecording3.drawRenderNode(this.node);
                beginRecording3.restore();
                this.effectNode.endRecording();
                beginRecording4 = this.effectNotchNode.beginRecording();
                beginRecording4.scale(f20, f20, 0.0f, 0.0f);
                if (ProfileGooeyView.this.notchInfo != null) {
                    beginRecording4.translate(f12, f13);
                    beginRecording4.translate(0.0f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView profileGooeyView = ProfileGooeyView.this;
                    NotchInfoUtils.NotchInfo notchInfo2 = profileGooeyView.notchInfo;
                    if (notchInfo2.isLikelyCircle) {
                        float min = Math.min(notchInfo2.bounds.width(), ProfileGooeyView.this.notchInfo.bounds.height()) / 2.0f;
                        RectF rectF3 = ProfileGooeyView.this.notchInfo.bounds;
                        float width3 = rectF3.bottom - (rectF3.width() / 2.0f);
                        beginRecording4.drawCircle(ProfileGooeyView.this.notchInfo.bounds.centerX(), width3, min, ProfileGooeyView.this.blackPaint);
                        ProfileGooeyView.this.path.rewind();
                        float f21 = lerp / 2.0f;
                        ProfileGooeyView.this.path.moveTo(ProfileGooeyView.this.notchInfo.bounds.centerX() - f21, width3);
                        ProfileGooeyView.this.path.lineTo(ProfileGooeyView.this.notchInfo.bounds.centerX(), min + width3 + lerp);
                        ProfileGooeyView.this.path.lineTo(ProfileGooeyView.this.notchInfo.bounds.centerX() + f21, width3);
                        ProfileGooeyView.this.path.close();
                        beginRecording4.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                    } else if (notchInfo2.isAccurate) {
                        beginRecording4.drawPath(notchInfo2.path, profileGooeyView.blackPaint);
                    } else {
                        float max = Math.max(notchInfo2.bounds.width(), ProfileGooeyView.this.notchInfo.bounds.height()) / 2.0f;
                        this.temp.set(ProfileGooeyView.this.notchInfo.bounds);
                        beginRecording4.drawRoundRect(this.temp, max, max, ProfileGooeyView.this.blackPaint);
                        ProfileGooeyView.this.path.rewind();
                        float f22 = lerp / 2.0f;
                        ProfileGooeyView.this.path.moveTo(this.temp.centerX() - f22, this.temp.bottom);
                        ProfileGooeyView.this.path.lineTo(this.temp.centerX(), this.temp.bottom + lerp);
                        ProfileGooeyView.this.path.lineTo(this.temp.centerX() + f22, this.temp.bottom);
                        ProfileGooeyView.this.path.close();
                        beginRecording4.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                    }
                    f5 = f4;
                    f6 = 1.0f;
                } else {
                    f5 = f4;
                    f6 = 1.0f;
                    beginRecording4.drawRect(0.0f, 0.0f, f10, AndroidUtilities.dp(32.0f), ProfileGooeyView.this.blackPaint);
                    ProfileGooeyView.this.path.rewind();
                    ProfileGooeyView.this.path.moveTo((f10 - lerp) / 2.0f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView.this.path.lineTo(f10 / 2.0f, AndroidUtilities.dp(32.0f) + lerp);
                    ProfileGooeyView.this.path.lineTo((lerp + f10) / 2.0f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView.this.path.close();
                    beginRecording4.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                }
                this.effectNotchNode.endRecording();
                canvas.translate(0.0f, -AndroidUtilities.dp(32.0f));
                canvas.save();
                canvas.translate(f8, f2);
                NotchInfoUtils.NotchInfo notchInfo3 = ProfileGooeyView.this.notchInfo;
                if (notchInfo3 != null) {
                    canvas.clipRect(0.0f, notchInfo3.bounds.top, f10, f);
                }
                canvas.saveLayer(this.wholeOptimized, null);
                canvas.saveLayer(this.wholeOptimized, this.filter);
                canvas.scale(f5, f5);
                canvas.drawRenderNode(this.effectNotchNode);
                canvas.drawRenderNode(this.effectNode);
                canvas.restore();
                canvas.drawRect(this.wholeOptimized, ProfileGooeyView.this.fadeToTop);
                canvas.restore();
                canvas.saveLayer(this.wholeOptimized, null);
                float f23 = ilerp * 0.75f;
                if (f23 < f6) {
                    canvas.saveLayer(this.wholeOptimized, null);
                    if (ProfileGooeyView.this.blurIntensity != 0.0f) {
                        canvas.saveLayer(this.wholeOptimized, this.filter);
                        f7 = f3;
                        canvas.scale(f7, f7);
                        canvas.drawRenderNode(this.blurNode);
                        canvas.restore();
                    } else {
                        f7 = f3;
                        canvas.drawRenderNode(this.node);
                    }
                    canvas.drawRect(this.wholeOptimized, this.blackNodePaint);
                    canvas.restore();
                } else {
                    f7 = f3;
                }
                canvas.saveLayerAlpha(this.wholeOptimized, (int) (f23 * 255.0f));
                if (ProfileGooeyView.this.blurIntensity != 0.0f) {
                    canvas.saveLayer(this.wholeOptimized, this.filter);
                    canvas.scale(f7, f7);
                    canvas.drawRenderNode(this.blurNode);
                    canvas.restore();
                } else {
                    canvas.drawRenderNode(this.node);
                }
                canvas.restore();
                canvas.drawRect(this.wholeOptimized, ProfileGooeyView.this.fadeToBottom);
                canvas.restore();
                canvas.restore();
            }
        }
    }
}
