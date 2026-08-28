package org.telegram.ui.ActionBar;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.io.File;
import java.util.Locale;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.tgnet.TLRPC;
public final class d6 {
    public int f22866a;
    public e6 f22867b;
    public int f22868c;
    public int d;
    public int f22869e;
    public int f22870f;
    public int f22871g;
    public int h;
    public boolean f22872i;
    public long f22873j;
    public long f22874k;
    public long f22875l;
    public long f22876m;
    public float f22879p;
    public boolean f22880q;
    public TLRPC.TL_theme f22881r;
    public TLRPC.TL_wallPaper f22882s;
    public int f22883t;
    public String f22884u;
    public String v;
    public TLRPC.InputFile f22885w;
    public TLRPC.InputFile f22886x;
    public y5 f22887y;
    public boolean f22888z;
    public int f22877n = 45;
    public String f22878o = "";
    public final float[] A = new float[3];

    public static int a(SparseIntArray sparseIntArray, int... iArr) {
        int i9 = 0;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < iArr.length; i13++) {
            if (sparseIntArray.indexOfKey(iArr[i13]) >= 0) {
                try {
                    int i14 = sparseIntArray.get(iArr[i13]);
                    i10 += Color.red(i14);
                    i11 += Color.green(i14);
                    i12 += Color.blue(i14);
                    i9++;
                } catch (Exception unused) {
                }
            }
        }
        if (i9 == 0) {
            return 0;
        }
        return Color.argb(255, i10 / i9, i11 / i9, i12 / i9);
    }

    public static void g(SparseIntArray sparseIntArray) {
        for (int i9 = f6.f23390za; i9 < f6.Ga; i9++) {
            sparseIntArray.delete(i9);
            sparseIntArray.put(i9, f6.nl[i9]);
        }
        for (int i10 = f6.Ha; i10 < f6.Tb; i10++) {
            sparseIntArray.delete(i10);
            sparseIntArray.put(i10, f6.nl[i10]);
        }
        for (int i11 = f6.Ub; i11 < f6.f22989cc; i11++) {
            sparseIntArray.delete(i11);
            sparseIntArray.put(i11, f6.nl[i11]);
        }
    }

    public final int b(int i9, int i10) {
        float[] fArr = this.A;
        Color.colorToHSV(i10, fArr);
        float f10 = fArr[0];
        Color.colorToHSV(i9, fArr);
        float f11 = fArr[1];
        if (f11 <= 0.0f) {
            fArr[0] = f10;
        }
        fArr[1] = Math.max(0.0f, Math.min(1.0f, f11 + 0.6f));
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.05f));
        return Color.HSVToColor(30, fArr);
    }

    public final boolean c(android.util.SparseIntArray r22, android.util.SparseIntArray r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.d6.c(android.util.SparseIntArray, android.util.SparseIntArray):boolean");
    }

    public final File d() {
        if (this.f22866a < 100) {
            if (TextUtils.isEmpty(this.f22878o)) {
                return null;
            }
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            Locale locale = Locale.US;
            String m10 = this.f22867b.m();
            int i9 = this.f22866a;
            String str = this.f22878o;
            return new File(filesDirFixed, m10 + "_" + i9 + "_" + str + "_v5.jpg");
        } else if (TextUtils.isEmpty(this.f22878o)) {
            return null;
        } else {
            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
            Locale locale2 = Locale.US;
            String m11 = this.f22867b.m();
            int i10 = this.f22866a;
            String str2 = this.f22878o;
            return new File(filesDirFixed2, m11 + "_" + i10 + "_" + str2 + "_v8_debug.jpg");
        }
    }

    public final int e(int i9, int i10, boolean z10) {
        int d = i0.a.d(0.25f, i9, i10);
        float[] fArr = this.A;
        Color.colorToHSV(d, fArr);
        float f10 = 0.1f;
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        float f11 = fArr[2];
        if (!z10) {
            f10 = 0.0f;
        }
        fArr[2] = Math.max(0.0f, Math.min(1.0f, f11 + f10));
        return Color.HSVToColor(51, fArr);
    }

    public final int f(int i9, float f10, boolean z10) {
        if (z10) {
            return 520093695;
        }
        float[] fArr = this.A;
        Color.colorToHSV(i9, fArr);
        if (fArr[1] > 0.0f) {
            float f11 = fArr[2];
            if (f11 < 1.0f && f11 > 0.0f) {
                fArr[0] = g7.n.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = g7.n.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = g7.n.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f10;
        fArr[1] = 0.2f;
        fArr[2] = g7.n.a(fArr[2] - 0.65f, 0.0f, 1.0f);
        return Color.HSVToColor(90, fArr);
    }

    public final int h(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.d6.h(int, int):int");
    }
}
