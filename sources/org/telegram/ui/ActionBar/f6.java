package org.telegram.ui.ActionBar;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.io.File;
import java.util.Locale;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.tgnet.TLRPC;
public final class f6 {
    public int f18885a;
    public g6 f18886b;
    public int f18887c;
    public int d;
    public int e;
    public int f18888f;
    public int f18889g;
    public int h;
    public boolean f18890i;
    public long f18891j;
    public long f18892k;
    public long f18893l;
    public long f18894m;
    public float f18897p;
    public boolean f18898q;
    public TLRPC.TL_theme f18899r;
    public TLRPC.TL_wallPaper f18900s;
    public int f18901t;
    public String f18902u;
    public String v;
    public TLRPC.InputFile f18903w;
    public TLRPC.InputFile f18904x;
    public z5 f18905y;
    public boolean f18906z;
    public int f18895n = 45;
    public String f18896o = "";
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
        for (int i10 = h6.f19465za; i10 < h6.Ga; i10++) {
            sparseIntArray.delete(i10);
            sparseIntArray.put(i10, h6.nl[i10]);
        }
        for (int i11 = h6.Ha; i11 < h6.Tb; i11++) {
            sparseIntArray.delete(i11);
            sparseIntArray.put(i11, h6.nl[i11]);
        }
        for (int i12 = h6.Ub; i12 < h6.f19046cc; i12++) {
            sparseIntArray.delete(i12);
            sparseIntArray.put(i12, h6.nl[i12]);
        }
    }

    public final int b(int i10, int i11) {
        float[] fArr = this.A;
        Color.colorToHSV(i11, fArr);
        float f7 = fArr[0];
        Color.colorToHSV(i10, fArr);
        float f10 = fArr[1];
        if (f10 <= 0.0f) {
            fArr[0] = f7;
        }
        fArr[1] = Math.max(0.0f, Math.min(1.0f, f10 + 0.6f));
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.05f));
        return Color.HSVToColor(30, fArr);
    }

    public final boolean c(android.util.SparseIntArray r22, android.util.SparseIntArray r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f6.c(android.util.SparseIntArray, android.util.SparseIntArray):boolean");
    }

    public final File d() {
        if (this.f18885a < 100) {
            if (TextUtils.isEmpty(this.f18896o)) {
                return null;
            }
            File filesDirFixed = ApplicationLoader.getFilesDirFixed();
            Locale locale = Locale.US;
            String m10 = this.f18886b.m();
            int i10 = this.f18885a;
            String str = this.f18896o;
            return new File(filesDirFixed, m10 + "_" + i10 + "_" + str + "_v5.jpg");
        } else if (TextUtils.isEmpty(this.f18896o)) {
            return null;
        } else {
            File filesDirFixed2 = ApplicationLoader.getFilesDirFixed();
            Locale locale2 = Locale.US;
            String m11 = this.f18886b.m();
            int i11 = this.f18885a;
            String str2 = this.f18896o;
            return new File(filesDirFixed2, m11 + "_" + i11 + "_" + str2 + "_v8_debug.jpg");
        }
    }

    public final int e(int i10, int i11, boolean z10) {
        int d = i0.a.d(0.25f, i10, i11);
        float[] fArr = this.A;
        Color.colorToHSV(d, fArr);
        float f7 = 0.1f;
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        float f10 = fArr[2];
        if (!z10) {
            f7 = 0.0f;
        }
        fArr[2] = Math.max(0.0f, Math.min(1.0f, f10 + f7));
        return Color.HSVToColor(51, fArr);
    }

    public final int f(int i10, float f7, boolean z10) {
        if (z10) {
            return 520093695;
        }
        float[] fArr = this.A;
        Color.colorToHSV(i10, fArr);
        if (fArr[1] > 0.0f) {
            float f10 = fArr[2];
            if (f10 < 1.0f && f10 > 0.0f) {
                fArr[0] = w7.q.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = w7.q.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = w7.q.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f7;
        fArr[1] = 0.2f;
        fArr[2] = w7.q.a(fArr[2] - 0.65f, 0.0f, 1.0f);
        return Color.HSVToColor(90, fArr);
    }

    public final int h(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.f6.h(int, int):int");
    }
}
