package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class jm0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.messenger.cp E;
    public int F;
    public final RectF G;
    public final org.telegram.ui.ActionBar.h6 f49017a;
    public final int f49018b;
    public final boolean f49019c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.b9 f49020e;
    public final pk f49021f;
    public final org.telegram.ui.ActionBar.m5 h;
    public boolean f49022n;
    public final org.telegram.ui.Components.n5 f49023r;
    public final org.telegram.ui.Components.n5 f49024s;
    public final org.telegram.ui.Components.n5 f49025w;
    public final fi.g7 f49026x;
    public final org.telegram.ui.Components.d6 f49027y;

    public jm0(int i7, long j3, Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context);
        boolean z10;
        CharSequence q10;
        long c10;
        int i10;
        int i11;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.b9 b9Var = new org.telegram.ui.Components.b9((org.telegram.ui.ActionBar.h6) null);
        this.f49020e = b9Var;
        this.f49025w = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.f49026x = new fi.g7(this);
        this.f49027y = new org.telegram.ui.Components.d6(this, 320L, org.telegram.ui.Components.nr.h);
        this.G = new RectF();
        this.f49018b = i7;
        this.f49017a = h6Var;
        long j10 = 0;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49019c = z10;
        pk pkVar = new pk(2, context, this);
        this.f49021f = pkVar;
        this.f49023r = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(17.0f), pkVar);
        this.f49024s = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), pkVar);
        pkVar.setLeftDrawableOutside(true);
        pkVar.setRightDrawableOutside(true);
        pkVar.setTextColor(-1);
        pkVar.setTextSize(20);
        pkVar.setTypeface(org.telegram.messenger.g0.o());
        pkVar.setWidthWrapContent(true);
        addView(pkVar, c8.ma.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.m5 m5Var = new org.telegram.ui.ActionBar.m5(context);
        this.h = m5Var;
        m5Var.setTextSize(14);
        m5Var.setTextColor(-2130706433);
        m5Var.setGravity(1);
        addView(m5Var, c8.ma.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.J0(org.telegram.messenger.g0.L(96.0f));
        if (z10) {
            TLRPC.Chat O0 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(-j3));
            if (O0 == null) {
                q10 = "";
            } else {
                q10 = O0.title;
            }
            b9Var.q(O0);
            imageReceiver.i0(O0, b9Var, null);
            c10 = org.telegram.messenger.n5.c(O0);
            if (O0 != null) {
                j10 = org.telegram.messenger.n5.f(O0.emoji_status);
            }
        } else {
            TLRPC.User f10 = org.telegram.messenger.k10.i(i7).f();
            q10 = org.telegram.messenger.p10.q(f10);
            b9Var.r(f10);
            imageReceiver.i0(f10, b9Var, null);
            c10 = org.telegram.messenger.n5.c(f10);
            if (f10 != null) {
                j10 = org.telegram.messenger.n5.f(f10.emoji_status);
            }
        }
        try {
            q10 = org.telegram.messenger.j6.m(q10, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f49021f.l(q10, false);
        this.f49023r.j(c10, false);
        this.f49021f.setLeftDrawable(this.f49023r);
        this.f49024s.j(j10, false);
        this.f49021f.i(this.f49024s);
        if (this.f49019c) {
            long j11 = -j3;
            TLRPC.Chat O02 = org.telegram.messenger.np.u1(i7).O0(Long.valueOf(j11));
            TLRPC.ChatFull P0 = org.telegram.messenger.np.u1(i7).P0(j11);
            if (P0 != null && P0.participants_count > 0) {
                if (org.telegram.messenger.v3.V(O02)) {
                    this.h.l(org.telegram.messenger.hd.H(',', "Subscribers", P0.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.hd.H(',', "Members", P0.participants_count), false);
                }
            } else if (O02 != null && O02.participants_count > 0) {
                if (org.telegram.messenger.v3.V(O02)) {
                    this.h.l(org.telegram.messenger.hd.H(',', "Subscribers", O02.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.hd.H(',', "Members", O02.participants_count), false);
                }
            } else {
                boolean t02 = org.telegram.messenger.v3.t0(O02);
                if (org.telegram.messenger.v3.V(O02)) {
                    org.telegram.ui.ActionBar.m5 m5Var2 = this.h;
                    if (t02) {
                        i11 = 2131752306;
                    } else {
                        i11 = 2131752317;
                    }
                    m5Var2.l(org.telegram.messenger.hd.N0(i11, null).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.m5 m5Var3 = this.h;
                    if (t02) {
                        i10 = 2131748445;
                    } else {
                        i10 = 2131748448;
                    }
                    m5Var3.l(org.telegram.messenger.hd.N0(i10, null).toLowerCase(), false);
                }
            }
        } else {
            this.h.l(org.telegram.messenger.hd.N0(2131747632, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i7) {
        int w02;
        int w03;
        org.telegram.messenger.cp cpVar;
        org.telegram.ui.ActionBar.h6 h6Var = this.f49017a;
        if (i7 >= 14) {
            org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(org.telegram.messenger.k10.f24968t0).f25966t4;
            if (dpVar != null) {
                cpVar = dpVar.d(i7);
            } else {
                cpVar = null;
            }
            if (cpVar != null) {
                int f10 = cpVar.f();
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29603p8[org.telegram.ui.Components.b9.f(f10)], h6Var);
                w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29623q8[org.telegram.ui.Components.b9.f(f10)], h6Var);
            } else {
                long j3 = i7;
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29603p8[org.telegram.ui.Components.b9.e(j3)], h6Var);
                w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29623q8[org.telegram.ui.Components.b9.e(j3)], h6Var);
            }
        } else {
            long j10 = i7;
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29603p8[org.telegram.ui.Components.b9.e(j10)], h6Var);
            w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29623q8[org.telegram.ui.Components.b9.e(j10)], h6Var);
        }
        this.f49020e.i(w02, w03);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29661s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29563n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29632qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29456h8));
    }

    public void b(int i7, boolean z10) {
        org.telegram.messenger.cp d;
        org.telegram.messenger.dp dpVar = org.telegram.messenger.np.u1(this.f49018b).f25974u4;
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
        org.telegram.ui.ActionBar.h6 h6Var = this.f49017a;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        pk pkVar = this.f49021f;
        org.telegram.ui.Components.n5 n5Var = this.f49023r;
        org.telegram.ui.Components.n5 n5Var2 = this.f49024s;
        org.telegram.ui.ActionBar.m5 m5Var = this.h;
        org.telegram.ui.Components.n5 n5Var3 = this.f49025w;
        if (cpVar != null) {
            int i7 = cpVar.f23353a;
            if (i7 != 0) {
                n5Var3.k(Integer.valueOf(i7));
            } else {
                n5Var3.k(Integer.valueOf(lm0.B0(cpVar.c(q10))));
            }
            n5Var2.k(Integer.valueOf(i0.a.f(0.25f, cpVar.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
            n5Var.k(Integer.valueOf(i0.a.f(0.25f, cpVar.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
            int f10 = i0.a.f(0.5f, cpVar.m(q10), cpVar.n(q10));
            int i10 = org.telegram.ui.ActionBar.m6.f29661s8;
            if (!org.telegram.ui.ActionBar.m6.e1(org.telegram.ui.ActionBar.m6.w0(i10, h6Var))) {
                m5Var.setTextColor(f10);
            } else {
                m5Var.setTextColor(org.telegram.ui.ActionBar.m6.D(q10, org.telegram.ui.ActionBar.m6.w0(i10, h6Var), f10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29456h8, h6Var), f10));
            }
            pkVar.setTextColor(-1);
        } else {
            int i11 = org.telegram.ui.ActionBar.m6.f29661s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)) > 0.8f) {
                n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29563n6, h6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)) < 0.2f) {
                n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var))));
            } else {
                n5Var3.k(Integer.valueOf(lm0.B0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var))));
            }
            int i12 = org.telegram.ui.ActionBar.m6.f29632qi;
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)));
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)));
            m5Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var));
            pkVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
        }
        this.F = 0;
        this.f49026x.c(cpVar, z10);
        invalidate();
    }

    public final void d(long j3, boolean z10, boolean z11) {
        boolean q10;
        org.telegram.messenger.cp cpVar;
        int i7;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.n5 n5Var = this.f49025w;
        if (i10 == 0) {
            n5Var.g(null, z11);
        } else {
            n5Var.j(j3, z11);
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f49017a;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        org.telegram.messenger.cp cpVar2 = this.E;
        if (cpVar2 != null) {
            int i11 = cpVar2.f23353a;
            if (i11 != 0) {
                n5Var.k(Integer.valueOf(i11));
            } else {
                n5Var.k(Integer.valueOf(lm0.B0(cpVar2.c(q10))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.m6.f29661s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) > 0.8f) {
                n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29563n6, h6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) < 0.2f) {
                n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.A8, false))));
            } else {
                n5Var.k(Integer.valueOf(lm0.B0(org.telegram.ui.ActionBar.m6.x0(null, i12, false))));
            }
        }
        org.telegram.messenger.cp cpVar3 = this.E;
        org.telegram.ui.Components.n5 n5Var2 = this.f49024s;
        if (cpVar3 != null) {
            int e10 = cpVar3.e(1, h6Var);
            if (this.E.o(q10)) {
                cpVar = this.E;
                i7 = 4;
            } else {
                cpVar = this.E;
                i7 = 2;
            }
            n5Var2.k(Integer.valueOf(i0.a.f(0.5f, e10, cpVar.e(i7, h6Var))));
        } else {
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29632qi, h6Var)));
        }
        this.F = 1;
        if (!z11) {
            this.f49027y.a(z10);
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
        di.v0.c(canvas, this.f49025w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f49022n) {
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
        if (this.f49022n) {
            f11 = 22.0f;
        } else {
            f11 = 58.0f;
        }
        float L2 = org.telegram.messenger.g0.L(f11);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, L2, L2, this.f49026x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j3, boolean z10, boolean z11) {
        boolean q10;
        int j10;
        int[] iArr;
        org.telegram.ui.Components.n5 n5Var = this.f49024s;
        n5Var.j(j3, z11);
        n5Var.m(z10, z11);
        org.telegram.ui.ActionBar.h6 h6Var = this.f49017a;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        org.telegram.messenger.cp cpVar = this.E;
        if (cpVar != null) {
            int h = cpVar.h(q10);
            if (this.E.o(q10)) {
                org.telegram.messenger.cp cpVar2 = this.E;
                if (q10) {
                    iArr = cpVar2.h;
                } else {
                    iArr = cpVar2.f23358g;
                }
                j10 = iArr[4];
            } else {
                j10 = this.E.j(q10);
            }
            n5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j10)));
        } else {
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29632qi, h6Var)));
        }
        this.F = 2;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49025w.a();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49025w.b();
        this.d.R();
    }

    public void setForum(boolean z10) {
        if (this.f49022n != z10) {
            invalidate();
        }
        this.f49022n = z10;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.n5 n5Var;
        org.telegram.ui.Components.n5 n5Var2;
        pk pkVar;
        org.telegram.ui.ActionBar.m5 m5Var;
        boolean q10;
        int j3;
        int[] iArr;
        int e10;
        org.telegram.ui.Components.n5 n5Var3 = this.f49025w;
        if (n5Var3 != null && (n5Var = this.f49024s) != null && (n5Var2 = this.f49023r) != null && (pkVar = this.f49021f) != null && (m5Var = this.h) != null) {
            org.telegram.ui.ActionBar.h6 h6Var = this.f49017a;
            try {
                if (h6Var != null) {
                    q10 = h6Var.d();
                } else {
                    q10 = org.telegram.ui.ActionBar.m6.I.q();
                }
                org.telegram.messenger.cp cpVar = this.E;
                if (cpVar != null) {
                    int i7 = cpVar.f23353a;
                    if (i7 != 0) {
                        n5Var3.k(Integer.valueOf(i7));
                    } else {
                        n5Var3.k(Integer.valueOf(lm0.B0(cpVar.c(q10))));
                    }
                    n5Var2.k(Integer.valueOf(i0.a.f(0.25f, this.E.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
                    int i10 = this.F;
                    if (i10 == 1) {
                        int e11 = this.E.e(1, h6Var);
                        if (this.E.o(q10)) {
                            e10 = this.E.e(4, h6Var);
                        } else {
                            e10 = this.E.e(2, h6Var);
                        }
                        n5Var.k(Integer.valueOf(i0.a.f(0.5f, e11, e10)));
                    } else if (i10 == 2) {
                        int h = this.E.h(q10);
                        if (this.E.o(q10)) {
                            org.telegram.messenger.cp cpVar2 = this.E;
                            if (q10) {
                                iArr = cpVar2.h;
                            } else {
                                iArr = cpVar2.f23358g;
                            }
                            j3 = iArr[4];
                        } else {
                            j3 = this.E.j(q10);
                        }
                        n5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j3)));
                    } else {
                        n5Var.k(Integer.valueOf(i0.a.f(0.25f, this.E.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
                    }
                    int f10 = i0.a.f(0.5f, this.E.m(q10), this.E.n(q10));
                    int i11 = org.telegram.ui.ActionBar.m6.f29661s8;
                    if (!org.telegram.ui.ActionBar.m6.e1(org.telegram.ui.ActionBar.m6.w0(i11, h6Var))) {
                        m5Var.setTextColor(f10);
                    } else {
                        m5Var.setTextColor(org.telegram.ui.ActionBar.m6.D(q10, org.telegram.ui.ActionBar.m6.w0(i11, h6Var), f10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29456h8, h6Var), f10));
                    }
                    pkVar.setTextColor(-1);
                } else {
                    int i12 = org.telegram.ui.ActionBar.m6.f29661s8;
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) > 0.8f) {
                        n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29563n6, h6Var)));
                    } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) < 0.2f) {
                        n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var))));
                    } else {
                        n5Var3.k(Integer.valueOf(lm0.B0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var))));
                    }
                    int i13 = org.telegram.ui.ActionBar.m6.f29632qi;
                    n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i13, h6Var)));
                    n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i13, h6Var)));
                    m5Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var));
                    pkVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
                }
                invalidate();
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
    }
}
