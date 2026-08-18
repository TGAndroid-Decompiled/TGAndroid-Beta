package org.telegram.ui.Stars;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.core.graphics.ColorUtils;
import com.google.zxing.common.detector.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;
import org.telegram.ui.Components.BatchParticlesDrawHelper;
import org.telegram.ui.Components.CubicBezierInterpolator;

public abstract class StarGiftPatterns {
    private static final BatchParticlesDrawHelper.BatchParticlesBuffer batchBuffer;
    private static final float[][] patternLocations;
    private static final float[] profileLeft;
    private static final float[] profileRight;

    static {
        float[][] fArr = {new float[]{83.33f, 24.0f, 27.33f, 0.22f, 68.66f, 75.33f, 25.33f, 0.21f, 0.0f, 86.0f, 25.33f, 0.12f, -68.66f, 75.33f, 25.33f, 0.21f, -82.66f, 13.66f, 27.33f, 0.22f, -80.0f, -33.33f, 20.0f, 0.24f, -46.5f, -63.16f, 27.0f, 0.21f, 1.0f, -82.66f, 20.0f, 0.15f, 46.5f, -63.16f, 27.0f, 0.21f, 80.0f, -33.33f, 19.33f, 0.24f, 115.66f, -63.0f, 20.0f, 0.15f, 134.0f, -10.66f, 20.0f, 0.18f, 118.66f, 55.66f, 20.0f, 0.15f, 124.33f, 98.33f, 20.0f, 0.11f, -128.0f, 98.33f, 20.0f, 0.11f, -108.0f, 55.66f, 20.0f, 0.15f, -123.33f, -10.66f, 20.0f, 0.18f, -116.0f, -63.33f, 20.0f, 0.15f}, new float[]{27.33f, -57.66f, 20.0f, 0.12f, 59.0f, -32.0f, 19.33f, 0.22f, 77.0f, 4.33f, 22.66f, 0.2f, 100.0f, 40.33f, 18.0f, 0.12f, 58.66f, 59.0f, 20.0f, 0.18f, 73.33f, 100.33f, 22.66f, 0.15f, 75.0f, 155.0f, 22.0f, 0.11f, -27.33f, -57.33f, 20.0f, 0.12f, -59.0f, -32.33f, 19.33f, 0.2f, -77.0f, 4.66f, 23.33f, 0.2f, -98.66f, 41.0f, 18.66f, 0.12f, -58.0f, 59.33f, 19.33f, 0.18f, -73.33f, 100.0f, 22.0f, 0.15f, -75.66f, 155.0f, 22.0f, 0.11f}, new float[]{-0.83f, -52.16f, 12.33f, 0.2f, 26.66f, -40.33f, 16.0f, 0.2f, 44.16f, -20.5f, 12.33f, 0.2f, 53.0f, 7.33f, 16.0f, 0.2f, 31.0f, 23.66f, 14.66f, 0.2f, 0.0f, 32.0f, 13.33f, 0.2f, -29.0f, 23.66f, 14.0f, 0.2f, -53.0f, 7.33f, 16.0f, 0.2f, -44.5f, -20.16f, 12.33f, 0.2f, -27.33f, -40.33f, 16.0f, 0.2f, 43.66f, 50.0f, 14.66f, 0.2f, -41.66f, 48.0f, 14.66f, 0.2f}, new float[]{-0.16f, -103.5f, 20.33f, 0.15f, 39.66f, -77.33f, 26.66f, 0.15f, 70.66f, -46.33f, 21.33f, 0.15f, 84.5f, -3.83f, 29.66f, 0.15f, 65.33f, 56.33f, 24.66f, 0.15f, 0.0f, 67.66f, 24.66f, 0.15f, -65.66f, 56.66f, 24.66f, 0.15f, -85.0f, -4.0f, 29.33f, 0.15f, -70.66f, -46.33f, 21.33f, 0.15f, -40.33f, -77.66f, 26.66f, 0.15f, 62.66f, -109.66f, 21.33f, 0.11f, 103.166f, -67.5f, 20.33f, 0.11f, 110.33f, 37.66f, 20.66f, 0.11f, 94.166f, 91.16f, 20.33f, 0.11f, 38.83f, 91.16f, 20.33f, 0.11f, 0.0f, 112.5f, 20.33f, 0.11f, -38.83f, 91.16f, 20.33f, 0.11f, -94.166f, 91.16f, 20.33f, 0.11f, -110.33f, 37.66f, 20.66f, 0.11f, -103.166f, -67.5f, 20.33f, 0.11f, -62.66f, -109.66f, 21.33f, 0.11f}};
        patternLocations = fArr;
        short sMax = 0;
        for (int i = 0; i < 4; i++) {
            sMax = (short) Math.max((int) sMax, fArr[i].length / 4);
        }
        batchBuffer = new BatchParticlesDrawHelper.BatchParticlesBuffer(sMax);
        profileRight = new float[]{-35.66f, -5.0f, 24.0f, 0.2388f, -14.33f, -29.33f, 20.66f, 0.32f, -15.0f, -73.66f, 19.33f, 0.32f, -2.0f, -99.66f, 18.0f, 0.1476f, -64.33f, -24.66f, 23.33f, 0.3235f, -40.66f, -53.33f, 24.0f, 0.3654f, -50.33f, -85.66f, 20.0f, 0.172f, -96.0f, -1.33f, 19.33f, 0.3343f, -136.66f, -13.0f, 18.66f, 0.2569f, -104.66f, -33.66f, 20.66f, 0.2216f, -82.0f, -62.33f, 22.66f, 0.2562f, -131.66f, -60.0f, 18.0f, 0.1316f, -105.66f, -88.33f, 18.0f, 0.1487f};
        profileLeft = new float[]{0.0f, -107.33f, 16.0f, 0.1505f, 14.33f, -84.0f, 18.0f, 0.1988f, 0.0f, -50.66f, 18.66f, 0.3225f, 13.0f, -15.0f, 18.66f, 0.37f, 43.33f, 1.0f, 18.66f, 0.3186f};
    }

