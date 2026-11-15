package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class hm0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.messenger.cp E;
    public int F;
    public final RectF G;
    public final org.telegram.ui.ActionBar.e6 f47731a;
    public final int f47732b;
    public final boolean f47733c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.t8 f47734e;
    public final ok f47735f;
    public final org.telegram.ui.ActionBar.j5 h;
    public boolean f47736n;
    public final org.telegram.ui.Components.e5 f47737r;
    public final org.telegram.ui.Components.e5 f47738s;
    public final org.telegram.ui.Components.e5 f47739w;
    public final fi.j7 f47740x;
    public final org.telegram.ui.Components.u5 f47741y;

    public hm0(int i7, long j3, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        CharSequence p10;
        long c10;
        int i10;
        int i11;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.t8 t8Var = new org.telegram.ui.Components.t8((org.telegram.ui.ActionBar.e6) null);
        this.f47734e = t8Var;
        this.f47739w = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.f47740x = new fi.j7(this);
        this.f47741y = new org.telegram.ui.Components.u5(this, 320L, org.telegram.ui.Components.er.h);
        this.G = new RectF();
        this.f47732b = i7;
        this.f47731a = e6Var;
        long j10 = 0;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f47733c = z10;
        ok okVar = new ok(2, context, this);
        this.f47735f = okVar;
        this.f47737r = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(17.0f), okVar);
        this.f47738s = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), okVar);
        okVar.setLeftDrawableOutside(true);
        okVar.setRightDrawableOutside(true);
        okVar.setTextColor(-1);
        okVar.setTextSize(20);
        okVar.setTypeface(org.telegram.messenger.g0.o());
        okVar.setWidthWrapContent(true);
        addView(okVar, c8.ja.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.j5 j5Var = new org.telegram.ui.ActionBar.j5(context);
        this.h = j5Var;
        j5Var.setTextSize(14);
        j5Var.setTextColor(-2130706433);
        j5Var.setGravity(1);
        addView(j5Var, c8.ja.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.J0(org.telegram.messenger.g0.L(96.0f));
        if (z10) {
            TLRPC.Chat M0 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(-j3));
            if (M0 == null) {
                p10 = "";
            } else {
                p10 = M0.title;
            }
            t8Var.q(M0);
            imageReceiver.i0(M0, t8Var, null);
            c10 = org.telegram.messenger.m5.c(M0);
            if (M0 != null) {
                j10 = org.telegram.messenger.m5.f(M0.emoji_status);
            }
        } else {
            TLRPC.User f10 = org.telegram.messenger.m10.i(i7).f();
            p10 = org.telegram.messenger.q10.p(f10);
            t8Var.r(f10);
            imageReceiver.i0(f10, t8Var, null);
            c10 = org.telegram.messenger.m5.c(f10);
            if (f10 != null) {
                j10 = org.telegram.messenger.m5.f(f10.emoji_status);
            }
        }
        try {
            p10 = org.telegram.messenger.j6.m(p10, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f47735f.l(p10, false);
        this.f47737r.j(c10, false);
        this.f47735f.setLeftDrawable(this.f47737r);
        this.f47738s.j(j10, false);
        this.f47735f.i(this.f47738s);
        if (this.f47733c) {
            long j11 = -j3;
            TLRPC.Chat M02 = org.telegram.messenger.np.s1(i7).M0(Long.valueOf(j11));
            TLRPC.ChatFull N0 = org.telegram.messenger.np.s1(i7).N0(j11);
            if (N0 != null && N0.participants_count > 0) {
                if (org.telegram.messenger.t3.V(M02)) {
                    this.h.l(org.telegram.messenger.hd.H(',', "Subscribers", N0.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.hd.H(',', "Members", N0.participants_count), false);
                }
            } else if (M02 != null && M02.participants_count > 0) {
                if (org.telegram.messenger.t3.V(M02)) {
                    this.h.l(org.telegram.messenger.hd.H(',', "Subscribers", M02.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.hd.H(',', "Members", M02.participants_count), false);
                }
            } else {
                boolean t02 = org.telegram.messenger.t3.t0(M02);
                if (org.telegram.messenger.t3.V(M02)) {
                    org.telegram.ui.ActionBar.j5 j5Var2 = this.h;
                    if (t02) {
                        i11 = 2131752318;
                    } else {
                        i11 = 2131752329;
                    }
                    j5Var2.l(org.telegram.messenger.hd.M0(i11, null).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.j5 j5Var3 = this.h;
                    if (t02) {
                        i10 = 2131748638;
                    } else {
                        i10 = 2131748641;
                    }
                    j5Var3.l(org.telegram.messenger.hd.M0(i10, null).toLowerCase(), false);
                }
            }
        } else {
            this.h.l(org.telegram.messenger.hd.M0(2131747826, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i7) {
        int w02;
        int w03;
        org.telegram.messenger.cp cpVar;
        org.telegram.ui.ActionBar.e6 e6Var = this.f47731a;
        if (i7 >= 14) {
            org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(org.telegram.messenger.m10.f24940t0).f25383r4;
            if (dpVar != null) {
                cpVar = dpVar.d(i7);
            } else {
                cpVar = null;
            }
            if (cpVar != null) {
                int f10 = cpVar.f();
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[org.telegram.ui.Components.t8.f(f10)], e6Var);
                w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[org.telegram.ui.Components.t8.f(f10)], e6Var);
            } else {
                long j3 = i7;
                w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[org.telegram.ui.Components.t8.e(j3)], e6Var);
                w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[org.telegram.ui.Components.t8.e(j3)], e6Var);
            }
        } else {
            long j10 = i7;
            w02 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29071p8[org.telegram.ui.Components.t8.e(j10)], e6Var);
            w03 = org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29091q8[org.telegram.ui.Components.t8.e(j10)], e6Var);
        }
        this.f47734e.i(w02, w03);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29129s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29031n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f29100qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.j6.f28924h8));
    }

    public void b(int i7, boolean z10) {
        org.telegram.messenger.cp d;
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.s1(this.f47732b).f25393s4;
        if (dpVar == null) {
            d = null;
        } else {
            d = dpVar.d(i7);
        }
        c(d, z10);
    }

    public final void c(org.telegram.messenger.cp cpVar, boolean z10) {
        boolean q10;
        this.E = cpVar;
        org.telegram.ui.ActionBar.e6 e6Var = this.f47731a;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        ok okVar = this.f47735f;
        org.telegram.ui.Components.e5 e5Var = this.f47737r;
        org.telegram.ui.Components.e5 e5Var2 = this.f47738s;
        org.telegram.ui.ActionBar.j5 j5Var = this.h;
        org.telegram.ui.Components.e5 e5Var3 = this.f47739w;
        if (cpVar != null) {
            int i7 = cpVar.f22917a;
            if (i7 != 0) {
                e5Var3.k(Integer.valueOf(i7));
            } else {
                e5Var3.k(Integer.valueOf(jm0.B0(cpVar.c(q10))));
            }
            e5Var2.k(Integer.valueOf(i0.a.f(0.25f, cpVar.m(org.telegram.ui.ActionBar.j6.I.q()), -1)));
            e5Var.k(Integer.valueOf(i0.a.f(0.25f, cpVar.m(org.telegram.ui.ActionBar.j6.I.q()), -1)));
            int f10 = i0.a.f(0.5f, cpVar.m(q10), cpVar.n(q10));
            int i10 = org.telegram.ui.ActionBar.j6.f29129s8;
            if (!org.telegram.ui.ActionBar.j6.e1(org.telegram.ui.ActionBar.j6.w0(i10, e6Var))) {
                j5Var.setTextColor(f10);
            } else {
                j5Var.setTextColor(org.telegram.ui.ActionBar.j6.D(q10, org.telegram.ui.ActionBar.j6.w0(i10, e6Var), f10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28924h8, e6Var), f10));
            }
            okVar.setTextColor(-1);
        } else {
            int i11 = org.telegram.ui.ActionBar.j6.f29129s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i11, e6Var)) > 0.8f) {
                e5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29031n6, e6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i11, e6Var)) < 0.2f) {
                e5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, e6Var))));
            } else {
                e5Var3.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.j6.w0(i11, e6Var))));
            }
            int i12 = org.telegram.ui.ActionBar.j6.f29100qi;
            e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i12, e6Var)));
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i12, e6Var)));
            j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, e6Var));
            okVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, e6Var));
        }
        this.F = 0;
        this.f47740x.c(cpVar, z10);
        invalidate();
    }

    public final void d(long j3, boolean z10, boolean z11) {
        boolean q10;
        org.telegram.messenger.cp cpVar;
        int i7;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.e5 e5Var = this.f47739w;
        if (i10 == 0) {
            e5Var.g(null, z11);
        } else {
            e5Var.j(j3, z11);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f47731a;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        org.telegram.messenger.cp cpVar2 = this.E;
        if (cpVar2 != null) {
            int i11 = cpVar2.f22917a;
            if (i11 != 0) {
                e5Var.k(Integer.valueOf(i11));
            } else {
                e5Var.k(Integer.valueOf(jm0.B0(cpVar2.c(q10))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.j6.f29129s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i12, e6Var)) > 0.8f) {
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29031n6, e6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i12, e6Var)) < 0.2f) {
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.x0(null, org.telegram.ui.ActionBar.j6.A8, false))));
            } else {
                e5Var.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.j6.x0(null, i12, false))));
            }
        }
        org.telegram.messenger.cp cpVar3 = this.E;
        org.telegram.ui.Components.e5 e5Var2 = this.f47738s;
        if (cpVar3 != null) {
            int e10 = cpVar3.e(1, e6Var);
            if (this.E.o(q10)) {
                cpVar = this.E;
                i7 = 4;
            } else {
                cpVar = this.E;
                i7 = 2;
            }
            e5Var2.k(Integer.valueOf(i0.a.f(0.5f, e10, cpVar.e(i7, e6Var))));
        } else {
            e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29100qi, e6Var)));
        }
        this.F = 1;
        if (!z11) {
            this.f47741y.a(z10);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int width = getWidth();
        RectF rectF = this.G;
        rectF.set((getWidth() - org.telegram.messenger.g0.L(86.0f)) / 2.0f, getHeight() - org.telegram.messenger.g0.L(168.0f), (org.telegram.messenger.g0.L(86.0f) + width) / 2.0f, getHeight() - org.telegram.messenger.g0.L(82.0f));
        di.w0.c(canvas, this.f47739w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f47736n) {
            f10 = 18.0f;
        } else {
            f10 = 54.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.J0(L);
        imageReceiver.A0(rectF);
        imageReceiver.h(canvas, null);
        float width2 = (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(4.0f);
        if (this.f47736n) {
            f11 = 22.0f;
        } else {
            f11 = 58.0f;
        }
        float L2 = org.telegram.messenger.g0.L(f11);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, L2, L2, this.f47740x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j3, boolean z10, boolean z11) {
        boolean q10;
        int j10;
        int[] iArr;
        org.telegram.ui.Components.e5 e5Var = this.f47738s;
        e5Var.j(j3, z11);
        e5Var.m(z10, z11);
        org.telegram.ui.ActionBar.e6 e6Var = this.f47731a;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.j6.I.q();
        }
        org.telegram.messenger.cp cpVar = this.E;
        if (cpVar != null) {
            int h = cpVar.h(q10);
            if (this.E.o(q10)) {
                org.telegram.messenger.cp cpVar2 = this.E;
                if (q10) {
                    iArr = cpVar2.h;
                } else {
                    iArr = cpVar2.f22922g;
                }
                j10 = iArr[4];
            } else {
                j10 = this.E.j(q10);
            }
            e5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j10)));
        } else {
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29100qi, e6Var)));
        }
        this.F = 2;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f47739w.a();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f47739w.b();
        this.d.R();
    }

    public void setForum(boolean z10) {
        if (this.f47736n != z10) {
            invalidate();
        }
        this.f47736n = z10;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.e5 e5Var;
        org.telegram.ui.Components.e5 e5Var2;
        ok okVar;
        org.telegram.ui.ActionBar.j5 j5Var;
        boolean q10;
        int j3;
        int[] iArr;
        int e10;
        org.telegram.ui.Components.e5 e5Var3 = this.f47739w;
        if (e5Var3 != null && (e5Var = this.f47738s) != null && (e5Var2 = this.f47737r) != null && (okVar = this.f47735f) != null && (j5Var = this.h) != null) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f47731a;
            try {
                if (e6Var != null) {
                    q10 = e6Var.a();
                } else {
                    q10 = org.telegram.ui.ActionBar.j6.I.q();
                }
                org.telegram.messenger.cp cpVar = this.E;
                if (cpVar != null) {
                    int i7 = cpVar.f22917a;
                    if (i7 != 0) {
                        e5Var3.k(Integer.valueOf(i7));
                    } else {
                        e5Var3.k(Integer.valueOf(jm0.B0(cpVar.c(q10))));
                    }
                    e5Var2.k(Integer.valueOf(i0.a.f(0.25f, this.E.m(org.telegram.ui.ActionBar.j6.I.q()), -1)));
                    int i10 = this.F;
                    if (i10 == 1) {
                        int e11 = this.E.e(1, e6Var);
                        if (this.E.o(q10)) {
                            e10 = this.E.e(4, e6Var);
                        } else {
                            e10 = this.E.e(2, e6Var);
                        }
                        e5Var.k(Integer.valueOf(i0.a.f(0.5f, e11, e10)));
                    } else if (i10 == 2) {
                        int h = this.E.h(q10);
                        if (this.E.o(q10)) {
                            org.telegram.messenger.cp cpVar2 = this.E;
                            if (q10) {
                                iArr = cpVar2.h;
                            } else {
                                iArr = cpVar2.f22922g;
                            }
                            j3 = iArr[4];
                        } else {
                            j3 = this.E.j(q10);
                        }
                        e5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j3)));
                    } else {
                        e5Var.k(Integer.valueOf(i0.a.f(0.25f, this.E.m(org.telegram.ui.ActionBar.j6.I.q()), -1)));
                    }
                    int f10 = i0.a.f(0.5f, this.E.m(q10), this.E.n(q10));
                    int i11 = org.telegram.ui.ActionBar.j6.f29129s8;
                    if (!org.telegram.ui.ActionBar.j6.e1(org.telegram.ui.ActionBar.j6.w0(i11, e6Var))) {
                        j5Var.setTextColor(f10);
                    } else {
                        j5Var.setTextColor(org.telegram.ui.ActionBar.j6.D(q10, org.telegram.ui.ActionBar.j6.w0(i11, e6Var), f10, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28924h8, e6Var), f10));
                    }
                    okVar.setTextColor(-1);
                } else {
                    int i12 = org.telegram.ui.ActionBar.j6.f29129s8;
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i12, e6Var)) > 0.8f) {
                        e5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f29031n6, e6Var)));
                    } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.j6.w0(i12, e6Var)) < 0.2f) {
                        e5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.r1(0.5f, org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, e6Var))));
                    } else {
                        e5Var3.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.j6.w0(i12, e6Var))));
                    }
                    int i13 = org.telegram.ui.ActionBar.j6.f29100qi;
                    e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i13, e6Var)));
                    e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.j6.w0(i13, e6Var)));
                    j5Var.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.B8, e6Var));
                    okVar.setTextColor(org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.A8, e6Var));
                }
                invalidate();
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
    }
}
