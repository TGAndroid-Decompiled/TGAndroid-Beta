package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class h71 {
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
    public final g71 f34318a;
    public final float f34319b;
    public final Handler f34320c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix f34321e;
    public final float[] f34322f;
    public final float[] f34323g;
    public final Path h;
    public final RectF f34324i;
    public final float[] f34325j;
    public final f71 f34326k;
    public final f71 f34327l;
    public final org.telegram.utils.twidget.h f34328m;
    public final f71 f34329n;
    public org.telegram.utils.twidget.f0 f34330o;
    public org.telegram.utils.twidget.u f34331p;
    public boolean f34332q;
    public boolean f34333r;
    public long f34334s;
    public long f34335t;
    public float f34336u;
    public float v;
    public boolean f34337w;
    public boolean f34338x;
    public boolean f34339y;
    public boolean f34340z;

    public h71(g71 g71Var, float f10) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f34321e = new Matrix();
        this.f34322f = new float[9];
        this.f34323g = new float[7];
        this.h = new Path();
        this.f34324i = new RectF();
        this.f34325j = new float[8];
        this.f34326k = new Runnable(this) {
            public final h71 f33760b;

            {
                this.f33760b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.u uVar;
                switch (r2) {
                    case 0:
                        this.f33760b.k(false, false, false);
                        return;
                    case 1:
                        h71 h71Var = this.f33760b;
                        if (h71Var.f34337w && h71Var.f34338x) {
                            h71Var.a(h71Var.f34328m.f(SystemClock.uptimeMillis()));
                            h71Var.o();
                            return;
                        }
                        return;
                    default:
                        h71 h71Var2 = this.f33760b;
                        if (h71Var2.f34330o != null && (uVar = h71Var2.f34331p) != null) {
                            org.telegram.utils.twidget.f0 c2 = uVar.c();
                            org.telegram.utils.twidget.f0 f0Var = h71Var2.f34330o;
                            if (c2 == f0Var) {
                                f0Var.f52848a.g();
                                h71Var2.f34318a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f34327l = new Runnable(this) {
            public final h71 f33760b;

            {
                this.f33760b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.u uVar;
                switch (r2) {
                    case 0:
                        this.f33760b.k(false, false, false);
                        return;
                    case 1:
                        h71 h71Var = this.f33760b;
                        if (h71Var.f34337w && h71Var.f34338x) {
                            h71Var.a(h71Var.f34328m.f(SystemClock.uptimeMillis()));
                            h71Var.o();
                            return;
                        }
                        return;
                    default:
                        h71 h71Var2 = this.f33760b;
                        if (h71Var2.f34330o != null && (uVar = h71Var2.f34331p) != null) {
                            org.telegram.utils.twidget.f0 c2 = uVar.c();
                            org.telegram.utils.twidget.f0 f0Var = h71Var2.f34330o;
                            if (c2 == f0Var) {
                                f0Var.f52848a.g();
                                h71Var2.f34318a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f34328m = new Object();
        this.f34329n = new Runnable(this) {
            public final h71 f33760b;

            {
                this.f33760b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.u uVar;
                switch (r2) {
                    case 0:
                        this.f33760b.k(false, false, false);
                        return;
                    case 1:
                        h71 h71Var = this.f33760b;
                        if (h71Var.f34337w && h71Var.f34338x) {
                            h71Var.a(h71Var.f34328m.f(SystemClock.uptimeMillis()));
                            h71Var.o();
                            return;
                        }
                        return;
                    default:
                        h71 h71Var2 = this.f33760b;
                        if (h71Var2.f34330o != null && (uVar = h71Var2.f34331p) != null) {
                            org.telegram.utils.twidget.f0 c2 = uVar.c();
                            org.telegram.utils.twidget.f0 f0Var = h71Var2.f34330o;
                            if (c2 == f0Var) {
                                f0Var.f52848a.g();
                                h71Var2.f34318a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.L = -1;
        this.f34318a = g71Var;
        this.f34319b = f10;
        paint.setTextSize(f10 * 14.0f);
        paint.setColor(-8355712);
    }

    public static int j(MotionEvent motionEvent) {
        int i3;
        int i10;
        int i11;
        int metaState = motionEvent.getMetaState();
        int i12 = 0;
        if ((metaState & 2) != 0) {
            i3 = 1;
        } else {
            i3 = 0;
        }
        if ((metaState & 4096) != 0) {
            i10 = 2;
        } else {
            i10 = 0;
        }
        int i13 = i3 | i10;
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

    public final void a(int i3) {
        if (i3 != -1) {
            this.L = i3;
            if ((i3 & 32) != 0 && !this.A) {
                this.A = true;
                this.f34331p.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
            }
            int i10 = i3 & 3;
            g71 g71Var = this.f34318a;
            if (i10 == 2) {
                g();
                if (((i3 >> 6) & 7) == 1 && !this.D) {
                    this.D = true;
                    g71Var.d();
                }
            } else if (i10 == 1 && n() && !this.C) {
                if (this.B) {
                    g71Var.b(true);
                } else {
                    h();
                }
            }
        }
    }

    public final boolean b(android.graphics.Canvas r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h71.b(android.graphics.Canvas, int):boolean");
    }

    public final void c() {
        if (!this.F) {
            return;
        }
        this.F = false;
        org.telegram.utils.twidget.u uVar = this.f34331p;
        if (uVar != null && !this.f34333r) {
            uVar.d(this.J, this.K, 1, 0);
        }
        this.f34318a.f("auto");
    }

    public final void d() {
        f71 f71Var = this.f34326k;
        Handler handler = this.f34320c;
        handler.removeCallbacks(f71Var);
        handler.removeCallbacks(this.f34327l);
        this.f34337w = false;
        this.f34338x = false;
    }

    public final void e() {
        org.telegram.utils.twidget.u uVar;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (this.f34337w && !this.A && (uVar = this.f34331p) != null) {
            this.A = true;
            uVar.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
        }
    }

    public final void f() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.u uVar = this.f34331p;
            if (uVar != null) {
                uVar.o(0, this.N, this.O, 0, true, this.E, this.I, this.H);
            }
        }
    }

    public final void g() {
        if (!this.C) {
            this.C = true;
            if (this.B) {
                this.f34318a.b(false);
            }
        }
    }

    public final void h() {
        if (!this.B && !this.C) {
            this.B = true;
            this.f34318a.b(true);
        }
    }

    public final float i(float f10) {
        int i3;
        if (org.telegram.messenger.bd.f21784a0 && (i3 = this.R) > 0) {
            return (i3 / this.f34319b) - f10;
        }
        return f10;
    }

    public final void k(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        if (this.f34337w && !this.f34338x) {
            this.f34320c.removeCallbacks(this.f34326k);
            this.f34338x = true;
            int b10 = this.f34328m.b(this.M, i(this.N), this.O, z10, z11, z12, this.E, this.H);
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
            this.f34339y = z14;
            if (z12 && !z13) {
                z15 = true;
            }
            this.f34340z = z15;
            a(b10);
            if (this.P != this.N || this.Q != this.O) {
                a(this.f34328m.d(SystemClock.uptimeMillis(), i(this.P), this.Q));
            }
            if (!this.f34339y && !this.f34340z && !this.E) {
                g();
            } else {
                h();
                if ((this.f34339y || this.E) && !this.C) {
                    this.f34318a.b(true);
                }
            }
            o();
        }
    }

    public final void l(MotionEvent motionEvent, boolean z10) {
        org.telegram.utils.twidget.u uVar;
        org.telegram.utils.twidget.h0 h0Var;
        int actionMasked = motionEvent.getActionMasked();
        if (z10 && actionMasked != 10 && (uVar = this.f34331p) != null && !this.f34333r && (h0Var = uVar.f52960f) != null && h0Var.A) {
            this.F = true;
            float x10 = motionEvent.getX();
            float f10 = this.f34319b;
            this.J = x10 / f10;
            float y9 = motionEvent.getY() / f10;
            this.K = y9;
            this.f34331p.d(this.J, y9, 0, j(motionEvent));
            return;
        }
        c();
    }

    public final boolean m(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.h71.m(android.view.MotionEvent):boolean");
    }

    public final boolean n() {
        int i3 = this.L;
        int i10 = (i3 >> 2) & 7;
        if ((i3 & 3) == 1) {
            if (i10 == 4 || i10 == 5 || i10 == 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o() {
        Handler handler = this.f34320c;
        f71 f71Var = this.f34327l;
        handler.removeCallbacks(f71Var);
        double c2 = this.f34328m.c();
        if (this.f34337w && c2 >= 0.0d) {
            handler.postDelayed(f71Var, Math.max(0L, ((long) Math.ceil(c2)) - SystemClock.uptimeMillis()));
        }
    }

    public final void p(boolean z10) {
        if (this.f34332q != z10) {
            this.f34332q = z10;
            org.telegram.utils.twidget.u uVar = this.f34331p;
            if (uVar != null && !this.f34333r) {
                uVar.m(z10);
            }
        }
    }

    public final void q() {
        if (this.f34331p == null) {
            return;
        }
        if (this.f34333r) {
            this.f34333r = false;
            this.f34331p = null;
            return;
        }
        e();
        c();
        this.f34331p.m(false);
        org.telegram.utils.twidget.u uVar = this.f34331p;
        if (uVar.h == this) {
            uVar.h = null;
        }
        this.f34331p = null;
        this.f34320c.removeCallbacks(this.f34329n);
        this.f34330o = null;
        d();
        this.f34328m.e();
    }
}
