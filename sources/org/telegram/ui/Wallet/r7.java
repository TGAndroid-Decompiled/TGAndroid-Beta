package org.telegram.ui.Wallet;

import android.graphics.Color;
import android.util.LruCache;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
public abstract class r7 {
    public static final LruCache f43118a = new LruCache(128);
    public static final float[] f43119b = {0.017513232f, 0.2844959f, 1.2347647f, 0.012535676f, 0.21663007f, 0.8356014f, 0.02682078f, 0.40080056f, 2.4040875f, 0.0032399998f, 0.171f, 0.47039998f};
    public static final float[] f43120c = {0.0f, 0.47809f, 1.0f};
    public static final LruCache d = new LruCache(64);
    public static final int f43121e;

    static {
        float[] j3 = j(-16748084);
        float f10 = j3[0] * 0.876903f;
        float f11 = j3[2];
        float e10 = e(f10, f11);
        float f12 = f11;
        for (int i7 = -15; i7 <= 15; i7++) {
            float radians = ((float) Math.toRadians(i7)) + f11;
            float e11 = e(f10, radians);
            if (e11 > 0.002f + e10) {
                f12 = radians;
                e10 = e11;
            }
        }
        float z9 = com.google.android.recaptcha.internal.a.z(f12, f11, 0.723f, f11);
        f43121e = l(f10, e(f10, z9), z9);
    }

    public static int a(int i7, float[] fArr) {
        int i10;
        int o4;
        if (i7 == -16216082) {
            i10 = -14456619;
        } else {
            i10 = -14184457;
        }
        if (fArr != null && fArr.length >= 18) {
            float f10 = fArr[10];
            if (f10 < 0.0f) {
                o4 = i10;
            } else {
                o4 = o(i7, (int) f10, (int) fArr[11]);
            }
            float f11 = fArr[14];
            if (f11 >= 0.0f) {
                i10 = o(i7, (int) f11, (int) fArr[15]);
            }
            return i0.a.f(fArr[8], o4, i10);
        }
        return i10;
    }

    public static int b(int i7, float[] fArr) {
        int i10 = i7 * 4;
        int i11 = i10 + 10;
        int i12 = f43121e;
        if (fArr != null && fArr.length >= 18) {
            float f10 = fArr[i11];
            float f11 = 0.0f;
            if (f10 >= 0.0f) {
                int n10 = n(-16216082, (int) f10, (int) fArr[i10 + 11]);
                Integer valueOf = Integer.valueOf(n10);
                LruCache lruCache = d;
                Integer num = (Integer) lruCache.get(valueOf);
                if (num != null) {
                    return num.intValue();
                }
                float[] j3 = j(n10);
                float d2 = (d(-16216082) + 0.05f) / (d(i12) + 0.05f);
                float d10 = d(n10);
                float f12 = ((d10 + 0.05f) / d2) - 0.05f;
                if (f12 < 0.004f) {
                    f12 = d10 * 0.3f;
                }
                float f13 = 1.0f;
                float max = Math.max(0.0f, Math.min(1.0f, j3[1] / 0.1f));
                for (int i13 = 0; i13 < 18; i13++) {
                    float f14 = (f11 + f13) / 2.0f;
                    if (d(l(f14, e(f14, j3[2]) * max, j3[2])) < f12) {
                        f11 = f14;
                    } else {
                        f13 = f14;
                    }
                }
                float f15 = (f11 + f13) / 2.0f;
                int l10 = l(f15, e(f15, j3[2]) * max, j3[2]);
                lruCache.put(Integer.valueOf(n10), Integer.valueOf(l10));
                return l10;
            }
        }
        return i12;
    }

    public static int c(float f10) {
        float pow;
        float max = Math.max(0.0f, Math.min(1.0f, f10));
        if (max <= 0.0031308f) {
            pow = max * 12.92f;
        } else {
            pow = (((float) Math.pow(max, 0.4166666666666667d)) * 1.055f) - 0.055f;
        }
        return Math.max(0, Math.min(255, (int) ((pow * 255.0f) + 0.5f)));
    }

