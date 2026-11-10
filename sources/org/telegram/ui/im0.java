package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class im0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.messenger.fp D;
    public int E;
    public final RectF F;
    public final org.telegram.ui.ActionBar.h6 f46664a;
    public final int f46665b;
    public final boolean f46666c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.v8 f46667e;
    public final qk f46668f;
    public final org.telegram.ui.ActionBar.m5 h;
    public boolean f46669n;
    public final org.telegram.ui.Components.f5 f46670r;
    public final org.telegram.ui.Components.f5 f46671s;
    public final org.telegram.ui.Components.f5 f46672w;
    public final di.q7 f46673x;
    public final org.telegram.ui.Components.v5 f46674y;

    public im0(int i7, long j3, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        boolean z9;
        CharSequence p10;
        long c10;
        int i10;
        int i11;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.v8 v8Var = new org.telegram.ui.Components.v8((org.telegram.ui.ActionBar.h6) null);
        this.f46667e = v8Var;
        this.f46672w = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.f46673x = new di.q7(this);
        this.f46674y = new org.telegram.ui.Components.v5(this, 320L, org.telegram.ui.Components.wq.h);
        this.F = new RectF();
        this.f46665b = i7;
        this.f46664a = h6Var;
        long j10 = 0;
        if (j3 < 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        this.f46666c = z9;
        qk qkVar = new qk(2, context, this);
        this.f46668f = qkVar;
        this.f46670r = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(17.0f), qkVar);
        this.f46671s = new org.telegram.ui.Components.f5(org.telegram.messenger.g0.L(24.0f), qkVar);
        qkVar.setLeftDrawableOutside(true);
        qkVar.setRightDrawableOutside(true);
        qkVar.setTextColor(-1);
        qkVar.setTextSize(20);
        qkVar.setTypeface(org.telegram.messenger.g0.o());
        qkVar.setWidthWrapContent(true);
        addView(qkVar, c8.ha.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.h = m5Var;
        m5Var.setTextSize(14);
        m5Var.setTextColor(-2130706433);
        m5Var.setGravity(1);
        addView(m5Var, c8.ha.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.J0(org.telegram.messenger.g0.L(96.0f));
        if (z9) {
            TLRPC.Chat M0 = org.telegram.messenger.qp.s1(i7).M0(Long.valueOf(-j3));
            if (M0 == null) {
                p10 = "";
            } else {
                p10 = M0.title;
            }
            v8Var.q(M0);
            imageReceiver.i0(M0, v8Var, null);
            c10 = org.telegram.messenger.m5.c(M0);
            if (M0 != null) {
                j10 = org.telegram.messenger.m5.f(M0.emoji_status);
            }
        } else {
            TLRPC.User f10 = org.telegram.messenger.p10.i(i7).f();
            p10 = org.telegram.messenger.t10.p(f10);
            v8Var.r(f10);
            imageReceiver.i0(f10, v8Var, null);
            c10 = org.telegram.messenger.m5.c(f10);
            if (f10 != null) {
                j10 = org.telegram.messenger.m5.f(f10.emoji_status);
            }
        }
        try {
            p10 = org.telegram.messenger.i6.m(p10, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f46668f.l(p10, false);
        this.f46670r.j(c10, false);
        this.f46668f.setLeftDrawable(this.f46670r);
        this.f46671s.j(j10, false);
        this.f46668f.i(this.f46671s);
        if (this.f46666c) {
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
                    org.telegram.ui.ActionBar.m5 m5Var2 = this.h;
                    if (t02) {
                        i11 = 2131752318;
                    } else {
                        i11 = 2131752329;
                    }
                    m5Var2.l(org.telegram.messenger.id.M0(i11, null).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.m5 m5Var3 = this.h;
                    if (t02) {
                        i10 = 2131748638;
                    } else {
                        i10 = 2131748641;
                    }
                    m5Var3.l(org.telegram.messenger.id.M0(i10, null).toLowerCase(), false);
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
        org.telegram.ui.ActionBar.h6 h6Var = this.f46664a;
        if (i7 >= 14) {
            org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(org.telegram.messenger.p10.f24474s0).f24878q4;
            if (gpVar != null) {
                fpVar = gpVar.d(i7);
            } else {
                fpVar = null;
            }
            if (fpVar != null) {
                int f10 = fpVar.f();
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[org.telegram.ui.Components.v8.f(f10)], h6Var);
                w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[org.telegram.ui.Components.v8.f(f10)], h6Var);
            } else {
                long j3 = i7;
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[org.telegram.ui.Components.v8.e(j3)], h6Var);
                w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[org.telegram.ui.Components.v8.e(j3)], h6Var);
            }
        } else {
            long j10 = i7;
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28112p8[org.telegram.ui.Components.v8.e(j10)], h6Var);
            w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28132q8[org.telegram.ui.Components.v8.e(j10)], h6Var);
        }
        this.f46667e.i(w02, w03);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28170s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28072n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f28083ni));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f27965h8));
    }

    public void b(int i7, boolean z9) {
        org.telegram.messenger.fp d;
        org.telegram.messenger.gp gpVar = org.telegram.messenger.qp.s1(this.f46665b).f24888r4;
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
        org.telegram.ui.ActionBar.h6 h6Var = this.f46664a;
        if (h6Var != null) {
            q10 = h6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        qk qkVar = this.f46668f;
        org.telegram.ui.Components.f5 f5Var = this.f46670r;
        org.telegram.ui.Components.f5 f5Var2 = this.f46671s;
        org.telegram.ui.ActionBar.m5 m5Var = this.h;
        org.telegram.ui.Components.f5 f5Var3 = this.f46672w;
        if (fpVar != null) {
            int i7 = fpVar.f22453a;
            if (i7 != 0) {
                f5Var3.k(Integer.valueOf(i7));
            } else {
                f5Var3.k(Integer.valueOf(km0.B0(fpVar.c(q10))));
            }
            f5Var2.k(Integer.valueOf(i0.a.f(0.25f, fpVar.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
            f5Var.k(Integer.valueOf(i0.a.f(0.25f, fpVar.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
            int f10 = i0.a.f(0.5f, fpVar.m(q10), fpVar.n(q10));
            int i10 = org.telegram.ui.ActionBar.m6.f28170s8;
            if (!org.telegram.ui.ActionBar.m6.e1(org.telegram.ui.ActionBar.m6.w0(i10, h6Var))) {
                m5Var.setTextColor(f10);
            } else {
                m5Var.setTextColor(org.telegram.ui.ActionBar.m6.D(q10, org.telegram.ui.ActionBar.m6.w0(i10, h6Var), f10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27965h8, h6Var), f10));
            }
            qkVar.setTextColor(-1);
        } else {
            int i11 = org.telegram.ui.ActionBar.m6.f28170s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)) > 0.8f) {
                f5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28072n6, h6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)) < 0.2f) {
                f5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var))));
            } else {
                f5Var3.k(Integer.valueOf(km0.B0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var))));
            }
            int i12 = org.telegram.ui.ActionBar.m6.f28083ni;
            f5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)));
            f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)));
            m5Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var));
            qkVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
        }
        this.E = 0;
        this.f46673x.c(fpVar, z9);
        invalidate();
    }

    public final void d(long j3, boolean z9, boolean z10) {
        boolean q10;
        org.telegram.messenger.fp fpVar;
        int i7;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.f5 f5Var = this.f46672w;
        if (i10 == 0) {
            f5Var.g(null, z10);
        } else {
            f5Var.j(j3, z10);
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f46664a;
        if (h6Var != null) {
            q10 = h6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        org.telegram.messenger.fp fpVar2 = this.D;
        if (fpVar2 != null) {
            int i11 = fpVar2.f22453a;
            if (i11 != 0) {
                f5Var.k(Integer.valueOf(i11));
            } else {
                f5Var.k(Integer.valueOf(km0.B0(fpVar2.c(q10))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.m6.f28170s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) > 0.8f) {
                f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28072n6, h6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) < 0.2f) {
                f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.A8, false))));
            } else {
                f5Var.k(Integer.valueOf(km0.B0(org.telegram.ui.ActionBar.m6.x0(null, i12, false))));
            }
        }
        org.telegram.messenger.fp fpVar3 = this.D;
        org.telegram.ui.Components.f5 f5Var2 = this.f46671s;
        if (fpVar3 != null) {
            int e10 = fpVar3.e(1, h6Var);
            if (this.D.o(q10)) {
                fpVar = this.D;
                i7 = 4;
            } else {
                fpVar = this.D;
                i7 = 2;
            }
            f5Var2.k(Integer.valueOf(i0.a.f(0.5f, e10, fpVar.e(i7, h6Var))));
        } else {
            f5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28083ni, h6Var)));
        }
        this.E = 1;
        if (!z10) {
            this.f46674y.a(z9);
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
        bi.i1.c(canvas, this.f46672w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f46669n) {
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
        if (this.f46669n) {
            f11 = 22.0f;
        } else {
            f11 = 58.0f;
        }
        float L2 = org.telegram.messenger.g0.L(f11);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, L2, L2, this.f46673x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j3, boolean z9, boolean z10) {
        boolean q10;
        int j10;
        int[] iArr;
        org.telegram.ui.Components.f5 f5Var = this.f46671s;
        f5Var.j(j3, z10);
        f5Var.m(z9, z10);
        org.telegram.ui.ActionBar.h6 h6Var = this.f46664a;
        if (h6Var != null) {
            q10 = h6Var.a();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        org.telegram.messenger.fp fpVar = this.D;
        if (fpVar != null) {
            int h = fpVar.h(q10);
            if (this.D.o(q10)) {
                org.telegram.messenger.fp fpVar2 = this.D;
                if (q10) {
                    iArr = fpVar2.h;
                } else {
                    iArr = fpVar2.f22458g;
                }
                j10 = iArr[4];
            } else {
                j10 = this.D.j(q10);
            }
            f5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j10)));
        } else {
            f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28083ni, h6Var)));
        }
        this.E = 2;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f46672w.a();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f46672w.b();
        this.d.R();
    }

    public void setForum(boolean z9) {
        if (this.f46669n != z9) {
            invalidate();
        }
        this.f46669n = z9;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.f5 f5Var;
        org.telegram.ui.Components.f5 f5Var2;
        qk qkVar;
        org.telegram.ui.ActionBar.m5 m5Var;
        boolean q10;
        int j3;
        int[] iArr;
        int e10;
        org.telegram.ui.Components.f5 f5Var3 = this.f46672w;
        if (f5Var3 != null && (f5Var = this.f46671s) != null && (f5Var2 = this.f46670r) != null && (qkVar = this.f46668f) != null && (m5Var = this.h) != null) {
            org.telegram.ui.ActionBar.h6 h6Var = this.f46664a;
            try {
                if (h6Var != null) {
                    q10 = h6Var.a();
                } else {
                    q10 = org.telegram.ui.ActionBar.m6.I.q();
                }
                org.telegram.messenger.fp fpVar = this.D;
                if (fpVar != null) {
                    int i7 = fpVar.f22453a;
                    if (i7 != 0) {
                        f5Var3.k(Integer.valueOf(i7));
                    } else {
                        f5Var3.k(Integer.valueOf(km0.B0(fpVar.c(q10))));
                    }
                    f5Var2.k(Integer.valueOf(i0.a.f(0.25f, this.D.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
                    int i10 = this.E;
                    if (i10 == 1) {
                        int e11 = this.D.e(1, h6Var);
                        if (this.D.o(q10)) {
                            e10 = this.D.e(4, h6Var);
                        } else {
                            e10 = this.D.e(2, h6Var);
                        }
                        f5Var.k(Integer.valueOf(i0.a.f(0.5f, e11, e10)));
                    } else if (i10 == 2) {
                        int h = this.D.h(q10);
                        if (this.D.o(q10)) {
                            org.telegram.messenger.fp fpVar2 = this.D;
                            if (q10) {
                                iArr = fpVar2.h;
                            } else {
                                iArr = fpVar2.f22458g;
                            }
                            j3 = iArr[4];
                        } else {
                            j3 = this.D.j(q10);
                        }
                        f5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j3)));
                    } else {
                        f5Var.k(Integer.valueOf(i0.a.f(0.25f, this.D.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
                    }
                    int f10 = i0.a.f(0.5f, this.D.m(q10), this.D.n(q10));
                    int i11 = org.telegram.ui.ActionBar.m6.f28170s8;
                    if (!org.telegram.ui.ActionBar.m6.e1(org.telegram.ui.ActionBar.m6.w0(i11, h6Var))) {
                        m5Var.setTextColor(f10);
                    } else {
                        m5Var.setTextColor(org.telegram.ui.ActionBar.m6.D(q10, org.telegram.ui.ActionBar.m6.w0(i11, h6Var), f10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27965h8, h6Var), f10));
                    }
                    qkVar.setTextColor(-1);
                } else {
                    int i12 = org.telegram.ui.ActionBar.m6.f28170s8;
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) > 0.8f) {
                        f5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f28072n6, h6Var)));
                    } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) < 0.2f) {
                        f5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var))));
                    } else {
                        f5Var3.k(Integer.valueOf(km0.B0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var))));
                    }
                    int i13 = org.telegram.ui.ActionBar.m6.f28083ni;
                    f5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i13, h6Var)));
                    f5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i13, h6Var)));
                    m5Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var));
                    qkVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
                }
                invalidate();
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
    }
}
