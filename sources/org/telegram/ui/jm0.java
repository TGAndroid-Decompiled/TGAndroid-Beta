package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class jm0 extends FrameLayout implements org.telegram.ui.ActionBar.b6 {
    public org.telegram.messenger.bp E;
    public int F;
    public final RectF G;
    public final org.telegram.ui.ActionBar.h6 f49013a;
    public final int f49014b;
    public final boolean f49015c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.b9 f49016e;
    public final pk f49017f;
    public final org.telegram.ui.ActionBar.m5 h;
    public boolean f49018n;
    public final org.telegram.ui.Components.n5 f49019r;
    public final org.telegram.ui.Components.n5 f49020s;
    public final org.telegram.ui.Components.n5 f49021w;
    public final fi.g7 f49022x;
    public final org.telegram.ui.Components.d6 f49023y;

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
        this.f49016e = b9Var;
        this.f49021w = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.f49022x = new fi.g7(this);
        this.f49023y = new org.telegram.ui.Components.d6(this, 320L, org.telegram.ui.Components.nr.h);
        this.G = new RectF();
        this.f49014b = i7;
        this.f49013a = h6Var;
        long j10 = 0;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f49015c = z10;
        pk pkVar = new pk(2, context, this);
        this.f49017f = pkVar;
        this.f49019r = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(17.0f), pkVar);
        this.f49020s = new org.telegram.ui.Components.n5(org.telegram.messenger.g0.L(24.0f), pkVar);
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
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
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
            TLRPC.User f10 = org.telegram.messenger.j10.i(i7).f();
            q10 = org.telegram.messenger.o10.q(f10);
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
        this.f49017f.l(q10, false);
        this.f49019r.j(c10, false);
        this.f49017f.setLeftDrawable(this.f49019r);
        this.f49020s.j(j10, false);
        this.f49017f.i(this.f49020s);
        if (this.f49015c) {
            long j11 = -j3;
            TLRPC.Chat O02 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(j11));
            TLRPC.ChatFull P0 = org.telegram.messenger.mp.u1(i7).P0(j11);
            if (P0 != null && P0.participants_count > 0) {
                if (org.telegram.messenger.v3.V(O02)) {
                    this.h.l(org.telegram.messenger.gd.H(',', "Subscribers", P0.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.gd.H(',', "Members", P0.participants_count), false);
                }
            } else if (O02 != null && O02.participants_count > 0) {
                if (org.telegram.messenger.v3.V(O02)) {
                    this.h.l(org.telegram.messenger.gd.H(',', "Subscribers", O02.participants_count), false);
                } else {
                    this.h.l(org.telegram.messenger.gd.H(',', "Members", O02.participants_count), false);
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
                    m5Var2.l(org.telegram.messenger.gd.N0(i11, null).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.m5 m5Var3 = this.h;
                    if (t02) {
                        i10 = 2131748445;
                    } else {
                        i10 = 2131748448;
                    }
                    m5Var3.l(org.telegram.messenger.gd.N0(i10, null).toLowerCase(), false);
                }
            }
        } else {
            this.h.l(org.telegram.messenger.gd.N0(2131747632, null), false);
        }
        setWillNotDraw(false);
    }

    public final void a(int i7) {
        int w02;
        int w03;
        org.telegram.messenger.bp bpVar;
        org.telegram.ui.ActionBar.h6 h6Var = this.f49013a;
        if (i7 >= 14) {
            org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(org.telegram.messenger.j10.f24798t0).f25795t4;
            if (cpVar != null) {
                bpVar = cpVar.d(i7);
            } else {
                bpVar = null;
            }
            if (bpVar != null) {
                int f10 = bpVar.f();
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29600p8[org.telegram.ui.Components.b9.f(f10)], h6Var);
                w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29620q8[org.telegram.ui.Components.b9.f(f10)], h6Var);
            } else {
                long j3 = i7;
                w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29600p8[org.telegram.ui.Components.b9.e(j3)], h6Var);
                w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29620q8[org.telegram.ui.Components.b9.e(j3)], h6Var);
            }
        } else {
            long j10 = i7;
            w02 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29600p8[org.telegram.ui.Components.b9.e(j10)], h6Var);
            w03 = org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29620q8[org.telegram.ui.Components.b9.e(j10)], h6Var);
        }
        this.f49016e.i(w02, w03);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29658s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29560n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29629qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.m6.f29453h8));
    }

    public void b(int i7, boolean z10) {
        org.telegram.messenger.bp d;
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(this.f49014b).f25803u4;
        if (cpVar == null) {
            d = null;
        } else {
            d = cpVar.d(i7);
        }
        c(d, z10);
    }

    public final void c(org.telegram.messenger.bp bpVar, boolean z10) {
        boolean q10;
        this.E = bpVar;
        org.telegram.ui.ActionBar.h6 h6Var = this.f49013a;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        pk pkVar = this.f49017f;
        org.telegram.ui.Components.n5 n5Var = this.f49019r;
        org.telegram.ui.Components.n5 n5Var2 = this.f49020s;
        org.telegram.ui.ActionBar.m5 m5Var = this.h;
        org.telegram.ui.Components.n5 n5Var3 = this.f49021w;
        if (bpVar != null) {
            int i7 = bpVar.f23139a;
            if (i7 != 0) {
                n5Var3.k(Integer.valueOf(i7));
            } else {
                n5Var3.k(Integer.valueOf(lm0.B0(bpVar.c(q10))));
            }
            n5Var2.k(Integer.valueOf(i0.a.f(0.25f, bpVar.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
            n5Var.k(Integer.valueOf(i0.a.f(0.25f, bpVar.m(org.telegram.ui.ActionBar.m6.I.q()), -1)));
            int f10 = i0.a.f(0.5f, bpVar.m(q10), bpVar.n(q10));
            int i10 = org.telegram.ui.ActionBar.m6.f29658s8;
            if (!org.telegram.ui.ActionBar.m6.e1(org.telegram.ui.ActionBar.m6.w0(i10, h6Var))) {
                m5Var.setTextColor(f10);
            } else {
                m5Var.setTextColor(org.telegram.ui.ActionBar.m6.D(q10, org.telegram.ui.ActionBar.m6.w0(i10, h6Var), f10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29453h8, h6Var), f10));
            }
            pkVar.setTextColor(-1);
        } else {
            int i11 = org.telegram.ui.ActionBar.m6.f29658s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)) > 0.8f) {
                n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29560n6, h6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i11, h6Var)) < 0.2f) {
                n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var))));
            } else {
                n5Var3.k(Integer.valueOf(lm0.B0(org.telegram.ui.ActionBar.m6.w0(i11, h6Var))));
            }
            int i12 = org.telegram.ui.ActionBar.m6.f29629qi;
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)));
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)));
            m5Var.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.B8, h6Var));
            pkVar.setTextColor(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var));
        }
        this.F = 0;
        this.f49022x.c(bpVar, z10);
        invalidate();
    }

    public final void d(long j3, boolean z10, boolean z11) {
        boolean q10;
        org.telegram.messenger.bp bpVar;
        int i7;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.n5 n5Var = this.f49021w;
        if (i10 == 0) {
            n5Var.g(null, z11);
        } else {
            n5Var.j(j3, z11);
        }
        org.telegram.ui.ActionBar.h6 h6Var = this.f49013a;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        org.telegram.messenger.bp bpVar2 = this.E;
        if (bpVar2 != null) {
            int i11 = bpVar2.f23139a;
            if (i11 != 0) {
                n5Var.k(Integer.valueOf(i11));
            } else {
                n5Var.k(Integer.valueOf(lm0.B0(bpVar2.c(q10))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.m6.f29658s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) > 0.8f) {
                n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29560n6, h6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) < 0.2f) {
                n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.A8, false))));
            } else {
                n5Var.k(Integer.valueOf(lm0.B0(org.telegram.ui.ActionBar.m6.x0(null, i12, false))));
            }
        }
        org.telegram.messenger.bp bpVar3 = this.E;
        org.telegram.ui.Components.n5 n5Var2 = this.f49020s;
        if (bpVar3 != null) {
            int e10 = bpVar3.e(1, h6Var);
            if (this.E.o(q10)) {
                bpVar = this.E;
                i7 = 4;
            } else {
                bpVar = this.E;
                i7 = 2;
            }
            n5Var2.k(Integer.valueOf(i0.a.f(0.5f, e10, bpVar.e(i7, h6Var))));
        } else {
            n5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29629qi, h6Var)));
        }
        this.F = 1;
        if (!z11) {
            this.f49023y.a(z10);
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
        di.v0.c(canvas, this.f49021w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f49018n) {
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
        if (this.f49018n) {
            f11 = 22.0f;
        } else {
            f11 = 58.0f;
        }
        float L2 = org.telegram.messenger.g0.L(f11);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, L2, L2, this.f49022x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j3, boolean z10, boolean z11) {
        boolean q10;
        int j10;
        int[] iArr;
        org.telegram.ui.Components.n5 n5Var = this.f49020s;
        n5Var.j(j3, z11);
        n5Var.m(z10, z11);
        org.telegram.ui.ActionBar.h6 h6Var = this.f49013a;
        if (h6Var != null) {
            q10 = h6Var.d();
        } else {
            q10 = org.telegram.ui.ActionBar.m6.I.q();
        }
        org.telegram.messenger.bp bpVar = this.E;
        if (bpVar != null) {
            int h = bpVar.h(q10);
            if (this.E.o(q10)) {
                org.telegram.messenger.bp bpVar2 = this.E;
                if (q10) {
                    iArr = bpVar2.h;
                } else {
                    iArr = bpVar2.f23144g;
                }
                j10 = iArr[4];
            } else {
                j10 = this.E.j(q10);
            }
            n5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j10)));
        } else {
            n5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29629qi, h6Var)));
        }
        this.F = 2;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49021w.a();
        this.d.P();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f49021w.b();
        this.d.R();
    }

    public void setForum(boolean z10) {
        if (this.f49018n != z10) {
            invalidate();
        }
        this.f49018n = z10;
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
        org.telegram.ui.Components.n5 n5Var3 = this.f49021w;
        if (n5Var3 != null && (n5Var = this.f49020s) != null && (n5Var2 = this.f49019r) != null && (pkVar = this.f49017f) != null && (m5Var = this.h) != null) {
            org.telegram.ui.ActionBar.h6 h6Var = this.f49013a;
            try {
                if (h6Var != null) {
                    q10 = h6Var.d();
                } else {
                    q10 = org.telegram.ui.ActionBar.m6.I.q();
                }
                org.telegram.messenger.bp bpVar = this.E;
                if (bpVar != null) {
                    int i7 = bpVar.f23139a;
                    if (i7 != 0) {
                        n5Var3.k(Integer.valueOf(i7));
                    } else {
                        n5Var3.k(Integer.valueOf(lm0.B0(bpVar.c(q10))));
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
                            org.telegram.messenger.bp bpVar2 = this.E;
                            if (q10) {
                                iArr = bpVar2.h;
                            } else {
                                iArr = bpVar2.f23144g;
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
                    int i11 = org.telegram.ui.ActionBar.m6.f29658s8;
                    if (!org.telegram.ui.ActionBar.m6.e1(org.telegram.ui.ActionBar.m6.w0(i11, h6Var))) {
                        m5Var.setTextColor(f10);
                    } else {
                        m5Var.setTextColor(org.telegram.ui.ActionBar.m6.D(q10, org.telegram.ui.ActionBar.m6.w0(i11, h6Var), f10, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29453h8, h6Var), f10));
                    }
                    pkVar.setTextColor(-1);
                } else {
                    int i12 = org.telegram.ui.ActionBar.m6.f29658s8;
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) > 0.8f) {
                        n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29560n6, h6Var)));
                    } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.m6.w0(i12, h6Var)) < 0.2f) {
                        n5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.m6.r1(0.5f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.A8, h6Var))));
                    } else {
                        n5Var3.k(Integer.valueOf(lm0.B0(org.telegram.ui.ActionBar.m6.w0(i12, h6Var))));
                    }
                    int i13 = org.telegram.ui.ActionBar.m6.f29629qi;
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
