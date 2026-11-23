package org.telegram.ui.Components;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.os.Build;
public final class yu0 {
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
    public int[] f42551a;
    public final int f42552b;
    public final float[] f42553c;
    public final float[] d;
    public final float[] f42554e;
    public final float[] f42555f;
    public final float[] f42556g;
    public final float[] h;
    public final float[] f42557i;
    public final float[] f42558j;
    public final float[] f42559k;
    public final float[] f42560l;
    public final float[] f42561m;
    public final float[] f42562n;
    public final byte[] f42563o;
    public final byte[] f42564p;
    public final byte[] f42565q;
    public final boolean[] f42566r;
    public boolean f42567s;
    public int[] f42568t;
    public float f42569u;
    public final float[] v;
    public final float[] f42570w;
    public final float[] f42571x;
    public final float[] f42572y;
    public final float[] f42573z;

    public yu0(int i7) {
        Paint paint = new Paint(1);
        this.K = paint;
        Paint paint2 = new Paint(1);
        this.L = paint2;
        this.P = 49734321;
        this.Q = org.telegram.messenger.g0.L(16.0f);
        this.f42552b = i7;
        this.f42553c = new float[i7];
        this.d = new float[i7];
        this.f42554e = new float[i7];
        this.f42555f = new float[i7];
        this.f42556g = new float[i7];
        this.h = new float[i7];
        this.f42557i = new float[i7];
        this.f42558j = new float[i7];
        this.f42559k = new float[i7];
        this.f42560l = new float[i7];
        this.f42561m = new float[i7];
        this.f42562n = new float[i7];
        this.f42563o = new byte[i7];
        this.f42564p = new byte[i7];
        this.f42565q = new byte[i7];
        this.f42566r = new boolean[i7];
        this.I = new short[i7];
        int i10 = i7 * 2;
        this.E = new float[i10];
        this.F = new float[i10];
        this.v = new float[i10];
        this.f42570w = new float[i7];
        this.f42571x = new float[i7];
        this.f42572y = new float[i7];
        this.f42573z = new float[i7];
        this.A = new boolean[i7];
        Paint.Cap cap = Paint.Cap.ROUND;
        paint.setStrokeCap(cap);
        paint2.setStrokeCap(cap);
    }

    public final void a() {
        for (int i7 = 0; i7 < this.f42552b; i7++) {
            this.h[i7] = 0.0f;
        }
        this.D = 0;
        this.N = 0L;
    }

    public final boolean b(android.graphics.Canvas r55, float r56) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.yu0.b(android.graphics.Canvas, float):boolean");
    }

    public final void c(float f10, float f11, int i7) {
        int i10;
        this.h[i7] = Math.max(0.05f, f10);
        this.f42556g[i7] = -f11;
        this.f42557i[i7] = d() * 6.2832f;
        this.f42558j[i7] = d() * 8.0f;
        int i11 = 0;
        this.f42566r[i7] = false;
        float d = d();
        if (d < 0.5f) {
            i10 = 0;
        } else if (d < 0.86f) {
            i10 = 1;
        } else {
            i10 = 2;
        }
        this.f42563o[i7] = (byte) i10;
        if (d() < 0.07f) {
            i11 = 1;
        }
        this.f42564p[i7] = (byte) i11;
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
        this.M = z10;
        if (Build.VERSION.SDK_INT >= 29) {
            this.L.setBlendMode(z10 ? BlendMode.PLUS : BlendMode.SRC_OVER);
        }
    }

    public final int f() {
        int i7 = this.C;
        this.C = (i7 + 1) % this.f42552b;
        if (this.h[i7] <= 0.0f) {
            this.D++;
        }
        return i7;
    }

    public final void g(float f10, float f11, float f12, float f13, float f14, float f15) {
        int f16 = f();
        this.f42553c[f16] = f10;
        this.d[f16] = f11;
        this.f42554e[f16] = f12;
        this.f42555f[f16] = f13;
        this.f42565q[f16] = 0;
        c(f14, f15, f16);
    }

    public final void h(float f10, float f11, float f12, float f13, float f14) {
        int f15 = f();
        this.f42553c[f15] = f10;
        this.f42561m[f15] = f10;
        this.f42562n[f15] = f11;
        this.d[f15] = f11;
        this.f42559k[f15] = f12;
        this.f42560l[f15] = f13;
        this.f42555f[f15] = 0.0f;
        this.f42554e[f15] = 0.0f;
        this.f42565q[f15] = 1;
        c(f14, 0.0f, f15);
    }

    public final void i(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17) {
        int i7;
        int f18 = f();
        this.f42553c[f18] = f10;
        this.f42561m[f18] = f10;
        this.d[f18] = f11;
        this.f42562n[f18] = f11;
        this.f42559k[f18] = f14;
        this.f42560l[f18] = f15;
        this.f42554e[f18] = f12;
        this.f42555f[f18] = f13;
        this.f42565q[f18] = 2;
        c(f16, f17, f18);
        this.f42571x[f18] = 0.0f;
        this.f42570w[f18] = 0.0f;
        this.A[f18] = false;
        if (this.f42567s) {
            if (d() < this.f42569u) {
                i7 = 1;
            } else {
                i7 = 0;
            }
            byte b10 = (byte) i7;
            this.f42564p[f18] = b10;
            if (b10 != 0) {
                this.f42563o[f18] = 0;
            }
        }
    }

    public final void j(float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, int i7) {
        i(f10, f11, f12, f13, f14, f15, f16, f17);
        int i10 = this.C;
        int i11 = this.f42552b;
        int i12 = ((i10 + i11) - 1) % i11;
        this.f42558j[i12] = Math.max(0, Math.min(7, i7));
        this.f42566r[i12] = true;
    }
}
