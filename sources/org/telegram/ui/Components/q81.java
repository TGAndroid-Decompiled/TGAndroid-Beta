package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class q81 {
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
    public final p81 f29578a;
    public final float f29579b;
    public final Handler f29580c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix e;
    public final float[] f29581f;
    public final float[] f29582g;
    public final Path h;
    public final RectF f29583i;
    public final float[] f29584j;
    public final o81 f29585k;
    public final o81 f29586l;
    public final org.telegram.utils.twidget.h f29587m;
    public final o81 f29588n;
    public org.telegram.utils.twidget.i0 f29589o;
    public org.telegram.utils.twidget.w f29590p;
    public boolean f29591q;
    public boolean f29592r;
    public long f29593s;
    public long f29594t;
    public float f29595u;
    public float v;
    public boolean f29596w;
    public boolean f29597x;
    public boolean f29598y;
    public boolean f29599z;

    public q81(p81 p81Var, float f7) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Matrix();
        this.f29581f = new float[9];
        this.f29582g = new float[7];
        this.h = new Path();
        this.f29583i = new RectF();
        this.f29584j = new float[8];
        this.f29585k = new Runnable(this) {
            public final q81 f29000b;

            {
                this.f29000b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.w wVar;
                switch (r2) {
                    case 0:
                        this.f29000b.l(false, false, false);
                        return;
                    case 1:
                        q81 q81Var = this.f29000b;
                        if (q81Var.f29596w && q81Var.f29597x) {
                            q81Var.a(q81Var.f29587m.f(SystemClock.uptimeMillis()));
                            q81Var.p();
                            return;
                        }
                        return;
                    default:
                        q81 q81Var2 = this.f29000b;
                        if (q81Var2.f29589o != null && (wVar = q81Var2.f29590p) != null) {
                            org.telegram.utils.twidget.i0 c10 = wVar.c();
                            org.telegram.utils.twidget.i0 i0Var = q81Var2.f29589o;
                            if (c10 == i0Var) {
                                i0Var.f44353a.g();
                                q81Var2.f29578a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f29586l = new Runnable(this) {
            public final q81 f29000b;

            {
                this.f29000b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.w wVar;
                switch (r2) {
                    case 0:
                        this.f29000b.l(false, false, false);
                        return;
                    case 1:
                        q81 q81Var = this.f29000b;
                        if (q81Var.f29596w && q81Var.f29597x) {
                            q81Var.a(q81Var.f29587m.f(SystemClock.uptimeMillis()));
                            q81Var.p();
                            return;
                        }
                        return;
                    default:
                        q81 q81Var2 = this.f29000b;
                        if (q81Var2.f29589o != null && (wVar = q81Var2.f29590p) != null) {
                            org.telegram.utils.twidget.i0 c10 = wVar.c();
                            org.telegram.utils.twidget.i0 i0Var = q81Var2.f29589o;
                            if (c10 == i0Var) {
                                i0Var.f44353a.g();
                                q81Var2.f29578a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f29587m = new Object();
        this.f29588n = new Runnable(this) {
            public final q81 f29000b;

            {
                this.f29000b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.w wVar;
                switch (r2) {
                    case 0:
                        this.f29000b.l(false, false, false);
                        return;
                    case 1:
                        q81 q81Var = this.f29000b;
                        if (q81Var.f29596w && q81Var.f29597x) {
                            q81Var.a(q81Var.f29587m.f(SystemClock.uptimeMillis()));
                            q81Var.p();
                            return;
                        }
                        return;
                    default:
                        q81 q81Var2 = this.f29000b;
                        if (q81Var2.f29589o != null && (wVar = q81Var2.f29590p) != null) {
                            org.telegram.utils.twidget.i0 c10 = wVar.c();
                            org.telegram.utils.twidget.i0 i0Var = q81Var2.f29589o;
                            if (c10 == i0Var) {
                                i0Var.f44353a.g();
                                q81Var2.f29578a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.L = -1;
        this.f29578a = p81Var;
        this.f29579b = f7;
        paint.setTextSize(f7 * 14.0f);
        paint.setColor(-8355712);
    }

    public static int k(MotionEvent motionEvent) {
        int i10;
        int i11;
        int i12;
        int metaState = motionEvent.getMetaState();
        int i13 = 0;
        if ((metaState & 2) != 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if ((metaState & 4096) != 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        int i14 = i10 | i11;
        if ((65536 & metaState) != 0) {
            i12 = 4;
        } else {
            i12 = 0;
        }
        int i15 = i14 | i12;
        if ((metaState & 1) != 0) {
            i13 = 8;
        }
        return i15 | i13;
    }

    public final void a(int i10) {
        if (i10 != -1) {
            this.L = i10;
            if ((i10 & 32) != 0 && !this.A) {
                this.A = true;
                this.f29590p.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
            }
            int i11 = i10 & 3;
            p81 p81Var = this.f29578a;
            if (i11 == 2) {
                h();
                if (((i10 >> 6) & 7) == 1 && !this.D) {
                    this.D = true;
                    p81Var.d();
                }
            } else if (i11 == 1 && o() && !this.C) {
                if (this.B) {
                    p81Var.b(true);
                } else {
                    i();
                }
            }
        }
    }

    public final void b(org.telegram.utils.twidget.w wVar) {
        if (this.f29590p != wVar) {
            r();
            this.f29590p = wVar;
            if (wVar == null) {
                return;
            }
            wVar.h = this;
            wVar.m(this.f29591q);
        }
    }

    public final boolean c(android.graphics.Canvas r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q81.c(android.graphics.Canvas, int):boolean");
    }

    public final void d() {
        if (!this.F) {
            return;
        }
        this.F = false;
        org.telegram.utils.twidget.w wVar = this.f29590p;
        if (wVar != null && !this.f29592r) {
            wVar.d(this.J, this.K, 1, 0);
        }
        this.f29578a.f("auto");
    }

    public final void e() {
        o81 o81Var = this.f29585k;
        Handler handler = this.f29580c;
        handler.removeCallbacks(o81Var);
        handler.removeCallbacks(this.f29586l);
        this.f29596w = false;
        this.f29597x = false;
    }

    public final void f() {
        org.telegram.utils.twidget.w wVar;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (this.f29596w && !this.A && (wVar = this.f29590p) != null) {
            this.A = true;
            wVar.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
        }
    }

    public final void g() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.w wVar = this.f29590p;
            if (wVar != null) {
                wVar.o(0, this.N, this.O, 0, true, this.E, this.I, this.H);
            }
        }
    }

    public final void h() {
        if (!this.C) {
            this.C = true;
            if (this.B) {
                this.f29578a.b(false);
            }
        }
    }

    public final void i() {
        if (!this.B && !this.C) {
            this.B = true;
            this.f29578a.b(true);
        }
    }

    public final float j(float f7) {
        int i10;
        if (org.telegram.messenger.cd.X && (i10 = this.R) > 0) {
            return (i10 / this.f29579b) - f7;
        }
        return f7;
    }

    public final void l(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        if (this.f29596w && !this.f29597x) {
            this.f29580c.removeCallbacks(this.f29585k);
            this.f29597x = true;
            int b10 = this.f29587m.b(this.M, j(this.N), this.O, z10, z11, z12, this.E, this.H);
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
            this.f29598y = z14;
            if (z12 && !z13) {
                z15 = true;
            }
            this.f29599z = z15;
            a(b10);
            if (this.P != this.N || this.Q != this.O) {
                a(this.f29587m.d(SystemClock.uptimeMillis(), j(this.P), this.Q));
            }
            if (!this.f29598y && !this.f29599z && !this.E) {
                h();
            } else {
                i();
                if ((this.f29598y || this.E) && !this.C) {
                    this.f29578a.b(true);
                }
            }
            p();
        }
    }

    public final void m(MotionEvent motionEvent, boolean z10) {
        org.telegram.utils.twidget.w wVar;
        org.telegram.utils.twidget.k0 k0Var;
        int actionMasked = motionEvent.getActionMasked();
        if (z10 && actionMasked != 10 && (wVar = this.f29590p) != null && !this.f29592r && (k0Var = wVar.f44454f) != null && k0Var.A) {
            this.F = true;
            float x10 = motionEvent.getX();
            float f7 = this.f29579b;
            this.J = x10 / f7;
            float y3 = motionEvent.getY() / f7;
            this.K = y3;
            this.f29590p.d(this.J, y3, 0, k(motionEvent));
            return;
        }
        d();
    }

    public final boolean n(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q81.n(android.view.MotionEvent):boolean");
    }

    public final boolean o() {
        int i10 = this.L;
        int i11 = (i10 >> 2) & 7;
        if ((i10 & 3) == 1) {
            if (i11 == 4 || i11 == 5 || i11 == 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void p() {
        Handler handler = this.f29580c;
        o81 o81Var = this.f29586l;
        handler.removeCallbacks(o81Var);
        double c10 = this.f29587m.c();
        if (this.f29596w && c10 >= 0.0d) {
            handler.postDelayed(o81Var, Math.max(0L, ((long) Math.ceil(c10)) - SystemClock.uptimeMillis()));
        }
    }

    public final void q(boolean z10) {
        if (this.f29591q != z10) {
            this.f29591q = z10;
            org.telegram.utils.twidget.w wVar = this.f29590p;
            if (wVar != null && !this.f29592r) {
                wVar.m(z10);
            }
        }
    }

    public final void r() {
        if (this.f29590p == null) {
            return;
        }
        if (this.f29592r) {
            this.f29592r = false;
            this.f29590p = null;
            return;
        }
        f();
        d();
        this.f29590p.m(false);
        org.telegram.utils.twidget.w wVar = this.f29590p;
        if (wVar.h == this) {
            wVar.h = null;
        }
        this.f29590p = null;
        this.f29580c.removeCallbacks(this.f29588n);
        this.f29589o = null;
        e();
        this.f29587m.e();
    }
}
