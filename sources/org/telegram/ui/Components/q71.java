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
    public final p71 f37211a;
    public final float f37212b;
    public final Handler f37213c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix f37214e;
    public final float[] f37215f;
    public final float[] f37216g;
    public final Path h;
    public final RectF f37217i;
    public final float[] f37218j;
    public final o71 f37219k;
    public final o71 f37220l;
    public final org.telegram.utils.twidget.e0 f37221m;
    public final o71 f37222n;
    public org.telegram.utils.twidget.g1 f37223o;
    public org.telegram.utils.twidget.v0 f37224p;
    public boolean f37225q;
    public boolean f37226r;
    public long f37227s;
    public long f37228t;
    public float f37229u;
    public float v;
    public boolean f37230w;
    public boolean f37231x;
    public boolean f37232y;
    public boolean f37233z;

    public q71(p71 p71Var, float f10) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f37214e = new Matrix();
        this.f37215f = new float[9];
        this.f37216g = new float[7];
        this.h = new Path();
        this.f37217i = new RectF();
        this.f37218j = new float[8];
        this.f37219k = new Runnable(this) {
            public final q71 f36665b;

            {
                this.f36665b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.v0 v0Var;
                switch (r2) {
                    case 0:
                        this.f36665b.k(false, false, false);
                        return;
                    case 1:
                        q71 q71Var = this.f36665b;
                        if (q71Var.f37230w && q71Var.f37231x) {
                            q71Var.a(q71Var.f37221m.f(SystemClock.uptimeMillis()));
                            q71Var.o();
                            return;
                        }
                        return;
                    default:
                        q71 q71Var2 = this.f36665b;
                        if (q71Var2.f37223o != null && (v0Var = q71Var2.f37224p) != null) {
                            org.telegram.utils.twidget.g1 d = v0Var.d();
                            org.telegram.utils.twidget.g1 g1Var = q71Var2.f37223o;
                            if (d == g1Var) {
                                g1Var.f52804a.f();
                                q71Var2.f37211a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f37220l = new Runnable(this) {
            public final q71 f36665b;

            {
                this.f36665b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.v0 v0Var;
                switch (r2) {
                    case 0:
                        this.f36665b.k(false, false, false);
                        return;
                    case 1:
                        q71 q71Var = this.f36665b;
                        if (q71Var.f37230w && q71Var.f37231x) {
                            q71Var.a(q71Var.f37221m.f(SystemClock.uptimeMillis()));
                            q71Var.o();
                            return;
                        }
                        return;
                    default:
                        q71 q71Var2 = this.f36665b;
                        if (q71Var2.f37223o != null && (v0Var = q71Var2.f37224p) != null) {
                            org.telegram.utils.twidget.g1 d = v0Var.d();
                            org.telegram.utils.twidget.g1 g1Var = q71Var2.f37223o;
                            if (d == g1Var) {
                                g1Var.f52804a.f();
                                q71Var2.f37211a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f37221m = new Object();
        this.f37222n = new Runnable(this) {
            public final q71 f36665b;

            {
                this.f36665b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.v0 v0Var;
                switch (r2) {
                    case 0:
                        this.f36665b.k(false, false, false);
                        return;
                    case 1:
                        q71 q71Var = this.f36665b;
                        if (q71Var.f37230w && q71Var.f37231x) {
                            q71Var.a(q71Var.f37221m.f(SystemClock.uptimeMillis()));
                            q71Var.o();
                            return;
                        }
                        return;
                    default:
                        q71 q71Var2 = this.f36665b;
                        if (q71Var2.f37223o != null && (v0Var = q71Var2.f37224p) != null) {
                            org.telegram.utils.twidget.g1 d = v0Var.d();
                            org.telegram.utils.twidget.g1 g1Var = q71Var2.f37223o;
                            if (d == g1Var) {
                                g1Var.f52804a.f();
                                q71Var2.f37211a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.L = -1;
        this.f37211a = p71Var;
        this.f37212b = f10;
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
                this.f37224p.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
            }
            int i10 = i7 & 3;
            p71 p71Var = this.f37211a;
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
        org.telegram.utils.twidget.v0 v0Var = this.f37224p;
        if (v0Var != null && !this.f37226r) {
            v0Var.e(this.J, this.K, 1, 0);
        }
        this.f37211a.f("auto");
    }

    public final void d() {
        o71 o71Var = this.f37219k;
        Handler handler = this.f37213c;
        handler.removeCallbacks(o71Var);
        handler.removeCallbacks(this.f37220l);
        this.f37230w = false;
        this.f37231x = false;
    }

    public final void e() {
        org.telegram.utils.twidget.v0 v0Var;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (this.f37230w && !this.A && (v0Var = this.f37224p) != null) {
            this.A = true;
            v0Var.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
        }
    }

    public final void f() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.v0 v0Var = this.f37224p;
            if (v0Var != null) {
                v0Var.o(0, this.N, this.O, 0, true, this.E, this.I, this.H);
            }
        }
    }

    public final void g() {
        if (!this.C) {
            this.C = true;
            if (this.B) {
                this.f37211a.b(false);
            }
        }
    }

    public final void h() {
        if (!this.B && !this.C) {
            this.B = true;
            this.f37211a.b(true);
        }
    }

    public final float i(float f10) {
        int i7;
        if (org.telegram.messenger.id.f23157a0 && (i7 = this.R) > 0) {
            return (i7 / this.f37212b) - f10;
        }
        return f10;
    }

    public final void k(boolean z9, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        if (this.f37230w && !this.f37231x) {
            this.f37213c.removeCallbacks(this.f37219k);
            this.f37231x = true;
            int b10 = this.f37221m.b(this.M, i(this.N), this.O, z9, z10, z11, this.E, this.H);
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
            this.f37232y = z13;
            if (z11 && !z12) {
                z14 = true;
            }
            this.f37233z = z14;
            a(b10);
            if (this.P != this.N || this.Q != this.O) {
                a(this.f37221m.d(SystemClock.uptimeMillis(), i(this.P), this.Q));
            }
            if (!this.f37232y && !this.f37233z && !this.E) {
                g();
            } else {
                h();
                if ((this.f37232y || this.E) && !this.C) {
                    this.f37211a.b(true);
                }
            }
            o();
        }
    }

    public final void l(MotionEvent motionEvent, boolean z9) {
        org.telegram.utils.twidget.v0 v0Var;
        org.telegram.utils.twidget.i1 i1Var;
        int actionMasked = motionEvent.getActionMasked();
        if (z9 && actionMasked != 10 && (v0Var = this.f37224p) != null && !this.f37226r && (i1Var = v0Var.f52995f) != null && i1Var.C) {
            this.F = true;
            float x10 = motionEvent.getX();
            float f10 = this.f37212b;
            this.J = x10 / f10;
            float y10 = motionEvent.getY() / f10;
            this.K = y10;
            this.f37224p.e(this.J, y10, 0, j(motionEvent));
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
        Handler handler = this.f37213c;
        o71 o71Var = this.f37220l;
        handler.removeCallbacks(o71Var);
        double c10 = this.f37221m.c();
        if (this.f37230w && c10 >= 0.0d) {
            handler.postDelayed(o71Var, Math.max(0L, ((long) Math.ceil(c10)) - SystemClock.uptimeMillis()));
        }
    }

    public final void p(boolean z9) {
        if (this.f37225q != z9) {
            this.f37225q = z9;
            org.telegram.utils.twidget.v0 v0Var = this.f37224p;
            if (v0Var != null && !this.f37226r) {
                v0Var.m(z9);
            }
        }
    }

    public final void q() {
        if (this.f37224p == null) {
            return;
        }
        if (this.f37226r) {
            this.f37226r = false;
            this.f37224p = null;
            return;
        }
        e();
        c();
        this.f37224p.m(false);
        org.telegram.utils.twidget.v0 v0Var = this.f37224p;
        if (v0Var.h == this) {
            v0Var.h = null;
        }
        this.f37224p = null;
        this.f37213c.removeCallbacks(this.f37222n);
        this.f37223o = null;
        d();
        this.f37221m.e();
    }
}
