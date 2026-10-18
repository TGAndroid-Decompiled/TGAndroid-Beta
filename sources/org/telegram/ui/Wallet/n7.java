package org.telegram.ui.Wallet;

import android.graphics.Color;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public abstract class n7 {
    public static final float[] f34644a = {0.017513232f, 0.2844959f, 1.2347647f, 0.012535676f, 0.21663007f, 0.8356014f, 0.02682078f, 0.40080056f, 2.4040875f, 0.0032399998f, 0.171f, 0.47039998f};
    public static final float[] f34645b = {0.0f, 0.47809f, 1.0f};

    public static int a(float[] fArr, int i10) {
        int i11 = i10 * 4;
        int i12 = i11 + 10;
        if (fArr != null && fArr.length >= 18 && fArr[i12] >= 0.0f) {
            return i0.a.f(0.2f, ((int) fArr[i11 + 12]) | (-16777216), ((int) fArr[i11 + 11]) | (-16777216));
        }
        return i0.a.f(0.2f, -16611884, -16748084);
    }

    public static int b(float f7) {
        float pow;
        float max = Math.max(0.0f, Math.min(1.0f, f7));
        if (max <= 0.0031308f) {
            pow = max * 12.92f;
        } else {
            pow = (((float) Math.pow(max, 0.4166666666666667d)) * 1.055f) - 0.055f;
        }
        return Math.max(0, Math.min(255, (int) ((pow * 255.0f) + 0.5f)));
    }

    public static float[] c(int i10) {
        float radians;
        double[] s10 = org.telegram.ui.ActionBar.g5.s(org.telegram.ui.ActionBar.g5.t(org.telegram.ui.ActionBar.g5.r(i10)));
        float f7 = (float) s10[0];
        float f10 = (float) s10[1];
        if (Double.isNaN(s10[2])) {
            radians = 0.0f;
        } else {
            radians = (float) Math.toRadians(s10[2]);
        }
        return new float[]{f7, f10, radians};
    }

    public static float d(float f7) {
        if (f7 <= 0.04045f) {
            return f7 / 12.92f;
        }
        return (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4d);
    }

    public static float e(int i10, int i11) {
        float f7 = ((i10 >> i11) & 255) / 255.0f;
        if (f7 <= 0.04045f) {
            return f7 / 12.92f;
        }
        return (float) Math.pow((f7 + 0.055f) / 1.055f, 2.4d);
    }

    public static float[] f(float[] fArr) {
        int i10;
        float f7;
        float f10;
        float f11;
        float[] fArr2 = new float[42];
        int i11 = 0;
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 * 4;
            int i14 = i13 + 10;
            int length = fArr.length;
            float[] fArr3 = f34645b;
            if (length >= 18 && fArr[i14] >= 0.0f) {
                fArr2[i12 + 28] = 0.6f;
                int i15 = (int) fArr[i14];
                int i16 = i12 * 3;
                int i17 = i16 + 30;
                float f12 = ((i15 >> 16) & 255) / 255.0f;
                float f13 = ((i15 >> 8) & 255) / 255.0f;
                float f14 = (i15 & 255) / 255.0f;
                float min = Math.min(f12, Math.min(f13, f14));
                float max = Math.max(f12, Math.max(f13, f14)) - min;
                float f15 = (fArr3[2] * 0.0722f) + (fArr3[1] * 0.7152f) + (fArr3[i11] * 0.2126f);
                float min2 = Math.min(1.0f, max / 0.15f);
                int i18 = (max > 0.0f ? 1 : (max == 0.0f ? 0 : -1));
                if (i18 > 0) {
                    f7 = (f12 - min) / max;
                } else {
                    f7 = 0.0f;
                }
                fArr2[i17] = com.google.android.gms.internal.play_billing.k3.y(f7, f15, min2, f15);
                int i19 = i16 + 31;
                if (i18 > 0) {
                    f10 = (f13 - min) / max;
                } else {
                    f10 = 0.0f;
                }
                fArr2[i19] = com.google.android.gms.internal.play_billing.k3.y(f10, f15, min2, f15);
                int i20 = i16 + 32;
                if (i18 > 0) {
                    f11 = (f14 - min) / max;
                } else {
                    f11 = 0.0f;
                }
                fArr2[i20] = com.google.android.gms.internal.play_billing.k3.y(f11, f15, min2, f15);
                int i21 = (int) fArr[i14];
                int i22 = (int) fArr[i13 + 11];
                int l4 = l(-16216082, i21, i22);
                int l10 = l(-15291399, i21, i22);
                for (int i23 = 0; i23 < 3; i23++) {
                    int i24 = 16 - (i23 * 8);
                    float e = e(l4, i24) * 0.73f;
                    float e7 = e(l10, i24) * 0.73f;
                    int i25 = i12 * 12;
                    fArr2[i25 + i23] = (e + e7) / 2.0f;
                    fArr2[i25 + 3 + i23] = e;
                    fArr2[i25 + 6 + i23] = e7;
                    fArr2[i25 + 9 + i23] = e;
                }
                i10 = 0;
            } else {
                i10 = 0;
                System.arraycopy(f34644a, 0, fArr2, i12 * 12, 12);
                fArr2[i12 + 28] = 1.0f;
                System.arraycopy(fArr3, 0, fArr2, (i12 * 3) + 30, 3);
            }
            i12++;
            i11 = i10;
        }
        while (i11 < 2) {
            int a2 = a(fArr, i11);
            int i26 = i11 * 3;
            fArr2[i26 + 36] = ((a2 >> 16) & 255) / 255.0f;
            fArr2[i26 + 37] = ((a2 >> 8) & 255) / 255.0f;
            fArr2[i26 + 38] = (a2 & 255) / 255.0f;
            i11++;
        }
        System.arraycopy(fArr, 6, fArr2, 24, 4);
        return fArr2;
    }

    public static float[] g(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return new float[]{0.0f, 1.0f, 1.0f};
        }
        float[] c10 = c(i0.a.f(0.5f, stargiftattributebackdrop.center_color | (-16777216), (-16777216) | stargiftattributebackdrop.edge_color));
        float[] c11 = c(-16216082);
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(c10[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        return new float[]{c10[2] - c11[2], Math.min(com.google.android.gms.internal.play_billing.k3.A(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (c10[1] * 1.5f) / 0.155f))), (c(stargiftattributebackdrop.center_color)[1] * 1.2f) / 0.173f), ((((Math.max(0.1f, c10[0] - 0.02f) / c11[0]) - 1.0f) * Math.max(0.0f, Math.min(1.0f, (0.6f - c10[0]) / 0.15f))) + 1.0f) - (exp * 0.025f)};
    }

    public static float[] h(int i10) {
        float d = d(Color.red(i10) / 255.0f);
        float d10 = d(Color.green(i10) / 255.0f);
        float d11 = d(Color.blue(i10) / 255.0f);
        float cbrt = (float) Math.cbrt((0.051445995f * d11) + (0.53633255f * d10) + (0.41222146f * d));
        float cbrt2 = (float) Math.cbrt((0.10739696f * d11) + (0.6806995f * d10) + (0.2119035f * d));
        float cbrt3 = (float) Math.cbrt((d11 * 0.6299787f) + (d10 * 0.28171885f) + (d * 0.08830246f));
        double d12 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        double d13 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        return new float[]{((0.7936178f * cbrt2) + (0.21045426f * cbrt)) - (0.004072047f * cbrt3), (float) Math.hypot(d12, d13), (float) Math.atan2(d13, d12)};
    }

    public static float[] i(float f7, float f10, float f11) {
        double d = f11;
        float cos = ((float) Math.cos(d)) * f10;
        float sin = f10 * ((float) Math.sin(d));
        float f12 = (0.21580376f * sin) + (0.39633778f * cos) + f7;
        float f13 = (f7 - (0.105561346f * cos)) - (0.06385417f * sin);
        float f14 = (f7 - (cos * 0.08948418f)) - (sin * 1.2914855f);
        float f15 = f12 * f12 * f12;
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        return new float[]{(0.23096994f * f17) + ((4.0767417f * f15) - (3.3077116f * f16)), ((2.6097574f * f16) + ((-1.268438f) * f15)) - (0.34131938f * f17), (f17 * 1.7076147f) + ((f15 * (-0.0041960864f)) - (f16 * 0.7034186f))};
    }

    public static int j(float f7, float f10, float f11) {
        float[] i10 = i(f7, f10, f11);
        loop0: for (int i11 = 0; i11 < 40; i11++) {
            for (float f12 : i10) {
                if (f12 < -0.001f || f12 > 1.001f) {
                    f10 *= 0.95f;
                    i10 = i(f7, f10, f11);
                }
            }
        }
        return Color.rgb(b(i10[0]), b(i10[1]), b(i10[2]));
    }

    public static void k(float[] fArr, int i10, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        float f7;
        float f10;
        float f11;
        int i11 = i10 * 4;
        int i12 = i11 + 10;
        float f12 = -1.0f;
        if (stargiftattributebackdrop == null) {
            f7 = -1.0f;
        } else {
            f7 = stargiftattributebackdrop.center_color & 16777215;
        }
        fArr[i12] = f7;
        int i13 = i11 + 11;
        if (stargiftattributebackdrop == null) {
            f10 = -1.0f;
        } else {
            f10 = stargiftattributebackdrop.edge_color & 16777215;
        }
        fArr[i13] = f10;
        int i14 = i11 + 12;
        if (stargiftattributebackdrop == null) {
            f11 = -1.0f;
        } else {
            f11 = stargiftattributebackdrop.pattern_color & 16777215;
        }
        fArr[i14] = f11;
        int i15 = i11 + 13;
        if (stargiftattributebackdrop != null) {
            f12 = stargiftattributebackdrop.text_color & 16777215;
        }
        fArr[i15] = f12;
    }

    public static int l(int i10, int i11, int i12) {
        int i13 = i11 | (-16777216);
        int i14 = i12 | (-16777216);
        float[] h = h(i0.a.f(0.5f, i13, i14));
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(h[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        float A = com.google.android.gms.internal.play_billing.k3.A(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (h[1] * 1.5f) / 0.155f)));
        float[] h10 = h(i13);
        float[] h11 = h(i14);
        float max = Math.max(0.0f, Math.min(1.0f, (0.6f - ((h10[0] + h11[0]) / 2.0f)) / 0.15f));
        float f7 = h(-16216082)[0];
        float f10 = h(-15291399)[0];
        float[] h12 = h(i10);
        float max2 = Math.max(-2.0f, Math.min(3.0f, (h12[0] - f7) / (f10 - f7)));
        float f11 = h11[0];
        float y3 = com.google.android.gms.internal.play_billing.k3.y(h10[0], f11, max2, f11 - 0.02f);
        float f12 = h12[0];
        float f13 = ((y3 - f12) * max) + f12 + (exp * (-0.025f));
        float f14 = h12[1];
        float f15 = f14 / 0.173f;
        float f16 = 1.0f - max;
        return j(Math.max(0.05f, Math.min(0.97f, f13)), com.google.android.gms.internal.play_billing.k3.t(h10[1], 1.1f, max, f16 * Math.min(f14 * A, f15 * h10[1] * 1.2f)), h[2]);
    }

    public static int m(float[] fArr, int i10, int i11) {
        double d;
        double d10;
        double d11;
        int i12;
        double cos;
        double sin;
        int i13 = ((i11 / 3) * 4) + 10;
        int i14 = 0;
        if (fArr.length >= 18 && fArr[i13] >= 0.0f) {
            int i15 = i10 & 16777215;
            if (i15 == 165332) {
                i14 = 2;
            } else if (i15 != 29132 && i15 != 561134) {
                if (i15 != 2267888 && i15 != 1485817) {
                    i14 = 3;
                }
            } else {
                i14 = 1;
            }
            return (((int) fArr[i13 + i14]) & 16777215) | (Color.alpha(i10) << 24);
        } else if (fArr[i11] == 0.0f && fArr[i11 + 1] == 1.0f && fArr[i11 + 2] == 1.0f) {
            return i10;
        } else {
            double[] s10 = org.telegram.ui.ActionBar.g5.s(org.telegram.ui.ActionBar.g5.t(org.telegram.ui.ActionBar.g5.r(i10)));
            double d12 = s10[0];
            double d13 = 0.8d;
            if (d12 < 0.8d) {
                d13 = 0.0d;
            }
            s10[0] = Math.max(d13, d12 * fArr[i11 + 2]);
            s10[1] = s10[1] * fArr[i11 + 1];
            if (Double.isNaN(s10[2])) {
                d = 0.0d;
            } else {
                d = s10[2];
            }
            s10[2] = Math.toDegrees(fArr[i11]) + d;
            double[] dArr = null;
            for (int i16 = 0; i16 < 40; i16++) {
                double d14 = s10[0];
                double d15 = s10[1];
                double d16 = s10[2];
                if (Double.isNaN(d16)) {
                    cos = 0.0d;
                } else {
                    cos = Math.cos((d16 * 3.141592653589793d) / 180.0d) * d15;
                }
                if (Double.isNaN(d16)) {
                    sin = 0.0d;
                } else {
                    sin = Math.sin((d16 * 3.141592653589793d) / 180.0d) * d15;
                }
                double[] j10 = org.telegram.ui.ActionBar.g5.j(org.telegram.ui.ActionBar.g5.d, new double[]{d14, cos, sin});
                for (int i17 = 0; i17 < 3; i17++) {
                    j10[i17] = Math.pow(j10[i17], 3.0d);
                }
                dArr = org.telegram.ui.ActionBar.g5.j(org.telegram.ui.ActionBar.g5.f20882f, org.telegram.ui.ActionBar.g5.j(org.telegram.ui.ActionBar.g5.f20880b, j10));
                double d17 = dArr[0];
                if (d17 >= 0.0d) {
                    double d18 = dArr[1];
                    if (d18 >= 0.0d) {
                        double d19 = dArr[2];
                        if (d19 >= 0.0d && d17 <= 1.0d && d18 <= 1.0d && d19 <= 1.0d) {
                            break;
                        }
                    } else {
                        continue;
                    }
                }
                s10[1] = s10[1] * 0.95d;
            }
            double[] dArr2 = new double[3];
            for (int i18 = 0; i18 < dArr.length; i18++) {
                if (Math.abs(dArr[i18]) > 0.0031308d) {
                    double d20 = dArr[i18];
                    if (d20 < 0.0d) {
                        i12 = -1;
                    } else {
                        i12 = 1;
                    }
                    d11 = i12;
                    d10 = (Math.pow(Math.abs(d20), 0.4166666666666667d) * 1.055d) - 0.055d;
                } else {
                    d10 = 12.92d;
                    d11 = dArr[i18];
                }
                dArr2[i18] = d10 * d11;
            }
            return i0.a.o(Color.rgb((int) Math.round(Utilities.clamp(dArr2[0], 1.0d, 0.0d) * 255.0d), (int) Math.round(Utilities.clamp(dArr2[1], 1.0d, 0.0d) * 255.0d), (int) Math.round(Utilities.clamp(dArr2[2], 1.0d, 0.0d) * 255.0d)), Color.alpha(i10));
        }
    }
}