    public static void drawPattern(Canvas canvas, Drawable drawable, float f, float f2, float f3, float f4) {
        drawPattern(canvas, 0, drawable, f, f2, f3, f4);
    }

    public static void drawPattern(Canvas canvas, int i, Drawable drawable, float f, float f2, float f3, float f4) {
        if (f3 <= 0.0f) {
            return;
        }
        int i2 = 0;
        while (true) {
            float[] fArr = patternLocations[i];
            if (i2 >= fArr.length) {
                return;
            }
            float f5 = fArr[i2];
            float f6 = fArr[i2 + 1];
            float f7 = fArr[i2 + 2];
            float f8 = fArr[i2 + 3];
            if (f >= f2 || i != 0) {
                f6 = f5;
                f5 = f6;
            }
            float f9 = f6 * f4;
            float f10 = f5 * f4;
            float f11 = f7 * f4;
            drawable.setBounds((int) (AndroidUtilities.dp(f9) - (AndroidUtilities.dp(f11) / 2.0f)), (int) (AndroidUtilities.dp(f10) - (AndroidUtilities.dp(f11) / 2.0f)), (int) (AndroidUtilities.dp(f9) + (AndroidUtilities.dp(f11) / 2.0f)), (int) (AndroidUtilities.dp(f10) + (AndroidUtilities.dp(f11) / 2.0f)));
            drawable.setAlpha((int) Utilities.clamp(f3 * 255.0f * f8, 255.0f, 0.0f));
            drawable.draw(canvas);
            i2 += 4;
        }
    }

