package org.telegram.ui.ActionBar;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.io.File;
import java.util.Locale;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;

public final class e6 {

    public int f22883a;

    public f6 f22884b;

    public int f22885c;
    public int d;

    public int f22886e;

    public int f22887f;

    public int f22888g;
    public int h;

    public boolean f22889i;

    public long f22890j;

    public long f22891k;

    public long f22892l;

    public long f22893m;

    public float f22896p;

    public boolean f22897q;

    public TLRPC.TL_theme f22898r;

    public TLRPC.TL_wallPaper f22899s;

    public int f22900t;

    public String f22901u;
    public String v;

    public TLRPC.InputFile f22902w;

    public TLRPC.InputFile f22903x;

    public z5 f22904y;

    public boolean f22905z;

    public int f22894n = 45;

    public String f22895o = "";
    public final float[] A = new float[3];

    public static int a(SparseIntArray sparseIntArray, int... iArr) {
        int i10 = 0;
        int iRed = 0;
        int iGreen = 0;
        int iBlue = 0;
        for (int i11 = 0; i11 < iArr.length; i11++) {
            if (sparseIntArray.indexOfKey(iArr[i11]) >= 0) {
                try {
                    int i12 = sparseIntArray.get(iArr[i11]);
                    iRed += Color.red(i12);
                    iGreen += Color.green(i12);
                    iBlue += Color.blue(i12);
                    i10++;
                } catch (Exception unused) {
                }
            }
        }
        if (i10 == 0) {
            return 0;
        }
        return Color.argb(255, iRed / i10, iGreen / i10, iBlue / i10);
    }

    public static void g(SparseIntArray sparseIntArray) {
        for (int i10 = g6.f23445za; i10 < g6.Ga; i10++) {
            sparseIntArray.delete(i10);
            sparseIntArray.put(i10, g6.nl[i10]);
        }
        for (int i11 = g6.Ha; i11 < g6.Tb; i11++) {
            sparseIntArray.delete(i11);
            sparseIntArray.put(i11, g6.nl[i11]);
        }
        for (int i12 = g6.Ub; i12 < g6.f23041cc; i12++) {
            sparseIntArray.delete(i12);
            sparseIntArray.put(i12, g6.nl[i12]);
        }
    }

