package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class a81 {
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
    public final z71 f33266a;
    public final float f33267b;
    public final Handler f33268c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix f33269e;
    public final float[] f33270f;
    public final float[] f33271g;
    public final Path h;
    public final RectF f33272i;
    public final float[] f33273j;
    public final y71 f33274k;
    public final y71 f33275l;
    public final org.telegram.utils.twidget.f0 f33276m;
    public final y71 f33277n;
    public org.telegram.utils.twidget.n1 f33278o;
    public org.telegram.utils.twidget.d1 f33279p;
    public boolean f33280q;
    public boolean f33281r;
    public long f33282s;
    public long f33283t;
    public float f33284u;
    public float v;
    public boolean f33285w;
    public boolean f33286x;
    public boolean f33287y;
    public boolean f33288z;

    public a81(z71 z71Var, float f10) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f33269e = new Matrix();
        this.f33270f = new float[9];
        this.f33271g = new float[7];
        this.h = new Path();
        this.f33272i = new RectF();
        this.f33273j = new float[8];
        this.f33274k = new Runnable(this) {
            public final a81 f42391b;

            {
                this.f42391b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.d1 d1Var;
                switch (r2) {
                    case 0:
                        this.f42391b.l(false, false, false);
                        return;
                    case 1:
                        a81 a81Var = this.f42391b;
                        if (a81Var.f33285w && a81Var.f33286x) {
                            a81Var.a(a81Var.f33276m.f(SystemClock.uptimeMillis()));
                            a81Var.p();
                            return;
                        }
                        return;
                    default:
                        a81 a81Var2 = this.f42391b;
                        if (a81Var2.f33278o != null && (d1Var = a81Var2.f33279p) != null) {
                            org.telegram.utils.twidget.n1 d = d1Var.d();
                            org.telegram.utils.twidget.n1 n1Var = a81Var2.f33278o;
                            if (d == n1Var) {
                                n1Var.f54857a.f();
                                a81Var2.f33266a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f33275l = new Runnable(this) {
            public final a81 f42391b;

            {
                this.f42391b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.d1 d1Var;
                switch (r2) {
                    case 0:
                        this.f42391b.l(false, false, false);
                        return;
                    case 1:
                        a81 a81Var = this.f42391b;
                        if (a81Var.f33285w && a81Var.f33286x) {
                            a81Var.a(a81Var.f33276m.f(SystemClock.uptimeMillis()));
                            a81Var.p();
                            return;
                        }
                        return;
                    default:
                        a81 a81Var2 = this.f42391b;
                        if (a81Var2.f33278o != null && (d1Var = a81Var2.f33279p) != null) {
                            org.telegram.utils.twidget.n1 d = d1Var.d();
                            org.telegram.utils.twidget.n1 n1Var = a81Var2.f33278o;
                            if (d == n1Var) {
                                n1Var.f54857a.f();
                                a81Var2.f33266a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f33276m = new Object();
        this.f33277n = new Runnable(this) {
            public final a81 f42391b;

            {
                this.f42391b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.d1 d1Var;
                switch (r2) {
                    case 0:
                        this.f42391b.l(false, false, false);
                        return;
                    case 1:
                        a81 a81Var = this.f42391b;
                        if (a81Var.f33285w && a81Var.f33286x) {
                            a81Var.a(a81Var.f33276m.f(SystemClock.uptimeMillis()));
                            a81Var.p();
                            return;
                        }
                        return;
                    default:
                        a81 a81Var2 = this.f42391b;
                        if (a81Var2.f33278o != null && (d1Var = a81Var2.f33279p) != null) {
                            org.telegram.utils.twidget.n1 d = d1Var.d();
                            org.telegram.utils.twidget.n1 n1Var = a81Var2.f33278o;
                            if (d == n1Var) {
                                n1Var.f54857a.f();
                                a81Var2.f33266a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.L = -1;
        this.f33266a = z71Var;
        this.f33267b = f10;
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
                org.telegram.utils.twidget.d1 d1Var = this.f33279p;
                float f10 = this.P;
                float f11 = this.Q;
                boolean z10 = this.E;
                int i10 = this.I;
                int i11 = this.H;
                org.telegram.utils.twidget.p1 p1Var = d1Var.f54695f;
                if (p1Var != null) {
                    p1Var.i(3, f10, f11, 0, true, z10, i10, i11);
                }
            }
            int i12 = i7 & 3;
            z71 z71Var = this.f33266a;
            if (i12 == 2) {
                h();
                if (((i7 >> 6) & 7) == 1 && !this.D) {
                    this.D = true;
                    z71Var.d();
                }
            } else if (i12 == 1 && o() && !this.C) {
                if (this.B) {
                    z71Var.b(true);
                } else {
                    i();
                }
            }
        }
    }

    public final void b(org.telegram.utils.twidget.d1 d1Var) {
        if (this.f33279p != d1Var) {
            r();
            this.f33279p = d1Var;
            if (d1Var == null) {
                return;
            }
            d1Var.h = this;
            d1Var.k(this.f33280q);
        }
    }

    public final boolean c(android.graphics.Canvas r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a81.c(android.graphics.Canvas, int):boolean");
    }

    public final void d() {
        if (!this.F) {
            return;
        }
        this.F = false;
        org.telegram.utils.twidget.d1 d1Var = this.f33279p;
        if (d1Var != null && !this.f33281r) {
            float f10 = this.J;
            float f11 = this.K;
            org.telegram.utils.twidget.p1 p1Var = d1Var.f54695f;
            if (p1Var != null) {
                long j3 = p1Var.v;
                if (!p1Var.A && j3 != 0) {
                    p1Var.f54885c.f(j3, 1, f10, f11, 0);
                }
            }
        }
        this.f33266a.f("auto");
    }

    public final void e() {
        y71 y71Var = this.f33274k;
        Handler handler = this.f33268c;
        handler.removeCallbacks(y71Var);
        handler.removeCallbacks(this.f33275l);
        this.f33285w = false;
        this.f33286x = false;
    }

    public final void f() {
        org.telegram.utils.twidget.d1 d1Var;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (this.f33285w && !this.A && (d1Var = this.f33279p) != null) {
            this.A = true;
            float f10 = this.P;
            float f11 = this.Q;
            boolean z10 = this.E;
            int i7 = this.I;
            int i10 = this.H;
            org.telegram.utils.twidget.p1 p1Var = d1Var.f54695f;
            if (p1Var != null) {
                p1Var.i(3, f10, f11, 0, true, z10, i7, i10);
            }
        }
    }

    public final void g() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.d1 d1Var = this.f33279p;
            if (d1Var != null) {
                float f10 = this.N;
                float f11 = this.O;
                boolean z10 = this.E;
                int i7 = this.I;
                int i10 = this.H;
                org.telegram.utils.twidget.p1 p1Var = d1Var.f54695f;
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
                this.f33266a.b(false);
            }
        }
    }

    public final void i() {
        if (!this.B && !this.C) {
            this.B = true;
            this.f33266a.b(true);
        }
    }

    public final float j(float f10) {
        int i7;
        if (org.telegram.messenger.gd.f24213a0 && (i7 = this.R) > 0) {
            return (i7 / this.f33267b) - f10;
        }
        return f10;
    }

    public final void l(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        if (this.f33285w && !this.f33286x) {
            this.f33268c.removeCallbacks(this.f33274k);
            this.f33286x = true;
            int b10 = this.f33276m.b(this.M, j(this.N), this.O, z10, z11, z12, this.E, this.H);
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
            this.f33287y = z14;
            if (z12 && !z13) {
                z15 = true;
            }
            this.f33288z = z15;
            a(b10);
            if (this.P != this.N || this.Q != this.O) {
                a(this.f33276m.d(SystemClock.uptimeMillis(), j(this.P), this.Q));
            }
            if (!this.f33287y && !this.f33288z && !this.E) {
                h();
            } else {
                i();
                if ((this.f33287y || this.E) && !this.C) {
                    this.f33266a.b(true);
                }
            }
            p();
        }
    }

    public final void m(MotionEvent motionEvent, boolean z10) {
        org.telegram.utils.twidget.d1 d1Var;
        org.telegram.utils.twidget.p1 p1Var;
        float f10 = this.f33267b;
        int actionMasked = motionEvent.getActionMasked();
        if (z10 && actionMasked != 10 && (d1Var = this.f33279p) != null && !this.f33281r && (p1Var = d1Var.f54695f) != null && p1Var.I) {
            this.F = true;
            this.J = motionEvent.getX() / f10;
            float y10 = motionEvent.getY() / f10;
            this.K = y10;
            org.telegram.utils.twidget.d1 d1Var2 = this.f33279p;
            float f11 = this.J;
            int k10 = k(motionEvent);
            org.telegram.utils.twidget.p1 p1Var2 = d1Var2.f54695f;
            if (p1Var2 != null) {
                long j3 = p1Var2.v;
                if (!p1Var2.A && j3 != 0) {
                    p1Var2.f54885c.f(j3, 0, f11, y10, k10);
                    return;
                }
                return;
            }
            return;
        }
        d();
    }

    public final boolean n(android.view.MotionEvent r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.a81.n(android.view.MotionEvent):boolean");
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
        Handler handler = this.f33268c;
        y71 y71Var = this.f33275l;
        handler.removeCallbacks(y71Var);
        double c10 = this.f33276m.c();
        if (this.f33285w && c10 >= 0.0d) {
            handler.postDelayed(y71Var, Math.max(0L, ((long) Math.ceil(c10)) - SystemClock.uptimeMillis()));
        }
    }

    public final void q(boolean z10) {
        if (this.f33280q != z10) {
            this.f33280q = z10;
            org.telegram.utils.twidget.d1 d1Var = this.f33279p;
            if (d1Var != null && !this.f33281r) {
                d1Var.k(z10);
            }
        }
    }

    public final void r() {
        if (this.f33279p == null) {
            return;
        }
        if (this.f33281r) {
            this.f33281r = false;
            this.f33279p = null;
            return;
        }
        f();
        d();
        this.f33279p.k(false);
        org.telegram.utils.twidget.d1 d1Var = this.f33279p;
        if (d1Var.h == this) {
            d1Var.h = null;
        }
        this.f33279p = null;
        this.f33268c.removeCallbacks(this.f33277n);
        this.f33278o = null;
        e();
        this.f33276m.e();
    }
}
