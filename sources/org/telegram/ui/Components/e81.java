package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class e81 {
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
    public final d81 f34645a;
    public final float f34646b;
    public final Handler f34647c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix f34648e;
    public final float[] f34649f;
    public final float[] f34650g;
    public final Path h;
    public final RectF f34651i;
    public final float[] f34652j;
    public final c81 f34653k;
    public final c81 f34654l;
    public final org.telegram.utils.twidget.f0 f34655m;
    public final c81 f34656n;
    public org.telegram.utils.twidget.n1 f34657o;
    public org.telegram.utils.twidget.d1 f34658p;
    public boolean f34659q;
    public boolean f34660r;
    public long f34661s;
    public long f34662t;
    public float f34663u;
    public float v;
    public boolean f34664w;
    public boolean f34665x;
    public boolean f34666y;
    public boolean f34667z;

    public e81(d81 d81Var, float f10) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f34648e = new Matrix();
        this.f34649f = new float[9];
        this.f34650g = new float[7];
        this.h = new Path();
        this.f34651i = new RectF();
        this.f34652j = new float[8];
        this.f34653k = new Runnable(this) {
            public final e81 f33948b;

            {
                this.f33948b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.d1 d1Var;
                switch (r2) {
                    case 0:
                        this.f33948b.l(false, false, false);
                        return;
                    case 1:
                        e81 e81Var = this.f33948b;
                        if (e81Var.f34664w && e81Var.f34665x) {
                            e81Var.a(e81Var.f34655m.f(SystemClock.uptimeMillis()));
                            e81Var.p();
                            return;
                        }
                        return;
                    default:
                        e81 e81Var2 = this.f33948b;
                        if (e81Var2.f34657o != null && (d1Var = e81Var2.f34658p) != null) {
                            org.telegram.utils.twidget.n1 d = d1Var.d();
                            org.telegram.utils.twidget.n1 n1Var = e81Var2.f34657o;
                            if (d == n1Var) {
                                n1Var.f54983a.f();
                                e81Var2.f34645a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f34654l = new Runnable(this) {
            public final e81 f33948b;

            {
                this.f33948b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.d1 d1Var;
                switch (r2) {
                    case 0:
                        this.f33948b.l(false, false, false);
                        return;
                    case 1:
                        e81 e81Var = this.f33948b;
                        if (e81Var.f34664w && e81Var.f34665x) {
                            e81Var.a(e81Var.f34655m.f(SystemClock.uptimeMillis()));
                            e81Var.p();
                            return;
                        }
                        return;
                    default:
                        e81 e81Var2 = this.f33948b;
                        if (e81Var2.f34657o != null && (d1Var = e81Var2.f34658p) != null) {
                            org.telegram.utils.twidget.n1 d = d1Var.d();
                            org.telegram.utils.twidget.n1 n1Var = e81Var2.f34657o;
                            if (d == n1Var) {
                                n1Var.f54983a.f();
                                e81Var2.f34645a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f34655m = new Object();
        this.f34656n = new Runnable(this) {
            public final e81 f33948b;

            {
                this.f33948b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.d1 d1Var;
                switch (r2) {
                    case 0:
                        this.f33948b.l(false, false, false);
                        return;
                    case 1:
                        e81 e81Var = this.f33948b;
                        if (e81Var.f34664w && e81Var.f34665x) {
                            e81Var.a(e81Var.f34655m.f(SystemClock.uptimeMillis()));
                            e81Var.p();
                            return;
                        }
                        return;
                    default:
                        e81 e81Var2 = this.f33948b;
                        if (e81Var2.f34657o != null && (d1Var = e81Var2.f34658p) != null) {
                            org.telegram.utils.twidget.n1 d = d1Var.d();
                            org.telegram.utils.twidget.n1 n1Var = e81Var2.f34657o;
                            if (d == n1Var) {
                                n1Var.f54983a.f();
                                e81Var2.f34645a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.L = -1;
        this.f34645a = d81Var;
        this.f34646b = f10;
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
                org.telegram.utils.twidget.d1 d1Var = this.f34658p;
                float f10 = this.P;
                float f11 = this.Q;
                boolean z10 = this.E;
                int i10 = this.I;
                int i11 = this.H;
                org.telegram.utils.twidget.p1 p1Var = d1Var.f54821f;
                if (p1Var != null) {
                    p1Var.i(3, f10, f11, 0, true, z10, i10, i11);
                }
            }
            int i12 = i7 & 3;
            d81 d81Var = this.f34645a;
            if (i12 == 2) {
                h();
                if (((i7 >> 6) & 7) == 1 && !this.D) {
                    this.D = true;
                    d81Var.d();
                }
            } else if (i12 == 1 && o() && !this.C) {
                if (this.B) {
                    d81Var.b(true);
                } else {
                    i();
                }
            }
        }
    }

    public final void b(org.telegram.utils.twidget.d1 d1Var) {
        if (this.f34658p != d1Var) {
            r();
            this.f34658p = d1Var;
            if (d1Var == null) {
                return;
            }
            d1Var.h = this;
            d1Var.k(this.f34659q);
        }
    }

    public final boolean c(android.graphics.Canvas r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e81.c(android.graphics.Canvas, int):boolean");
    }

    public final void d() {
        if (!this.F) {
            return;
        }
        this.F = false;
        org.telegram.utils.twidget.d1 d1Var = this.f34658p;
        if (d1Var != null && !this.f34660r) {
            float f10 = this.J;
            float f11 = this.K;
            org.telegram.utils.twidget.p1 p1Var = d1Var.f54821f;
            if (p1Var != null) {
                long j3 = p1Var.v;
                if (!p1Var.A && j3 != 0) {
                    p1Var.f55011c.f(j3, 1, f10, f11, 0);
                }
            }
        }
        this.f34645a.f("auto");
    }

    public final void e() {
        c81 c81Var = this.f34653k;
        Handler handler = this.f34647c;
        handler.removeCallbacks(c81Var);
        handler.removeCallbacks(this.f34654l);
        this.f34664w = false;
        this.f34665x = false;
    }

    public final void f() {
        org.telegram.utils.twidget.d1 d1Var;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (this.f34664w && !this.A && (d1Var = this.f34658p) != null) {
            this.A = true;
            float f10 = this.P;
            float f11 = this.Q;
            boolean z10 = this.E;
            int i7 = this.I;
            int i10 = this.H;
            org.telegram.utils.twidget.p1 p1Var = d1Var.f54821f;
            if (p1Var != null) {
                p1Var.i(3, f10, f11, 0, true, z10, i7, i10);
            }
        }
    }

    public final void g() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.d1 d1Var = this.f34658p;
            if (d1Var != null) {
                float f10 = this.N;
                float f11 = this.O;
                boolean z10 = this.E;
                int i7 = this.I;
                int i10 = this.H;
                org.telegram.utils.twidget.p1 p1Var = d1Var.f54821f;
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
                this.f34645a.b(false);
            }
        }
    }

    public final void i() {
        if (!this.B && !this.C) {
            this.B = true;
            this.f34645a.b(true);
        }
    }

    public final float j(float f10) {
        int i7;
        if (org.telegram.messenger.gd.f24314a0 && (i7 = this.R) > 0) {
            return (i7 / this.f34646b) - f10;
        }
        return f10;
    }

    public final void l(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        if (this.f34664w && !this.f34665x) {
            this.f34647c.removeCallbacks(this.f34653k);
            this.f34665x = true;
            int b10 = this.f34655m.b(this.M, j(this.N), this.O, z10, z11, z12, this.E, this.H);
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
            this.f34666y = z14;
            if (z12 && !z13) {
                z15 = true;
            }
            this.f34667z = z15;
            a(b10);
            if (this.P != this.N || this.Q != this.O) {
                a(this.f34655m.d(SystemClock.uptimeMillis(), j(this.P), this.Q));
            }
            if (!this.f34666y && !this.f34667z && !this.E) {
                h();
            } else {
                i();
                if ((this.f34666y || this.E) && !this.C) {
                    this.f34645a.b(true);
                }
            }
            p();
        }
    }

    public final void m(MotionEvent motionEvent, boolean z10) {
        org.telegram.utils.twidget.d1 d1Var;
        org.telegram.utils.twidget.p1 p1Var;
        float f10 = this.f34646b;
        int actionMasked = motionEvent.getActionMasked();
        if (z10 && actionMasked != 10 && (d1Var = this.f34658p) != null && !this.f34660r && (p1Var = d1Var.f54821f) != null && p1Var.I) {
            this.F = true;
            this.J = motionEvent.getX() / f10;
            float y10 = motionEvent.getY() / f10;
            this.K = y10;
            org.telegram.utils.twidget.d1 d1Var2 = this.f34658p;
            float f11 = this.J;
            int k10 = k(motionEvent);
            org.telegram.utils.twidget.p1 p1Var2 = d1Var2.f54821f;
            if (p1Var2 != null) {
                long j3 = p1Var2.v;
                if (!p1Var2.A && j3 != 0) {
                    p1Var2.f55011c.f(j3, 0, f11, y10, k10);
                    return;
                }
                return;
            }
            return;
        }
        d();
    }

    public final boolean n(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.e81.n(android.view.MotionEvent):boolean");
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
        Handler handler = this.f34647c;
        c81 c81Var = this.f34654l;
        handler.removeCallbacks(c81Var);
        double c10 = this.f34655m.c();
        if (this.f34664w && c10 >= 0.0d) {
            handler.postDelayed(c81Var, Math.max(0L, ((long) Math.ceil(c10)) - SystemClock.uptimeMillis()));
        }
    }

    public final void q(boolean z10) {
        if (this.f34659q != z10) {
            this.f34659q = z10;
            org.telegram.utils.twidget.d1 d1Var = this.f34658p;
            if (d1Var != null && !this.f34660r) {
                d1Var.k(z10);
            }
        }
    }

    public final void r() {
        if (this.f34658p == null) {
            return;
        }
        if (this.f34660r) {
            this.f34660r = false;
            this.f34658p = null;
            return;
        }
        f();
        d();
        this.f34658p.k(false);
        org.telegram.utils.twidget.d1 d1Var = this.f34658p;
        if (d1Var.h == this) {
            d1Var.h = null;
        }
        this.f34658p = null;
        this.f34647c.removeCallbacks(this.f34656n);
        this.f34657o = null;
        e();
        this.f34655m.e();
    }
}
