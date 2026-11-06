package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class o71 {
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
    public final n71 f36524a;
    public final float f36525b;
    public final Handler f36526c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix f36527e;
    public final float[] f36528f;
    public final float[] f36529g;
    public final Path h;
    public final RectF f36530i;
    public final float[] f36531j;
    public final m71 f36532k;
    public final m71 f36533l;
    public final org.telegram.utils.twidget.h f36534m;
    public final m71 f36535n;
    public org.telegram.utils.twidget.f0 f36536o;
    public org.telegram.utils.twidget.u f36537p;
    public boolean f36538q;
    public boolean f36539r;
    public long f36540s;
    public long f36541t;
    public float f36542u;
    public float v;
    public boolean f36543w;
    public boolean f36544x;
    public boolean f36545y;
    public boolean f36546z;

    public o71(n71 n71Var, float f10) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f36527e = new Matrix();
        this.f36528f = new float[9];
        this.f36529g = new float[7];
        this.h = new Path();
        this.f36530i = new RectF();
        this.f36531j = new float[8];
        this.f36532k = new Runnable(this) {
            public final o71 f35894b;

            {
                this.f35894b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.u uVar;
                switch (r2) {
                    case 0:
                        this.f35894b.k(false, false, false);
                        return;
                    case 1:
                        o71 o71Var = this.f35894b;
                        if (o71Var.f36543w && o71Var.f36544x) {
                            o71Var.a(o71Var.f36534m.f(SystemClock.uptimeMillis()));
                            o71Var.o();
                            return;
                        }
                        return;
                    default:
                        o71 o71Var2 = this.f35894b;
                        if (o71Var2.f36536o != null && (uVar = o71Var2.f36537p) != null) {
                            org.telegram.utils.twidget.f0 c10 = uVar.c();
                            org.telegram.utils.twidget.f0 f0Var = o71Var2.f36536o;
                            if (c10 == f0Var) {
                                f0Var.f52783a.g();
                                o71Var2.f36524a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f36533l = new Runnable(this) {
            public final o71 f35894b;

            {
                this.f35894b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.u uVar;
                switch (r2) {
                    case 0:
                        this.f35894b.k(false, false, false);
                        return;
                    case 1:
                        o71 o71Var = this.f35894b;
                        if (o71Var.f36543w && o71Var.f36544x) {
                            o71Var.a(o71Var.f36534m.f(SystemClock.uptimeMillis()));
                            o71Var.o();
                            return;
                        }
                        return;
                    default:
                        o71 o71Var2 = this.f35894b;
                        if (o71Var2.f36536o != null && (uVar = o71Var2.f36537p) != null) {
                            org.telegram.utils.twidget.f0 c10 = uVar.c();
                            org.telegram.utils.twidget.f0 f0Var = o71Var2.f36536o;
                            if (c10 == f0Var) {
                                f0Var.f52783a.g();
                                o71Var2.f36524a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f36534m = new Object();
        this.f36535n = new Runnable(this) {
            public final o71 f35894b;

            {
                this.f35894b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.u uVar;
                switch (r2) {
                    case 0:
                        this.f35894b.k(false, false, false);
                        return;
                    case 1:
                        o71 o71Var = this.f35894b;
                        if (o71Var.f36543w && o71Var.f36544x) {
                            o71Var.a(o71Var.f36534m.f(SystemClock.uptimeMillis()));
                            o71Var.o();
                            return;
                        }
                        return;
                    default:
                        o71 o71Var2 = this.f35894b;
                        if (o71Var2.f36536o != null && (uVar = o71Var2.f36537p) != null) {
                            org.telegram.utils.twidget.f0 c10 = uVar.c();
                            org.telegram.utils.twidget.f0 f0Var = o71Var2.f36536o;
                            if (c10 == f0Var) {
                                f0Var.f52783a.g();
                                o71Var2.f36524a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.L = -1;
        this.f36524a = n71Var;
        this.f36525b = f10;
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
                this.f36537p.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
            }
            int i10 = i7 & 3;
            n71 n71Var = this.f36524a;
            if (i10 == 2) {
                g();
                if (((i7 >> 6) & 7) == 1 && !this.D) {
                    this.D = true;
                    n71Var.d();
                }
            } else if (i10 == 1 && n() && !this.C) {
                if (this.B) {
                    n71Var.b(true);
                } else {
                    h();
                }
            }
        }
    }

    public final boolean b(android.graphics.Canvas r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o71.b(android.graphics.Canvas, int):boolean");
    }

    public final void c() {
        if (!this.F) {
            return;
        }
        this.F = false;
        org.telegram.utils.twidget.u uVar = this.f36537p;
        if (uVar != null && !this.f36539r) {
            uVar.d(this.J, this.K, 1, 0);
        }
        this.f36524a.f("auto");
    }

    public final void d() {
        m71 m71Var = this.f36532k;
        Handler handler = this.f36526c;
        handler.removeCallbacks(m71Var);
        handler.removeCallbacks(this.f36533l);
        this.f36543w = false;
        this.f36544x = false;
    }

    public final void e() {
        org.telegram.utils.twidget.u uVar;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (this.f36543w && !this.A && (uVar = this.f36537p) != null) {
            this.A = true;
            uVar.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
        }
    }

    public final void f() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.u uVar = this.f36537p;
            if (uVar != null) {
                uVar.o(0, this.N, this.O, 0, true, this.E, this.I, this.H);
            }
        }
    }

    public final void g() {
        if (!this.C) {
            this.C = true;
            if (this.B) {
                this.f36524a.b(false);
            }
        }
    }

    public final void h() {
        if (!this.B && !this.C) {
            this.B = true;
            this.f36524a.b(true);
        }
    }

    public final float i(float f10) {
        int i7;
        if (org.telegram.messenger.hd.f22871a0 && (i7 = this.R) > 0) {
            return (i7 / this.f36525b) - f10;
        }
        return f10;
    }

    public final void k(boolean z9, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        if (this.f36543w && !this.f36544x) {
            this.f36526c.removeCallbacks(this.f36532k);
            this.f36544x = true;
            int b10 = this.f36534m.b(this.M, i(this.N), this.O, z9, z10, z11, this.E, this.H);
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
            this.f36545y = z13;
            if (z11 && !z12) {
                z14 = true;
            }
            this.f36546z = z14;
            a(b10);
            if (this.P != this.N || this.Q != this.O) {
                a(this.f36534m.d(SystemClock.uptimeMillis(), i(this.P), this.Q));
            }
            if (!this.f36545y && !this.f36546z && !this.E) {
                g();
            } else {
                h();
                if ((this.f36545y || this.E) && !this.C) {
                    this.f36524a.b(true);
                }
            }
            o();
        }
    }

    public final void l(MotionEvent motionEvent, boolean z9) {
        org.telegram.utils.twidget.u uVar;
        org.telegram.utils.twidget.h0 h0Var;
        int actionMasked = motionEvent.getActionMasked();
        if (z9 && actionMasked != 10 && (uVar = this.f36537p) != null && !this.f36539r && (h0Var = uVar.f52895f) != null && h0Var.A) {
            this.F = true;
            float x10 = motionEvent.getX();
            float f10 = this.f36525b;
            this.J = x10 / f10;
            float y10 = motionEvent.getY() / f10;
            this.K = y10;
            this.f36537p.d(this.J, y10, 0, j(motionEvent));
            return;
        }
        c();
    }

    public final boolean m(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.o71.m(android.view.MotionEvent):boolean");
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
        Handler handler = this.f36526c;
        m71 m71Var = this.f36533l;
        handler.removeCallbacks(m71Var);
        double c10 = this.f36534m.c();
        if (this.f36543w && c10 >= 0.0d) {
            handler.postDelayed(m71Var, Math.max(0L, ((long) Math.ceil(c10)) - SystemClock.uptimeMillis()));
        }
    }

    public final void p(boolean z9) {
        if (this.f36538q != z9) {
            this.f36538q = z9;
            org.telegram.utils.twidget.u uVar = this.f36537p;
            if (uVar != null && !this.f36539r) {
                uVar.m(z9);
            }
        }
    }

    public final void q() {
        if (this.f36537p == null) {
            return;
        }
        if (this.f36539r) {
            this.f36539r = false;
            this.f36537p = null;
            return;
        }
        e();
        c();
        this.f36537p.m(false);
        org.telegram.utils.twidget.u uVar = this.f36537p;
        if (uVar.h == this) {
            uVar.h = null;
        }
        this.f36537p = null;
        this.f36526c.removeCallbacks(this.f36535n);
        this.f36536o = null;
        d();
        this.f36534m.e();
    }
}
