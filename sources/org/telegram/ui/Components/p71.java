package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class p71 {
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
    public final o71 f36814a;
    public final float f36815b;
    public final Handler f36816c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix f36817e;
    public final float[] f36818f;
    public final float[] f36819g;
    public final Path h;
    public final RectF f36820i;
    public final float[] f36821j;
    public final n71 f36822k;
    public final n71 f36823l;
    public final org.telegram.utils.twidget.e0 f36824m;
    public final n71 f36825n;
    public org.telegram.utils.twidget.f1 f36826o;
    public org.telegram.utils.twidget.v0 f36827p;
    public boolean f36828q;
    public boolean f36829r;
    public long f36830s;
    public long f36831t;
    public float f36832u;
    public float v;
    public boolean f36833w;
    public boolean f36834x;
    public boolean f36835y;
    public boolean f36836z;

    public p71(o71 o71Var, float f10) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f36817e = new Matrix();
        this.f36818f = new float[9];
        this.f36819g = new float[7];
        this.h = new Path();
        this.f36820i = new RectF();
        this.f36821j = new float[8];
        this.f36822k = new Runnable(this) {
            public final p71 f36262b;

            {
                this.f36262b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.v0 v0Var;
                switch (r2) {
                    case 0:
                        this.f36262b.k(false, false, false);
                        return;
                    case 1:
                        p71 p71Var = this.f36262b;
                        if (p71Var.f36833w && p71Var.f36834x) {
                            p71Var.a(p71Var.f36824m.f(SystemClock.uptimeMillis()));
                            p71Var.o();
                            return;
                        }
                        return;
                    default:
                        p71 p71Var2 = this.f36262b;
                        if (p71Var2.f36826o != null && (v0Var = p71Var2.f36827p) != null) {
                            org.telegram.utils.twidget.f1 d = v0Var.d();
                            org.telegram.utils.twidget.f1 f1Var = p71Var2.f36826o;
                            if (d == f1Var) {
                                f1Var.f52786a.f();
                                p71Var2.f36814a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f36823l = new Runnable(this) {
            public final p71 f36262b;

            {
                this.f36262b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.v0 v0Var;
                switch (r2) {
                    case 0:
                        this.f36262b.k(false, false, false);
                        return;
                    case 1:
                        p71 p71Var = this.f36262b;
                        if (p71Var.f36833w && p71Var.f36834x) {
                            p71Var.a(p71Var.f36824m.f(SystemClock.uptimeMillis()));
                            p71Var.o();
                            return;
                        }
                        return;
                    default:
                        p71 p71Var2 = this.f36262b;
                        if (p71Var2.f36826o != null && (v0Var = p71Var2.f36827p) != null) {
                            org.telegram.utils.twidget.f1 d = v0Var.d();
                            org.telegram.utils.twidget.f1 f1Var = p71Var2.f36826o;
                            if (d == f1Var) {
                                f1Var.f52786a.f();
                                p71Var2.f36814a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f36824m = new Object();
        this.f36825n = new Runnable(this) {
            public final p71 f36262b;

            {
                this.f36262b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.v0 v0Var;
                switch (r2) {
                    case 0:
                        this.f36262b.k(false, false, false);
                        return;
                    case 1:
                        p71 p71Var = this.f36262b;
                        if (p71Var.f36833w && p71Var.f36834x) {
                            p71Var.a(p71Var.f36824m.f(SystemClock.uptimeMillis()));
                            p71Var.o();
                            return;
                        }
                        return;
                    default:
                        p71 p71Var2 = this.f36262b;
                        if (p71Var2.f36826o != null && (v0Var = p71Var2.f36827p) != null) {
                            org.telegram.utils.twidget.f1 d = v0Var.d();
                            org.telegram.utils.twidget.f1 f1Var = p71Var2.f36826o;
                            if (d == f1Var) {
                                f1Var.f52786a.f();
                                p71Var2.f36814a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.L = -1;
        this.f36814a = o71Var;
        this.f36815b = f10;
        paint.setTextSize(f10 * 14.0f);
        paint.setColor(-8355712);
    }

    public static int j(MotionEvent motionEvent) {
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
                this.f36827p.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
            }
            int i10 = i7 & 3;
            o71 o71Var = this.f36814a;
            if (i10 == 2) {
                g();
                if (((i7 >> 6) & 7) == 1 && !this.D) {
                    this.D = true;
                    o71Var.d();
                }
            } else if (i10 == 1 && n() && !this.C) {
                if (this.B) {
                    o71Var.b(true);
                } else {
                    h();
                }
            }
        }
    }

    public final boolean b(android.graphics.Canvas r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p71.b(android.graphics.Canvas, int):boolean");
    }

    public final void c() {
        if (!this.F) {
            return;
        }
        this.F = false;
        org.telegram.utils.twidget.v0 v0Var = this.f36827p;
        if (v0Var != null && !this.f36829r) {
            v0Var.e(this.J, this.K, 1, 0);
        }
        this.f36814a.f("auto");
    }

    public final void d() {
        n71 n71Var = this.f36822k;
        Handler handler = this.f36816c;
        handler.removeCallbacks(n71Var);
        handler.removeCallbacks(this.f36823l);
        this.f36833w = false;
        this.f36834x = false;
    }

    public final void e() {
        org.telegram.utils.twidget.v0 v0Var;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (this.f36833w && !this.A && (v0Var = this.f36827p) != null) {
            this.A = true;
            v0Var.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
        }
    }

    public final void f() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.v0 v0Var = this.f36827p;
            if (v0Var != null) {
                v0Var.o(0, this.N, this.O, 0, true, this.E, this.I, this.H);
            }
        }
    }

    public final void g() {
        if (!this.C) {
            this.C = true;
            if (this.B) {
                this.f36814a.b(false);
            }
        }
    }

    public final void h() {
        if (!this.B && !this.C) {
            this.B = true;
            this.f36814a.b(true);
        }
    }

    public final float i(float f10) {
        int i7;
        if (org.telegram.messenger.id.f23157a0 && (i7 = this.R) > 0) {
            return (i7 / this.f36815b) - f10;
        }
        return f10;
    }

    public final void k(boolean z9, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        if (this.f36833w && !this.f36834x) {
            this.f36816c.removeCallbacks(this.f36822k);
            this.f36834x = true;
            int b10 = this.f36824m.b(this.M, i(this.N), this.O, z9, z10, z11, this.E, this.H);
            boolean z14 = false;
            if ((b10 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z9 && !z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            this.f36835y = z13;
            if (z11 && !z12) {
                z14 = true;
            }
            this.f36836z = z14;
            a(b10);
            if (this.P != this.N || this.Q != this.O) {
                a(this.f36824m.d(SystemClock.uptimeMillis(), i(this.P), this.Q));
            }
            if (!this.f36835y && !this.f36836z && !this.E) {
                g();
            } else {
                h();
                if ((this.f36835y || this.E) && !this.C) {
                    this.f36814a.b(true);
                }
            }
            o();
        }
    }

    public final void l(MotionEvent motionEvent, boolean z9) {
        org.telegram.utils.twidget.v0 v0Var;
        org.telegram.utils.twidget.h1 h1Var;
        int actionMasked = motionEvent.getActionMasked();
        if (z9 && actionMasked != 10 && (v0Var = this.f36827p) != null && !this.f36829r && (h1Var = v0Var.f52980f) != null && h1Var.C) {
            this.F = true;
            float x10 = motionEvent.getX();
            float f10 = this.f36815b;
            this.J = x10 / f10;
            float y10 = motionEvent.getY() / f10;
            this.K = y10;
            this.f36827p.e(this.J, y10, 0, j(motionEvent));
            return;
        }
        c();
    }

    public final boolean m(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.p71.m(android.view.MotionEvent):boolean");
    }

    public final boolean n() {
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

    public final void o() {
        Handler handler = this.f36816c;
        n71 n71Var = this.f36823l;
        handler.removeCallbacks(n71Var);
        double c10 = this.f36824m.c();
        if (this.f36833w && c10 >= 0.0d) {
            handler.postDelayed(n71Var, Math.max(0L, ((long) Math.ceil(c10)) - SystemClock.uptimeMillis()));
        }
    }

    public final void p(boolean z9) {
        if (this.f36828q != z9) {
            this.f36828q = z9;
            org.telegram.utils.twidget.v0 v0Var = this.f36827p;
            if (v0Var != null && !this.f36829r) {
                v0Var.m(z9);
            }
        }
    }

    public final void q() {
        if (this.f36827p == null) {
            return;
        }
        if (this.f36829r) {
            this.f36829r = false;
            this.f36827p = null;
            return;
        }
        e();
        c();
        this.f36827p.m(false);
        org.telegram.utils.twidget.v0 v0Var = this.f36827p;
        if (v0Var.h == this) {
            v0Var.h = null;
        }
        this.f36827p = null;
        this.f36816c.removeCallbacks(this.f36825n);
        this.f36826o = null;
        d();
        this.f36824m.e();
    }
}
