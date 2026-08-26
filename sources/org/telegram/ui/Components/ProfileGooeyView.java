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
import androidx.recyclerview.widget.DiffUtil;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotchInfoUtils;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.Utilities;

public class ProfileGooeyView extends FrameLayout {
    private static final float AVATAR_SIZE_DP = 100.0f;
    private static final float BLACK_KING_BAR = 32.0f;
    private final Paint blackPaint;
    private float blurIntensity;
    private boolean enabled;
    private final Impl impl;
    private float intensity;
    public NotchInfoUtils.NotchInfo notchInfo;
    private final Path path;
    private float pullProgress;

    public final class CPUImpl implements Impl {
        private Bitmap bitmap;
        private Canvas bitmapCanvas;
        private int bitmapOrigH;
        private int bitmapOrigW;
        private final Paint bitmapPaint;
        private final Paint bitmapPaint2;
        private int optimizedH;
        private int optimizedW;
        private final float scaleConst;

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
                if (ProfileGooeyView.this.notchInfo != null) {
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
                } else {
                    this.bitmapCanvas.drawRect(0.0f, 0.0f, this.optimizedW, AndroidUtilities.dp(32.0f), ProfileGooeyView.this.blackPaint);
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
            int iDp = AndroidUtilities.dp(32.0f) + iMin;
            this.bitmapOrigH = iDp;
            this.bitmap = Bitmap.createBitmap((int) (this.bitmapOrigW / 6.0f), (int) (iDp / 6.0f), Bitmap.Config.ARGB_8888);
            this.bitmapCanvas = new Canvas(this.bitmap);
        }

        @Override
        public final void setBlurIntensity(float f) {
            Impl.CC.$default$setBlurIntensity(this, f);
        }

        @Override
        public final void setIntensity(float f) {
            Impl.CC.$default$setIntensity(this, f);
        }
    }

    public interface Drawer {
        void draw(Canvas canvas);
    }

