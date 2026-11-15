package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class q71 {
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
    public final p71 f38537a;
    public final float f38538b;
    public final Handler f38539c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix f38540e;
    public final float[] f38541f;
    public final float[] f38542g;
    public final Path h;
    public final RectF f38543i;
    public final float[] f38544j;
    public final o71 f38545k;
    public final o71 f38546l;
    public final org.telegram.utils.twidget.e0 f38547m;
    public final o71 f38548n;
    public org.telegram.utils.twidget.j1 f38549o;
    public org.telegram.utils.twidget.y0 f38550p;
    public boolean f38551q;
    public boolean f38552r;
    public long f38553s;
    public long f38554t;
    public float f38555u;
    public float v;
    public boolean f38556w;
    public boolean f38557x;
    public boolean f38558y;
    public boolean f38559z;

    public q71(p71 p71Var, float f10) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f38540e = new Matrix();
        this.f38541f = new float[9];
        this.f38542g = new float[7];
        this.h = new Path();
        this.f38543i = new RectF();
        this.f38544j = new float[8];
        this.f38545k = new Runnable(this) {
            public final q71 f37852b;

            {
                this.f37852b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.y0 y0Var;
                switch (r2) {
                    case 0:
                        this.f37852b.k(false, false, false);
                        return;
                    case 1:
                        q71 q71Var = this.f37852b;
                        if (q71Var.f38556w && q71Var.f38557x) {
                            q71Var.a(q71Var.f38547m.f(SystemClock.uptimeMillis()));
                            q71Var.o();
                            return;
                        }
                        return;
                    default:
                        q71 q71Var2 = this.f37852b;
                        if (q71Var2.f38549o != null && (y0Var = q71Var2.f38550p) != null) {
                            org.telegram.utils.twidget.j1 d = y0Var.d();
                            org.telegram.utils.twidget.j1 j1Var = q71Var2.f38549o;
                            if (d == j1Var) {
                                j1Var.f54259a.f();
                                q71Var2.f38537a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f38546l = new Runnable(this) {
            public final q71 f37852b;

            {
                this.f37852b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.y0 y0Var;
                switch (r2) {
                    case 0:
                        this.f37852b.k(false, false, false);
                        return;
                    case 1:
                        q71 q71Var = this.f37852b;
                        if (q71Var.f38556w && q71Var.f38557x) {
                            q71Var.a(q71Var.f38547m.f(SystemClock.uptimeMillis()));
                            q71Var.o();
                            return;
                        }
                        return;
                    default:
                        q71 q71Var2 = this.f37852b;
                        if (q71Var2.f38549o != null && (y0Var = q71Var2.f38550p) != null) {
                            org.telegram.utils.twidget.j1 d = y0Var.d();
                            org.telegram.utils.twidget.j1 j1Var = q71Var2.f38549o;
                            if (d == j1Var) {
                                j1Var.f54259a.f();
                                q71Var2.f38537a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f38547m = new Object();
        this.f38548n = new Runnable(this) {
            public final q71 f37852b;

            {
                this.f37852b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.y0 y0Var;
                switch (r2) {
                    case 0:
                        this.f37852b.k(false, false, false);
                        return;
                    case 1:
                        q71 q71Var = this.f37852b;
                        if (q71Var.f38556w && q71Var.f38557x) {
                            q71Var.a(q71Var.f38547m.f(SystemClock.uptimeMillis()));
                            q71Var.o();
                            return;
                        }
                        return;
                    default:
                        q71 q71Var2 = this.f37852b;
                        if (q71Var2.f38549o != null && (y0Var = q71Var2.f38550p) != null) {
                            org.telegram.utils.twidget.j1 d = y0Var.d();
                            org.telegram.utils.twidget.j1 j1Var = q71Var2.f38549o;
                            if (d == j1Var) {
                                j1Var.f54259a.f();
                                q71Var2.f38537a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.L = -1;
        this.f38537a = p71Var;
        this.f38538b = f10;
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
                this.f38550p.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
            }
            int i10 = i7 & 3;
            p71 p71Var = this.f38537a;
            if (i10 == 2) {
                g();
                if (((i7 >> 6) & 7) == 1 && !this.D) {
                    this.D = true;
                    p71Var.d();
                }
            } else if (i10 == 1 && n() && !this.C) {
                if (this.B) {
                    p71Var.b(true);
                } else {
                    h();
                }
            }
        }
    }

    public final boolean b(android.graphics.Canvas r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q71.b(android.graphics.Canvas, int):boolean");
    }

    public final void c() {
        if (!this.F) {
            return;
        }
        this.F = false;
        org.telegram.utils.twidget.y0 y0Var = this.f38550p;
        if (y0Var != null && !this.f38552r) {
            y0Var.e(this.J, this.K, 1, 0);
        }
        this.f38537a.f("auto");
    }

    public final void d() {
        o71 o71Var = this.f38545k;
        Handler handler = this.f38539c;
        handler.removeCallbacks(o71Var);
        handler.removeCallbacks(this.f38546l);
        this.f38556w = false;
        this.f38557x = false;
    }

    public final void e() {
        org.telegram.utils.twidget.y0 y0Var;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (this.f38556w && !this.A && (y0Var = this.f38550p) != null) {
            this.A = true;
            y0Var.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
        }
    }

    public final void f() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.y0 y0Var = this.f38550p;
            if (y0Var != null) {
                y0Var.o(0, this.N, this.O, 0, true, this.E, this.I, this.H);
            }
        }
    }

    public final void g() {
        if (!this.C) {
            this.C = true;
            if (this.B) {
                this.f38537a.b(false);
            }
        }
    }

    public final void h() {
        if (!this.B && !this.C) {
            this.B = true;
            this.f38537a.b(true);
        }
    }

    public final float i(float f10) {
        int i7;
        if (org.telegram.messenger.hd.f24104a0 && (i7 = this.R) > 0) {
            return (i7 / this.f38538b) - f10;
        }
        return f10;
    }

    public final void k(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        if (this.f38556w && !this.f38557x) {
            this.f38539c.removeCallbacks(this.f38545k);
            this.f38557x = true;
            int b10 = this.f38547m.b(this.M, i(this.N), this.O, z10, z11, z12, this.E, this.H);
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
            this.f38558y = z14;
            if (z12 && !z13) {
                z15 = true;
            }
            this.f38559z = z15;
            a(b10);
            if (this.P != this.N || this.Q != this.O) {
                a(this.f38547m.d(SystemClock.uptimeMillis(), i(this.P), this.Q));
            }
            if (!this.f38558y && !this.f38559z && !this.E) {
                g();
            } else {
                h();
                if ((this.f38558y || this.E) && !this.C) {
                    this.f38537a.b(true);
                }
            }
            o();
        }
    }

    public final void l(MotionEvent motionEvent, boolean z10) {
        org.telegram.utils.twidget.y0 y0Var;
        org.telegram.utils.twidget.l1 l1Var;
        int actionMasked = motionEvent.getActionMasked();
        if (z10 && actionMasked != 10 && (y0Var = this.f38550p) != null && !this.f38552r && (l1Var = y0Var.f54427f) != null && l1Var.C) {
            this.F = true;
            float x10 = motionEvent.getX();
            float f10 = this.f38538b;
            this.J = x10 / f10;
            float y10 = motionEvent.getY() / f10;
            this.K = y10;
            this.f38550p.e(this.J, y10, 0, j(motionEvent));
            return;
        }
        c();
    }

    public final boolean m(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.q71.m(android.view.MotionEvent):boolean");
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
        Handler handler = this.f38539c;
        o71 o71Var = this.f38546l;
        handler.removeCallbacks(o71Var);
        double c10 = this.f38547m.c();
        if (this.f38556w && c10 >= 0.0d) {
            handler.postDelayed(o71Var, Math.max(0L, ((long) Math.ceil(c10)) - SystemClock.uptimeMillis()));
        }
    }

    public final void p(boolean z10) {
        if (this.f38551q != z10) {
            this.f38551q = z10;
            org.telegram.utils.twidget.y0 y0Var = this.f38550p;
            if (y0Var != null && !this.f38552r) {
                y0Var.m(z10);
            }
        }
    }

    public final void q() {
        if (this.f38550p == null) {
            return;
        }
        if (this.f38552r) {
            this.f38552r = false;
            this.f38550p = null;
            return;
        }
        e();
        c();
        this.f38550p.m(false);
        org.telegram.utils.twidget.y0 y0Var = this.f38550p;
        if (y0Var.h == this) {
            y0Var.h = null;
        }
        this.f38550p = null;
        this.f38539c.removeCallbacks(this.f38548n);
        this.f38549o = null;
        d();
        this.f38547m.e();
    }
}
