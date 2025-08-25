package org.telegram.ui.Stars;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
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
        short s = 0;
        for (int i = 0; i < 4; i++) {
            s = (short) Math.max((int) s, fArr[i].length / 4);
        }
        batchBuffer = new BatchParticlesDrawHelper.BatchParticlesBuffer(s);
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
            drawable.setAlpha((int) (255.0f * f3 * f8));
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

    public static void drawProfilePattern(Canvas canvas, Drawable drawable, float f, float f2, float f3, float f4) {
        if (f3 <= 0.0f) {
            return;
        }
        int i = 0;
        if (f4 > 0.0f) {
            int i2 = 0;
            while (true) {
                float[] fArr = profileLeft;
                if (i2 >= fArr.length) {
                    break;
                }
                float f5 = fArr[i2];
                float f6 = fArr[i2 + 1];
                float f7 = fArr[i2 + 2];
                float f8 = fArr[i2 + 3];
                drawable.setBounds((int) ((AndroidUtilities.dpf2(f5) + 0.0f) - (AndroidUtilities.dpf2(f7) / 2.0f)), (int) ((f2 + AndroidUtilities.dpf2(f6)) - (AndroidUtilities.dpf2(f7) / 2.0f)), (int) (AndroidUtilities.dpf2(f5) + 0.0f + (AndroidUtilities.dpf2(f7) / 2.0f)), (int) (f2 + AndroidUtilities.dpf2(f6) + (AndroidUtilities.dpf2(f7) / 2.0f)));
                drawable.setAlpha((int) (f3 * 255.0f * f8 * f4));
                drawable.draw(canvas);
                i2 += 4;
            }
            float f9 = ((f / AndroidUtilities.density) - 77.5f) - 173.33f;
            int max = Math.max(0, Math.round(f9 / 27.25f));
            if (max % 2 == 0) {
                max++;
            }
            for (int i3 = 0; i3 < max; i3++) {
                float f10 = ((i3 / (max - 1)) * f9) + 77.5f;
                float f11 = i3 % 2 == 0 ? 0.0f : -12.5f;
                drawable.setBounds((int) ((AndroidUtilities.dpf2(f10) + 0.0f) - (AndroidUtilities.dpf2(17.0f) / 2.0f)), (int) ((f2 + AndroidUtilities.dpf2(f11)) - (AndroidUtilities.dpf2(17.0f) / 2.0f)), (int) (AndroidUtilities.dpf2(f10) + 0.0f + (AndroidUtilities.dpf2(17.0f) / 2.0f)), (int) (f2 + AndroidUtilities.dpf2(f11) + (AndroidUtilities.dpf2(17.0f) / 2.0f)));
                drawable.setAlpha((int) (f3 * 255.0f * 0.21f * f4));
                drawable.draw(canvas);
            }
        }
        while (true) {
            float[] fArr2 = profileRight;
            if (i >= fArr2.length) {
                return;
            }
            float f12 = fArr2[i];
            float f13 = fArr2[i + 1];
            float f14 = fArr2[i + 2];
            float f15 = fArr2[i + 3];
            drawable.setBounds((int) ((f + AndroidUtilities.dpf2(f12)) - (AndroidUtilities.dpf2(f14) / 2.0f)), (int) ((f2 + AndroidUtilities.dpf2(f13)) - (AndroidUtilities.dpf2(f14) / 2.0f)), (int) (f + AndroidUtilities.dpf2(f12) + (AndroidUtilities.dpf2(f14) / 2.0f)), (int) (f2 + AndroidUtilities.dpf2(f13) + (AndroidUtilities.dpf2(f14) / 2.0f)));
            drawable.setAlpha((int) (f3 * 255.0f * f15));
            drawable.draw(canvas);
            i += 4;
        }
    }

    public static void drawProfileAnimatedPattern(Canvas canvas, Drawable drawable, int i, float f, float f2, View view) {
        float clamp01;
        float[] fArr;
        float f3;
        float f4;
        float f5;
        float f6;
        if (f2 <= 0.0f) {
            return;
        }
        float clamp012 = Utilities.clamp01(((f2 >= 0.85f ? 1.0f : f2 / 0.85f) - 0.2f) / 0.8f);
        float x = view.getX();
        float y = view.getY();
        float width = view.getWidth() * view.getScaleX();
        float height = view.getHeight() * view.getScaleY();
        float f7 = x + (width / 2.0f);
        float f8 = y + (height / 2.0f);
        float dpf2 = AndroidUtilities.dpf2(96.0f);
        float min = Math.min(x, (i - dpf2) / 2.0f);
        float max = Math.max(y, (f - dpf2) / 2.0f);
        float max2 = Math.max(width, dpf2);
        float max3 = Math.max(height, dpf2);
        float f9 = max2 / 2.0f;
        float f10 = min + f9;
        float f11 = max3 / 2.0f;
        float f12 = max + f11;
        float dpf22 = AndroidUtilities.dpf2(24.0f);
        float dpf23 = AndroidUtilities.dpf2(16.0f);
        float dpf24 = AndroidUtilities.dpf2(12.0f);
        float dpf25 = AndroidUtilities.dpf2(8.0f);
        float dpf26 = AndroidUtilities.dpf2(4.0f);
        float f13 = dpf22 * 2.0f;
        float f14 = f13 * 2.0f;
        float cos = (f13 + f9) * ((float) Math.cos(Math.toRadians(120.0d)));
        float cos2 = (dpf23 + f11) * ((float) Math.cos(Math.toRadians(160.0d)));
        float f15 = max + max3;
        float f16 = min - dpf23;
        float f17 = max3 / 4.0f;
        float f18 = (f12 - f17) - dpf25;
        float f19 = min + max2;
        float f20 = f19 + dpf23;
        float f21 = f17 + f12 + dpf25;
        float f22 = min - f13;
        float f23 = f19 + f13;
        float f24 = f10 + cos;
        float f25 = (max - f13) + dpf24;
        float f26 = f10 - cos;
        float f27 = (f15 + f13) - dpf24;
        float f28 = f22 - dpf25;
        float f29 = f12 + cos2;
        float f30 = f23 + dpf25;
        float f31 = f12 - cos2;
        int i2 = 0;
        float[] fArr2 = {f10, max - dpf22, 20.0f, f10, f15 + dpf22, 20.0f, f16, f18, 23.0f, f20, f18, 18.0f, f16, f21, 24.0f, f20 - dpf26, f21, 24.0f, f22, f12, 19.0f, f23, f12, 19.0f, f24, f25, 17.0f, f26, f25, 17.0f, f24, f27, 20.0f, f26, f27, 20.0f, f28, f29, 20.0f, f30, f29, 19.0f, f28, f31, 21.0f, f30, f31, 18.0f, min - f14, f12, 19.0f, f19 + f14, f12, 19.0f};
        float[] fArr3 = {0.02f, 0.42f, 0.0f, 0.32f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.14f, 0.6f, 0.16f, 0.64f, 0.14f, 0.7f, 0.14f, 0.9f, 0.2f, 0.75f, 0.2f, 0.85f, 0.09f, 0.45f, 0.09f, 0.45f, 0.09f, 0.45f, 0.11f, 0.45f, 0.14f, 0.75f, 0.2f, 0.8f};
        int i3 = 0;
        for (int i4 = 54; i3 < i4; i4 = 54) {
            float f32 = fArr2[i3];
            float f33 = fArr2[i3 + 1];
            float dpf27 = AndroidUtilities.dpf2(fArr2[i3 + 2]) * 0.5f;
            float f34 = fArr3[i2];
            float f35 = fArr3[i2 + 1];
            float f36 = 1.0f - clamp012;
            if (f36 < f34) {
                fArr = fArr3;
                clamp01 = 1.0f;
            } else {
                clamp01 = 1.0f - Utilities.clamp01((f36 - f34) / (f35 - f34));
                fArr = fArr3;
            }
            if (i3 == 18 || i3 == 19 || i3 == 6 || i3 == 7) {
                clamp01 = CubicBezierInterpolator.EASE_IN.getInterpolation(clamp01);
            }
            float[] fArr4 = fArr2;
            float dp = f33 - (AndroidUtilities.dp(12.0f) * (1.0f - f2));
            if (clamp01 < 1.0f) {
                f32 = AndroidUtilities.lerp(f7, f32, CubicBezierInterpolator.EASE_IN.getInterpolation(clamp01));
                dp = AndroidUtilities.lerp(f8, dp, clamp01);
                f3 = f7;
                f4 = 8.0f;
                dpf27 = AndroidUtilities.lerp(AndroidUtilities.dpf2(8.0f), dpf27, clamp01);
            } else {
                f3 = f7;
                f4 = 8.0f;
            }
            if (dp > AndroidUtilities.dp(f4) + f15) {
                f5 = max3;
                f6 = 1.0f - Utilities.clamp01((((dp - max) - max3) - AndroidUtilities.dp(f4)) / AndroidUtilities.dp(56.0f));
            } else {
                f5 = max3;
                f6 = 1.0f;
            }
            float clamp013 = (1.0f - Utilities.clamp01(MathUtils.distance(f10, f12, f32, dp) / (max2 * 2.0f))) * 0.5f * f6;
            if (clamp01 < 1.0f) {
                clamp013 = AndroidUtilities.lerp(0.0f, clamp013, clamp01);
            }
            drawable.setBounds((int) (f32 - dpf27), (int) (dp - dpf27), (int) (f32 + dpf27), (int) (dp + dpf27));
            drawable.setAlpha((int) (clamp013 * 255.0f));
            drawable.draw(canvas);
            i3 += 3;
            i2 += 2;
            max3 = f5;
            f7 = f3;
            fArr3 = fArr;
            fArr2 = fArr4;
        }
    }
}
