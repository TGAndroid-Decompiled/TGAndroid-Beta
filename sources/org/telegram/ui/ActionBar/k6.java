package org.telegram.ui.ActionBar;

import android.graphics.Color;
import android.text.TextUtils;
import android.util.SparseIntArray;
import c8.l9;
import java.io.File;
import java.util.Locale;
import org.telegram.messenger.n10;
import org.telegram.tgnet.TLRPC;
public final class k6 {
    public int f29168a;
    public m6 f29169b;
    public int f29170c;
    public int d;
    public int f29171e;
    public int f29172f;
    public int f29173g;
    public int h;
    public boolean f29174i;
    public long f29175j;
    public long f29176k;
    public long f29177l;
    public long f29178m;
    public float f29181p;
    public boolean f29182q;
    public TLRPC.TL_theme f29183r;
    public TLRPC.TL_wallPaper f29184s;
    public int f29185t;
    public String f29186u;
    public String v;
    public TLRPC.InputFile f29187w;
    public TLRPC.InputFile f29188x;
    public e6 f29189y;
    public boolean f29190z;
    public int f29179n = 45;
    public String f29180o = "";
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
        if (indexOfKey < 0 && (i10 = n6.im.get(i7, -1)) >= 0) {
            indexOfKey = sparseIntArray.indexOfKey(i10);
        }
        if (indexOfKey >= 0) {
            return sparseIntArray.valueAt(indexOfKey);
        }
        return n6.hm[i7];
    }

    public static void h(SparseIntArray sparseIntArray) {
        for (int i7 = n6.f29639qb; i7 < n6.f29772xb; i7++) {
            sparseIntArray.delete(i7);
            sparseIntArray.put(i7, n6.hm[i7]);
        }
        for (int i10 = n6.f29790yb; i10 < n6.Kc; i10++) {
            sparseIntArray.delete(i10);
            sparseIntArray.put(i10, n6.hm[i10]);
        }
        for (int i11 = n6.Lc; i11 < n6.Tc; i11++) {
            sparseIntArray.delete(i11);
            sparseIntArray.put(i11, n6.hm[i11]);
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
        fArr[1] = n10.A(f11, 0.6f, 1.0f, 0.0f);
        fArr[2] = Math.max(0.0f, Math.min(1.0f, fArr[2] - 0.05f));
        return Color.HSVToColor(30, fArr);
    }

    public final boolean d(android.util.SparseIntArray r21, android.util.SparseIntArray r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.d(android.util.SparseIntArray, android.util.SparseIntArray):boolean");
    }

    public final File e() {
        if (this.f29168a < 100) {
            if (TextUtils.isEmpty(this.f29180o)) {
                return null;
            }
            File h = org.telegram.messenger.t0.h();
            Locale locale = Locale.US;
            String m10 = this.f29169b.m();
            int i7 = this.f29168a;
            String str = this.f29180o;
            return new File(h, m10 + "_" + i7 + "_" + str + "_v5.jpg");
        } else if (TextUtils.isEmpty(this.f29180o)) {
            return null;
        } else {
            File h7 = org.telegram.messenger.t0.h();
            Locale locale2 = Locale.US;
            String m11 = this.f29169b.m();
            int i10 = this.f29168a;
            String str2 = this.f29180o;
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
        fArr[2] = n10.A(f12, f11, 1.0f, 0.0f);
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
                fArr[0] = l9.a(fArr[0] + 0.22f, 0.0f, 1.0f);
                fArr[1] = l9.a(fArr[1] - 0.35f, 0.0f, 1.0f);
                fArr[2] = l9.a(fArr[2] - 0.65f, 0.0f, 1.0f);
                return Color.HSVToColor(90, fArr);
            }
        }
        fArr[0] = f10;
        fArr[1] = 0.2f;
        fArr[2] = l9.a(fArr[2] - 0.65f, 0.0f, 1.0f);
        return Color.HSVToColor(90, fArr);
    }

    public final int i(int r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ActionBar.k6.i(int, int):int");
    }
}