    public static float d(int i7) {
        float h = h(i7, 8) * 0.7152f;
        return (h(i7, 0) * 0.0722f) + h + (h(i7, 16) * 0.2126f);
    }

    public static float e(float f10, float f11) {
        float f12 = 0.5f;
        float f13 = 0.0f;
        for (int i7 = 0; i7 < 18; i7++) {
            float f14 = (f13 + f12) / 2.0f;
            float[] k10 = k(f10, f14, f11);
            float f15 = k10[0];
            if (f15 >= 0.0f) {
                float f16 = k10[1];
                if (f16 >= 0.0f) {
                    float f17 = k10[2];
                    if (f17 >= 0.0f && f15 <= 1.0f && f16 <= 1.0f && f17 <= 1.0f) {
                        f13 = f14;
                    }
                }
            }
            f12 = f14;
        }
        return f13;
    }

    public static float[] f(int i7) {
        float radians;
        double[] f10 = org.telegram.ui.ActionBar.v4.f(org.telegram.ui.ActionBar.v4.g(org.telegram.ui.ActionBar.v4.e(i7)));
        float f11 = (float) f10[0];
        float f12 = (float) f10[1];
        if (Double.isNaN(f10[2])) {
            radians = 0.0f;
        } else {
            radians = (float) Math.toRadians(f10[2]);
        }
        return new float[]{f11, f12, radians};
    }

