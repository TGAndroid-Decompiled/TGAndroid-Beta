package org.telegram.ui.Components;

import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Color;
import android.graphics.ComposeShader;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.RuntimeShader;
import android.graphics.Shader;
import android.os.Build;
import androidx.core.graphics.ColorUtils;
import androidx.core.math.MathUtils;
import com.android.billingclient.api.zzbv;
import com.google.common.base.Splitter;
import com.google.mlkit.vision.label.defaults.thin.zzc;
import java.util.Arrays;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.ColorShader;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.blur3.utils.BitmapChangeTracker;

public final class MotionBackgroundPaint {
    public final AgslImpl agslImpl;
    public int gradientHeight;
    public int gradientWidth;
    public int patternHeight;
    public int patternWidth;
    public static final float[] tmpPts = new float[4];
    public static final Matrix tmpInverse = new Matrix();
    public final ChatActivity.AnonymousClass117 patterAlphaBitmapMemo = new ChatActivity.AnonymousClass117(new EmojiView$$ExternalSyntheticLambda21(28));
    public final Splitter gradientSoftLightBitmapMemo = new Splitter(19, (byte) 0);
    public final ForwardBackground shaderImpl = new ForwardBackground();
    public final Matrix tmpMatrix = new Matrix();
    public final RectF tmpRectF = new RectF();

    public final class AgslImpl {
        public final zzc gradientShader;
        public final zzc gradientSoftLightShader;
        public float lastIntensity;
        public int lastMode;
        public final Paint paint;
        public final zzc patternShader;
        public final ChatActivity.AnonymousClass117 runtimeShaderNegative;
        public final ChatActivity.AnonymousClass117 runtimeShaderPositive;
        public final float[] tmpOut;

        public AgslImpl() {
            Paint paint = new Paint();
            this.paint = paint;
            Shader.TileMode tileMode = Shader.TileMode.CLAMP;
            this.gradientShader = new zzc(tileMode);
            this.gradientSoftLightShader = new zzc(tileMode);
            this.patternShader = new zzc(Shader.TileMode.REPEAT);
            this.runtimeShaderPositive = new ChatActivity.AnonymousClass117(R.raw.wallpaper_pos_intensity);
            this.runtimeShaderNegative = new ChatActivity.AnonymousClass117(R.raw.wallpaper_neg_intensity);
            this.tmpOut = new float[4];
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
        }
    }

    public MotionBackgroundPaint() {
        if (Build.VERSION.SDK_INT >= 33) {
            this.agslImpl = new AgslImpl();
        } else {
            this.agslImpl = null;
        }
    }

    public static void access$200(Matrix matrix, float[] fArr) {
        Matrix matrix2 = tmpInverse;
        matrix.invert(matrix2);
        float[] fArr2 = tmpPts;
        fArr2[0] = 0.0f;
        fArr2[1] = 0.0f;
        fArr2[2] = 1.0f;
        fArr2[3] = 1.0f;
        matrix2.mapPoints(fArr2);
        fArr[0] = fArr2[2] - fArr2[0];
        fArr[1] = fArr2[3] - fArr2[1];
        fArr[2] = fArr2[0];
        fArr[3] = fArr2[1];
    }