    public final int b(int i10, int i11) {
        float[] fArr = this.A;
        Color.colorToHSV(i11, fArr);
        float f10 = fArr[0];
        Color.colorToHSV(i10, fArr);
        float f11 = fArr[1];
        if (f11 <= 0.0f) {
            fArr[0] = f10;
        }
        fArr[1] = Math.max(0.0f, Math.min(1.0f, f11 + 0.6f));
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.05f));
        return Color.HSVToColor(30, fArr);
    }

    public final boolean c(SparseIntArray sparseIntArray, SparseIntArray sparseIntArray2) {
        int iValueAt;
        char c10;
        char c11;
        float f10;
        boolean zA;
        boolean z10;
        int iValueAt2;
        int iValueAt3;
        float f11;
        float f12;
        int i10;
        boolean zA2;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        float[] fArrM0 = g6.M0(1);
        float[] fArrM1 = g6.M0(2);
        Color.colorToHSV(this.f22884b.T, fArrM0);
        Color.colorToHSV(this.f22885c, fArrM1);
        boolean zQ = this.f22884b.q();
        if (this.f22885c != this.f22884b.T || this.d != 0) {
            int i16 = 0;
            while (true) {
                int[] iArr = g6.nl;
                if (i16 >= iArr.length) {
                    break;
                }
                if (!g6.pl.contains(Integer.valueOf(i16))) {
                    int iIndexOfKey = sparseIntArray.indexOfKey(i16);
                    if (iIndexOfKey < 0) {
                        int i17 = g6.ol.get(i16, -1);
                        if (i17 < 0 || sparseIntArray.indexOfKey(i17) < 0) {
                            iValueAt = iArr[i16];
                        }
                    } else {
                        iValueAt = sparseIntArray.valueAt(iIndexOfKey);
                    }
                    int iD = g6.D(fArrM0, fArrM1, iValueAt, zQ, iValueAt);
                    if (iD != iValueAt) {
                        sparseIntArray2.put(i16, iD);
                    }
                }
                i16++;
            }
        }
        int iHSVToColor = this.f22886e;
        if ((iHSVToColor == 0 && this.f22885c == 0) || this.f22887f == 0) {
            c10 = 1;
            c11 = 2;
            f10 = 0.705f;
            z10 = false;
        } else {
            if (iHSVToColor == 0) {
                iHSVToColor = this.f22885c;
            }
            int i18 = g6.Aa;
            int i19 = sparseIntArray.get(i18);
            if (i19 == 0) {
                i19 = g6.nl[i18];
            }
            int colorDistance = AndroidUtilities.getColorDistance(iHSVToColor, g6.D(fArrM0, fArrM1, i19, zQ, i19));
            c10 = 1;
            int colorDistance2 = AndroidUtilities.getColorDistance(iHSVToColor, this.f22887f);
            c11 = 2;
            if (this.f22888g != 0) {
                f10 = 0.705f;
                int averageColor = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.f22886e, this.f22887f), this.f22888g);
                int i20 = this.h;
                if (i20 != 0) {
                    averageColor = AndroidUtilities.getAverageColor(averageColor, i20);
                }
                zA = AndroidUtilities.computePerceivedBrightness(averageColor) > 0.705f;
            } else {
                f10 = 0.705f;
                zA = g6.a(this.f22886e, this.f22887f);
            }
            z10 = zA && colorDistance <= 35000 && colorDistance2 <= 35000;
            float[] fArrM2 = g6.M0(3);
            float[] fArrM3 = g6.M0(4);
            Color.colorToHSV(i19, fArrM2);
            Color.colorToHSV(iHSVToColor, fArrM3);
            float fMin = Math.min((fArrM2[1] * 1.5f) / fArrM0[1], 1.0f);
            fArrM2[0] = (fArrM3[0] - fArrM2[0]) + fArrM0[0];
            fArrM2[1] = (fArrM3[1] * fArrM0[1]) / fArrM2[1];
            float f13 = ((((fArrM3[2] / fArrM2[2]) + fMin) - 1.0f) * fArrM0[2]) / fMin;
            fArrM2[2] = f13;
            if (f13 >= 0.3f) {
                iHSVToColor = Color.HSVToColor(255, fArrM2);
            }
        }
        boolean z11 = (iHSVToColor == 0 || (((i14 = this.f22884b.T) == 0 || iHSVToColor == i14) && ((i15 = this.f22885c) == 0 || i15 == iHSVToColor))) ? false : true;
        if (z11 || this.d != 0) {
            int i21 = this.d;
            if (i21 != 0) {
                Color.colorToHSV(i21, fArrM1);
            } else {
                Color.colorToHSV(iHSVToColor, fArrM1);
            }
            for (int i22 = g6.Ha; i22 < g6.Tb; i22++) {
                int iIndexOfKey2 = sparseIntArray.indexOfKey(i22);
                if (iIndexOfKey2 < 0) {
                    int i23 = g6.ol.get(i22, -1);
                    if (i23 < 0 || sparseIntArray.get(i23, -1) < 0) {
                        iValueAt3 = g6.nl[i22];
                    }
                } else {
                    iValueAt3 = sparseIntArray.valueAt(iIndexOfKey2);
                }
                int iD2 = g6.D(fArrM0, fArrM1, iValueAt3, zQ, iValueAt3);
                if (iD2 != iValueAt3) {
                    sparseIntArray2.put(i22, iD2);
                }
            }
            for (int i24 : g6.Hk) {
                int iIndexOfKey3 = sparseIntArray.indexOfKey(i24);
                int iValueAt4 = iIndexOfKey3 < 0 ? g6.nl[i24] : sparseIntArray.valueAt(iIndexOfKey3);
                int iD3 = g6.D(fArrM0, fArrM1, iValueAt4, zQ, iValueAt4);
                if (iD3 != iValueAt4) {
                    sparseIntArray2.put(i24, iD3);
                }
            }
            if (z11) {
                Color.colorToHSV(iHSVToColor, fArrM1);
                for (int i25 = g6.f23445za; i25 < g6.Ga; i25++) {
                    int iIndexOfKey4 = sparseIntArray.indexOfKey(i25);
                    if (iIndexOfKey4 < 0) {
                        int i26 = g6.ol.get(i25, -1);
                        if (i26 < 0 || sparseIntArray.get(i26, -1) < 0) {
                            iValueAt2 = g6.nl[i25];
                        }
                    } else {
                        iValueAt2 = sparseIntArray.valueAt(iIndexOfKey4);
                    }
                    int iD4 = g6.D(fArrM0, fArrM1, iValueAt2, zQ, iValueAt2);
                    if (iD4 != iValueAt2) {
                        sparseIntArray2.put(i25, iD4);
                    }
                }
            }
        }
        if (!z10 && (i10 = this.f22887f) != 0) {
            if (this.f22888g != 0) {
                int averageColor2 = AndroidUtilities.getAverageColor(AndroidUtilities.getAverageColor(this.f22886e, i10), this.f22888g);
                int i27 = this.h;
                if (i27 != 0) {
                    averageColor2 = AndroidUtilities.getAverageColor(averageColor2, i27);
                }
                zA2 = AndroidUtilities.computePerceivedBrightness(averageColor2) > f10;
            } else {
                zA2 = g6.a(this.f22886e, i10);
            }
            if (zA2) {
                i13 = -14606047;
                i11 = -11184811;
                i12 = 1291845632;
            } else {
                i11 = -1118482;
                i12 = 1308622847;
                i13 = -1;
            }
            if (this.d == 0) {
                sparseIntArray2.put(g6.f23287qb, i12);
                sparseIntArray2.put(g6.f23306rb, i12);
                sparseIntArray2.put(g6.wb, i12);
                sparseIntArray2.put(g6.f23410xb, i12);
                sparseIntArray2.put(g6.f23428yb, i12);
                sparseIntArray2.put(g6.f23446zb, i13);
                sparseIntArray2.put(g6.Ab, i12);
                sparseIntArray2.put(g6.Bb, i12);
                sparseIntArray2.put(g6.Cb, i13);
                sparseIntArray2.put(g6.f23131hc, i13);
                sparseIntArray2.put(g6.Ya, i13);
                sparseIntArray2.put(g6.Za, i13);
                sparseIntArray2.put(g6.f23003ab, i13);
                sparseIntArray2.put(g6.f23022bb, i13);
                sparseIntArray2.put(g6.f23040cb, i13);
                sparseIntArray2.put(g6.f23113gb, i13);
                sparseIntArray2.put(g6.f23130hb, i13);
                sparseIntArray2.put(g6.Va, i13);
                sparseIntArray2.put(g6.Wa, i13);
                sparseIntArray2.put(g6.Xa, i13);
                sparseIntArray2.put(g6.Ra, i13);
                sparseIntArray2.put(g6.Sa, i13);
                sparseIntArray2.put(g6.f23344tb, i13);
                sparseIntArray2.put(g6.Fb, i13);
                sparseIntArray2.put(g6.f23149ib, i13);
                sparseIntArray2.put(g6.f23202lb, i13);
                sparseIntArray2.put(g6.f23220mb, i13);
                sparseIntArray2.put(g6.Ja, i13);
                sparseIntArray2.put(g6.Ka, i13);
                sparseIntArray2.put(g6.La, i13);
                sparseIntArray2.put(g6.Ma, i13);
                sparseIntArray2.put(g6.Na, i13);
                sparseIntArray2.put(g6.Oa, i13);
                sparseIntArray2.put(g6.Ta, i13);
                sparseIntArray2.put(g6.Ua, i13);
                sparseIntArray2.put(g6.f23325sb, i13);
                sparseIntArray2.put(g6.nb, i13);
                sparseIntArray2.put(g6.f23362ub, i11);
                sparseIntArray2.put(g6.f23378vb, i11);
                sparseIntArray2.put(g6.f23167jb, i11);
                sparseIntArray2.put(g6.f23186kb, i11);
                sparseIntArray2.put(g6.Gb, i11);
                sparseIntArray2.put(g6.Hb, i11);
                sparseIntArray2.put(g6.Kb, i11);
                sparseIntArray2.put(g6.Lb, i11);
                sparseIntArray2.put(g6.Nb, i13);
                sparseIntArray2.put(g6.Ob, i13);
                sparseIntArray2.put(g6.Db, this.f22886e);
                sparseIntArray2.put(g6.Eb, this.f22886e);
                sparseIntArray2.put(g6.Pa, this.f22886e);
                sparseIntArray2.put(g6.Qa, this.f22886e);
            }
            sparseIntArray2.put(g6.f23058db, i13);
            sparseIntArray2.put(g6.f23076eb, i13);
            sparseIntArray2.put(g6.f23095fb, i13);
            sparseIntArray2.put(g6.fc, i13);
        }
        if (z10) {
            int i28 = g6.Nb;
            if (AndroidUtilities.getColorDistance(-1, sparseIntArray2.indexOfKey(i28) >= 0 ? sparseIntArray2.get(i28) : 0) < 5000) {
                z10 = false;
            }
        }
        int i29 = this.f22886e;
        if (i29 != 0 && this.f22887f != 0) {
            sparseIntArray2.put(g6.Aa, i29);
            sparseIntArray2.put(g6.Da, this.f22887f);
            int i30 = this.f22888g;
            if (i30 != 0) {
                sparseIntArray2.put(g6.Ea, i30);
                int i31 = this.h;
                if (i31 != 0) {
                    sparseIntArray2.put(g6.Fa, i31);
                }
            }
            sparseIntArray2.put(g6.f23004ac, this.f22889i ? 1 : 0);
        }
        long j10 = this.f22890j;
        int i32 = (int) j10;
        if (i32 != 0) {
            sparseIntArray2.put(g6.Nd, i32);
        } else if (j10 != 0) {
            sparseIntArray2.delete(g6.Nd);
        }
        long j11 = this.f22891k;
        int i33 = (int) j11;
        if (i33 != 0) {
            sparseIntArray2.put(g6.Od, i33);
        } else if (j11 != 0) {
            sparseIntArray2.delete(g6.Od);
        }
        long j12 = this.f22892l;
        int i34 = (int) j12;
        if (i34 != 0) {
            sparseIntArray2.put(g6.Pd, i34);
        } else if (j12 != 0) {
            sparseIntArray2.delete(g6.Pd);
        }
        long j13 = this.f22893m;
        int i35 = (int) j13;
        if (i35 != 0) {
            sparseIntArray2.put(g6.Qd, i35);
        } else if (j13 != 0) {
            sparseIntArray2.delete(g6.Qd);
        }
        int i36 = this.f22894n;
        if (i36 != 45) {
            sparseIntArray2.put(g6.Rd, i36);
        }
        int i37 = g6.Aa;
        int iW0 = sparseIntArray2.get(i37);
        if (iW0 == 0) {
            iW0 = g6.w0(null, i37, false);
        }
        int i38 = g6.f23305ra;
        int iW1 = sparseIntArray2.get(i38);
        if (iW1 == 0) {
            iW1 = g6.w0(null, i38, false);
        }
        TLRPC.TL_theme tL_theme = this.f22898r;
        if (tL_theme != null && tL_theme.emoticon != null && !zQ) {
            sparseIntArray2.delete(g6.Hc);
            int iA = a(sparseIntArray2, g6.Od, g6.Pd, g6.Qd);
            if (iA == 0) {
                iA = a(sparseIntArray2, g6.Nd);
            }
            if (iA == 0) {
                iA = this.f22885c;
            }
            int iB = b(iW0, iA);
            sparseIntArray2.put(g6.Yb, iB);
            sparseIntArray2.put(g6.f23023bc, iB);
            sparseIntArray2.put(g6.Ba, g6.v(iW0, iB));
            int iB2 = b(iW1, this.f22885c);
            sparseIntArray2.put(g6.f23324sa, iB2);
            sparseIntArray2.put(g6.f23059dc, g6.v(iW1, iB2));
        }
        float[] fArr = this.A;
        if (!zQ) {
            sparseIntArray2.put(g6.f23366uf, h(iW1, this.f22885c));
            sparseIntArray2.put(g6.Vb, h(iW0, this.f22885c));
            int i39 = g6.Wb;
            Color.colorToHSV(this.f22885c, fArr);
            float f14 = fArr[0];
            Color.colorToHSV(iW0, fArr);
            float f15 = fArr[c10];
            if (f15 > 0.0f) {
                float f16 = fArr[0];
                if (f16 > 45.0f && f16 < 85.0f) {
                    fArr[0] = f14;
                }
            } else {
                fArr[0] = f14;
            }
            fArr[c10] = Math.max(0.0f, Math.min(1.0f, f15 + 0.6f));
            float f17 = fArr[c11];
            fArr[c11] = Math.max(0.0f, Math.min(1.0f, f17 - (f17 > 0.7f ? 0.25f : 0.125f)));
            sparseIntArray2.put(i39, g6.v(iW0, Color.HSVToColor(255, fArr)));
        }
        Color.colorToHSV(g6.w0(null, g6.f23234n6, false), fArr);
        float f18 = fArr[0];
        sparseIntArray2.put(g6.Xb, f(iW0, f18, zQ));
        sparseIntArray2.put(g6.f23397wf, f(iW1, f18, zQ));
        int i40 = g6.gc;
        int iW2 = sparseIntArray2.get(i40);
        if (iW2 == 0) {
            iW2 = g6.w0(null, i40, false);
        }
        int i41 = g6.f23131hc;
        int iW3 = sparseIntArray2.get(i41);
        if (iW3 == 0) {
            iW3 = g6.w0(null, i41, false);
        }
        sparseIntArray2.put(g6.Ld, e(iW2, iW1, zQ));
        sparseIntArray2.put(g6.Mb, e(iW3, iW0, zQ));
        int i42 = g6.G8;
        int iW4 = sparseIntArray2.get(i42);
        if (iW4 == 0) {
            iW4 = g6.w0(null, i42, false);
        }
        sparseIntArray2.put(g6.H8, Color.argb(Color.alpha(iW4), Math.max(0, Color.red(iW4) - 10), Math.max(0, Color.green(iW4) - 10), Math.max(0, Color.blue(iW4) - 10)));
        int i43 = 64;
        if (zQ) {
            int i44 = g6.Da;
            if (sparseIntArray2.get(i44) != 0) {
                Color.colorToHSV(a(sparseIntArray2, i44, g6.Ea, g6.Fa), fArr);
                fArr[c10] = Utilities.clamp(fArr[c10] + 0.1f, 1.0f, 0.0f);
                fArr[c11] = Utilities.clamp(fArr[c11] - 0.8f, 1.0f, 0.0f);
                sparseIntArray2.put(g6.qk, Color.HSVToColor(64, fArr));
            } else {
                int i45 = g6.qk;
                Color.colorToHSV(iW0, fArr);
                if (zQ) {
                    fArr[c10] = Utilities.clamp(fArr[c10] - 0.08f, 1.0f, 0.0f);
                    fArr[c11] = 0.03f;
                } else {
                    f11 = fArr[c10];
                    if (f11 > 0.0f) {
                        f12 = fArr[c11];
                        if (f12 < 1.0f || f12 <= 0.0f) {
                            fArr[c11] = Math.max(0.0f, Math.min(1.0f, fArr[c11] - 0.2f));
                        } else {
                            fArr[c10] = Math.max(0.0f, Math.min(1.0f, f11 + 0.28f));
                            fArr[c11] = Math.max(0.0f, Math.min(1.0f, fArr[c11] - 0.1f));
                        }
                    } else {
                        fArr[c11] = Math.max(0.0f, Math.min(1.0f, fArr[c11] - 0.2f));
                    }
                    i43 = 32;
                }
                sparseIntArray2.put(i45, Color.HSVToColor(i43, fArr));
            }
        } else {
            int i46 = g6.qk;
            Color.colorToHSV(iW0, fArr);
            if (zQ) {
                fArr[c10] = Utilities.clamp(fArr[c10] - 0.08f, 1.0f, 0.0f);
                fArr[c11] = 0.03f;
            } else {
                f11 = fArr[c10];
                if (f11 > 0.0f) {
                    f12 = fArr[c11];
                    if (f12 < 1.0f) {
                        fArr[c11] = Math.max(0.0f, Math.min(1.0f, fArr[c11] - 0.2f));
                    } else {
                        fArr[c11] = Math.max(0.0f, Math.min(1.0f, fArr[c11] - 0.2f));
                    }
                } else {
                    fArr[c11] = Math.max(0.0f, Math.min(1.0f, fArr[c11] - 0.2f));
                }
                i43 = 32;
            }
            sparseIntArray2.put(i46, Color.HSVToColor(i43, fArr));
        }
        g6.g(sparseIntArray, sparseIntArray2, zQ);
        g6.f(sparseIntArray, sparseIntArray2, zQ);
        return !z10;
    }

    public final File d() {
        if (this.f22883a < 100) {
            if (TextUtils.isEmpty(this.f22895o)) {
                return null;
            }
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            Locale locale = Locale.US;
            return new File(filesDirFixed, this.f22884b.m() + "_" + this.f22883a + "_" + this.f22895o + "_v5.jpg");
        }
        if (TextUtils.isEmpty(this.f22895o)) {
            return null;
        }
        File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
        Locale locale2 = Locale.US;
        return new File(filesDirFixed2, this.f22884b.m() + "_" + this.f22883a + "_" + this.f22895o + "_v8_debug.jpg");
    }

    public final int e(int i10, int i11, boolean z10) {
        int iD = i0.b.d(0.25f, i10, i11);
        float[] fArr = this.A;
        Color.colorToHSV(iD, fArr);
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] + (z10 ? 0.1f : 0.0f)));
        return Color.HSVToColor(51, fArr);
    }

    public final int f(int i10, float f10, boolean z10) {
        if (z10) {
            return 520093695;
        }
        float[] fArr = this.A;
        Color.colorToHSV(i10, fArr);
        if (fArr[1] > 0.0f) {
            float f11 = fArr[2];
            if (f11 >= 1.0f || f11 <= 0.0f) {
                fArr[0] = f10;
                fArr[1] = 0.2f;
            } else {
                fArr[0] = h7.n.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = h7.n.a(fArr[1] - 0.35f, 0.0f, 1.0f);
            }
        } else {
            fArr[0] = f10;
            fArr[1] = 0.2f;
        }
        fArr[2] = h7.n.a(fArr[2] - 0.65f, 0.0f, 1.0f);
        return Color.HSVToColor(90, fArr);
    }

    public final int h(int i10, int i11) {
        float[] fArr = this.A;
        Color.colorToHSV(i11, fArr);
        float f10 = fArr[0];
        Color.colorToHSV(i10, fArr);
        float f11 = fArr[1];
        if (f11 > 0.0f) {
            float f12 = fArr[0];
            if (f12 > 45.0f && f12 < 85.0f) {
                fArr[0] = f10;
            }
        } else {
            fArr[0] = f10;
        }
        fArr[1] = Math.max(0.0f, Math.min(1.0f, f11 + (fArr[2] > 0.85f ? 0.25f : 0.45f)));
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.15f));
        return Color.HSVToColor(80, fArr);
    }
}
