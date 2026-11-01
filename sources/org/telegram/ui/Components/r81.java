package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class r81 {
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
    public final q81 f29940a;
    public final float f29941b;
    public final Handler f29942c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix e;
    public final float[] f29943f;
    public final float[] f29944g;
    public final Path h;
    public final RectF f29945i;
    public final float[] f29946j;
    public final p81 f29947k;
    public final p81 f29948l;
    public final org.telegram.utils.twidget.h f29949m;
    public final p81 f29950n;
    public org.telegram.utils.twidget.i0 f29951o;
    public org.telegram.utils.twidget.w f29952p;
    public boolean f29953q;
    public boolean f29954r;
    public long f29955s;
    public long f29956t;
    public float f29957u;
    public float v;
    public boolean f29958w;
    public boolean f29959x;
    public boolean f29960y;
    public boolean f29961z;

    public r81(q81 q81Var, float f7) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Matrix();
        this.f29943f = new float[9];
        this.f29944g = new float[7];
        this.h = new Path();
        this.f29945i = new RectF();
        this.f29946j = new float[8];
        this.f29947k = new Runnable(this) {
            public final r81 f29384b;

            {
                this.f29384b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.w wVar;
                switch (r2) {
                    case 0:
                        this.f29384b.l(false, false, false);
                        return;
                    case 1:
                        r81 r81Var = this.f29384b;
                        if (r81Var.f29958w && r81Var.f29959x) {
                            r81Var.a(r81Var.f29949m.f(SystemClock.uptimeMillis()));
                            r81Var.p();
                            return;
                        }
                        return;
                    default:
                        r81 r81Var2 = this.f29384b;
                        if (r81Var2.f29951o != null && (wVar = r81Var2.f29952p) != null) {
                            org.telegram.utils.twidget.i0 c10 = wVar.c();
                            org.telegram.utils.twidget.i0 i0Var = r81Var2.f29951o;
                            if (c10 == i0Var) {
                                i0Var.f44364a.g();
                                r81Var2.f29940a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f29948l = new Runnable(this) {
            public final r81 f29384b;

            {
                this.f29384b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.w wVar;
                switch (r2) {
                    case 0:
                        this.f29384b.l(false, false, false);
                        return;
                    case 1:
                        r81 r81Var = this.f29384b;
                        if (r81Var.f29958w && r81Var.f29959x) {
                            r81Var.a(r81Var.f29949m.f(SystemClock.uptimeMillis()));
                            r81Var.p();
                            return;
                        }
                        return;
                    default:
                        r81 r81Var2 = this.f29384b;
                        if (r81Var2.f29951o != null && (wVar = r81Var2.f29952p) != null) {
                            org.telegram.utils.twidget.i0 c10 = wVar.c();
                            org.telegram.utils.twidget.i0 i0Var = r81Var2.f29951o;
                            if (c10 == i0Var) {
                                i0Var.f44364a.g();
                                r81Var2.f29940a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f29949m = new Object();
        this.f29950n = new Runnable(this) {
            public final r81 f29384b;

            {
                this.f29384b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.w wVar;
                switch (r2) {
                    case 0:
                        this.f29384b.l(false, false, false);
                        return;
                    case 1:
                        r81 r81Var = this.f29384b;
                        if (r81Var.f29958w && r81Var.f29959x) {
                            r81Var.a(r81Var.f29949m.f(SystemClock.uptimeMillis()));
                            r81Var.p();
                            return;
                        }
                        return;
                    default:
                        r81 r81Var2 = this.f29384b;
                        if (r81Var2.f29951o != null && (wVar = r81Var2.f29952p) != null) {
                            org.telegram.utils.twidget.i0 c10 = wVar.c();
                            org.telegram.utils.twidget.i0 i0Var = r81Var2.f29951o;
                            if (c10 == i0Var) {
                                i0Var.f44364a.g();
                                r81Var2.f29940a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.L = -1;
        this.f29940a = q81Var;
        this.f29941b = f7;
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
                this.f29952p.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
            }
            int i11 = i10 & 3;
            q81 q81Var = this.f29940a;
            if (i11 == 2) {
                h();
                if (((i10 >> 6) & 7) == 1 && !this.D) {
                    this.D = true;
                    q81Var.d();
                }
            } else if (i11 == 1 && o() && !this.C) {
                if (this.B) {
                    q81Var.b(true);
                } else {
                    i();
                }
            }
        }
    }

    public final void b(org.telegram.utils.twidget.w wVar) {
        if (this.f29952p != wVar) {
            r();
            this.f29952p = wVar;
            if (wVar == null) {
                return;
            }
            wVar.h = this;
            wVar.m(this.f29953q);
        }
    }

    public final boolean c(android.graphics.Canvas r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r81.c(android.graphics.Canvas, int):boolean");
    }

    public final void d() {
        if (!this.F) {
            return;
        }
        this.F = false;
        org.telegram.utils.twidget.w wVar = this.f29952p;
        if (wVar != null && !this.f29954r) {
            wVar.d(this.J, this.K, 1, 0);
        }
        this.f29940a.f("auto");
    }

    public final void e() {
        p81 p81Var = this.f29947k;
        Handler handler = this.f29942c;
        handler.removeCallbacks(p81Var);
        handler.removeCallbacks(this.f29948l);
        this.f29958w = false;
        this.f29959x = false;
    }

    public final void f() {
        org.telegram.utils.twidget.w wVar;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (this.f29958w && !this.A && (wVar = this.f29952p) != null) {
            this.A = true;
            wVar.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
        }
    }

    public final void g() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.w wVar = this.f29952p;
            if (wVar != null) {
                wVar.o(0, this.N, this.O, 0, true, this.E, this.I, this.H);
            }
        }
    }

    public final void h() {
        if (!this.C) {
            this.C = true;
            if (this.B) {
                this.f29940a.b(false);
            }
        }
    }

    public final void i() {
        if (!this.B && !this.C) {
            this.B = true;
            this.f29940a.b(true);
        }
    }

    public final float j(float f7) {
        int i10;
        if (org.telegram.messenger.dd.X && (i10 = this.R) > 0) {
            return (i10 / this.f29941b) - f7;
        }
        return f7;
    }

    public final void l(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        if (this.f29958w && !this.f29959x) {
            this.f29942c.removeCallbacks(this.f29947k);
            this.f29959x = true;
            int b10 = this.f29949m.b(this.M, j(this.N), this.O, z10, z11, z12, this.E, this.H);
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
            this.f29960y = z14;
            if (z12 && !z13) {
                z15 = true;
            }
            this.f29961z = z15;
            a(b10);
            if (this.P != this.N || this.Q != this.O) {
                a(this.f29949m.d(SystemClock.uptimeMillis(), j(this.P), this.Q));
            }
            if (!this.f29960y && !this.f29961z && !this.E) {
                h();
            } else {
                i();
                if ((this.f29960y || this.E) && !this.C) {
                    this.f29940a.b(true);
                }
            }
            p();
        }
    }

    public final void m(MotionEvent motionEvent, boolean z10) {
        org.telegram.utils.twidget.w wVar;
        org.telegram.utils.twidget.k0 k0Var;
        int actionMasked = motionEvent.getActionMasked();
        if (z10 && actionMasked != 10 && (wVar = this.f29952p) != null && !this.f29954r && (k0Var = wVar.f44465f) != null && k0Var.A) {
            this.F = true;
            float x10 = motionEvent.getX();
            float f7 = this.f29941b;
            this.J = x10 / f7;
            float y3 = motionEvent.getY() / f7;
            this.K = y3;
            this.f29952p.d(this.J, y3, 0, k(motionEvent));
            return;
        }
        d();
    }

    public final boolean n(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.r81.n(android.view.MotionEvent):boolean");
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
        Handler handler = this.f29942c;
        p81 p81Var = this.f29948l;
        handler.removeCallbacks(p81Var);
        double c10 = this.f29949m.c();
        if (this.f29958w && c10 >= 0.0d) {
            handler.postDelayed(p81Var, Math.max(0L, ((long) Math.ceil(c10)) - SystemClock.uptimeMillis()));
        }
    }

    public final void q(boolean z10) {
        if (this.f29953q != z10) {
            this.f29953q = z10;
            org.telegram.utils.twidget.w wVar = this.f29952p;
            if (wVar != null && !this.f29954r) {
                wVar.m(z10);
            }
        }
    }

    public final void r() {
        if (this.f29952p == null) {
            return;
        }
        if (this.f29954r) {
            this.f29954r = false;
            this.f29952p = null;
            return;
        }
        f();
        d();
        this.f29952p.m(false);
        org.telegram.utils.twidget.w wVar = this.f29952p;
        if (wVar.h == this) {
            wVar.h = null;
        }
        this.f29952p = null;
        this.f29942c.removeCallbacks(this.f29950n);
        this.f29951o = null;
        e();
        this.f29949m.e();
    }
}
