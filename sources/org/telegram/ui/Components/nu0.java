package org.telegram.ui.Components;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.os.Build;
public final class nu0 {
    public static final int[] T = {-10504961, -13056257, -9445121, -5841665, -11544336, -7362817, -8468225, -3870977};
    public static final int[] U = {-15233051, -14054705, -14776080, -14575888, -15233051, -14975018, -13984526, -11554059};
    public final boolean[] A;
    public int B;
    public int C;
    public int D;
    public final float[] E;
    public final float[] F;
    public final int[] G = new int[72];
    public final int[] H = new int[72];
    public final short[] I;
    public int J;
    public final Paint K;
    public final Paint L;
    public boolean M;
    public long N;
    public float O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public int[] f37705a;
    public final int f37706b;
    public final float[] f37707c;
    public final float[] d;
    public final float[] f37708e;
    public final float[] f37709f;
    public final float[] f37710g;
    public final float[] h;
    public final float[] f37711i;
    public final float[] f37712j;
    public final float[] f37713k;
    public final float[] f37714l;
    public final float[] f37715m;
    public final float[] f37716n;
    public final byte[] f37717o;
    public final byte[] f37718p;
    public final byte[] f37719q;
    public final boolean[] f37720r;
    public boolean f37721s;
    public int[] f37722t;
    public float f37723u;
    public final float[] v;
    public final float[] f37724w;
    public final float[] f37725x;
    public final float[] f37726y;
    public final float[] f37727z;

    public nu0(int i7) {
        Paint paint = new Paint(1);
        this.K = paint;
        Paint paint2 = new Paint(1);
        this.L = paint2;
        this.P = 49734321;
        this.Q = org.telegram.messenger.g0.L(16.0f);
        this.f37706b = i7;
        this.f37707c = new float[i7];
        this.d = new float[i7];
        this.f37708e = new float[i7];
        this.f37709f = new float[i7];
        this.f37710g = new float[i7];
        this.h = new float[i7];
        this.f37711i = new float[i7];
        this.f37712j = new float[i7];
        this.f37713k = new float[i7];
        this.f37714l = new float[i7];
        this.f37715m = new float[i7];
        this.f37716n = new float[i7];
        this.f37717o = new byte[i7];
        this.f37718p = new byte[i7];
        this.f37719q = new byte[i7];
        this.f37720r = new boolean[i7];
        this.I = new short[i7];
        int i10 = i7 * 2;
        this.E = new float[i10];
        this.F = new float[i10];
        this.v = new float[i10];
        this.f37724w = new float[i7];
        this.f37725x = new float[i7];
        this.f37726y = new float[i7];
        this.f37727z = new float[i7];
        this.A = new boolean[i7];
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStrokeCap(cap);
    }

    public final void a() {
        for (int i7 = 0; i7 < this.f37706b; i7++) {
            this.h[i7] = 0.0f;
        }
        this.D = 0;
        this.N = 0L;
    }

    public final boolean b(android.graphics.Canvas r55, float r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.nu0.b(android.graphics.Canvas, float):boolean");
    }

    public final void c(float f10, float f11, int i7) {
        int i10;
        this.h[i7] = Math.max(0.05f, f10);
        this.f37710g[i7] = -f11;
        this.f37711i[i7] = d() * 6.2832f;
        this.f37712j[i7] = d() * 8.0f;
        int i11 = 0;
        this.f37720r[i7] = false;
        float d = d();
        if (d < 0.5f) {
            i10 = 0;
        } else if (d < 0.86f) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        this.f37717o[i7] = (byte) i10;
        if (d() < 0.07f) {
            i11 = 1;
        }
        this.f37718p[i7] = (byte) i11;
    }

    public final float d() {
        int i7 = this.P;
        int i10 = i7 ^ (i7 << 13);
        int i11 = i10 ^ (i10 >>> 17);
        int i12 = i11 ^ (i11 << 5);
        this.P = i12;
        return (i12 >>> 8) / 1.6777216E7f;
    }

    public final void e(boolean z10) {
        BlendMode k10;
        this.M = z10;
        if (Build.VERSION.SDK_INT >= 29) {
            if (z10) {
                k10 = rb0.i();
            } else {
                k10 = rb0.k();
            }
            this.L.setBlendMode(k10);
        }
    }

    public final int f() {
        int i7 = this.C;
        this.C = (i7 + 1) % this.f37706b;
        if (this.h[i7] <= 0.0f) {
            this.D++;
        }
        return i7;
    }

    public final void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        int f16 = f();
        this.f37707c[f16] = f10;
        this.d[f16] = f11;
        this.f37708e[f16] = f12;
        this.f37709f[f16] = f13;
        this.f37719q[f16] = 0;
        c(f14, f15, f16);
    }

    public final void h(float f10, float f11, float f12, float f13, float f14) {
        int f15 = f();
        this.f37707c[f15] = f10;
        this.f37715m[f15] = f10;
        this.f37716n[f15] = f11;
        this.d[f15] = f11;
        this.f37713k[f15] = f12;
        this.f37714l[f15] = f13;
        this.f37709f[f15] = 0.0f;
        this.f37708e[f15] = 0.0f;
        this.f37719q[f15] = 1;
        c(f14, 0.0f, f15);
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        int i7;
        int f18 = f();
        this.f37707c[f18] = f10;
        this.f37715m[f18] = f10;
        this.d[f18] = f11;
        this.f37716n[f18] = f11;
        this.f37713k[f18] = f14;
        this.f37714l[f18] = f15;
        this.f37708e[f18] = f12;
        this.f37709f[f18] = f13;
        this.f37719q[f18] = 2;
        c(f16, f17, f18);
        this.f37725x[f18] = 0.0f;
        this.f37724w[f18] = 0.0f;
        this.A[f18] = false;
        if (this.f37721s) {
            if (d() < this.f37723u) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            byte b10 = (byte) i7;
            this.f37718p[f18] = b10;
            if (b10 != 0) {
                this.f37717o[f18] = 0;
            }
        }
    }

    public final void j(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i7) {
        i(f10, f11, f12, f13, f14, f15, f16, f17);
        int i10 = this.C;
        int i11 = this.f37706b;
        int i12 = ((i10 + i11) - 1) % i11;
        this.f37712j[i12] = Math.max(0, Math.min(7, i7));
        this.f37720r[i12] = true;
    }
}