    public static void drawPatternBatch(Canvas canvas, int i, Paint paint, Bitmap bitmap, float f, float f2, float f3, float f4) {
        if (f3 <= 0.0f) {
            return;
        }
        batchBuffer.fillParticleTextureCords(0.0f, 0.0f, bitmap.getWidth(), bitmap.getHeight());
        int i2 = 0;
        while (true) {
            float[] fArr = patternLocations[i];
            if (i2 < fArr.length) {
                float f5 = fArr[i2];
                float f6 = fArr[i2 + 1];
                float f7 = fArr[i2 + 2];
                float f8 = fArr[i2 + 3];
                if (f >= f2 || i != 0) {
                    f6 = f5;
                    f5 = f6;
                }
                float f9 = f6 * f4;
                float f10 = f5 * f4;
                float f11 = f7 * f4;
                BatchParticlesDrawHelper.BatchParticlesBuffer batchParticlesBuffer = batchBuffer;
                int i3 = i2 / 4;
                batchParticlesBuffer.setParticleVertexCords(i3, AndroidUtilities.dp(f9) - (AndroidUtilities.dp(f11) / 2.0f), AndroidUtilities.dp(f10) - (AndroidUtilities.dp(f11) / 2.0f), AndroidUtilities.dp(f9) + (AndroidUtilities.dp(f11) / 2.0f), AndroidUtilities.dp(f10) + (AndroidUtilities.dp(f11) / 2.0f));
                batchParticlesBuffer.setParticleColor(i3, ColorUtils.setAlphaComponent(-1, (int) (255.0f * f3 * f8)));
                i2 += 4;
            } else {
                BatchParticlesDrawHelper.draw(canvas, batchBuffer, fArr.length / 4, paint);
                return;
            }
        }
    }

    public static void drawProfileAnimatedPattern(Canvas canvas, Drawable drawable, int i, float f, float f2, View view, float f3) {
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(view.getX(), view.getY(), view.getX() + (view.getWidth() * view.getScaleX()), view.getY() + (view.getHeight() * view.getScaleY()));
        drawProfileAnimatedPattern(canvas, drawable, i, f, f2, rectF, f3);
    }

