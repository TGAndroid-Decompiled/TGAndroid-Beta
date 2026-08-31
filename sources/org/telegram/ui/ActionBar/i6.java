package org.telegram.ui.ActionBar;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.io.File;
import java.util.Locale;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.tgnet.TLRPC;
public final class i6 {
    public int f21467a;
    public j6 f21468b;
    public int f21469c;
    public int d;
    public int f21470e;
    public int f21471f;
    public int f21472g;
    public int h;
    public boolean f21473i;
    public long f21474j;
    public long f21475k;
    public long f21476l;
    public long f21477m;
    public float f21480p;
    public boolean f21481q;
    public TLRPC.TL_theme f21482r;
    public TLRPC.TL_wallPaper f21483s;
    public int f21484t;
    public String f21485u;
    public String v;
    public TLRPC.InputFile f21486w;
    public TLRPC.InputFile f21487x;
    public d6 f21488y;
    public boolean f21489z;
    public int f21478n = 45;
    public String f21479o = "";
    public final float[] A = new float[3];

    public static int a(SparseIntArray sparseIntArray, int... iArr) {
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < iArr.length; i14++) {
            if (sparseIntArray.indexOfKey(iArr[i14]) >= 0) {
                try {
                    int i15 = sparseIntArray.get(iArr[i14]);
                    i11 += Color.red(i15);
                    i12 += Color.green(i15);
                    i13 += Color.blue(i15);
                    i10++;
                } catch (Exception unused) {
                }
            }
        }
        if (i10 == 0) {
            return 0;
        }
        return Color.argb(255, i11 / i10, i12 / i10, i13 / i10);
    }

    public static void g(SparseIntArray sparseIntArray) {
        for (int i10 = k6.za; i10 < k6.Ga; i10++) {
            sparseIntArray.delete(i10);
            sparseIntArray.put(i10, k6.nl[i10]);
        }
        for (int i11 = k6.Ha; i11 < k6.Tb; i11++) {
            sparseIntArray.delete(i11);
            sparseIntArray.put(i11, k6.nl[i11]);
        }
        for (int i12 = k6.Ub; i12 < k6.f21647cc; i12++) {
            sparseIntArray.delete(i12);
            sparseIntArray.put(i12, k6.nl[i12]);
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

    public final boolean c(android.util.SparseIntArray r22, android.util.SparseIntArray r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.i6.c(android.util.SparseIntArray, android.util.SparseIntArray):boolean");
    }

    public final File d() {
        if (this.f21467a < 100) {
            if (TextUtils.isEmpty(this.f21479o)) {
                return null;
            }
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            Locale locale = Locale.US;
            String m9 = this.f21468b.m();
            int i10 = this.f21467a;
            String str = this.f21479o;
            return new File(filesDirFixed, m9 + "_" + i10 + "_" + str + "_v5.jpg");
        } else if (TextUtils.isEmpty(this.f21479o)) {
            return null;
        } else {
            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
            Locale locale2 = Locale.US;
            String m10 = this.f21468b.m();
            int i11 = this.f21467a;
            String str2 = this.f21479o;
            return new File(filesDirFixed2, m10 + "_" + i11 + "_" + str2 + "_v8_debug.jpg");
        }
    }

    public final int e(int i10, int i11, boolean z4) {
        int d = i0.a.d(0.25f, i10, i11);
        float[] fArr = this.A;
        Color.colorToHSV(d, fArr);
        float f10 = 0.1f;
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        float f11 = fArr[2];
        if (!z4) {
            f10 = 0.0f;
        }
        fArr[2] = Math.max(0.0f, Math.min(1.0f, f11 + f10));
        return Color.HSVToColor(51, fArr);
    }

    public final int f(int i10, float f10, boolean z4) {
        if (z4) {
            return 520093695;
        }
        float[] fArr = this.A;
        Color.colorToHSV(i10, fArr);
        if (fArr[1] > 0.0f) {
            float f11 = fArr[2];
            if (f11 < 1.0f && f11 > 0.0f) {
                fArr[0] = k7.o.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = k7.o.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = k7.o.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f10;
        fArr[1] = 0.2f;
        fArr[2] = k7.o.a(fArr[2] - 0.65f, 0.0f, 1.0f);
        return Color.HSVToColor(90, fArr);
    }

    public final int h(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.i6.h(int, int):int");
    }
}