    public final class GPUImpl implements Impl {
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
        public void draw(Drawer drawer, Canvas canvas) {
            float f;
            Paint paint;
            float f2;
            if (canvas.isHardwareAccelerated()) {
                this.whole.set(0.0f, 0.0f, ProfileGooeyView.this.getWidth(), ProfileGooeyView.this.getHeight());
                if (ProfileGooeyView.this.getChildCount() > 0) {
                    View childAt = ProfileGooeyView.this.getChildAt(0);
                    float scaleX = childAt.getScaleX() * childAt.getWidth();
                    float scaleY = childAt.getScaleY() * childAt.getHeight();
                    float x = childAt.getX();
                    float y = childAt.getY();
                    this.wholeOptimized.set(x, y, scaleX + x, scaleY + y);
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
                float f3 = rectF.left;
                float f4 = rectF.top;
                this.node.setPosition(0, 0, iCeil, iCeil2);
                this.blurNode.setPosition(0, 0, iCeil, iCeil2);
                this.effectNode.setPosition(0, 0, iCeil, iCeil2);
                this.effectNotchNode.setPosition(0, 0, iCeil, iCeil2);
                float f5 = iCeil;
                float f6 = iCeil2;
                this.wholeOptimized.set(0.0f, 0.0f, f5, f6);
                RecordingCanvas recordingCanvasBeginRecording = this.node.beginRecording();
                float f7 = -f3;
                float f8 = -f4;
                recordingCanvasBeginRecording.translate(f7, f8);
                int iIlerp = (int) ((1.0f - AndroidUtilities.ilerp(ProfileGooeyView.this.pullProgress, 0.5f, 1.0f)) * 255.0f);
                int iClamp = MathUtils.clamp(iIlerp, 0, 255);
                drawer.draw(recordingCanvasBeginRecording);
                this.node.endRecording();
                float f9 = (this.factorMult / 4.0f) + 1.0f;
                float f10 = ProfileGooeyView.this.blurIntensity * 0.5f;
                float f11 = this.factorMult;
                float fM = DiffUtil.m(f11, 1.0f, 2.0f, (f10 * f11) + f9);
                RecordingCanvas recordingCanvasBeginRecording2 = this.blurNode.beginRecording();
                float f12 = 1.0f / fM;
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
                    float scaleX2 = (((childAt2.getScaleX() * childAt2.getWidth()) / 2.0f) + childAt2.getX()) - f3;
                    f = fLerp;
                    float scaleY2 = ((((childAt2.getScaleY() * childAt2.getHeight()) / 2.0f) + childAt2.getY()) + AndroidUtilities.dp(32.0f)) - f4;
                    float scaleX3 = childAt2.getScaleX() * (childAt2.getWidth() / 2.0f);
                    ProfileGooeyView.this.path.rewind();
                    ProfileGooeyView.this.path.moveTo(scaleX2 - scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
                    ProfileGooeyView.this.path.lineTo(scaleX2, (scaleY2 - scaleX3) - (0.25f * f));
                    ProfileGooeyView.this.path.lineTo(scaleX2 + scaleX3, scaleY2 - (((float) Math.cos(0.7853981633974483d)) * scaleX3));
                    ProfileGooeyView.this.path.close();
                    recordingCanvasBeginRecording3.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                } else {
                    f = fLerp;
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
                if (ProfileGooeyView.this.notchInfo != null) {
                    recordingCanvasBeginRecording4.translate(f7, f8);
                    recordingCanvasBeginRecording4.translate(0.0f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView profileGooeyView = ProfileGooeyView.this;
                    NotchInfoUtils.NotchInfo notchInfo2 = profileGooeyView.notchInfo;
                    if (notchInfo2.isLikelyCircle) {
                        float fMin = Math.min(notchInfo2.bounds.width(), ProfileGooeyView.this.notchInfo.bounds.height()) / 2.0f;
                        RectF rectF2 = ProfileGooeyView.this.notchInfo.bounds;
                        float fWidth = rectF2.bottom - (rectF2.width() / 2.0f);
                        recordingCanvasBeginRecording4.drawCircle(ProfileGooeyView.this.notchInfo.bounds.centerX(), fWidth, fMin, ProfileGooeyView.this.blackPaint);
                        ProfileGooeyView.this.path.rewind();
                        float f15 = f / 2.0f;
                        ProfileGooeyView.this.path.moveTo(ProfileGooeyView.this.notchInfo.bounds.centerX() - f15, fWidth);
                        ProfileGooeyView.this.path.lineTo(ProfileGooeyView.this.notchInfo.bounds.centerX(), fMin + fWidth + f);
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
                        float f16 = f / 2.0f;
                        ProfileGooeyView.this.path.moveTo(this.temp.centerX() - f16, this.temp.bottom);
                        ProfileGooeyView.this.path.lineTo(this.temp.centerX(), this.temp.bottom + f);
                        ProfileGooeyView.this.path.lineTo(this.temp.centerX() + f16, this.temp.bottom);
                        ProfileGooeyView.this.path.close();
                        recordingCanvasBeginRecording4.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                    }
                    paint = null;
                } else {
                    paint = null;
                    recordingCanvasBeginRecording4.drawRect(0.0f, 0.0f, f5, AndroidUtilities.dp(32.0f), ProfileGooeyView.this.blackPaint);
                    ProfileGooeyView.this.path.rewind();
                    ProfileGooeyView.this.path.moveTo((f5 - f) / 2.0f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView.this.path.lineTo(f5 / 2.0f, AndroidUtilities.dp(32.0f) + f);
                    ProfileGooeyView.this.path.lineTo((f5 + f) / 2.0f, AndroidUtilities.dp(32.0f));
                    ProfileGooeyView.this.path.close();
                    recordingCanvasBeginRecording4.drawPath(ProfileGooeyView.this.path, ProfileGooeyView.this.blackPaint);
                }
                this.effectNotchNode.endRecording();
                canvas.save();
                canvas.translate(f3, f4 - AndroidUtilities.dp(32.0f));
                NotchInfoUtils.NotchInfo notchInfo3 = ProfileGooeyView.this.notchInfo;
                if (notchInfo3 != null) {
                    canvas.clipRect(0.0f, notchInfo3.bounds.top, f5, f6);
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
                        f2 = fM;
                        canvas.scale(f2, f2);
                        canvas.drawRenderNode(this.blurNode);
                        canvas.restore();
                    } else {
                        f2 = fM;
                        canvas.drawRenderNode(this.node);
                    }
                    canvas.drawRect(this.wholeOptimized, this.blackNodePaint);
                    canvas.restore();
                } else {
                    f2 = fM;
                }
                if (iClamp2 > 0) {
                    if (iClamp2 != 255) {
                        canvas.saveLayerAlpha(this.wholeOptimized, iClamp2);
                    }
                    if (ProfileGooeyView.this.blurIntensity != 0.0f) {
                        canvas.saveLayer(this.wholeOptimized, this.filter);
                        canvas.scale(f2, f2);
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
            Impl.CC.$default$onSizeChanged(this, i, i2);
        }

        @Override
        public void setBlurIntensity(float f) {
            if (f == 0.0f) {
                this.blurNode.setRenderEffect(null);
                return;
            }
            RenderNode renderNode = this.blurNode;
            float f2 = (ProfileGooeyView.this.intensity * f) / this.factorMult;
            float f3 = (ProfileGooeyView.this.intensity * f) / this.factorMult;
            Shader.TileMode unused = Shader.TileMode.DECAL;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f2, f3, Shader.TileMode.DECAL));
        }

        @Override
        public void setIntensity(float f) {
            RenderNode renderNode = this.effectNode;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            renderNode.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP));
            this.effectNotchNode.setRenderEffect(RenderEffect.createBlurEffect(f, f, Shader.TileMode.CLAMP));
            this.filter.setColorFilter(new ColorMatrixColorFilter(new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 51.0f, -6375.0f}));
        }

        private GPUImpl(float f) {
            this.filter = new Paint(1);
            this.node = new RenderNode("render");
            this.effectNotchNode = new RenderNode("effectNotch");
            this.effectNode = new RenderNode("effect");
            this.blurNode = new RenderNode("blur");
            this.whole = new RectF();
            this.temp = new RectF();
            Paint paint = new Paint();
            this.blackNodePaint = paint;
            this.wholeOptimized = new RectF();
            this.factorMult = f;
            paint.setColor(-16777216);
            paint.setBlendMode(BlendMode.SRC_IN);
        }
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

    public void lambda$draw$0(Canvas canvas) {
        canvas.save();
        canvas.translate(0.0f, AndroidUtilities.dp(32.0f));
        super.draw(canvas);
        canvas.restore();
    }

    @Override
    public void draw(Canvas canvas) {
        if (this.enabled) {
            this.impl.draw(new EmojiView$$ExternalSyntheticLambda21(this, 13), canvas);
        } else {
            super.draw(canvas);
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

    public float getEndOffset(boolean z, float f) {
        float fHeight;
        if (this.notchInfo == null) {
            return -(AndroidUtilities.dp(100.0f) + AndroidUtilities.dp(16.0f) + (z ? AndroidUtilities.statusBarHeight : 0));
        }
        float fDp = AndroidUtilities.dp(16.0f);
        NotchInfoUtils.NotchInfo notchInfo = this.notchInfo;
        boolean z2 = notchInfo.isLikelyCircle;
        RectF rectF = notchInfo.bounds;
        if (z2) {
            fHeight = (getAvatarEndScale() * this.notchInfo.bounds.width()) + rectF.width();
        } else {
            fHeight = rectF.height() - this.notchInfo.bounds.top;
        }
        return -(fDp + fHeight);
    }

    public boolean hasNotchInfo() {
        return this.notchInfo != null;
    }

    @Override
    public void onSizeChanged(int i, int i2, int i3, int i4) {
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

    public interface Impl {
        void draw(Drawer drawer, Canvas canvas);

        void onSizeChanged(int i, int i2);

        void setBlurIntensity(float f);

        void setIntensity(float f);

        public abstract class CC {
            public static void $default$setBlurIntensity(Impl impl, float f) {
            }

            public static void $default$setIntensity(Impl impl, float f) {
            }

            public static void $default$onSizeChanged(Impl impl, int i, int i2) {
            }
        }
    }
}