    public static float g(float f10) {
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4d);
    }

    public static float h(int i7, int i10) {
        float f10 = ((i7 >> i10) & 255) / 255.0f;
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4d);
    }

    public static float[] i(TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        if (stargiftattributebackdrop == null) {
            return new float[]{0.0f, 1.0f, 1.0f};
        }
        float[] f10 = f(i0.a.f(0.5f, stargiftattributebackdrop.center_color | (-16777216), (-16777216) | stargiftattributebackdrop.edge_color));
        float[] f11 = f(-16216082);
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(f10[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        return new float[]{f10[2] - f11[2], Math.min(com.google.android.recaptcha.internal.a.B(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (f10[1] * 1.5f) / 0.155f))), (f(stargiftattributebackdrop.center_color)[1] * 1.2f) / 0.173f), ((((Math.max(0.1f, f10[0] - 0.02f) / f11[0]) - 1.0f) * Math.max(0.0f, Math.min(1.0f, (0.6f - f10[0]) / 0.15f))) + 1.0f) - (exp * 0.025f)};
    }

    public static float[] j(int i7) {
        float g10 = g(Color.red(i7) / 255.0f);
        float g11 = g(Color.green(i7) / 255.0f);
        float g12 = g(Color.blue(i7) / 255.0f);
        float cbrt = (float) Math.cbrt((0.051445995f * g12) + (0.53633255f * g11) + (0.41222146f * g10));
        float cbrt2 = (float) Math.cbrt((0.10739696f * g12) + (0.6806995f * g11) + (0.2119035f * g10));
        float cbrt3 = (float) Math.cbrt((g12 * 0.6299787f) + (g11 * 0.28171885f) + (g10 * 0.08830246f));
        double d2 = (0.4505937f * cbrt3) + ((1.9779985f * cbrt) - (2.4285922f * cbrt2));
        double d10 = ((cbrt2 * 0.78277177f) + (cbrt * 0.025904037f)) - (cbrt3 * 0.80867577f);
        return new float[]{((0.7936178f * cbrt2) + (0.21045426f * cbrt)) - (0.004072047f * cbrt3), (float) Math.hypot(d2, d10), (float) Math.atan2(d10, d2)};
    }

    public static float[] k(float f10, float f11, float f12) {
        double d2 = f12;
        float cos = ((float) Math.cos(d2)) * f11;
        float sin = f11 * ((float) Math.sin(d2));
        float f13 = (0.21580376f * sin) + (0.39633778f * cos) + f10;
        float f14 = (f10 - (0.105561346f * cos)) - (0.06385417f * sin);
        float f15 = (f10 - (cos * 0.08948418f)) - (sin * 1.2914855f);
        float f16 = f13 * f13 * f13;
        float f17 = f14 * f14 * f14;
        float f18 = f15 * f15 * f15;
        return new float[]{(0.23096994f * f18) + ((4.0767417f * f16) - (3.3077116f * f17)), ((2.6097574f * f17) + ((-1.268438f) * f16)) - (0.34131938f * f18), (f18 * 1.7076147f) + ((f16 * (-0.0041960864f)) - (f17 * 0.7034186f))};
    }

    public static int l(float f10, float f11, float f12) {
        float[] k10 = k(f10, f11, f12);
        loop0: for (int i7 = 0; i7 < 40; i7++) {
            for (float f13 : k10) {
                if (f13 < -0.001f || f13 > 1.001f) {
                    f11 *= 0.95f;
                    k10 = k(f10, f11, f12);
                }
            }
        }
        return Color.rgb(c(k10[0]), c(k10[1]), c(k10[2]));
    }

    public static void m(float[] fArr, int i7, TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop) {
        float f10;
        float f11;
        float f12;
        int i10 = i7 * 4;
        int i11 = i10 + 10;
        float f13 = -1.0f;
        if (stargiftattributebackdrop == null) {
            f10 = -1.0f;
        } else {
            f10 = stargiftattributebackdrop.center_color & 16777215;
        }
        fArr[i11] = f10;
        int i12 = i10 + 11;
        if (stargiftattributebackdrop == null) {
            f11 = -1.0f;
        } else {
            f11 = stargiftattributebackdrop.edge_color & 16777215;
        }
        fArr[i12] = f11;
        int i13 = i10 + 12;
        if (stargiftattributebackdrop == null) {
            f12 = -1.0f;
        } else {
            f12 = stargiftattributebackdrop.pattern_color & 16777215;
        }
        fArr[i13] = f12;
        int i14 = i10 + 13;
        if (stargiftattributebackdrop != null) {
            f13 = stargiftattributebackdrop.text_color & 16777215;
        }
        fArr[i14] = f13;
    }

    public static int n(int i7, int i10, int i11) {
        int i12 = i10 | (-16777216);
        int i13 = i11 | (-16777216);
        float[] j3 = j(i0.a.f(0.5f, i12, i13));
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(j3[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        float B = com.google.android.recaptcha.internal.a.B(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (j3[1] * 1.5f) / 0.155f)));
        float[] j10 = j(i12);
        float[] j11 = j(i13);
        float max = Math.max(0.0f, Math.min(1.0f, (0.6f - ((j10[0] + j11[0]) / 2.0f)) / 0.15f));
        float f10 = j(-16216082)[0];
        float f11 = j(-15291399)[0];
        float[] j12 = j(i7);
        float max2 = Math.max(-2.0f, Math.min(3.0f, (j12[0] - f10) / (f11 - f10)));
        float f12 = j11[0];
        float z9 = com.google.android.recaptcha.internal.a.z(j10[0], f12, max2, f12 - 0.02f);
        float f13 = j12[0];
        float f14 = ((z9 - f13) * max) + f13 + (exp * (-0.025f));
        float f15 = j12[1];
        float f16 = f15 / 0.173f;
        float f17 = 1.0f - max;
        return l(Math.max(0.05f, Math.min(0.97f, f14)), com.google.android.recaptcha.internal.a.x(j10[1], 1.1f, max, f17 * Math.min(f15 * B, f16 * j10[1] * 1.2f)), j3[2]);
    }

    public static int o(int i7, int i10, int i11) {
        float[] fArr;
        float f10;
        String str = i7 + ":" + i10 + ":" + i11;
        LruCache lruCache = f43118a;
        Integer num = (Integer) lruCache.get(str);
        if (num != null) {
            return num.intValue();
        }
        int i12 = i10 | (-16777216);
        int i13 = i11 | (-16777216);
        float[] j3 = j(i0.a.f(0.7f, i12, i13));
        float[] j10 = j(i12);
        float[] j11 = j(i13);
        float[] j12 = j(i7);
        float exp = (float) Math.exp(-Math.pow((((float) ((Math.toDegrees(j3[2]) + 360.0d) % 360.0d)) - 300.0f) / 38.0f, 2.0d));
        float B = com.google.android.recaptcha.internal.a.B(exp, 0.18f, 1.0f, Math.max(0.15f, Math.min(1.0f, (j3[1] * 1.5f) / 0.155f)));
        float max = Math.max(0.0f, Math.min(1.0f, (0.6f - ((j10[0] + j11[0]) / 2.0f)) / 0.15f));
        float f11 = j(-16216082)[0];
        float max2 = Math.max(-2.0f, Math.min(3.0f, (j12[0] - f11) / (j(-15291399)[0] - f11)));
        float f12 = j11[0];
        float z9 = com.google.android.recaptcha.internal.a.z(j10[0], f12, max2, f12 - 0.02f);
        float f13 = j12[0];
        float z10 = com.google.android.recaptcha.internal.a.z(z9, f13, max, f13) - (exp * 0.025f);
        float f14 = j12[1];
        float x10 = com.google.android.recaptcha.internal.a.x(j10[1], 1.1f, max, (1.0f - max) * Math.min(B * f14, (f14 / 0.173f) * j10[1] * 1.2f));
        if (i7 == -15291399) {
            fArr = j(i0.a.f(0.5f, i12, i13));
        } else {
            fArr = j11;
        }
        float z11 = com.google.android.recaptcha.internal.a.z(fArr[0], z10, 0.399f, z10);
        float z12 = com.google.android.recaptcha.internal.a.z(fArr[1], x10, 0.399f, x10);
        float atan2 = (((float) Math.atan2(Math.sin(fArr[2] - f10), Math.cos(fArr[2] - j3[2]))) * 0.399f) + j3[2];
        float max3 = (1.0f - Math.max(0.0f, Math.min(1.0f, (j3[1] - 0.125f) / 0.015f))) * Math.max(0.0f, Math.min(1.0f, (j3[1] - 0.06f) / 0.055f));
        float exp2 = (float) Math.exp(-Math.pow(((((Math.toDegrees(atan2) % 360.0d) + 360.0d) % 360.0d) - 70.0d) / 35.0d, 2.0d));
        float f15 = (((1.0f - (0.75f * exp2)) * max3 * 0.35f) + 1.0f) * z12;
        float C = com.google.android.recaptcha.internal.a.C(exp2, 0.15f, 1.0f, Math.max(j10[1], j11[1]) * 1.3f);
        if (f15 > C && C > 0.0f) {
            f15 = com.google.android.recaptcha.internal.a.z(C, f15, 0.8f, f15);
        }
        int l10 = l(Math.max(0.05f, Math.min(0.97f, z11 - (exp2 * 0.025f))), f15, atan2);
        lruCache.put(str, Integer.valueOf(l10));
        return l10;
    }

    public static int p(int i7, int i10, float[] fArr) {
        double d2;
        int i11;
        int i12;
        char c10;
        double d10;
        int i13;
        double cos;
        double sin;
        int i14 = ((i10 / 3) * 4) + 10;
        int i15 = 0;
        int i16 = 1;
        char c11 = 2;
        if (fArr.length >= 18 && fArr[i14] >= 0.0f) {
            int i17 = i7 & 16777215;
            if (i17 == 165332) {
                i15 = 2;
            } else if (i17 != 29132 && i17 != 561134) {
                if (i17 != 2267888 && i17 != 1485817) {
                    i15 = 3;
                }
            } else {
                i15 = 1;
            }
            return (((int) fArr[i14 + i15]) & 16777215) | (Color.alpha(i7) << 24);
        } else if (fArr[i10] == 0.0f && fArr[i10 + 1] == 1.0f && fArr[i10 + 2] == 1.0f) {
            return i7;
        } else {
            double[] f10 = org.telegram.ui.ActionBar.v4.f(org.telegram.ui.ActionBar.v4.g(org.telegram.ui.ActionBar.v4.e(i7)));
            double d11 = f10[0];
            double d12 = 0.8d;
            if (d11 < 0.8d) {
                d12 = 0.0d;
            }
            f10[0] = Math.max(d12, d11 * fArr[i10 + 2]);
            f10[1] = f10[1] * fArr[i10 + 1];
            if (Double.isNaN(f10[2])) {
                d2 = 0.0d;
            } else {
                d2 = f10[2];
            }
            f10[2] = Math.toDegrees(fArr[i10]) + d2;
            double[] dArr = null;
            int i18 = 0;
            while (true) {
                if (i18 < 40) {
                    double d13 = f10[i15];
                    double d14 = f10[i16];
                    double d15 = f10[2];
                    if (Double.isNaN(d15)) {
                        cos = 0.0d;
                    } else {
                        cos = Math.cos((d15 * 3.141592653589793d) / 180.0d) * d14;
                    }
                    if (Double.isNaN(d15)) {
                        sin = 0.0d;
                    } else {
                        sin = Math.sin((d15 * 3.141592653589793d) / 180.0d) * d14;
                    }
                    double[] dArr2 = new double[3];
                    dArr2[i15] = d13;
                    dArr2[i16] = cos;
                    dArr2[2] = sin;
                    double[] d16 = org.telegram.ui.ActionBar.v4.d(org.telegram.ui.ActionBar.v4.d, dArr2);
                    int i19 = i15;
                    while (i19 < 3) {
                        d16[i19] = Math.pow(d16[i19], 3.0d);
                        i19++;
                        i16 = i16;
                        i15 = i15;
                    }
                    i11 = i15;
                    i12 = i16;
                    dArr = org.telegram.ui.ActionBar.v4.d(org.telegram.ui.ActionBar.v4.f28624f, org.telegram.ui.ActionBar.v4.d(org.telegram.ui.ActionBar.v4.f28621b, d16));
                    double d17 = dArr[i11];
                    if (d17 >= 0.0d) {
                        double d18 = dArr[i12];
                        if (d18 >= 0.0d) {
                            double d19 = dArr[2];
                            if (d19 >= 0.0d && d17 <= 1.0d && d18 <= 1.0d && d19 <= 1.0d) {
                                break;
                            }
                        } else {
                            continue;
                        }
                    }
                    f10[i12] = f10[i12] * 0.95d;
                    i18++;
                    i16 = i12;
                    i15 = i11;
                } else {
                    i11 = i15;
                    i12 = i16;
                    break;
                }
            }
            double[] dArr3 = new double[3];
            int i20 = i11;
            while (i20 < dArr.length) {
                if (Math.abs(dArr[i20]) > 0.0031308d) {
                    double d20 = dArr[i20];
                    if (d20 < 0.0d) {
                        i13 = -1;
                    } else {
                        i13 = i12;
                    }
                    double d21 = i13;
                    c10 = c11;
                    d10 = ((Math.pow(Math.abs(d20), 0.4166666666666667d) * 1.055d) - 0.055d) * d21;
                } else {
                    c10 = c11;
                    d10 = 12.92d * dArr[i20];
                }
                dArr3[i20] = d10;
                i20++;
                c11 = c10;
            }
            return i0.a.o(Color.rgb((int) Math.round(Utilities.h(dArr3[i11], 1.0d) * 255.0d), (int) Math.round(Utilities.h(dArr3[i12], 1.0d) * 255.0d), (int) Math.round(Utilities.h(dArr3[c11], 1.0d) * 255.0d)), Color.alpha(i7));
        }
    }
}
