package org.telegram.ui.ActionBar;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.SparseIntArray;
import c8.i9;
import java.io.File;
import java.util.Locale;
import org.telegram.messenger.i20;
import org.telegram.tgnet.TLRPC;
public final class g6 {
    public int f28602a;
    public i6 f28603b;
    public int f28604c;
    public int d;
    public int f28605e;
    public int f28606f;
    public int f28607g;
    public int h;
    public boolean f28608i;
    public long f28609j;
    public long f28610k;
    public long f28611l;
    public long f28612m;
    public float f28615p;
    public boolean f28616q;
    public TLRPC.TL_theme f28617r;
    public TLRPC.TL_wallPaper f28618s;
    public int f28619t;
    public String f28620u;
    public String v;
    public TLRPC.InputFile f28621w;
    public TLRPC.InputFile f28622x;
    public b6 f28623y;
    public boolean f28624z;
    public int f28613n = 45;
    public String f28614o = "";
    public final float[] A = new float[3];

    public static int a(SparseIntArray sparseIntArray, int... iArr) {
        int i7 = 0;
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
                    i7++;
                } catch (Exception unused) {
                }
            }
        }
        if (i7 == 0) {
            return 0;
        }
        return Color.argb(255, i10 / i7, i11 / i7, i12 / i7);
    }

    public static int c(SparseIntArray sparseIntArray, int i7) {
        int i10;
        int indexOfKey = sparseIntArray.indexOfKey(i7);
        if (indexOfKey < 0 && (i10 = j6.im.get(i7, -1)) >= 0) {
            indexOfKey = sparseIntArray.indexOfKey(i10);
        }
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return j6.hm[i7];
    }

    public static void h(SparseIntArray sparseIntArray) {
        for (int i7 = j6.f29094qb; i7 < j6.f29227xb; i7++) {
            sparseIntArray.delete(i7);
            sparseIntArray.put(i7, j6.hm[i7]);
        }
        for (int i10 = j6.f29245yb; i10 < j6.Kc; i10++) {
            sparseIntArray.delete(i10);
            sparseIntArray.put(i10, j6.hm[i10]);
        }
        for (int i11 = j6.Lc; i11 < j6.Tc; i11++) {
            sparseIntArray.delete(i11);
            sparseIntArray.put(i11, j6.hm[i11]);
        }
    }

    public final int b(int i7, int i10) {
        float[] fArr = this.A;
        Color.colorToHSV(i10, fArr);
        float f10 = fArr[0];
        Color.colorToHSV(i7, fArr);
        float f11 = fArr[1];
        if (f11 <= 0.0f) {
            fArr[0] = f10;
        }
        fArr[1] = i20.z(f11, 0.6f, 1.0f, 0.0f);
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.05f));
        return Color.HSVToColor(30, fArr);
    }

    public final boolean d(android.util.SparseIntArray r21, android.util.SparseIntArray r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.g6.d(android.util.SparseIntArray, android.util.SparseIntArray):boolean");
    }

    public final File e() {
        if (this.f28602a < 100) {
            if (TextUtils.isEmpty(this.f28614o)) {
                return null;
            }
            File h = org.telegram.messenger.t0.h();
            Locale locale = Locale.US;
            String m10 = this.f28603b.m();
            int i7 = this.f28602a;
            String str = this.f28614o;
            return new File(h, m10 + "_" + i7 + "_" + str + "_v5.jpg");
        } else if (TextUtils.isEmpty(this.f28614o)) {
            return null;
        } else {
            File h7 = org.telegram.messenger.t0.h();
            Locale locale2 = Locale.US;
            String m11 = this.f28603b.m();
            int i10 = this.f28602a;
            String str2 = this.f28614o;
            return new File(h7, m11 + "_" + i10 + "_" + str2 + "_v8_debug.jpg");
        }
    }

    public final int f(int i7, int i10, boolean z10) {
        int f10 = i0.a.f(0.25f, i7, i10);
        float[] fArr = this.A;
        Color.colorToHSV(f10, fArr);
        float f11 = 0.1f;
        fArr[1] = Math.max(0.0f, Math.min(1.0f, fArr[1] - 0.1f));
        float f12 = fArr[2];
        if (!z10) {
            f11 = 0.0f;
        }
        fArr[2] = i20.z(f12, f11, 1.0f, 0.0f);
        return Color.HSVToColor(51, fArr);
    }

    public final int g(int i7, float f10, boolean z10) {
        if (z10) {
            return 520093695;
        }
        float[] fArr = this.A;
        Color.colorToHSV(i7, fArr);
        if (fArr[1] > 0.0f) {
            float f11 = fArr[2];
            if (f11 < 1.0f && f11 > 0.0f) {
                fArr[0] = i9.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = i9.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = i9.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f10;
        fArr[1] = 0.2f;
        fArr[2] = i9.a(fArr[2] - 0.65f, 0.0f, 1.0f);
        return Color.HSVToColor(90, fArr);
    }

    public final int i(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.g6.i(int, int):int");
    }
}
