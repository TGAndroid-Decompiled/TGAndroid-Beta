package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import org.telegram.messenger.LocaleController;
public final class ub1 {
    public boolean A;
    public boolean B;
    public boolean C;
    public boolean D;
    public boolean E;
    public boolean F;
    public int G;
    public int H;
    public float I;
    public float J;
    public int K;
    public long L;
    public float M;
    public float N;
    public float O;
    public float P;
    public int Q;
    public final tb1 f33335a;
    public final float f33336b;
    public final Handler f33337c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix e;
    public final float[] f33338f;
    public final float[] f33339g;
    public final Path h;
    public final RectF f33340i;
    public final float[] f33341j;
    public final sb1 f33342k;
    public final sb1 f33343l;
    public final c3.s f33344m;
    public final sb1 f33345n;
    public ac1 f33346o;
    public nb1 f33347p;
    public boolean f33348q;
    public boolean f33349r;
    public long f33350s;
    public long f33351t;
    public float f33352u;
    public float v;
    public boolean f33353w;
    public boolean f33354x;
    public boolean f33355y;
    public boolean f33356z;

    public ub1(tb1 tb1Var, float f7) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Matrix();
        this.f33338f = new float[9];
        this.f33339g = new float[7];
        this.h = new Path();
        this.f33340i = new RectF();
        this.f33341j = new float[8];
        this.f33342k = new Runnable(this) {
            public final ub1 f32549b;

            {
                this.f32549b = this;
            }

            @Override
            public final void run() {
                int arbiterTick;
                nb1 nb1Var;
                switch (r2) {
                    case 0:
                        ub1 ub1Var = this.f32549b;
                        if (ub1Var.f33353w && ub1Var.f33354x) {
                            c3.s sVar = ub1Var.f33344m;
                            double uptimeMillis = SystemClock.uptimeMillis();
                            long j10 = sVar.f6092a;
                            if (j10 == 0) {
                                arbiterTick = -1;
                            } else {
                                arbiterTick = WidgetSandboxNative.arbiterTick(j10, uptimeMillis);
                            }
                            ub1Var.a(arbiterTick);
                            ub1Var.o();
                            return;
                        }
                        return;
                    case 1:
                        this.f32549b.k(false, false, false);
                        return;
                    default:
                        ub1 ub1Var2 = this.f32549b;
                        if (ub1Var2.f33346o != null && (nb1Var = ub1Var2.f33347p) != null) {
                            ac1 l4 = nb1Var.l();
                            ac1 ac1Var = ub1Var2.f33346o;
                            if (l4 == ac1Var) {
                                ac1Var.f26505a.g();
                                ub1Var2.f33335a.d();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f33343l = new Runnable(this) {
            public final ub1 f32549b;

            {
                this.f32549b = this;
            }

            @Override
            public final void run() {
                int arbiterTick;
                nb1 nb1Var;
                switch (r2) {
                    case 0:
                        ub1 ub1Var = this.f32549b;
                        if (ub1Var.f33353w && ub1Var.f33354x) {
                            c3.s sVar = ub1Var.f33344m;
                            double uptimeMillis = SystemClock.uptimeMillis();
                            long j10 = sVar.f6092a;
                            if (j10 == 0) {
                                arbiterTick = -1;
                            } else {
                                arbiterTick = WidgetSandboxNative.arbiterTick(j10, uptimeMillis);
                            }
                            ub1Var.a(arbiterTick);
                            ub1Var.o();
                            return;
                        }
                        return;
                    case 1:
                        this.f32549b.k(false, false, false);
                        return;
                    default:
                        ub1 ub1Var2 = this.f32549b;
                        if (ub1Var2.f33346o != null && (nb1Var = ub1Var2.f33347p) != null) {
                            ac1 l4 = nb1Var.l();
                            ac1 ac1Var = ub1Var2.f33346o;
                            if (l4 == ac1Var) {
                                ac1Var.f26505a.g();
                                ub1Var2.f33335a.d();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f33344m = new Object();
        this.f33345n = new Runnable(this) {
            public final ub1 f32549b;

            {
                this.f32549b = this;
            }

            @Override
            public final void run() {
                int arbiterTick;
                nb1 nb1Var;
                switch (r2) {
                    case 0:
                        ub1 ub1Var = this.f32549b;
                        if (ub1Var.f33353w && ub1Var.f33354x) {
                            c3.s sVar = ub1Var.f33344m;
                            double uptimeMillis = SystemClock.uptimeMillis();
                            long j10 = sVar.f6092a;
                            if (j10 == 0) {
                                arbiterTick = -1;
                            } else {
                                arbiterTick = WidgetSandboxNative.arbiterTick(j10, uptimeMillis);
                            }
                            ub1Var.a(arbiterTick);
                            ub1Var.o();
                            return;
                        }
                        return;
                    case 1:
                        this.f32549b.k(false, false, false);
                        return;
                    default:
                        ub1 ub1Var2 = this.f32549b;
                        if (ub1Var2.f33346o != null && (nb1Var = ub1Var2.f33347p) != null) {
                            ac1 l4 = nb1Var.l();
                            ac1 ac1Var = ub1Var2.f33346o;
                            if (l4 == ac1Var) {
                                ac1Var.f26505a.g();
                                ub1Var2.f33335a.d();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.K = -1;
        this.f33335a = tb1Var;
        this.f33336b = f7;
        paint.setTextSize(f7 * 14.0f);
        paint.setColor(-8355712);
    }

    public static int j(MotionEvent motionEvent) {
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
        tb1 tb1Var = this.f33335a;
        if (i10 != -1) {
            this.K = i10;
            if ((i10 & 32) != 0 && !this.A) {
                this.A = true;
                nb1 nb1Var = this.f33347p;
                float f7 = this.O;
                float f10 = this.P;
                boolean z10 = this.D;
                int i11 = this.H;
                int i12 = this.G;
                dc1 dc1Var = nb1Var.f30841f;
                if (dc1Var != null) {
                    long j10 = dc1Var.f27411s;
                    if (!dc1Var.f27412t && j10 != 0) {
                        WidgetSandboxNative.touch(j10, 3, f7, f10, 0, true, z10, i11, i12);
                    }
                }
            }
            int i13 = i10 & 3;
            if (i13 == 2) {
                g();
                if (((i10 >> 6) & 7) == 1) {
                    tb1Var.b();
                }
            } else if (i13 == 1 && n() && !this.C) {
                if (this.B) {
                    tb1Var.a(true);
                } else {
                    h();
                }
            }
        }
    }

    public final boolean b(android.graphics.Canvas r26, int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ub1.b(android.graphics.Canvas, int):boolean");
    }

    public final void c() {
        if (!this.E) {
            return;
        }
        this.E = false;
        nb1 nb1Var = this.f33347p;
        if (nb1Var != null && !this.f33349r) {
            float f7 = this.I;
            float f10 = this.J;
            dc1 dc1Var = nb1Var.f30841f;
            if (dc1Var != null) {
                long j10 = dc1Var.f27411s;
                if (!dc1Var.f27412t && j10 != 0) {
                    WidgetSandboxNative.hover(j10, 1, f7, f10, 0);
                }
            }
        }
        this.f33335a.c("auto");
    }

    public final void d() {
        sb1 sb1Var = this.f33342k;
        Handler handler = this.f33337c;
        handler.removeCallbacks(sb1Var);
        handler.removeCallbacks(this.f33343l);
        this.f33353w = false;
        this.f33354x = false;
    }

    public final void e() {
        nb1 nb1Var;
        if (this.F) {
            this.F = false;
            this.A = true;
        }
        if (this.f33353w && !this.A && (nb1Var = this.f33347p) != null) {
            this.A = true;
            float f7 = this.O;
            float f10 = this.P;
            boolean z10 = this.D;
            int i10 = this.H;
            int i11 = this.G;
            dc1 dc1Var = nb1Var.f30841f;
            if (dc1Var != null) {
                long j10 = dc1Var.f27411s;
                if (!dc1Var.f27412t && j10 != 0) {
                    WidgetSandboxNative.touch(j10, 3, f7, f10, 0, true, z10, i10, i11);
                }
            }
        }
    }

    public final void f() {
        if (this.F) {
            this.F = false;
            nb1 nb1Var = this.f33347p;
            if (nb1Var != null) {
                float f7 = this.M;
                float f10 = this.N;
                boolean z10 = this.D;
                int i10 = this.H;
                int i11 = this.G;
                dc1 dc1Var = nb1Var.f30841f;
                if (dc1Var != null) {
                    long j10 = dc1Var.f27411s;
                    if (!dc1Var.f27412t && j10 != 0) {
                        WidgetSandboxNative.touch(j10, 0, f7, f10, 0, true, z10, i10, i11);
                    }
                }
            }
        }
    }

    public final void g() {
        if (!this.C) {
            this.C = true;
            if (this.B) {
                this.f33335a.a(false);
            }
        }
    }

    public final void h() {
        if (!this.B && !this.C) {
            this.B = true;
            this.f33335a.a(true);
        }
    }

    public final float i(float f7) {
        int i10;
        if (LocaleController.isRTL && (i10 = this.Q) > 0) {
            return (i10 / this.f33336b) - f7;
        }
        return f7;
    }

    public final void k(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        int arbiterMove;
        if (this.f33353w && !this.f33354x) {
            this.f33337c.removeCallbacks(this.f33342k);
            this.f33354x = true;
            double d = this.L;
            double i10 = i(this.M);
            double d10 = this.N;
            boolean z15 = this.D;
            int i11 = this.G;
            c3.s sVar = this.f33344m;
            if (sVar.f6092a == 0) {
                sVar.f6092a = WidgetSandboxNative.arbiterCreate();
            }
            int arbiterDown = WidgetSandboxNative.arbiterDown(sVar.f6092a, d, i10, d10, z10, z11, z12, z15, i11);
            boolean z16 = false;
            if ((arbiterDown & 2048) != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (z10 && !z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            this.f33355y = z14;
            if (z12 && !z13) {
                z16 = true;
            }
            this.f33356z = z16;
            a(arbiterDown);
            if (this.O != this.M || this.P != this.N) {
                double uptimeMillis = SystemClock.uptimeMillis();
                double i12 = i(this.O);
                double d11 = this.P;
                long j10 = sVar.f6092a;
                if (j10 == 0) {
                    arbiterMove = -1;
                } else {
                    arbiterMove = WidgetSandboxNative.arbiterMove(j10, uptimeMillis, i12, d11);
                }
                a(arbiterMove);
            }
            if (!this.f33355y && !this.f33356z && !this.D) {
                g();
            } else {
                h();
                if ((this.f33355y || this.D) && !this.C) {
                    this.f33335a.a(true);
                }
            }
            o();
        }
    }

    public final void l(MotionEvent motionEvent, boolean z10) {
        nb1 nb1Var;
        dc1 dc1Var;
        float f7 = this.f33336b;
        int actionMasked = motionEvent.getActionMasked();
        if (z10 && actionMasked != 10 && (nb1Var = this.f33347p) != null && !this.f33349r && (dc1Var = nb1Var.f30841f) != null && dc1Var.f27417z) {
            this.E = true;
            this.I = motionEvent.getX() / f7;
            float y3 = motionEvent.getY() / f7;
            this.J = y3;
            nb1 nb1Var2 = this.f33347p;
            float f10 = this.I;
            int j10 = j(motionEvent);
            dc1 dc1Var2 = nb1Var2.f30841f;
            if (dc1Var2 != null) {
                long j11 = dc1Var2.f27411s;
                if (!dc1Var2.f27412t && j11 != 0) {
                    WidgetSandboxNative.hover(j11, 0, f10, y3, j10);
                    return;
                }
                return;
            }
            return;
        }
        c();
    }

    public final boolean m(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.ub1.m(android.view.MotionEvent):boolean");
    }

    public final boolean n() {
        int i10 = this.K;
        int i11 = (i10 >> 2) & 7;
        if ((i10 & 3) == 1) {
            if (i11 == 4 || i11 == 5 || i11 == 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void o() {
        double arbiterHoldDeadline;
        Handler handler = this.f33337c;
        sb1 sb1Var = this.f33343l;
        handler.removeCallbacks(sb1Var);
        long j10 = this.f33344m.f6092a;
        if (j10 == 0) {
            arbiterHoldDeadline = -1.0d;
        } else {
            arbiterHoldDeadline = WidgetSandboxNative.arbiterHoldDeadline(j10);
        }
        if (this.f33353w && arbiterHoldDeadline >= 0.0d) {
            handler.postDelayed(sb1Var, Math.max(0L, ((long) Math.ceil(arbiterHoldDeadline)) - SystemClock.uptimeMillis()));
        }
    }

    public final void p(boolean z10) {
        if (this.f33348q != z10) {
            this.f33348q = z10;
            nb1 nb1Var = this.f33347p;
            if (nb1Var != null && !this.f33349r) {
                nb1Var.p(z10);
            }
        }
    }

    public final void q() {
        if (this.f33347p != null) {
            if (this.f33349r) {
                this.f33349r = false;
                this.f33347p = null;
                return;
            }
            e();
            c();
            this.f33347p.p(false);
            nb1 nb1Var = this.f33347p;
            if (nb1Var.h == this) {
                nb1Var.h = null;
            }
            this.f33347p = null;
            this.f33337c.removeCallbacks(this.f33345n);
            this.f33346o = null;
            d();
            c3.s sVar = this.f33344m;
            long j10 = sVar.f6092a;
            if (j10 == 0) {
                return;
            }
            WidgetSandboxNative.arbiterDestroy(j10);
            sVar.f6092a = 0L;
        }
    }
}
