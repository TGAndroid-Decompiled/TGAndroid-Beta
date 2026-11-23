package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class d81 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public boolean G;
    public int H;
    public int I;
    public float J;
    public float K;
    public int L;
    public long M;
    public float N;
    public float O;
    public float P;
    public float Q;
    public int R;
    public final c81 f34364a;
    public final float f34365b;
    public final Handler f34366c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix f34367e;
    public final float[] f34368f;
    public final float[] f34369g;
    public final Path h;
    public final RectF f34370i;
    public final float[] f34371j;
    public final b81 f34372k;
    public final b81 f34373l;
    public final org.telegram.utils.twidget.f0 f34374m;
    public final b81 f34375n;
    public org.telegram.utils.twidget.n1 f34376o;
    public org.telegram.utils.twidget.d1 f34377p;
    public boolean f34378q;
    public boolean f34379r;
    public long f34380s;
    public long f34381t;
    public float f34382u;
    public float v;
    public boolean f34383w;
    public boolean f34384x;
    public boolean f34385y;
    public boolean f34386z;

    public d81(c81 c81Var, float f10) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f34367e = new Matrix();
        this.f34368f = new float[9];
        this.f34369g = new float[7];
        this.h = new Path();
        this.f34370i = new RectF();
        this.f34371j = new float[8];
        this.f34372k = new Runnable(this) {
            public final d81 f33765b;

            {
                this.f33765b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.d1 d1Var;
                switch (r2) {
                    case 0:
                        this.f33765b.l(false, false, false);
                        return;
                    case 1:
                        d81 d81Var = this.f33765b;
                        if (d81Var.f34383w && d81Var.f34384x) {
                            d81Var.a(d81Var.f34374m.f(SystemClock.uptimeMillis()));
                            d81Var.p();
                            return;
                        }
                        return;
                    default:
                        d81 d81Var2 = this.f33765b;
                        if (d81Var2.f34376o != null && (d1Var = d81Var2.f34377p) != null) {
                            org.telegram.utils.twidget.n1 d = d1Var.d();
                            org.telegram.utils.twidget.n1 n1Var = d81Var2.f34376o;
                            if (d == n1Var) {
                                n1Var.f54867a.f();
                                d81Var2.f34364a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f34373l = new Runnable(this) {
            public final d81 f33765b;

            {
                this.f33765b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.d1 d1Var;
                switch (r2) {
                    case 0:
                        this.f33765b.l(false, false, false);
                        return;
                    case 1:
                        d81 d81Var = this.f33765b;
                        if (d81Var.f34383w && d81Var.f34384x) {
                            d81Var.a(d81Var.f34374m.f(SystemClock.uptimeMillis()));
                            d81Var.p();
                            return;
                        }
                        return;
                    default:
                        d81 d81Var2 = this.f33765b;
                        if (d81Var2.f34376o != null && (d1Var = d81Var2.f34377p) != null) {
                            org.telegram.utils.twidget.n1 d = d1Var.d();
                            org.telegram.utils.twidget.n1 n1Var = d81Var2.f34376o;
                            if (d == n1Var) {
                                n1Var.f54867a.f();
                                d81Var2.f34364a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f34374m = new Object();
        this.f34375n = new Runnable(this) {
            public final d81 f33765b;

            {
                this.f33765b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.d1 d1Var;
                switch (r2) {
                    case 0:
                        this.f33765b.l(false, false, false);
                        return;
                    case 1:
                        d81 d81Var = this.f33765b;
                        if (d81Var.f34383w && d81Var.f34384x) {
                            d81Var.a(d81Var.f34374m.f(SystemClock.uptimeMillis()));
                            d81Var.p();
                            return;
                        }
                        return;
                    default:
                        d81 d81Var2 = this.f33765b;
                        if (d81Var2.f34376o != null && (d1Var = d81Var2.f34377p) != null) {
                            org.telegram.utils.twidget.n1 d = d1Var.d();
                            org.telegram.utils.twidget.n1 n1Var = d81Var2.f34376o;
                            if (d == n1Var) {
                                n1Var.f54867a.f();
                                d81Var2.f34364a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.L = -1;
        this.f34364a = c81Var;
        this.f34365b = f10;
        paint.setTextSize(f10 * 14.0f);
        paint.setColor(-8355712);
    }

    public static int k(MotionEvent motionEvent) {
        int i7;
        int i10;
        int i11;
        int metaState = motionEvent.getMetaState();
        int i12 = 0;
        if ((metaState & 2) != 0) {
            i7 = 1;
        } else {
            i7 = 0;
        }
        if ((metaState & 4096) != 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i13 = i7 | i10;
        if ((65536 & metaState) != 0) {
            i11 = 4;
        } else {
            i11 = 0;
        }
        int i14 = i13 | i11;
        if ((metaState & 1) != 0) {
            i12 = 8;
        }
        return i14 | i12;
    }

    public final void a(int i7) {
        if (i7 != -1) {
            this.L = i7;
            if ((i7 & 32) != 0 && !this.A) {
                this.A = true;
                org.telegram.utils.twidget.d1 d1Var = this.f34377p;
                float f10 = this.P;
                float f11 = this.Q;
                boolean z10 = this.E;
                int i10 = this.I;
                int i11 = this.H;
                org.telegram.utils.twidget.p1 p1Var = d1Var.f54705f;
                if (p1Var != null) {
                    p1Var.i(3, f10, f11, 0, true, z10, i10, i11);
                }
            }
            int i12 = i7 & 3;
            c81 c81Var = this.f34364a;
            if (i12 == 2) {
                h();
                if (((i7 >> 6) & 7) == 1 && !this.D) {
                    this.D = true;
                    c81Var.d();
                }
            } else if (i12 == 1 && o() && !this.C) {
                if (this.B) {
                    c81Var.b(true);
                } else {
                    i();
                }
            }
        }
    }

    public final void b(org.telegram.utils.twidget.d1 d1Var) {
        if (this.f34377p != d1Var) {
            r();
            this.f34377p = d1Var;
            if (d1Var == null) {
                return;
            }
            d1Var.h = this;
            d1Var.k(this.f34378q);
        }
    }

    public final boolean c(android.graphics.Canvas r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d81.c(android.graphics.Canvas, int):boolean");
    }

    public final void d() {
        if (!this.F) {
            return;
        }
        this.F = false;
        org.telegram.utils.twidget.d1 d1Var = this.f34377p;
        if (d1Var != null && !this.f34379r) {
            float f10 = this.J;
            float f11 = this.K;
            org.telegram.utils.twidget.p1 p1Var = d1Var.f54705f;
            if (p1Var != null) {
                long j3 = p1Var.v;
                if (!p1Var.A && j3 != 0) {
                    p1Var.f54895c.f(j3, 1, f10, f11, 0);
                }
            }
        }
        this.f34364a.f("auto");
    }

    public final void e() {
        b81 b81Var = this.f34372k;
        Handler handler = this.f34366c;
        handler.removeCallbacks(b81Var);
        handler.removeCallbacks(this.f34373l);
        this.f34383w = false;
        this.f34384x = false;
    }

    public final void f() {
        org.telegram.utils.twidget.d1 d1Var;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (this.f34383w && !this.A && (d1Var = this.f34377p) != null) {
            this.A = true;
            float f10 = this.P;
            float f11 = this.Q;
            boolean z10 = this.E;
            int i7 = this.I;
            int i10 = this.H;
            org.telegram.utils.twidget.p1 p1Var = d1Var.f54705f;
            if (p1Var != null) {
                p1Var.i(3, f10, f11, 0, true, z10, i7, i10);
            }
        }
    }

    public final void g() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.d1 d1Var = this.f34377p;
            if (d1Var != null) {
                float f10 = this.N;
                float f11 = this.O;
                boolean z10 = this.E;
                int i7 = this.I;
                int i10 = this.H;
                org.telegram.utils.twidget.p1 p1Var = d1Var.f54705f;
                if (p1Var != null) {
                    p1Var.i(0, f10, f11, 0, true, z10, i7, i10);
                }
            }
        }
    }

    public final void h() {
        if (!this.C) {
            this.C = true;
            if (this.B) {
                this.f34364a.b(false);
            }
        }
    }

    public final void i() {
        if (!this.B && !this.C) {
            this.B = true;
            this.f34364a.b(true);
        }
    }

    public final float j(float f10) {
        int i7;
        if (org.telegram.messenger.hd.f24408a0 && (i7 = this.R) > 0) {
            return (i7 / this.f34365b) - f10;
        }
        return f10;
    }

    public final void l(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        if (this.f34383w && !this.f34384x) {
            this.f34366c.removeCallbacks(this.f34372k);
            this.f34384x = true;
            int b10 = this.f34374m.b(this.M, j(this.N), this.O, z10, z11, z12, this.E, this.H);
            boolean z15 = false;
            if ((b10 & 2048) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z10 && !z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f34385y = z14;
            if (z12 && !z13) {
                z15 = true;
            }
            this.f34386z = z15;
            a(b10);
            if (this.P != this.N || this.Q != this.O) {
                a(this.f34374m.d(SystemClock.uptimeMillis(), j(this.P), this.Q));
            }
            if (!this.f34385y && !this.f34386z && !this.E) {
                h();
            } else {
                i();
                if ((this.f34385y || this.E) && !this.C) {
                    this.f34364a.b(true);
                }
            }
            p();
        }
    }

    public final void m(MotionEvent motionEvent, boolean z10) {
        org.telegram.utils.twidget.d1 d1Var;
        org.telegram.utils.twidget.p1 p1Var;
        float f10 = this.f34365b;
        int actionMasked = motionEvent.getActionMasked();
        if (z10 && actionMasked != 10 && (d1Var = this.f34377p) != null && !this.f34379r && (p1Var = d1Var.f54705f) != null && p1Var.I) {
            this.F = true;
            this.J = motionEvent.getX() / f10;
            float y10 = motionEvent.getY() / f10;
            this.K = y10;
            org.telegram.utils.twidget.d1 d1Var2 = this.f34377p;
            float f11 = this.J;
            int k10 = k(motionEvent);
            org.telegram.utils.twidget.p1 p1Var2 = d1Var2.f54705f;
            if (p1Var2 != null) {
                long j3 = p1Var2.v;
                if (!p1Var2.A && j3 != 0) {
                    p1Var2.f54895c.f(j3, 0, f11, y10, k10);
                    return;
                }
                return;
            }
            return;
        }
        d();
    }

    public final boolean n(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.d81.n(android.view.MotionEvent):boolean");
    }

    public final boolean o() {
        int i7 = this.L;
        int i10 = (i7 >> 2) & 7;
        if ((i7 & 3) == 1) {
            if (i10 == 4 || i10 == 5 || i10 == 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p() {
        Handler handler = this.f34366c;
        b81 b81Var = this.f34373l;
        handler.removeCallbacks(b81Var);
        double c10 = this.f34374m.c();
        if (this.f34383w && c10 >= 0.0d) {
            handler.postDelayed(b81Var, Math.max(0L, ((long) Math.ceil(c10)) - SystemClock.uptimeMillis()));
        }
    }

    public final void q(boolean z10) {
        if (this.f34378q != z10) {
            this.f34378q = z10;
            org.telegram.utils.twidget.d1 d1Var = this.f34377p;
            if (d1Var != null && !this.f34379r) {
                d1Var.k(z10);
            }
        }
    }

    public final void r() {
        if (this.f34377p == null) {
            return;
        }
        if (this.f34379r) {
            this.f34379r = false;
            this.f34377p = null;
            return;
        }
        f();
        d();
        this.f34377p.k(false);
        org.telegram.utils.twidget.d1 d1Var = this.f34377p;
        if (d1Var.h == this) {
            d1Var.h = null;
        }
        this.f34377p = null;
        this.f34366c.removeCallbacks(this.f34375n);
        this.f34376o = null;
        e();
        this.f34374m.e();
    }
}
