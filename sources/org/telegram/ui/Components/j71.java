package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
public final class j71 {
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
    public final i71 f34900a;
    public final float f34901b;
    public final Handler f34902c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix f34903e;
    public final float[] f34904f;
    public final float[] f34905g;
    public final Path h;
    public final RectF f34906i;
    public final float[] f34907j;
    public final h71 f34908k;
    public final h71 f34909l;
    public final org.telegram.utils.twidget.h f34910m;
    public final h71 f34911n;
    public org.telegram.utils.twidget.f0 f34912o;
    public org.telegram.utils.twidget.u f34913p;
    public boolean f34914q;
    public boolean f34915r;
    public long f34916s;
    public long f34917t;
    public float f34918u;
    public float v;
    public boolean f34919w;
    public boolean f34920x;
    public boolean f34921y;
    public boolean f34922z;

    public j71(i71 i71Var, float f10) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.f34903e = new Matrix();
        this.f34904f = new float[9];
        this.f34905g = new float[7];
        this.h = new Path();
        this.f34906i = new RectF();
        this.f34907j = new float[8];
        this.f34908k = new Runnable(this) {
            public final j71 f34235b;

            {
                this.f34235b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.u uVar;
                switch (r2) {
                    case 0:
                        this.f34235b.k(false, false, false);
                        return;
                    case 1:
                        j71 j71Var = this.f34235b;
                        if (j71Var.f34919w && j71Var.f34920x) {
                            j71Var.a(j71Var.f34910m.f(SystemClock.uptimeMillis()));
                            j71Var.o();
                            return;
                        }
                        return;
                    default:
                        j71 j71Var2 = this.f34235b;
                        if (j71Var2.f34912o != null && (uVar = j71Var2.f34913p) != null) {
                            org.telegram.utils.twidget.f0 c10 = uVar.c();
                            org.telegram.utils.twidget.f0 f0Var = j71Var2.f34912o;
                            if (c10 == f0Var) {
                                f0Var.f52757a.g();
                                j71Var2.f34900a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f34909l = new Runnable(this) {
            public final j71 f34235b;

            {
                this.f34235b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.u uVar;
                switch (r2) {
                    case 0:
                        this.f34235b.k(false, false, false);
                        return;
                    case 1:
                        j71 j71Var = this.f34235b;
                        if (j71Var.f34919w && j71Var.f34920x) {
                            j71Var.a(j71Var.f34910m.f(SystemClock.uptimeMillis()));
                            j71Var.o();
                            return;
                        }
                        return;
                    default:
                        j71 j71Var2 = this.f34235b;
                        if (j71Var2.f34912o != null && (uVar = j71Var2.f34913p) != null) {
                            org.telegram.utils.twidget.f0 c10 = uVar.c();
                            org.telegram.utils.twidget.f0 f0Var = j71Var2.f34912o;
                            if (c10 == f0Var) {
                                f0Var.f52757a.g();
                                j71Var2.f34900a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f34910m = new Object();
        this.f34911n = new Runnable(this) {
            public final j71 f34235b;

            {
                this.f34235b = this;
            }

            @Override
            public final void run() {
                org.telegram.utils.twidget.u uVar;
                switch (r2) {
                    case 0:
                        this.f34235b.k(false, false, false);
                        return;
                    case 1:
                        j71 j71Var = this.f34235b;
                        if (j71Var.f34919w && j71Var.f34920x) {
                            j71Var.a(j71Var.f34910m.f(SystemClock.uptimeMillis()));
                            j71Var.o();
                            return;
                        }
                        return;
                    default:
                        j71 j71Var2 = this.f34235b;
                        if (j71Var2.f34912o != null && (uVar = j71Var2.f34913p) != null) {
                            org.telegram.utils.twidget.f0 c10 = uVar.c();
                            org.telegram.utils.twidget.f0 f0Var = j71Var2.f34912o;
                            if (c10 == f0Var) {
                                f0Var.f52757a.g();
                                j71Var2.f34900a.h();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.L = -1;
        this.f34900a = i71Var;
        this.f34901b = f10;
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
                this.f34913p.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
            }
            int i10 = i7 & 3;
            i71 i71Var = this.f34900a;
            if (i10 == 2) {
                g();
                if (((i7 >> 6) & 7) == 1 && !this.D) {
                    this.D = true;
                    i71Var.d();
                }
            } else if (i10 == 1 && n() && !this.C) {
                if (this.B) {
                    i71Var.b(true);
                } else {
                    h();
                }
            }
        }
    }

    public final boolean b(android.graphics.Canvas r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j71.b(android.graphics.Canvas, int):boolean");
    }

    public final void c() {
        if (!this.F) {
            return;
        }
        this.F = false;
        org.telegram.utils.twidget.u uVar = this.f34913p;
        if (uVar != null && !this.f34915r) {
            uVar.d(this.J, this.K, 1, 0);
        }
        this.f34900a.f("auto");
    }

    public final void d() {
        h71 h71Var = this.f34908k;
        Handler handler = this.f34902c;
        handler.removeCallbacks(h71Var);
        handler.removeCallbacks(this.f34909l);
        this.f34919w = false;
        this.f34920x = false;
    }

    public final void e() {
        org.telegram.utils.twidget.u uVar;
        if (this.G) {
            this.G = false;
            this.A = true;
        }
        if (this.f34919w && !this.A && (uVar = this.f34913p) != null) {
            this.A = true;
            uVar.o(3, this.P, this.Q, 0, true, this.E, this.I, this.H);
        }
    }

    public final void f() {
        if (this.G) {
            this.G = false;
            org.telegram.utils.twidget.u uVar = this.f34913p;
            if (uVar != null) {
                uVar.o(0, this.N, this.O, 0, true, this.E, this.I, this.H);
            }
        }
    }

    public final void g() {
        if (!this.C) {
            this.C = true;
            if (this.B) {
                this.f34900a.b(false);
            }
        }
    }

    public final void h() {
        if (!this.B && !this.C) {
            this.B = true;
            this.f34900a.b(true);
        }
    }

    public final float i(float f10) {
        int i7;
        if (org.telegram.messenger.hd.f22871a0 && (i7 = this.R) > 0) {
            return (i7 / this.f34901b) - f10;
        }
        return f10;
    }

    public final void k(boolean z9, boolean z10, boolean z11) {
        boolean z12;
        boolean z13;
        if (this.f34919w && !this.f34920x) {
            this.f34902c.removeCallbacks(this.f34908k);
            this.f34920x = true;
            int b10 = this.f34910m.b(this.M, i(this.N), this.O, z9, z10, z11, this.E, this.H);
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
            this.f34921y = z13;
            if (z11 && !z12) {
                z14 = true;
            }
            this.f34922z = z14;
            a(b10);
            if (this.P != this.N || this.Q != this.O) {
                a(this.f34910m.d(SystemClock.uptimeMillis(), i(this.P), this.Q));
            }
            if (!this.f34921y && !this.f34922z && !this.E) {
                g();
            } else {
                h();
                if ((this.f34921y || this.E) && !this.C) {
                    this.f34900a.b(true);
                }
            }
            o();
        }
    }

    public final void l(MotionEvent motionEvent, boolean z9) {
        org.telegram.utils.twidget.u uVar;
        org.telegram.utils.twidget.h0 h0Var;
        int actionMasked = motionEvent.getActionMasked();
        if (z9 && actionMasked != 10 && (uVar = this.f34913p) != null && !this.f34915r && (h0Var = uVar.f52869f) != null && h0Var.A) {
            this.F = true;
            float x10 = motionEvent.getX();
            float f10 = this.f34901b;
            this.J = x10 / f10;
            float y10 = motionEvent.getY() / f10;
            this.K = y10;
            this.f34913p.d(this.J, y10, 0, j(motionEvent));
            return;
        }
        c();
    }

    public final boolean m(android.view.MotionEvent r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.j71.m(android.view.MotionEvent):boolean");
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
        Handler handler = this.f34902c;
        h71 h71Var = this.f34909l;
        handler.removeCallbacks(h71Var);
        double c10 = this.f34910m.c();
        if (this.f34919w && c10 >= 0.0d) {
            handler.postDelayed(h71Var, Math.max(0L, ((long) Math.ceil(c10)) - SystemClock.uptimeMillis()));
        }
    }

    public final void p(boolean z9) {
        if (this.f34914q != z9) {
            this.f34914q = z9;
            org.telegram.utils.twidget.u uVar = this.f34913p;
            if (uVar != null && !this.f34915r) {
                uVar.m(z9);
            }
        }
    }

    public final void q() {
        if (this.f34913p == null) {
            return;
        }
        if (this.f34915r) {
            this.f34915r = false;
            this.f34913p = null;
            return;
        }
        e();
        c();
        this.f34913p.m(false);
        org.telegram.utils.twidget.u uVar = this.f34913p;
        if (uVar.h == this) {
            uVar.h = null;
        }
        this.f34913p = null;
        this.f34902c.removeCallbacks(this.f34911n);
        this.f34912o = null;
        d();
        this.f34910m.e();
    }
}