    public final void applyGradientMatrix(RectF rectF) {
        RectF rectF2 = this.tmpRectF;
        rectF2.set(0.0f, 0.0f, this.gradientWidth, this.gradientHeight);
        Matrix matrix = this.tmpMatrix;
        matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.FILL);
        ForwardBackground forwardBackground = this.shaderImpl;
        zzc zzcVar = (zzc) forwardBackground.path;
        ((Matrix) zzcVar.zzb).set(matrix);
        BitmapShader bitmapShader = (BitmapShader) zzcVar.zzc;
        if (bitmapShader != null) {
            bitmapShader.setLocalMatrix(matrix);
        }
        zzc zzcVar2 = (zzc) forwardBackground.bounds;
        ((Matrix) zzcVar2.zzb).set(matrix);
        BitmapShader bitmapShader2 = (BitmapShader) zzcVar2.zzc;
        if (bitmapShader2 != null) {
            bitmapShader2.setLocalMatrix(matrix);
        }
        AgslImpl agslImpl = this.agslImpl;
        if (agslImpl == null || Build.VERSION.SDK_INT < 33) {
            return;
        }
        float[] fArr = agslImpl.tmpOut;
        access$200(matrix, fArr);
        ChatActivity.AnonymousClass117 anonymousClass117 = agslImpl.runtimeShaderPositive;
        float[] fArr2 = (float[]) anonymousClass117.val$finalReactionsLayout;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            ((RuntimeShader) anonymousClass117.val$primaryMessage).setFloatUniform("transformGradient", fArr2);
        }
        ChatActivity.AnonymousClass117 anonymousClass118 = agslImpl.runtimeShaderNegative;
        float[] fArr3 = (float[]) anonymousClass118.val$finalReactionsLayout;
        if (Arrays.equals(fArr, fArr3)) {
            return;
        }
        System.arraycopy(fArr, 0, fArr3, 0, 4);
        ((RuntimeShader) anonymousClass118.val$primaryMessage).setFloatUniform("transformGradient", fArr3);
    }

    public final void applyPatternMatrix(Matrix matrix) {
        int i;
        BitmapShader bitmapShader;
        BitmapShader bitmapShader2;
        ForwardBackground forwardBackground = this.shaderImpl;
        access$200(matrix, (float[]) forwardBackground.loadingDrawable);
        zzc zzcVar = (zzc) forwardBackground.bounce;
        ((Matrix) zzcVar.zzb).set(matrix);
        BitmapShader bitmapShader3 = (BitmapShader) zzcVar.zzc;
        if (bitmapShader3 != null) {
            bitmapShader3.setLocalMatrix(matrix);
        }
        float[] fArr = (float[]) forwardBackground.loadingDrawable;
        boolean z = Math.abs(fArr[0] - 1.0f) <= 1.0E-4f && Math.abs(fArr[1] - 1.0f) <= 1.0E-4f;
        if (zzcVar.zzd != z) {
            zzcVar.zzd = z;
            if (Build.VERSION.SDK_INT >= 33 && (bitmapShader2 = (BitmapShader) zzcVar.zzc) != null) {
                bitmapShader2.setFilterMode(z ? 1 : 2);
            }
        }
        AgslImpl agslImpl = this.agslImpl;
        if (agslImpl == null || (i = Build.VERSION.SDK_INT) < 33) {
            return;
        }
        float[] fArr2 = agslImpl.tmpOut;
        access$200(matrix, fArr2);
        boolean z2 = Math.abs(fArr2[0] - 1.0f) <= 1.0E-4f && Math.abs(fArr2[1] - 1.0f) <= 1.0E-4f;
        zzc zzcVar2 = agslImpl.patternShader;
        if (zzcVar2.zzd != z2) {
            zzcVar2.zzd = z2;
            if (i >= 33 && (bitmapShader = (BitmapShader) zzcVar2.zzc) != null) {
                bitmapShader.setFilterMode(z2 ? 1 : 2);
            }
        }
        ChatActivity.AnonymousClass117 anonymousClass117 = agslImpl.runtimeShaderPositive;
        float[] fArr3 = (float[]) anonymousClass117.this$0;
        if (!Arrays.equals(fArr2, fArr3)) {
            System.arraycopy(fArr2, 0, fArr3, 0, 4);
            ((RuntimeShader) anonymousClass117.val$primaryMessage).setFloatUniform("transformPattern", fArr3);
        }
        ChatActivity.AnonymousClass117 anonymousClass118 = agslImpl.runtimeShaderNegative;
        float[] fArr4 = (float[]) anonymousClass118.this$0;
        if (Arrays.equals(fArr2, fArr4)) {
            return;
        }
        System.arraycopy(fArr2, 0, fArr4, 0, 4);
        ((RuntimeShader) anonymousClass118.val$primaryMessage).setFloatUniform("transformPattern", fArr4);
    }

    public final Paint getPaint(Bitmap bitmap, Bitmap bitmap2, int i, int i2, int i3, boolean z) {
        Bitmap bitmap3;
        boolean z2;
        Bitmap bitmap4 = (Bitmap) this.patterAlphaBitmapMemo.get(bitmap2);
        if (i3 >= 0) {
            int alphaComponent = ColorUtils.setAlphaComponent(i, ((Color.alpha(i) * i2) * i3) / 25500);
            Splitter splitter = this.gradientSoftLightBitmapMemo;
            if (((BitmapChangeTracker) splitter.trimmer).isInvalidated(bitmap) || alphaComponent != splitter.limit || ((Bitmap) splitter.strategy) == null) {
                Bitmap bitmap5 = (Bitmap) splitter.strategy;
                if (bitmap5 == null || bitmap5.getWidth() != bitmap.getWidth() || ((Bitmap) splitter.strategy).getHeight() != bitmap.getHeight()) {
                    splitter.strategy = Bitmap.createBitmap(bitmap);
                }
                Utilities.applySoftLight(bitmap, (Bitmap) splitter.strategy, alphaComponent);
                ((BitmapChangeTracker) splitter.trimmer).set(bitmap);
                splitter.limit = alphaComponent;
            }
            bitmap3 = (Bitmap) splitter.strategy;
        } else {
            bitmap3 = null;
        }
        this.gradientWidth = bitmap.getWidth();
        this.gradientHeight = bitmap.getHeight();
        this.patternWidth = bitmap4.getWidth();
        this.patternHeight = bitmap4.getHeight();
        boolean z3 = true;
        AgslImpl agslImpl = this.agslImpl;
        if (agslImpl != null && z && Build.VERSION.SDK_INT >= 33) {
            zzc zzcVar = agslImpl.gradientShader;
            boolean upVar = zzcVar.setup(bitmap);
            zzc zzcVar2 = agslImpl.patternShader;
            boolean upVar2 = upVar | zzcVar2.setup(bitmap4);
            Paint paint = agslImpl.paint;
            if (i3 >= 0) {
                zzc zzcVar3 = agslImpl.gradientSoftLightShader;
                if ((upVar2 | zzcVar3.setup(bitmap3)) || agslImpl.lastMode != 1) {
                    agslImpl.lastMode = 1;
                    ChatActivity.AnonymousClass117 anonymousClass117 = agslImpl.runtimeShaderPositive;
                    ((RuntimeShader) anonymousClass117.val$primaryMessage).setInputBuffer("shaderPattern", (BitmapShader) zzcVar2.zzc);
                    ((RuntimeShader) anonymousClass117.val$primaryMessage).setInputBuffer("shaderGradient", (BitmapShader) zzcVar.zzc);
                    ((RuntimeShader) anonymousClass117.val$primaryMessage).setInputBuffer("shaderGradientSoftLight", (BitmapShader) zzcVar3.zzc);
                    ((RuntimeShader) anonymousClass117.val$primaryMessage).setFloatUniform("transformGradient", (float[]) anonymousClass117.val$finalReactionsLayout);
                    ((RuntimeShader) anonymousClass117.val$primaryMessage).setFloatUniform("transformPattern", (float[]) anonymousClass117.this$0);
                    paint.setShader((RuntimeShader) anonymousClass117.val$primaryMessage);
                    return paint;
                }
            } else {
                float fClamp = MathUtils.clamp((i2 * (-i3)) / 25500.0f, 0.0f, 1.0f);
                if (upVar2 || agslImpl.lastIntensity != fClamp || agslImpl.lastMode != 2) {
                    agslImpl.lastMode = 2;
                    agslImpl.lastIntensity = fClamp;
                    ChatActivity.AnonymousClass117 anonymousClass118 = agslImpl.runtimeShaderNegative;
                    ((RuntimeShader) anonymousClass118.val$primaryMessage).setInputBuffer("shaderPattern", (BitmapShader) zzcVar2.zzc);
                    ((RuntimeShader) anonymousClass118.val$primaryMessage).setInputBuffer("shaderGradient", (BitmapShader) zzcVar.zzc);
                    ((RuntimeShader) anonymousClass118.val$primaryMessage).setFloatUniform("intensity", fClamp);
                    ((RuntimeShader) anonymousClass118.val$primaryMessage).setFloatUniform("transformGradient", (float[]) anonymousClass118.val$finalReactionsLayout);
                    ((RuntimeShader) anonymousClass118.val$primaryMessage).setFloatUniform("transformPattern", (float[]) anonymousClass118.this$0);
                    paint.setShader((RuntimeShader) anonymousClass118.val$primaryMessage);
                    return paint;
                }
            }
            return paint;
        }
        ForwardBackground forwardBackground = this.shaderImpl;
        boolean upVar3 = ((zzc) forwardBackground.path).setup(bitmap);
        zzc zzcVar4 = (zzc) forwardBackground.bounce;
        boolean upVar4 = upVar3 | zzcVar4.setup(bitmap4);
        Paint paint2 = (Paint) forwardBackground.view;
        zzc zzcVar5 = (zzc) forwardBackground.path;
        if (i3 >= 0) {
            zzc zzcVar6 = (zzc) forwardBackground.bounds;
            if ((upVar4 | zzcVar6.setup(bitmap3)) || forwardBackground.rippleDrawableColor != 1) {
                forwardBackground.rippleDrawableColor = 1;
                paint2.setShader(new ComposeShader((BitmapShader) zzcVar5.zzc, new ComposeShader((BitmapShader) zzcVar6.zzc, (BitmapShader) zzcVar4.zzc, PorterDuff.Mode.DST_IN), PorterDuff.Mode.SRC_OVER));
                return paint2;
            }
        } else {
            int alphaComponent2 = ColorUtils.setAlphaComponent(-1, (i2 * (-i3)) / 100);
            zzbv zzbvVar = (zzbv) forwardBackground.rippleDrawable;
            if (((ColorShader) zzbvVar.zza) == null || zzbvVar.zzb != alphaComponent2) {
                zzbvVar.zzb = alphaComponent2;
                zzbvVar.zza = new ColorShader(alphaComponent2);
                z2 = true;
            } else {
                z2 = false;
            }
            boolean z4 = upVar4 | z2;
            zzbv zzbvVar2 = (zzbv) forwardBackground.r;
            if (((ColorShader) zzbvVar2.zza) == null || zzbvVar2.zzb != -16777216) {
                zzbvVar2.zzb = -16777216;
                zzbvVar2.zza = new ColorShader(-16777216);
            } else {
                z3 = false;
            }
            if ((z4 | z3) || forwardBackground.rippleDrawableColor != 2) {
                forwardBackground.rippleDrawableColor = 2;
                paint2.setShader(new ComposeShader((ColorShader) zzbvVar2.zza, new ComposeShader(new ComposeShader((BitmapShader) zzcVar5.zzc, (BitmapShader) zzcVar4.zzc, PorterDuff.Mode.DST_IN), (ColorShader) zzbvVar.zza, PorterDuff.Mode.MULTIPLY), PorterDuff.Mode.SRC_OVER));
                return paint2;
            }
        }
        return paint2;
    }
}
