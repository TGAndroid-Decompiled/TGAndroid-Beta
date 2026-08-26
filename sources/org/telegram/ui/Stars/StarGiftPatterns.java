package org.telegram.ui.Stars;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import androidx.core.app.NotificationCompatBuilder;
import androidx.core.graphics.ColorUtils;
import com.google.zxing.common.detector.MathUtils;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BotFullscreenButtons$$ExternalSyntheticOutline0;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ChatActivity$$ExternalSyntheticOutline0;
import org.telegram.ui.Components.AnimatedEmojiDrawable;
import org.telegram.ui.Components.CubicBezierInterpolator;

public abstract class StarGiftPatterns {
    public static final NotificationCompatBuilder batchBuffer;
    public static final float[][] patternLocations;

    static {
        float[][] fArr = {new float[]{83.33f, 24.0f, 27.33f, 0.22f, 68.66f, 75.33f, 25.33f, 0.21f, 0.0f, 86.0f, 25.33f, 0.12f, -68.66f, 75.33f, 25.33f, 0.21f, -82.66f, 13.66f, 27.33f, 0.22f, -80.0f, -33.33f, 20.0f, 0.24f, -46.5f, -63.16f, 27.0f, 0.21f, 1.0f, -82.66f, 20.0f, 0.15f, 46.5f, -63.16f, 27.0f, 0.21f, 80.0f, -33.33f, 19.33f, 0.24f, 115.66f, -63.0f, 20.0f, 0.15f, 134.0f, -10.66f, 20.0f, 0.18f, 118.66f, 55.66f, 20.0f, 0.15f, 124.33f, 98.33f, 20.0f, 0.11f, -128.0f, 98.33f, 20.0f, 0.11f, -108.0f, 55.66f, 20.0f, 0.15f, -123.33f, -10.66f, 20.0f, 0.18f, -116.0f, -63.33f, 20.0f, 0.15f}, new float[]{27.33f, -57.66f, 20.0f, 0.12f, 59.0f, -32.0f, 19.33f, 0.22f, 77.0f, 4.33f, 22.66f, 0.2f, 100.0f, 40.33f, 18.0f, 0.12f, 58.66f, 59.0f, 20.0f, 0.18f, 73.33f, 100.33f, 22.66f, 0.15f, 75.0f, 155.0f, 22.0f, 0.11f, -27.33f, -57.33f, 20.0f, 0.12f, -59.0f, -32.33f, 19.33f, 0.2f, -77.0f, 4.66f, 23.33f, 0.2f, -98.66f, 41.0f, 18.66f, 0.12f, -58.0f, 59.33f, 19.33f, 0.18f, -73.33f, 100.0f, 22.0f, 0.15f, -75.66f, 155.0f, 22.0f, 0.11f}, new float[]{-0.83f, -52.16f, 12.33f, 0.2f, 26.66f, -40.33f, 16.0f, 0.2f, 44.16f, -20.5f, 12.33f, 0.2f, 53.0f, 7.33f, 16.0f, 0.2f, 31.0f, 23.66f, 14.66f, 0.2f, 0.0f, 32.0f, 13.33f, 0.2f, -29.0f, 23.66f, 14.0f, 0.2f, -53.0f, 7.33f, 16.0f, 0.2f, -44.5f, -20.16f, 12.33f, 0.2f, -27.33f, -40.33f, 16.0f, 0.2f, 43.66f, 50.0f, 14.66f, 0.2f, -41.66f, 48.0f, 14.66f, 0.2f}, new float[]{-0.16f, -103.5f, 20.33f, 0.15f, 39.66f, -77.33f, 26.66f, 0.15f, 70.66f, -46.33f, 21.33f, 0.15f, 84.5f, -3.83f, 29.66f, 0.15f, 65.33f, 56.33f, 24.66f, 0.15f, 0.0f, 67.66f, 24.66f, 0.15f, -65.66f, 56.66f, 24.66f, 0.15f, -85.0f, -4.0f, 29.33f, 0.15f, -70.66f, -46.33f, 21.33f, 0.15f, -40.33f, -77.66f, 26.66f, 0.15f, 62.66f, -109.66f, 21.33f, 0.11f, 103.166f, -67.5f, 20.33f, 0.11f, 110.33f, 37.66f, 20.66f, 0.11f, 94.166f, 91.16f, 20.33f, 0.11f, 38.83f, 91.16f, 20.33f, 0.11f, 0.0f, 112.5f, 20.33f, 0.11f, -38.83f, 91.16f, 20.33f, 0.11f, -94.166f, 91.16f, 20.33f, 0.11f, -110.33f, 37.66f, 20.66f, 0.11f, -103.166f, -67.5f, 20.33f, 0.11f, -62.66f, -109.66f, 21.33f, 0.11f}};
        patternLocations = fArr;
        short sMax = 0;
        for (int i = 0; i < 4; i++) {
            sMax = (short) Math.max((int) sMax, fArr[i].length / 4);
        }
        batchBuffer = new NotificationCompatBuilder(sMax);
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
            drawable.setBounds((int) (AndroidUtilities.dp(f9) - (AndroidUtilities.dp(f11) / 2.0f)), (int) (AndroidUtilities.dp(f10) - (AndroidUtilities.dp(f11) / 2.0f)), (int) ((AndroidUtilities.dp(f11) / 2.0f) + AndroidUtilities.dp(f9)), (int) ((AndroidUtilities.dp(f11) / 2.0f) + AndroidUtilities.dp(f10)));
            drawable.setAlpha((int) Utilities.clamp(f3 * 255.0f * f8, 255.0f, 0.0f));
            drawable.draw(canvas);
            i2 += 4;
        }
    }

    public static void drawPatternBatch(Canvas canvas, int i, Paint paint, Bitmap bitmap, float f, float f2, float f3) {
        NotificationCompatBuilder notificationCompatBuilder;
        float[] fArr;
        if (f3 <= 0.0f) {
            return;
        }
        float width = bitmap.getWidth();
        float height = bitmap.getHeight();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            notificationCompatBuilder = batchBuffer;
            int i4 = notificationCompatBuilder.mGroupAlertBehavior;
            fArr = (float[]) notificationCompatBuilder.mBuilder;
            if (i3 >= i4) {
                break;
            }
            NotificationCompatBuilder.bufferVertexSet(fArr, i3, 0.0f, 0.0f, width, height);
            i3++;
        }
        while (true) {
            float[] fArr2 = patternLocations[i];
            int length = fArr2.length;
            int[] iArr = (int[]) notificationCompatBuilder.mExtras;
            float[] fArr3 = (float[]) notificationCompatBuilder.mContext;
            if (i2 >= length) {
                int length2 = fArr2.length / 4;
                canvas.drawVertices(Canvas.VertexMode.TRIANGLES, length2 * 8, fArr3, 0, fArr, 0, iArr, 0, (short[]) notificationCompatBuilder.mBuilderCompat, 0, length2 * 6, paint);
                return;
            }
            float f4 = fArr2[i2];
            float f5 = fArr2[i2 + 1];
            float f6 = fArr2[i2 + 2];
            float f7 = fArr2[i2 + 3];
            if (f >= f2 || i != 0) {
                f5 = f4;
                f4 = f5;
            }
            float f8 = f5 * 1.0f;
            float f9 = f4 * 1.0f;
            float f10 = f6 * 1.0f;
            int i5 = i2 / 4;
            NotificationCompatBuilder.bufferVertexSet(fArr3, i5, AndroidUtilities.dp(f8) - (AndroidUtilities.dp(f10) / 2.0f), AndroidUtilities.dp(f9) - (AndroidUtilities.dp(f10) / 2.0f), (AndroidUtilities.dp(f10) / 2.0f) + AndroidUtilities.dp(f8), (AndroidUtilities.dp(f10) / 2.0f) + AndroidUtilities.dp(f9));
            int alphaComponent = ColorUtils.setAlphaComponent(-1, (int) (255.0f * f3 * f7));
            int i6 = i5 * 4;
            iArr[i6] = alphaComponent;
            iArr[i6 + 1] = alphaComponent;
            iArr[i6 + 2] = alphaComponent;
            iArr[i6 + 3] = alphaComponent;
            i2 += 4;
        }
    }

    public static void drawProfileAnimatedPattern(Canvas canvas, AnimatedEmojiDrawable.SwapAnimatedEmojiDrawable swapAnimatedEmojiDrawable, int i, float f, float f2, RectF rectF, float f3) {
        float fClamp01;
        float f4 = f2;
        int i2 = 0;
        if (f4 <= 0.0f) {
            return;
        }
        float fClamp02 = Utilities.clamp01(((f4 >= 0.85f ? 1.0f : f4 / 0.85f) - 0.2f) / 0.8f);
        float f5 = rectF.left;
        float f6 = rectF.top;
        float fWidth = rectF.width();
        float fHeight = rectF.height();
        float f7 = (fWidth / 2.0f) + f5;
        float f8 = (fHeight / 2.0f) + f6;
        float fDpf2 = AndroidUtilities.dpf2(96.0f);
        float fMin = Math.min(f5, (i - fDpf2) / 2.0f);
        float fM = ChatActivity$$ExternalSyntheticOutline0.m(f, fDpf2, 2.0f, f6);
        float fMax = Math.max(fWidth, fDpf2);
        float fMax2 = Math.max(fHeight, fDpf2);
        float f9 = fMax / 2.0f;
        float f10 = fMin + f9;
        float f11 = fMax2 / 2.0f;
        float f12 = fM + f11;
        float fDpf3 = AndroidUtilities.dpf2(24.0f);
        float fDpf4 = AndroidUtilities.dpf2(16.0f);
        float fDpf5 = AndroidUtilities.dpf2(12.0f);
        float fDpf6 = AndroidUtilities.dpf2(8.0f);
        float fDpf7 = AndroidUtilities.dpf2(4.0f);
        float f13 = fDpf3 * 2.0f;
        float f14 = f13 * 2.0f;
        float f15 = 1.0f;
        float fCos = (f13 + f9) * ((float) Math.cos(Math.toRadians(120.0d)));
        float fCos2 = (fDpf4 + f11) * ((float) Math.cos(Math.toRadians(160.0d)));
        float f16 = fM + fMax2;
        float f17 = fMin - fDpf4;
        float f18 = fMax2 / 4.0f;
        float f19 = (f12 - f18) - fDpf6;
        float f20 = fMin + fMax;
        float f21 = f20 + fDpf4;
        float f22 = f12 + f18 + fDpf6;
        float f23 = fMin - f13;
        float f24 = f20 + f13;
        float f25 = f10 + fCos;
        float f26 = (fM - f13) + fDpf5;
        float f27 = f10 - fCos;
        float f28 = (f16 + f13) - fDpf5;
        float f29 = f23 - fDpf6;
        float f30 = f12 + fCos2;
        float f31 = f24 + fDpf6;
        float f32 = f12 - fCos2;
        float[] fArr = {f10, fM - fDpf3, 20.0f, f10, f16 + fDpf3, 20.0f, f17, f19, 23.0f, f21, f19, 18.0f, f17, f22, 24.0f, f21 - fDpf7, f22, 24.0f, f23, f12, 19.0f, f24, f12, 19.0f, f25, f26, 17.0f, f27, f26, 17.0f, f25, f28, 20.0f, f27, f28, 20.0f, f29, f30, 20.0f, f31, f30, 19.0f, f29, f32, 21.0f, f31, f32, 18.0f, fMin - f14, f12, 19.0f, f20 + f14, f12, 19.0f};
        float[] fArr2 = {0.02f, 0.42f, 0.0f, 0.32f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.0f, 0.4f, 0.14f, 0.6f, 0.16f, 0.64f, 0.14f, 0.7f, 0.14f, 0.9f, 0.2f, 0.75f, 0.2f, 0.85f, 0.09f, 0.45f, 0.09f, 0.45f, 0.09f, 0.45f, 0.11f, 0.45f, 0.14f, 0.75f, 0.2f, 0.8f};
        int i3 = 0;
        for (int i4 = 54; i3 < i4; i4 = 54) {
            float fLerp = fArr[i3];
            float f33 = fArr[i3 + 1];
            float fDpf8 = AndroidUtilities.dpf2(fArr[i3 + 2]) * 0.5f;
            float f34 = fArr2[i2];
            float f35 = f15 - fClamp02;
            float fClamp03 = f35 < f34 ? 1.0f : f15 - Utilities.clamp01((f35 - f34) / (fArr2[i2 + 1] - f34));
            float[] fArr3 = fArr;
            if (i3 == 18 || i3 == 19 || i3 == 6 || i3 == 7) {
                fClamp03 = CubicBezierInterpolator.EASE_IN.getInterpolation(fClamp03);
            }
            float[] fArr4 = fArr2;
            float fM2 = BotFullscreenButtons$$ExternalSyntheticOutline0.m(1.0f, f4, AndroidUtilities.dp(12.0f), f33);
            if (fClamp03 < 1.0f) {
                fLerp = AndroidUtilities.lerp(f7, fLerp, CubicBezierInterpolator.EASE_IN.getInterpolation(fClamp03));
                fM2 = AndroidUtilities.lerp(f8, fM2, fClamp03);
                fDpf8 = AndroidUtilities.lerp(AndroidUtilities.dpf2(8.0f), fDpf8, fClamp03);
            }
            if (fM2 > AndroidUtilities.dp(8.0f) + f16) {
                f15 = 1.0f;
                fClamp01 = 1.0f - Utilities.clamp01((((fM2 - fM) - fMax2) - AndroidUtilities.dp(8.0f)) / AndroidUtilities.dp(56.0f));
            } else {
                f15 = 1.0f;
                fClamp01 = 1.0f;
            }
            float fClamp04 = (f15 - Utilities.clamp01(MathUtils.distance(f10, f12, fLerp, fM2) / (fMax * 2.0f))) * f3 * 0.5f * fClamp01;
            if (fClamp03 < 1.0f) {
                fClamp04 = AndroidUtilities.lerp(0.0f, fClamp04, fClamp03);
            }
            swapAnimatedEmojiDrawable.setBounds((int) (fLerp - fDpf8), (int) (fM2 - fDpf8), (int) (fLerp + fDpf8), (int) (fM2 + fDpf8));
            swapAnimatedEmojiDrawable.alpha = (int) (fClamp04 * 255.0f);
            swapAnimatedEmojiDrawable.draw(canvas);
            i3 += 3;
            i2 += 2;
            fMax2 = fMax2;
            f4 = f2;
            fArr = fArr3;
            fArr2 = fArr4;
        }
    }
}
