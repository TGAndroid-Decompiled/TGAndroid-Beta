package org.telegram.ui.Components;

import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.MotionEvent;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
public final class pb1 {
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
    public final an0 f31519a;
    public final float f31520b;
    public final Handler f31521c = new Handler(Looper.getMainLooper());
    public final Paint d;
    public final Matrix e;
    public final float[] f31522f;
    public final float[] f31523g;
    public final Path h;
    public final RectF f31524i;
    public final float[] f31525j;
    public final ob1 f31526k;
    public final ob1 f31527l;
    public final c3.s f31528m;
    public final ob1 f31529n;
    public vb1 f31530o;
    public jb1 f31531p;
    public boolean f31532q;
    public boolean f31533r;
    public long f31534s;
    public long f31535t;
    public float f31536u;
    public float v;
    public boolean f31537w;
    public boolean f31538x;
    public boolean f31539y;
    public boolean f31540z;

    public pb1(an0 an0Var, float f7) {
        Paint paint = new Paint(1);
        this.d = paint;
        this.e = new Matrix();
        this.f31522f = new float[9];
        this.f31523g = new float[7];
        this.h = new Path();
        this.f31524i = new RectF();
        this.f31525j = new float[8];
        this.f31526k = new Runnable(this) {
            public final pb1 f31251b;

            {
                this.f31251b = this;
            }

            @Override
            public final void run() {
                int arbiterTick;
                jb1 jb1Var;
                switch (r2) {
                    case 0:
                        pb1 pb1Var = this.f31251b;
                        if (pb1Var.f31537w && pb1Var.f31538x) {
                            c3.s sVar = pb1Var.f31528m;
                            double uptimeMillis = SystemClock.uptimeMillis();
                            long j10 = sVar.f6092a;
                            if (j10 == 0) {
                                arbiterTick = -1;
                            } else {
                                arbiterTick = WidgetSandboxNative.arbiterTick(j10, uptimeMillis);
                            }
                            pb1Var.a(arbiterTick);
                            pb1Var.o();
                            return;
                        }
                        return;
                    case 1:
                        this.f31251b.j(false, false, false);
                        return;
                    default:
                        pb1 pb1Var2 = this.f31251b;
                        if (pb1Var2.f31530o != null && (jb1Var = pb1Var2.f31531p) != null) {
                            vb1 i10 = jb1Var.i();
                            vb1 vb1Var = pb1Var2.f31530o;
                            if (i10 == vb1Var) {
                                vb1Var.f33620a.g();
                                pb1Var2.f31519a.j();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f31527l = new Runnable(this) {
            public final pb1 f31251b;

            {
                this.f31251b = this;
            }

            @Override
            public final void run() {
                int arbiterTick;
                jb1 jb1Var;
                switch (r2) {
                    case 0:
                        pb1 pb1Var = this.f31251b;
                        if (pb1Var.f31537w && pb1Var.f31538x) {
                            c3.s sVar = pb1Var.f31528m;
                            double uptimeMillis = SystemClock.uptimeMillis();
                            long j10 = sVar.f6092a;
                            if (j10 == 0) {
                                arbiterTick = -1;
                            } else {
                                arbiterTick = WidgetSandboxNative.arbiterTick(j10, uptimeMillis);
                            }
                            pb1Var.a(arbiterTick);
                            pb1Var.o();
                            return;
                        }
                        return;
                    case 1:
                        this.f31251b.j(false, false, false);
                        return;
                    default:
                        pb1 pb1Var2 = this.f31251b;
                        if (pb1Var2.f31530o != null && (jb1Var = pb1Var2.f31531p) != null) {
                            vb1 i10 = jb1Var.i();
                            vb1 vb1Var = pb1Var2.f31530o;
                            if (i10 == vb1Var) {
                                vb1Var.f33620a.g();
                                pb1Var2.f31519a.j();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.f31528m = new Object();
        this.f31529n = new Runnable(this) {
            public final pb1 f31251b;

            {
                this.f31251b = this;
            }

            @Override
            public final void run() {
                int arbiterTick;
                jb1 jb1Var;
                switch (r2) {
                    case 0:
                        pb1 pb1Var = this.f31251b;
                        if (pb1Var.f31537w && pb1Var.f31538x) {
                            c3.s sVar = pb1Var.f31528m;
                            double uptimeMillis = SystemClock.uptimeMillis();
                            long j10 = sVar.f6092a;
                            if (j10 == 0) {
                                arbiterTick = -1;
                            } else {
                                arbiterTick = WidgetSandboxNative.arbiterTick(j10, uptimeMillis);
                            }
                            pb1Var.a(arbiterTick);
                            pb1Var.o();
                            return;
                        }
                        return;
                    case 1:
                        this.f31251b.j(false, false, false);
                        return;
                    default:
                        pb1 pb1Var2 = this.f31251b;
                        if (pb1Var2.f31530o != null && (jb1Var = pb1Var2.f31531p) != null) {
                            vb1 i10 = jb1Var.i();
                            vb1 vb1Var = pb1Var2.f31530o;
                            if (i10 == vb1Var) {
                                vb1Var.f33620a.g();
                                pb1Var2.f31519a.j();
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        };
        this.K = -1;
        this.f31519a = an0Var;
        this.f31520b = f7;
        paint.setTextSize(f7 * 14.0f);
        paint.setColor(-8355712);
    }

    public static int i(MotionEvent motionEvent) {
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
        org.telegram.ui.Cells.s1 cell;
        an0 an0Var = this.f31519a;
        if (i10 != -1) {
            this.K = i10;
            if ((i10 & 32) != 0 && !this.A) {
                this.A = true;
                jb1 jb1Var = this.f31531p;
                float f7 = this.O;
                float f10 = this.P;
                boolean z10 = this.D;
                int i11 = this.H;
                int i12 = this.G;
                yb1 yb1Var = jb1Var.f29585f;
                if (yb1Var != null) {
                    long j10 = yb1Var.f35014r;
                    if (!yb1Var.f35015s && j10 != 0) {
                        WidgetSandboxNative.touch(j10, 3, f7, f10, 0, true, z10, i11, i12);
                    }
                }
            }
            int i13 = i10 & 3;
            if (i13 == 2) {
                f();
                if (((i10 >> 6) & 7) == 1 && (cell = an0Var.root.getCell()) != null && cell.Jc != null) {
                    try {
                        cell.performHapticFeedback(0);
                    } catch (Exception unused) {
                    }
                    cell.Jc.j0(cell, cell.f25099g1, cell.f25112h1);
                }
            } else if (i13 == 1 && n() && !this.C) {
                if (this.B) {
                    an0Var.requestDisallowParentIntercept(true);
                } else {
                    g();
                }
            }
        }
    }

    public final void b() {
        if (!this.E) {
            return;
        }
        this.E = false;
        jb1 jb1Var = this.f31531p;
        if (jb1Var != null && !this.f31533r) {
            float f7 = this.I;
            float f10 = this.J;
            yb1 yb1Var = jb1Var.f29585f;
            if (yb1Var != null) {
                long j10 = yb1Var.f35014r;
                if (!yb1Var.f35015s && j10 != 0) {
                    WidgetSandboxNative.hover(j10, 1, f7, f10, 0);
                }
            }
        }
        this.f31519a.o("auto");
    }

    public final void c() {
        ob1 ob1Var = this.f31526k;
        Handler handler = this.f31521c;
        handler.removeCallbacks(ob1Var);
        handler.removeCallbacks(this.f31527l);
        this.f31537w = false;
        this.f31538x = false;
    }

    public final void d() {
        jb1 jb1Var;
        if (this.F) {
            this.F = false;
            this.A = true;
        }
        if (this.f31537w && !this.A && (jb1Var = this.f31531p) != null) {
            this.A = true;
            float f7 = this.O;
            float f10 = this.P;
            boolean z10 = this.D;
            int i10 = this.H;
            int i11 = this.G;
            yb1 yb1Var = jb1Var.f29585f;
            if (yb1Var != null) {
                long j10 = yb1Var.f35014r;
                if (!yb1Var.f35015s && j10 != 0) {
                    WidgetSandboxNative.touch(j10, 3, f7, f10, 0, true, z10, i10, i11);
                }
            }
        }
    }

    public final void e() {
        if (this.F) {
            this.F = false;
            jb1 jb1Var = this.f31531p;
            if (jb1Var != null) {
                float f7 = this.M;
                float f10 = this.N;
                boolean z10 = this.D;
                int i10 = this.H;
                int i11 = this.G;
                yb1 yb1Var = jb1Var.f29585f;
                if (yb1Var != null) {
                    long j10 = yb1Var.f35014r;
                    if (!yb1Var.f35015s && j10 != 0) {
                        WidgetSandboxNative.touch(j10, 0, f7, f10, 0, true, z10, i10, i11);
                    }
                }
            }
        }
    }

    public final void f() {
        if (!this.C) {
            this.C = true;
            if (this.B) {
                this.f31519a.requestDisallowParentIntercept(false);
            }
        }
    }

    public final void g() {
        if (!this.B && !this.C) {
            this.B = true;
            this.f31519a.requestDisallowParentIntercept(true);
        }
    }

    public final float h(float f7) {
        int i10;
        if (LocaleController.isRTL && (i10 = this.Q) > 0) {
            return (i10 / this.f31520b) - f7;
        }
        return f7;
    }

    public final void j(boolean z10, boolean z11, boolean z12) {
        boolean z13;
        boolean z14;
        int arbiterMove;
        if (this.f31537w && !this.f31538x) {
            this.f31521c.removeCallbacks(this.f31526k);
            this.f31538x = true;
            double d = this.L;
            double h = h(this.M);
            double d10 = this.N;
            boolean z15 = this.D;
            int i10 = this.G;
            c3.s sVar = this.f31528m;
            if (sVar.f6092a == 0) {
                sVar.f6092a = WidgetSandboxNative.arbiterCreate();
            }
            int arbiterDown = WidgetSandboxNative.arbiterDown(sVar.f6092a, d, h, d10, z10, z11, z12, z15, i10);
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
            this.f31539y = z14;
            if (z12 && !z13) {
                z16 = true;
            }
            this.f31540z = z16;
            a(arbiterDown);
            if (this.O != this.M || this.P != this.N) {
                double uptimeMillis = SystemClock.uptimeMillis();
                double h10 = h(this.O);
                double d11 = this.P;
                long j10 = sVar.f6092a;
                if (j10 == 0) {
                    arbiterMove = -1;
                } else {
                    arbiterMove = WidgetSandboxNative.arbiterMove(j10, uptimeMillis, h10, d11);
                }
                a(arbiterMove);
            }
            if (!this.f31539y && !this.f31540z && !this.D) {
                f();
            } else {
                g();
                if ((this.f31539y || this.D) && !this.C) {
                    this.f31519a.requestDisallowParentIntercept(true);
                }
            }
            o();
        }
    }

    public final void k(MotionEvent motionEvent, boolean z10) {
        jb1 jb1Var;
        yb1 yb1Var;
        float f7 = this.f31520b;
        int actionMasked = motionEvent.getActionMasked();
        if (z10 && actionMasked != 10 && (jb1Var = this.f31531p) != null && !this.f31533r && (yb1Var = jb1Var.f29585f) != null && yb1Var.f35020y) {
            this.E = true;
            this.I = motionEvent.getX() / f7;
            float y3 = motionEvent.getY() / f7;
            this.J = y3;
            jb1 jb1Var2 = this.f31531p;
            float f10 = this.I;
            int i10 = i(motionEvent);
            yb1 yb1Var2 = jb1Var2.f29585f;
            if (yb1Var2 != null) {
                long j10 = yb1Var2.f35014r;
                if (!yb1Var2.f35015s && j10 != 0) {
                    WidgetSandboxNative.hover(j10, 0, f10, y3, i10);
                    return;
                }
                return;
            }
            return;
        }
        b();
    }

    public final void l(boolean z10) {
        vb1 vb1Var;
        an0 an0Var = this.f31519a;
        if (z10) {
            wa0 wa0Var = an0Var.f26583w;
            AndroidUtilities.cancelRunOnUIThread(wa0Var);
            if (!an0Var.v) {
                yb1 yb1Var = an0Var.f26577b.f29585f;
                if (yb1Var != null && (vb1Var = yb1Var.D) != null && (vb1Var.f33624g || yb1Var.v)) {
                    an0Var.v = true;
                    an0Var.f26582s = SystemClock.uptimeMillis();
                    if (an0Var.h() != an0Var.f26584x) {
                        an0Var.m("on screen, loaded", true);
                    }
                } else {
                    AndroidUtilities.runOnUIThread(wa0Var, 1500L);
                }
            } else if (SystemClock.uptimeMillis() - an0Var.f26582s < 1500) {
                AndroidUtilities.runOnUIThread(wa0Var, 200L);
            } else if (an0Var.h() != an0Var.f26584x) {
                an0Var.m("on screen", true);
            }
        }
        an0Var.j();
    }

    public final boolean m(android.view.MotionEvent r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.Components.pb1.m(android.view.MotionEvent):boolean");
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
        Handler handler = this.f31521c;
        ob1 ob1Var = this.f31527l;
        handler.removeCallbacks(ob1Var);
        long j10 = this.f31528m.f6092a;
        if (j10 == 0) {
            arbiterHoldDeadline = -1.0d;
        } else {
            arbiterHoldDeadline = WidgetSandboxNative.arbiterHoldDeadline(j10);
        }
        if (this.f31537w && arbiterHoldDeadline >= 0.0d) {
            handler.postDelayed(ob1Var, Math.max(0L, ((long) Math.ceil(arbiterHoldDeadline)) - SystemClock.uptimeMillis()));
        }
    }

    public final void p() {
        if (this.f31531p != null) {
            if (this.f31533r) {
                this.f31533r = false;
                this.f31531p = null;
                return;
            }
            d();
            b();
            this.f31531p.k(false);
            jb1 jb1Var = this.f31531p;
            if (jb1Var.h == this) {
                jb1Var.h = null;
            }
            this.f31531p = null;
            this.f31521c.removeCallbacks(this.f31529n);
            this.f31530o = null;
            c();
            c3.s sVar = this.f31528m;
            long j10 = sVar.f6092a;
            if (j10 == 0) {
                return;
            }
            WidgetSandboxNative.arbiterDestroy(j10);
            sVar.f6092a = 0L;
        }
    }
}
