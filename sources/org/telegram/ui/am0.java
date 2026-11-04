package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class am0 extends FrameLayout implements org.telegram.ui.ActionBar.z5 {
    public org.telegram.messenger.wo E;
    public int F;
    public final RectF G;
    public final org.telegram.ui.ActionBar.e6 f43798a;
    public final int f43799b;
    public final boolean f43800c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.u8 f43801e;
    public final kk f43802f;
    public final org.telegram.ui.ActionBar.k5 h;
    public boolean f43803n;
    public final org.telegram.ui.Components.e5 f43804r;
    public final org.telegram.ui.Components.e5 f43805s;
    public final org.telegram.ui.Components.e5 f43806w;
    public final ei.q7 f43807x;
    public final org.telegram.ui.Components.u5 f43808y;

    public am0(int i3, long j10, Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context);
        boolean z10;
        CharSequence p10;
        long c2;
        int i10;
        int i11;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
        this.f43801e = u8Var;
        this.f43806w = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.f43807x = new ei.q7(this);
        this.f43808y = new org.telegram.ui.Components.u5(this, 320L, org.telegram.ui.Components.xq.h);
        this.G = new RectF();
        this.f43799b = i3;
        this.f43798a = e6Var;
        long j11 = 0;
        if (j10 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43800c = z10;
        kk kkVar = new kk(2, context, this);
        this.f43802f = kkVar;
        this.f43804r = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(17.0f), kkVar);
        this.f43805s = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(24.0f), kkVar);
        kkVar.setLeftDrawableOutside(true);
        kkVar.setRightDrawableOutside(true);
        kkVar.setTextColor(-1);
        kkVar.setTextSize(20);
        kkVar.setTypeface(org.telegram.messenger.g0.o());
        kkVar.setWidthWrapContent(true);
        addView(kkVar, b8.mf.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(context);
        this.h = k5Var;
        k5Var.setTextSize(14);
        k5Var.setTextColor(-2130706433);
        k5Var.setGravity(1);
        addView(k5Var, b8.mf.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.J0(org.telegram.messenger.g0.L(96.0f));
        if (z10) {
            TLRPC.Chat M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-j10));
            if (M0 == null) {
                p10 = "";
            } else {
                p10 = M0.title;
            }
            u8Var.q(M0);
            imageReceiver.i0(M0, u8Var, null);
            c2 = org.telegram.messenger.m5.c(M0);
            if (M0 != null) {
                j11 = org.telegram.messenger.m5.f(M0.emoji_status);
            }
        } else {
            TLRPC.User f10 = org.telegram.messenger.h10.i(i3).f();
            p10 = org.telegram.messenger.l10.p(f10);
            u8Var.r(f10);
            imageReceiver.i0(f10, u8Var, null);
            c2 = org.telegram.messenger.m5.c(f10);
            if (f10 != null) {
                j11 = org.telegram.messenger.m5.f(f10.emoji_status);
            }
        }
        try {
            p10 = org.telegram.messenger.i6.m(p10, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f43802f.l(p10, false);
        this.f43804r.j(c2, false);
        this.f43802f.setLeftDrawable(this.f43804r);
        this.f43805s.j(j11, false);
        this.f43802f.i(this.f43805s);
        if (this.f43800c) {
            long j12 = -j10;
            TLRPC.Chat M02 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(j12));
            TLRPC.ChatFull N0 = org.telegram.messenger.hp.s1(i3).N0(j12);
            if (N0 != null && N0.participants_count > 0) {
                if (org.telegram.messenger.t3.V(M02)) {
                    this.h.l(org.telegram.messenger.bd.H(',', "Subscribers", N0.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.bd.H(',', "Members", N0.participants_count), false);
                }
            } else if (M02 != null && M02.participants_count > 0) {
                if (org.telegram.messenger.t3.V(M02)) {
                    this.h.l(org.telegram.messenger.bd.H(',', "Subscribers", M02.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.bd.H(',', "Members", M02.participants_count), false);
                }
            } else {
                boolean t02 = org.telegram.messenger.t3.t0(M02);
                if (org.telegram.messenger.t3.V(M02)) {
                    org.telegram.ui.ActionBar.k5 k5Var2 = this.h;
                    if (t02) {
                        i11 = 2131752318;
                    } else {
                        i11 = 2131752329;
                    }
                    k5Var2.l(org.telegram.messenger.bd.M0(i11, null).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.k5 k5Var3 = this.h;
                    if (t02) {
                        i10 = 2131748646;
                    } else {
                        i10 = 2131748649;
                    }
                    k5Var3.l(org.telegram.messenger.bd.M0(i10, null).toLowerCase(), false);
                }
            }
        } else {
            this.h.l(org.telegram.messenger.bd.M0(2131747834, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i3) {
        int w02;
        int w03;
        org.telegram.messenger.wo woVar;
        org.telegram.ui.ActionBar.e6 e6Var = this.f43798a;
        if (i3 >= 14) {
            org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(org.telegram.messenger.h10.f22829t0).f23099q4;
            if (xoVar != null) {
                woVar = xoVar.d(i3);
            } else {
                woVar = null;
            }
            if (woVar != null) {
                int f10 = woVar.f();
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[org.telegram.ui.Components.u8.f(f10)], e6Var);
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[org.telegram.ui.Components.u8.f(f10)], e6Var);
            } else {
                long j10 = i3;
                w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[org.telegram.ui.Components.u8.e(j10)], e6Var);
                w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[org.telegram.ui.Components.u8.e(j10)], e6Var);
            }
        } else {
            long j11 = i3;
            w02 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28103p8[org.telegram.ui.Components.u8.e(j11)], e6Var);
            w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28123q8[org.telegram.ui.Components.u8.e(j11)], e6Var);
        }
        this.f43801e.i(w02, w03);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28062n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28073ni));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27956h8));
    }

    public void b(int i3, boolean z10) {
        org.telegram.messenger.wo d;
        org.telegram.messenger.xo xoVar = org.telegram.messenger.hp.s1(this.f43799b).f23109r4;
        if (xoVar == null) {
            d = null;
        } else {
            d = xoVar.d(i3);
        }
        c(d, z10);
    }

    public final void c(org.telegram.messenger.wo woVar, boolean z10) {
        boolean q10;
        this.E = woVar;
        org.telegram.ui.ActionBar.e6 e6Var = this.f43798a;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        kk kkVar = this.f43802f;
        org.telegram.ui.Components.e5 e5Var = this.f43804r;
        org.telegram.ui.Components.e5 e5Var2 = this.f43805s;
        org.telegram.ui.ActionBar.k5 k5Var = this.h;
        org.telegram.ui.Components.e5 e5Var3 = this.f43806w;
        if (woVar != null) {
            int i3 = woVar.f26237a;
            if (i3 != 0) {
                e5Var3.k(Integer.valueOf(i3));
            } else {
                e5Var3.k(Integer.valueOf(cm0.B0(woVar.c(q10))));
            }
            e5Var2.k(Integer.valueOf(i0.a.f(0.25f, woVar.m(org.telegram.ui.ActionBar.k6.I.q()), -1)));
            e5Var.k(Integer.valueOf(i0.a.f(0.25f, woVar.m(org.telegram.ui.ActionBar.k6.I.q()), -1)));
            int f10 = i0.a.f(0.5f, woVar.m(q10), woVar.n(q10));
            int i10 = org.telegram.ui.ActionBar.k6.f28160s8;
            if (!org.telegram.ui.ActionBar.k6.e1(org.telegram.ui.ActionBar.k6.w0(i10, e6Var))) {
                k5Var.setTextColor(f10);
            } else {
                k5Var.setTextColor(org.telegram.ui.ActionBar.k6.D(q10, org.telegram.ui.ActionBar.k6.w0(i10, e6Var), f10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956h8, e6Var), f10));
            }
            kkVar.setTextColor(-1);
        } else {
            int i11 = org.telegram.ui.ActionBar.k6.f28160s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i11, e6Var)) > 0.8f) {
                e5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i11, e6Var)) < 0.2f) {
                e5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, e6Var))));
            } else {
                e5Var3.k(Integer.valueOf(cm0.B0(org.telegram.ui.ActionBar.k6.w0(i11, e6Var))));
            }
            int i12 = org.telegram.ui.ActionBar.k6.f28073ni;
            e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i12, e6Var)));
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i12, e6Var)));
            k5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, e6Var));
            kkVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, e6Var));
        }
        this.F = 0;
        this.f43807x.c(woVar, z10);
        invalidate();
    }

    public final void d(long j10, boolean z10, boolean z11) {
        boolean q10;
        org.telegram.messenger.wo woVar;
        int i3;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        org.telegram.ui.Components.e5 e5Var = this.f43806w;
        if (i10 == 0) {
            e5Var.g(null, z11);
        } else {
            e5Var.j(j10, z11);
        }
        org.telegram.ui.ActionBar.e6 e6Var = this.f43798a;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        org.telegram.messenger.wo woVar2 = this.E;
        if (woVar2 != null) {
            int i11 = woVar2.f26237a;
            if (i11 != 0) {
                e5Var.k(Integer.valueOf(i11));
            } else {
                e5Var.k(Integer.valueOf(cm0.B0(woVar2.c(q10))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.k6.f28160s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i12, e6Var)) > 0.8f) {
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i12, e6Var)) < 0.2f) {
                e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.A8, false))));
            } else {
                e5Var.k(Integer.valueOf(cm0.B0(org.telegram.ui.ActionBar.k6.x0(null, i12, false))));
            }
        }
        org.telegram.messenger.wo woVar3 = this.E;
        org.telegram.ui.Components.e5 e5Var2 = this.f43805s;
        if (woVar3 != null) {
            int e10 = woVar3.e(1, e6Var);
            if (this.E.o(q10)) {
                woVar = this.E;
                i3 = 4;
            } else {
                woVar = this.E;
                i3 = 2;
            }
            e5Var2.k(Integer.valueOf(i0.a.f(0.5f, e10, woVar.e(i3, e6Var))));
        } else {
            e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073ni, e6Var)));
        }
        this.F = 1;
        if (!z11) {
            this.f43808y.a(z10);
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
        ci.b1.c(canvas, this.f43806w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f43803n) {
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
        if (this.f43803n) {
            f11 = 22.0f;
        } else {
            f11 = 58.0f;
        }
        float L2 = org.telegram.messenger.g0.L(f11);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, L2, L2, this.f43807x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j10, boolean z10, boolean z11) {
        boolean q10;
        int j11;
        int[] iArr;
        org.telegram.ui.Components.e5 e5Var = this.f43805s;
        e5Var.j(j10, z11);
        e5Var.m(z10, z11);
        org.telegram.ui.ActionBar.e6 e6Var = this.f43798a;
        if (e6Var != null) {
            q10 = e6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.k6.I.q();
        }
        org.telegram.messenger.wo woVar = this.E;
        if (woVar != null) {
            int h = woVar.h(q10);
            if (this.E.o(q10)) {
                org.telegram.messenger.wo woVar2 = this.E;
                if (q10) {
                    iArr = woVar2.h;
                } else {
                    iArr = woVar2.f26242g;
                }
                j11 = iArr[4];
            } else {
                j11 = this.E.j(q10);
            }
            e5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j11)));
        } else {
            e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28073ni, e6Var)));
        }
        this.F = 2;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f43806w.a();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f43806w.b();
        this.d.R();
    }

    public void setForum(boolean z10) {
        if (this.f43803n != z10) {
            invalidate();
        }
        this.f43803n = z10;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.e5 e5Var;
        org.telegram.ui.Components.e5 e5Var2;
        kk kkVar;
        org.telegram.ui.ActionBar.k5 k5Var;
        boolean q10;
        int j10;
        int[] iArr;
        int e10;
        org.telegram.ui.Components.e5 e5Var3 = this.f43806w;
        if (e5Var3 != null && (e5Var = this.f43805s) != null && (e5Var2 = this.f43804r) != null && (kkVar = this.f43802f) != null && (k5Var = this.h) != null) {
            org.telegram.ui.ActionBar.e6 e6Var = this.f43798a;
            try {
                if (e6Var != null) {
                    q10 = e6Var.a();
                } else {
                    q10 = org.telegram.ui.ActionBar.k6.I.q();
                }
                org.telegram.messenger.wo woVar = this.E;
                if (woVar != null) {
                    int i3 = woVar.f26237a;
                    if (i3 != 0) {
                        e5Var3.k(Integer.valueOf(i3));
                    } else {
                        e5Var3.k(Integer.valueOf(cm0.B0(woVar.c(q10))));
                    }
                    e5Var2.k(Integer.valueOf(i0.a.f(0.25f, this.E.m(org.telegram.ui.ActionBar.k6.I.q()), -1)));
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
                            org.telegram.messenger.wo woVar2 = this.E;
                            if (q10) {
                                iArr = woVar2.h;
                            } else {
                                iArr = woVar2.f26242g;
                            }
                            j10 = iArr[4];
                        } else {
                            j10 = this.E.j(q10);
                        }
                        e5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j10)));
                    } else {
                        e5Var.k(Integer.valueOf(i0.a.f(0.25f, this.E.m(org.telegram.ui.ActionBar.k6.I.q()), -1)));
                    }
                    int f10 = i0.a.f(0.5f, this.E.m(q10), this.E.n(q10));
                    int i11 = org.telegram.ui.ActionBar.k6.f28160s8;
                    if (!org.telegram.ui.ActionBar.k6.e1(org.telegram.ui.ActionBar.k6.w0(i11, e6Var))) {
                        k5Var.setTextColor(f10);
                    } else {
                        k5Var.setTextColor(org.telegram.ui.ActionBar.k6.D(q10, org.telegram.ui.ActionBar.k6.w0(i11, e6Var), f10, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27956h8, e6Var), f10));
                    }
                    kkVar.setTextColor(-1);
                } else {
                    int i12 = org.telegram.ui.ActionBar.k6.f28160s8;
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i12, e6Var)) > 0.8f) {
                        e5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f28062n6, e6Var)));
                    } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.k6.w0(i12, e6Var)) < 0.2f) {
                        e5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.r1(0.5f, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, e6Var))));
                    } else {
                        e5Var3.k(Integer.valueOf(cm0.B0(org.telegram.ui.ActionBar.k6.w0(i12, e6Var))));
                    }
                    int i13 = org.telegram.ui.ActionBar.k6.f28073ni;
                    e5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i13, e6Var)));
                    e5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.k6.w0(i13, e6Var)));
                    k5Var.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.B8, e6Var));
                    kkVar.setTextColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.A8, e6Var));
                }
                invalidate();
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
    }
}
