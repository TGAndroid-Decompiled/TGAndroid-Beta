package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class hm0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.messenger.fp D;
    public int E;
    public final RectF F;
    public final org.telegram.ui.ActionBar.g6 f46341a;
    public final int f46342b;
    public final boolean f46343c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.w8 f46344e;
    public final qk f46345f;
    public final org.telegram.ui.ActionBar.l5 h;
    public boolean f46346n;
    public final org.telegram.ui.Components.g5 f46347r;
    public final org.telegram.ui.Components.g5 f46348s;
    public final org.telegram.ui.Components.g5 f46349w;
    public final di.q7 f46350x;
    public final org.telegram.ui.Components.w5 f46351y;

    public hm0(int i7, long j3, Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context);
        boolean z9;
        CharSequence p10;
        long c10;
        int i10;
        int i11;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.w8 w8Var = new org.telegram.ui.Components.w8((org.telegram.ui.ActionBar.g6) null);
        this.f46344e = w8Var;
        this.f46349w = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.f46350x = new di.q7(this);
        this.f46351y = new org.telegram.ui.Components.w5(this, 320L, org.telegram.ui.Components.xq.h);
        this.F = new RectF();
        this.f46342b = i7;
        this.f46341a = g6Var;
        long j10 = 0;
        if (j3 < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f46343c = z9;
        qk qkVar = new qk(2, context, this);
        this.f46345f = qkVar;
        this.f46347r = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(17.0f), qkVar);
        this.f46348s = new org.telegram.ui.Components.g5(org.telegram.messenger.g0.L(24.0f), qkVar);
        qkVar.setLeftDrawableOutside(true);
        qkVar.setRightDrawableOutside(true);
        qkVar.setTextColor(-1);
        qkVar.setTextSize(20);
        qkVar.setTypeface(org.telegram.messenger.g0.o());
        qkVar.setWidthWrapContent(true);
        addView(qkVar, c8.ha.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(context);
        this.h = l5Var;
        l5Var.setTextSize(14);
        l5Var.setTextColor(-2130706433);
        l5Var.setGravity(1);
        addView(l5Var, c8.ha.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.J0(org.telegram.messenger.g0.L(96.0f));
        if (z9) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
            if (M0 == null) {
                p10 = "";
            } else {
                p10 = M0.title;
            }
            w8Var.q(M0);
            imageReceiver.i0(M0, w8Var, null);
            c10 = org.telegram.messenger.m5.c(M0);
            if (M0 != null) {
                j10 = org.telegram.messenger.m5.f(M0.emoji_status);
            }
        } else {
            TLRPC.User f10 = org.telegram.messenger.p10.i(i7).f();
            p10 = org.telegram.messenger.t10.p(f10);
            w8Var.r(f10);
            imageReceiver.i0(f10, w8Var, null);
            c10 = org.telegram.messenger.m5.c(f10);
            if (f10 != null) {
                j10 = org.telegram.messenger.m5.f(f10.emoji_status);
            }
        }
        try {
            p10 = org.telegram.messenger.i6.m(p10, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f46345f.l(p10, false);
        this.f46347r.j(c10, false);
        this.f46345f.setLeftDrawable(this.f46347r);
        this.f46348s.j(j10, false);
        this.f46345f.i(this.f46348s);
        if (this.f46343c) {
            long j11 = -j3;
            TLRPC.Chat M02 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(j11));
            TLRPC.ChatFull N0 = org.telegram.messenger.qp.s1(i7).N0(j11);
            if (N0 != null && N0.participants_count > 0) {
                if (org.telegram.messenger.t3.V(M02)) {
                    this.h.l(org.telegram.messenger.id.H(',', "Subscribers", N0.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.id.H(',', "Members", N0.participants_count), false);
                }
            } else if (M02 != null && M02.participants_count > 0) {
                if (org.telegram.messenger.t3.V(M02)) {
                    this.h.l(org.telegram.messenger.id.H(',', "Subscribers", M02.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.id.H(',', "Members", M02.participants_count), false);
                }
            } else {
                boolean t02 = org.telegram.messenger.t3.t0(M02);
                if (org.telegram.messenger.t3.V(M02)) {
                    org.telegram.ui.ActionBar.l5 l5Var2 = this.h;
                    if (t02) {
                        i11 = 2131752318;
                    } else {
                        i11 = 2131752329;
                    }
                    l5Var2.l(org.telegram.messenger.id.M0(i11, null).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.l5 l5Var3 = this.h;
                    if (t02) {
                        i10 = 2131748638;
                    } else {
                        i10 = 2131748641;
                    }
                    l5Var3.l(org.telegram.messenger.id.M0(i10, null).toLowerCase(), false);
                }
            }
        } else {
            this.h.l(org.telegram.messenger.id.M0(2131747826, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i7) {
        int w02;
        int w03;
        org.telegram.messenger.fp fpVar;
        org.telegram.ui.ActionBar.g6 g6Var = this.f46341a;
        if (i7 >= 14) {
            org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24470s0).f24874q4;
            if (gpVar != null) {
                fpVar = gpVar.d(i7);
            } else {
                fpVar = null;
            }
            if (fpVar != null) {
                int f10 = fpVar.f();
                w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28087p8[org.telegram.ui.Components.w8.f(f10)], g6Var);
                w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28107q8[org.telegram.ui.Components.w8.f(f10)], g6Var);
            } else {
                long j3 = i7;
                w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28087p8[org.telegram.ui.Components.w8.e(j3)], g6Var);
                w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28107q8[org.telegram.ui.Components.w8.e(j3)], g6Var);
            }
        } else {
            long j10 = i7;
            w02 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28087p8[org.telegram.ui.Components.w8.e(j10)], g6Var);
            w03 = org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28107q8[org.telegram.ui.Components.w8.e(j10)], g6Var);
        }
        this.f46344e.i(w02, w03);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28145s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28047n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f28058ni));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.l6.f27940h8));
    }

    public void b(int i7, boolean z9) {
        org.telegram.messenger.fp d;
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.f46342b).f24884r4;
        if (gpVar == null) {
            d = null;
        } else {
            d = gpVar.d(i7);
        }
        c(d, z9);
    }

    public final void c(org.telegram.messenger.fp fpVar, boolean z9) {
        boolean q10;
        this.D = fpVar;
        org.telegram.ui.ActionBar.g6 g6Var = this.f46341a;
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.l6.I.q();
        }
        qk qkVar = this.f46345f;
        org.telegram.ui.Components.g5 g5Var = this.f46347r;
        org.telegram.ui.Components.g5 g5Var2 = this.f46348s;
        org.telegram.ui.ActionBar.l5 l5Var = this.h;
        org.telegram.ui.Components.g5 g5Var3 = this.f46349w;
        if (fpVar != null) {
            int i7 = fpVar.f22449a;
            if (i7 != 0) {
                g5Var3.k(Integer.valueOf(i7));
            } else {
                g5Var3.k(Integer.valueOf(jm0.B0(fpVar.c(q10))));
            }
            g5Var2.k(Integer.valueOf(i0.a.f(0.25f, fpVar.m(org.telegram.ui.ActionBar.l6.I.q()), -1)));
            g5Var.k(Integer.valueOf(i0.a.f(0.25f, fpVar.m(org.telegram.ui.ActionBar.l6.I.q()), -1)));
            int f10 = i0.a.f(0.5f, fpVar.m(q10), fpVar.n(q10));
            int i10 = org.telegram.ui.ActionBar.l6.f28145s8;
            if (!org.telegram.ui.ActionBar.l6.e1(org.telegram.ui.ActionBar.l6.w0(i10, g6Var))) {
                l5Var.setTextColor(f10);
            } else {
                l5Var.setTextColor(org.telegram.ui.ActionBar.l6.D(q10, org.telegram.ui.ActionBar.l6.w0(i10, g6Var), f10, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27940h8, g6Var), f10));
            }
            qkVar.setTextColor(-1);
        } else {
            int i11 = org.telegram.ui.ActionBar.l6.f28145s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i11, g6Var)) > 0.8f) {
                g5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28047n6, g6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i11, g6Var)) < 0.2f) {
                g5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.A8, g6Var))));
            } else {
                g5Var3.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.l6.w0(i11, g6Var))));
            }
            int i12 = org.telegram.ui.ActionBar.l6.f28058ni;
            g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i12, g6Var)));
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i12, g6Var)));
            l5Var.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.B8, g6Var));
            qkVar.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.A8, g6Var));
        }
        this.E = 0;
        this.f46350x.c(fpVar, z9);
        invalidate();
    }

    public final void d(long j3, boolean z9, boolean z10) {
        boolean q10;
        org.telegram.messenger.fp fpVar;
        int i7;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.g5 g5Var = this.f46349w;
        if (i10 == 0) {
            g5Var.g(null, z10);
        } else {
            g5Var.j(j3, z10);
        }
        org.telegram.ui.ActionBar.g6 g6Var = this.f46341a;
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.l6.I.q();
        }
        org.telegram.messenger.fp fpVar2 = this.D;
        if (fpVar2 != null) {
            int i11 = fpVar2.f22449a;
            if (i11 != 0) {
                g5Var.k(Integer.valueOf(i11));
            } else {
                g5Var.k(Integer.valueOf(jm0.B0(fpVar2.c(q10))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.l6.f28145s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i12, g6Var)) > 0.8f) {
                g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28047n6, g6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i12, g6Var)) < 0.2f) {
                g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.A8, false))));
            } else {
                g5Var.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.l6.x0(null, i12, false))));
            }
        }
        org.telegram.messenger.fp fpVar3 = this.D;
        org.telegram.ui.Components.g5 g5Var2 = this.f46348s;
        if (fpVar3 != null) {
            int e10 = fpVar3.e(1, g6Var);
            if (this.D.o(q10)) {
                fpVar = this.D;
                i7 = 4;
            } else {
                fpVar = this.D;
                i7 = 2;
            }
            g5Var2.k(Integer.valueOf(i0.a.f(0.5f, e10, fpVar.e(i7, g6Var))));
        } else {
            g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28058ni, g6Var)));
        }
        this.E = 1;
        if (!z10) {
            this.f46351y.a(z9);
        }
        invalidate();
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        float f10;
        float f11;
        int width = getWidth();
        RectF rectF = this.F;
        rectF.set((getWidth() - org.telegram.messenger.g0.L(86.0f)) / 2.0f, getHeight() - org.telegram.messenger.g0.L(168.0f), (org.telegram.messenger.g0.L(86.0f) + width) / 2.0f, getHeight() - org.telegram.messenger.g0.L(82.0f));
        bi.i1.c(canvas, this.f46349w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f46346n) {
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
        if (this.f46346n) {
            f11 = 22.0f;
        } else {
            f11 = 58.0f;
        }
        float L2 = org.telegram.messenger.g0.L(f11);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, L2, L2, this.f46350x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j3, boolean z9, boolean z10) {
        boolean q10;
        int j10;
        int[] iArr;
        org.telegram.ui.Components.g5 g5Var = this.f46348s;
        g5Var.j(j3, z10);
        g5Var.m(z9, z10);
        org.telegram.ui.ActionBar.g6 g6Var = this.f46341a;
        if (g6Var != null) {
            q10 = g6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.l6.I.q();
        }
        org.telegram.messenger.fp fpVar = this.D;
        if (fpVar != null) {
            int h = fpVar.h(q10);
            if (this.D.o(q10)) {
                org.telegram.messenger.fp fpVar2 = this.D;
                if (q10) {
                    iArr = fpVar2.h;
                } else {
                    iArr = fpVar2.f22454g;
                }
                j10 = iArr[4];
            } else {
                j10 = this.D.j(q10);
            }
            g5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j10)));
        } else {
            g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28058ni, g6Var)));
        }
        this.E = 2;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46349w.a();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46349w.b();
        this.d.R();
    }

    public void setForum(boolean z9) {
        if (this.f46346n != z9) {
            invalidate();
        }
        this.f46346n = z9;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.g5 g5Var;
        org.telegram.ui.Components.g5 g5Var2;
        qk qkVar;
        org.telegram.ui.ActionBar.l5 l5Var;
        boolean q10;
        int j3;
        int[] iArr;
        int e10;
        org.telegram.ui.Components.g5 g5Var3 = this.f46349w;
        if (g5Var3 != null && (g5Var = this.f46348s) != null && (g5Var2 = this.f46347r) != null && (qkVar = this.f46345f) != null && (l5Var = this.h) != null) {
            org.telegram.ui.ActionBar.g6 g6Var = this.f46341a;
            try {
                if (g6Var != null) {
                    q10 = g6Var.a();
                } else {
                    q10 = org.telegram.ui.ActionBar.l6.I.q();
                }
                org.telegram.messenger.fp fpVar = this.D;
                if (fpVar != null) {
                    int i7 = fpVar.f22449a;
                    if (i7 != 0) {
                        g5Var3.k(Integer.valueOf(i7));
                    } else {
                        g5Var3.k(Integer.valueOf(jm0.B0(fpVar.c(q10))));
                    }
                    g5Var2.k(Integer.valueOf(i0.a.f(0.25f, this.D.m(org.telegram.ui.ActionBar.l6.I.q()), -1)));
                    int i10 = this.E;
                    if (i10 == 1) {
                        int e11 = this.D.e(1, g6Var);
                        if (this.D.o(q10)) {
                            e10 = this.D.e(4, g6Var);
                        } else {
                            e10 = this.D.e(2, g6Var);
                        }
                        g5Var.k(Integer.valueOf(i0.a.f(0.5f, e11, e10)));
                    } else if (i10 == 2) {
                        int h = this.D.h(q10);
                        if (this.D.o(q10)) {
                            org.telegram.messenger.fp fpVar2 = this.D;
                            if (q10) {
                                iArr = fpVar2.h;
                            } else {
                                iArr = fpVar2.f22454g;
                            }
                            j3 = iArr[4];
                        } else {
                            j3 = this.D.j(q10);
                        }
                        g5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j3)));
                    } else {
                        g5Var.k(Integer.valueOf(i0.a.f(0.25f, this.D.m(org.telegram.ui.ActionBar.l6.I.q()), -1)));
                    }
                    int f10 = i0.a.f(0.5f, this.D.m(q10), this.D.n(q10));
                    int i11 = org.telegram.ui.ActionBar.l6.f28145s8;
                    if (!org.telegram.ui.ActionBar.l6.e1(org.telegram.ui.ActionBar.l6.w0(i11, g6Var))) {
                        l5Var.setTextColor(f10);
                    } else {
                        l5Var.setTextColor(org.telegram.ui.ActionBar.l6.D(q10, org.telegram.ui.ActionBar.l6.w0(i11, g6Var), f10, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f27940h8, g6Var), f10));
                    }
                    qkVar.setTextColor(-1);
                } else {
                    int i12 = org.telegram.ui.ActionBar.l6.f28145s8;
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i12, g6Var)) > 0.8f) {
                        g5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.f28047n6, g6Var)));
                    } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.l6.w0(i12, g6Var)) < 0.2f) {
                        g5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.r1(0.5f, org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.A8, g6Var))));
                    } else {
                        g5Var3.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.l6.w0(i12, g6Var))));
                    }
                    int i13 = org.telegram.ui.ActionBar.l6.f28058ni;
                    g5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i13, g6Var)));
                    g5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.l6.w0(i13, g6Var)));
                    l5Var.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.B8, g6Var));
                    qkVar.setTextColor(org.telegram.ui.ActionBar.l6.w0(org.telegram.ui.ActionBar.l6.A8, g6Var));
                }
                invalidate();
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
    }
}