    public static void drawProfileAnimatedPattern(Canvas canvas, Drawable drawable, int i, float f, float f2, RectF rectF, float f3) {
        float f4;
        if (f2 <= 0.0f) {
            return;
        }
        float fClamp01 = Utilities.clamp01(((f2 >= 0.85f ? 1.0f : f2 / 0.85f) - 0.2f) / 0.8f);
        float f5 = rectF.left;
        float f6 = rectF.top;
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float f7 = f5 + (fWidth / 2.0f);
        float f8 = f6 + (fHeight / 2.0f);
        float fDpf2 = AndroidUtilities.dpf2(96.0f);
        float fMin = Math.min(f5, (i - fDpf2) / 2.0f);
        float fMax = Math.max(f6, (f - fDpf2) / 2.0f);
        float fMax2 = Math.max(fWidth, fDpf2);
        float fMax3 = Math.max(fHeight, fDpf2);
        float f9 = fMax2 / 2.0f;
        float f10 = fMin + f9;
        float f11 = fMax3 / 2.0f;
        float f12 = fMax + f11;
        float fDpf3 = AndroidUtilities.dpf2(24.0f);
        float fDpf4 = AndroidUtilities.dpf2(16.0f);
        float fDpf5 = AndroidUtilities.dpf2(12.0f);
        float fDpf6 = AndroidUtilities.dpf2(8.0f);
        float fDpf7 = AndroidUtilities.dpf2(4.0f);
        float f13 = fDpf3 * 2.0f;
        float f14 = f13 * 2.0f;
        float fCos = (f13 + f9) * ((float) Math.cos(Math.toRadians(120.0d)));
        float fCos2 = (fDpf4 + f11) * ((float) Math.cos(Math.toRadians(160.0d)));
        float f15 = fMax + fMax3;
        float f16 = fMin - fDpf4;
        float f17 = fMax3 / 4.0f;
        float f18 = (f12 - f17) - fDpf6;
        float f19 = fMin + fMax2;
        float f20 = f19 + fDpf4;
        float f21 = f17 + f12 + fDpf6;
        float f22 = fMin - f13;
        float f23 = f19 + f13;
        float f24 = f10 + fCos;
        float f25 = (fMax - f13) + fDpf5;
        float f26 = f10 - fCos;
        float f27 = (f15 + f13) - fDpf5;
        float f28 = f22 - fDpf6;
        float f29 = f12 + fCos2;
        float f30 = f23 + fDpf6;
        float f31 = f12 - fCos2;
        int i2 = 0;
        float[] fArr = {f10, fMax - fDpf3, 20.0f, f10, f15 + fDpf3, 20.0f, f16, f18, 23.0f, f20, f18, 18.0f, f16, f21, 24.0f, f20 - fDpf7, f21, 24.0f, f22, f12, 19.0f, f23, f12, 19.0f, f24, f25, 17.0f, f26, f25, 17.0f, f24, f27, 20.0f, f26, f27, 20.0f, f28, f29, 20.0f, f30, f29, 19.0f, f28, f31, 21.0f, f30, f31, 18.0f, fMin - f14, f12, 19.0f, f19 + f14, f12, 19.0f};
        float[] fArr2 = {0.02f, 0.42f, 0.0f, 0.32f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.14f, 0.6f, 0.16f, 0.64f, 0.14f, 0.7f, 0.14f, 0.9f, 0.2f, 0.75f, 0.2f, 0.85f, 0.09f, 0.45f, 0.09f, 0.45f, 0.09f, 0.45f, 0.11f, 0.45f, 0.14f, 0.75f, 0.2f, 0.8f};
        int i3 = 0;
        for (int i4 = 54; i3 < i4; i4 = 54) {
            float fLerp = fArr[i3];
            float f32 = fArr[i3 + 1];
            float fDpf8 = AndroidUtilities.dpf2(fArr[i3 + 2]) * 0.5f;
            float f33 = fArr2[i2];
            float f34 = 1.0f - fClamp01;
            float fClamp02 = f34 < f33 ? 1.0f : 1.0f - Utilities.clamp01((f34 - f33) / (fArr2[i2 + 1] - f33));
            if (i3 == 18 || i3 == 19 || i3 == 6 || i3 == 7) {
                fClamp02 = CubicBezierInterpolator.EASE_IN.getInterpolation(fClamp02);
            }
            float[] fArr3 = fArr;
            float fDp = f32 - (AndroidUtilities.dp(12.0f) * (1.0f - f2));
            if (fClamp02 < 1.0f) {
                fLerp = AndroidUtilities.lerp(f7, fLerp, CubicBezierInterpolator.EASE_IN.getInterpolation(fClamp02));
                fDp = AndroidUtilities.lerp(f8, fDp, fClamp02);
                f4 = 8.0f;
                fDpf8 = AndroidUtilities.lerp(AndroidUtilities.dpf2(8.0f), fDpf8, fClamp02);
            } else {
                f4 = 8.0f;
            }
            float fClamp03 = (1.0f - Utilities.clamp01(MathUtils.distance(f10, f12, fLerp, fDp) / (fMax2 * 2.0f))) * f3 * 0.5f * (fDp > ((float) AndroidUtilities.dp(f4)) + f15 ? 1.0f - Utilities.clamp01((((fDp - fMax) - fMax3) - AndroidUtilities.dp(f4)) / AndroidUtilities.dp(56.0f)) : 1.0f);
            if (fClamp02 < 1.0f) {
                fClamp03 = AndroidUtilities.lerp(0.0f, fClamp03, fClamp02);
            }
            drawable.setBounds((int) (fLerp - fDpf8), (int) (fDp - fDpf8), (int) (fLerp + fDpf8), (int) (fDp + fDpf8));
            drawable.setAlpha((int) (fClamp03 * 255.0f));
            drawable.draw(canvas);
            i3 += 3;
            i2 += 2;
            fMax3 = fMax3;
            f7 = f7;
            fArr2 = fArr2;
            fArr = fArr3;
        }
    }
}
