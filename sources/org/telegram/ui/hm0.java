package org.telegram.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.widget.FrameLayout;
import java.util.HashSet;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public class hm0 extends FrameLayout implements org.telegram.ui.ActionBar.c6 {
    public org.telegram.messenger.bp E;
    public int F;
    public final RectF G;
    public final org.telegram.ui.ActionBar.i6 f48577a;
    public final int f48578b;
    public final boolean f48579c;
    public final ImageReceiver d;
    public final org.telegram.ui.Components.a9 f48580e;
    public final pk f48581f;
    public final org.telegram.ui.ActionBar.n5 h;
    public boolean f48582n;
    public final org.telegram.ui.Components.m5 f48583r;
    public final org.telegram.ui.Components.m5 f48584s;
    public final org.telegram.ui.Components.m5 f48585w;
    public final fi.g7 f48586x;
    public final org.telegram.ui.Components.c6 f48587y;

    public hm0(int i7, long j3, Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context);
        boolean z10;
        CharSequence q10;
        long c10;
        int i10;
        int i11;
        ImageReceiver imageReceiver = new ImageReceiver(this);
        this.d = imageReceiver;
        org.telegram.ui.Components.a9 a9Var = new org.telegram.ui.Components.a9((org.telegram.ui.ActionBar.i6) null);
        this.f48580e = a9Var;
        this.f48585w = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(20.0f), 13, this, false);
        this.f48586x = new fi.g7(this);
        this.f48587y = new org.telegram.ui.Components.c6(this, 320L, org.telegram.ui.Components.kr.h);
        this.G = new RectF();
        this.f48578b = i7;
        this.f48577a = i6Var;
        long j10 = 0;
        if (j3 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f48579c = z10;
        pk pkVar = new pk(2, context, this);
        this.f48581f = pkVar;
        this.f48583r = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(17.0f), pkVar);
        this.f48584s = new org.telegram.ui.Components.m5(org.telegram.messenger.g0.L(24.0f), pkVar);
        pkVar.setLeftDrawableOutside(true);
        pkVar.setRightDrawableOutside(true);
        pkVar.setTextColor(-1);
        pkVar.setTextSize(20);
        pkVar.setTypeface(org.telegram.messenger.g0.o());
        pkVar.setWidthWrapContent(true);
        addView(pkVar, c8.na.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.33f));
        org.telegram.ui.ActionBar.n5 n5Var = new org.telegram.ui.ActionBar.n5(context);
        this.h = n5Var;
        n5Var.setTextSize(14);
        n5Var.setTextColor(-2130706433);
        n5Var.setGravity(1);
        addView(n5Var, c8.na.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 20.66f));
        imageReceiver.K0(org.telegram.messenger.g0.L(96.0f));
        if (z10) {
            TLRPC.Chat O0 = org.telegram.messenger.mp.u1(i7).O0(Long.valueOf(-j3));
            if (O0 == null) {
                q10 = "";
            } else {
                q10 = O0.title;
            }
            a9Var.q(O0);
            imageReceiver.j0(O0, a9Var, null);
            c10 = org.telegram.messenger.n5.c(O0);
            if (O0 != null) {
                j10 = org.telegram.messenger.n5.f(O0.emoji_status);
            }
        } else {
            TLRPC.User f10 = org.telegram.messenger.i10.i(i7).f();
            q10 = org.telegram.messenger.n10.q(f10);
            a9Var.r(f10);
            imageReceiver.j0(f10, a9Var, null);
            c10 = org.telegram.messenger.n5.c(f10);
            if (f10 != null) {
                j10 = org.telegram.messenger.n5.f(f10.emoji_status);
            }
        }
        try {
            q10 = org.telegram.messenger.j6.m(q10, null, false, null, 0);
        } catch (Exception unused) {
        }
        this.f48581f.l(q10, false);
        this.f48583r.j(c10, false);
        this.f48581f.setLeftDrawable(this.f48583r);
        this.f48584s.j(j10, false);
        this.f48581f.i(this.f48584s);
        if (this.f48579c) {
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
                    org.telegram.ui.ActionBar.n5 n5Var2 = this.h;
                    if (t02) {
                        i11 = 2131752306;
                    } else {
                        i11 = 2131752317;
                    }
                    n5Var2.l(org.telegram.messenger.gd.N0(i11, null).toLowerCase(), false);
                } else {
                    org.telegram.ui.ActionBar.n5 n5Var3 = this.h;
                    if (t02) {
                        i10 = 2131748445;
                    } else {
                        i10 = 2131748448;
                    }
                    n5Var3.l(org.telegram.messenger.gd.N0(i10, null).toLowerCase(), false);
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
        org.telegram.ui.ActionBar.i6 i6Var = this.f48577a;
        if (i7 >= 14) {
            org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(org.telegram.messenger.i10.f24637t0).f25862t4;
            if (cpVar != null) {
                bpVar = cpVar.d(i7);
            } else {
                bpVar = null;
            }
            if (bpVar != null) {
                int f10 = bpVar.f();
                w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29673p8[org.telegram.ui.Components.a9.f(f10)], i6Var);
                w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29693q8[org.telegram.ui.Components.a9.f(f10)], i6Var);
            } else {
                long j3 = i7;
                w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29673p8[org.telegram.ui.Components.a9.e(j3)], i6Var);
                w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29693q8[org.telegram.ui.Components.a9.e(j3)], i6Var);
            }
        } else {
            long j10 = i7;
            w02 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29673p8[org.telegram.ui.Components.a9.e(j10)], i6Var);
            w03 = org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29693q8[org.telegram.ui.Components.a9.e(j10)], i6Var);
        }
        this.f48580e.i(w02, w03);
        invalidate();
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29731s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29633n6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29702qi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.n6.f29526h8));
    }

    public void b(int i7, boolean z10) {
        org.telegram.messenger.bp d;
        org.telegram.messenger.cp cpVar = org.telegram.messenger.mp.u1(this.f48578b).f25870u4;
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
        org.telegram.ui.ActionBar.i6 i6Var = this.f48577a;
        if (i6Var != null) {
            q10 = i6Var.b();
        } else {
            q10 = org.telegram.ui.ActionBar.n6.I.q();
        }
        pk pkVar = this.f48581f;
        org.telegram.ui.Components.m5 m5Var = this.f48583r;
        org.telegram.ui.Components.m5 m5Var2 = this.f48584s;
        org.telegram.ui.ActionBar.n5 n5Var = this.h;
        org.telegram.ui.Components.m5 m5Var3 = this.f48585w;
        if (bpVar != null) {
            int i7 = bpVar.f23236a;
            if (i7 != 0) {
                m5Var3.k(Integer.valueOf(i7));
            } else {
                m5Var3.k(Integer.valueOf(jm0.B0(bpVar.c(q10))));
            }
            m5Var2.k(Integer.valueOf(i0.a.f(0.25f, bpVar.m(org.telegram.ui.ActionBar.n6.I.q()), -1)));
            m5Var.k(Integer.valueOf(i0.a.f(0.25f, bpVar.m(org.telegram.ui.ActionBar.n6.I.q()), -1)));
            int f10 = i0.a.f(0.5f, bpVar.m(q10), bpVar.n(q10));
            int i10 = org.telegram.ui.ActionBar.n6.f29731s8;
            if (!org.telegram.ui.ActionBar.n6.e1(org.telegram.ui.ActionBar.n6.w0(i10, i6Var))) {
                n5Var.setTextColor(f10);
            } else {
                n5Var.setTextColor(org.telegram.ui.ActionBar.n6.D(q10, org.telegram.ui.ActionBar.n6.w0(i10, i6Var), f10, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29526h8, i6Var), f10));
            }
            pkVar.setTextColor(-1);
        } else {
            int i11 = org.telegram.ui.ActionBar.n6.f29731s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i11, i6Var)) > 0.8f) {
                m5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29633n6, i6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i11, i6Var)) < 0.2f) {
                m5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A8, i6Var))));
            } else {
                m5Var3.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.n6.w0(i11, i6Var))));
            }
            int i12 = org.telegram.ui.ActionBar.n6.f29702qi;
            m5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i12, i6Var)));
            m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i12, i6Var)));
            n5Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B8, i6Var));
            pkVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A8, i6Var));
        }
        this.F = 0;
        this.f48586x.c(bpVar, z10);
        invalidate();
    }

    public final void d(long j3, boolean z10, boolean z11) {
        boolean q10;
        org.telegram.messenger.bp bpVar;
        int i7;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        org.telegram.ui.Components.m5 m5Var = this.f48585w;
        if (i10 == 0) {
            m5Var.g(null, z11);
        } else {
            m5Var.j(j3, z11);
        }
        org.telegram.ui.ActionBar.i6 i6Var = this.f48577a;
        if (i6Var != null) {
            q10 = i6Var.b();
        } else {
            q10 = org.telegram.ui.ActionBar.n6.I.q();
        }
        org.telegram.messenger.bp bpVar2 = this.E;
        if (bpVar2 != null) {
            int i11 = bpVar2.f23236a;
            if (i11 != 0) {
                m5Var.k(Integer.valueOf(i11));
            } else {
                m5Var.k(Integer.valueOf(jm0.B0(bpVar2.c(q10))));
            }
        } else {
            int i12 = org.telegram.ui.ActionBar.n6.f29731s8;
            if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i12, i6Var)) > 0.8f) {
                m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29633n6, i6Var)));
            } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i12, i6Var)) < 0.2f) {
                m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.A8, false))));
            } else {
                m5Var.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.n6.x0(null, i12, false))));
            }
        }
        org.telegram.messenger.bp bpVar3 = this.E;
        org.telegram.ui.Components.m5 m5Var2 = this.f48584s;
        if (bpVar3 != null) {
            int e10 = bpVar3.e(1, i6Var);
            if (this.E.o(q10)) {
                bpVar = this.E;
                i7 = 4;
            } else {
                bpVar = this.E;
                i7 = 2;
            }
            m5Var2.k(Integer.valueOf(i0.a.f(0.5f, e10, bpVar.e(i7, i6Var))));
        } else {
            m5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29702qi, i6Var)));
        }
        this.F = 1;
        if (!z11) {
            this.f48587y.a(z10);
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
        di.v0.c(canvas, this.f48585w, getWidth(), getHeight(), 1.0f, rectF, 1.0f);
        if (this.f48582n) {
            f10 = 18.0f;
        } else {
            f10 = 54.0f;
        }
        int L = org.telegram.messenger.g0.L(f10);
        ImageReceiver imageReceiver = this.d;
        imageReceiver.K0(L);
        imageReceiver.B0(rectF);
        imageReceiver.h(canvas, null);
        float width2 = (rectF.width() / 2.0f) + org.telegram.messenger.g0.L(4.0f);
        if (this.f48582n) {
            f11 = 22.0f;
        } else {
            f11 = 58.0f;
        }
        float L2 = org.telegram.messenger.g0.L(f11);
        canvas.drawRoundRect(rectF.centerX() - width2, rectF.centerY() - width2, rectF.centerX() + width2, rectF.centerY() + width2, L2, L2, this.f48586x.a(rectF));
        super.dispatchDraw(canvas);
    }

    public final void e(long j3, boolean z10, boolean z11) {
        boolean q10;
        int j10;
        int[] iArr;
        org.telegram.ui.Components.m5 m5Var = this.f48584s;
        m5Var.j(j3, z11);
        m5Var.m(z10, z11);
        org.telegram.ui.ActionBar.i6 i6Var = this.f48577a;
        if (i6Var != null) {
            q10 = i6Var.b();
        } else {
            q10 = org.telegram.ui.ActionBar.n6.I.q();
        }
        org.telegram.messenger.bp bpVar = this.E;
        if (bpVar != null) {
            int h = bpVar.h(q10);
            if (this.E.o(q10)) {
                org.telegram.messenger.bp bpVar2 = this.E;
                if (q10) {
                    iArr = bpVar2.h;
                } else {
                    iArr = bpVar2.f23241g;
                }
                j10 = iArr[4];
            } else {
                j10 = this.E.j(q10);
            }
            m5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j10)));
        } else {
            m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29702qi, i6Var)));
        }
        this.F = 2;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f48585w.a();
        this.d.Q();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f48585w.b();
        this.d.S();
    }

    public void setForum(boolean z10) {
        if (this.f48582n != z10) {
            invalidate();
        }
        this.f48582n = z10;
    }

    @Override
    public final void updateColors() {
        org.telegram.ui.Components.m5 m5Var;
        org.telegram.ui.Components.m5 m5Var2;
        pk pkVar;
        org.telegram.ui.ActionBar.n5 n5Var;
        boolean q10;
        int j3;
        int[] iArr;
        int e10;
        org.telegram.ui.Components.m5 m5Var3 = this.f48585w;
        if (m5Var3 != null && (m5Var = this.f48584s) != null && (m5Var2 = this.f48583r) != null && (pkVar = this.f48581f) != null && (n5Var = this.h) != null) {
            org.telegram.ui.ActionBar.i6 i6Var = this.f48577a;
            try {
                if (i6Var != null) {
                    q10 = i6Var.b();
                } else {
                    q10 = org.telegram.ui.ActionBar.n6.I.q();
                }
                org.telegram.messenger.bp bpVar = this.E;
                if (bpVar != null) {
                    int i7 = bpVar.f23236a;
                    if (i7 != 0) {
                        m5Var3.k(Integer.valueOf(i7));
                    } else {
                        m5Var3.k(Integer.valueOf(jm0.B0(bpVar.c(q10))));
                    }
                    m5Var2.k(Integer.valueOf(i0.a.f(0.25f, this.E.m(org.telegram.ui.ActionBar.n6.I.q()), -1)));
                    int i10 = this.F;
                    if (i10 == 1) {
                        int e11 = this.E.e(1, i6Var);
                        if (this.E.o(q10)) {
                            e10 = this.E.e(4, i6Var);
                        } else {
                            e10 = this.E.e(2, i6Var);
                        }
                        m5Var.k(Integer.valueOf(i0.a.f(0.5f, e11, e10)));
                    } else if (i10 == 2) {
                        int h = this.E.h(q10);
                        if (this.E.o(q10)) {
                            org.telegram.messenger.bp bpVar2 = this.E;
                            if (q10) {
                                iArr = bpVar2.h;
                            } else {
                                iArr = bpVar2.f23241g;
                            }
                            j3 = iArr[4];
                        } else {
                            j3 = this.E.j(q10);
                        }
                        m5Var.k(Integer.valueOf(i0.a.f(0.5f, h, j3)));
                    } else {
                        m5Var.k(Integer.valueOf(i0.a.f(0.25f, this.E.m(org.telegram.ui.ActionBar.n6.I.q()), -1)));
                    }
                    int f10 = i0.a.f(0.5f, this.E.m(q10), this.E.n(q10));
                    int i11 = org.telegram.ui.ActionBar.n6.f29731s8;
                    if (!org.telegram.ui.ActionBar.n6.e1(org.telegram.ui.ActionBar.n6.w0(i11, i6Var))) {
                        n5Var.setTextColor(f10);
                    } else {
                        n5Var.setTextColor(org.telegram.ui.ActionBar.n6.D(q10, org.telegram.ui.ActionBar.n6.w0(i11, i6Var), f10, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29526h8, i6Var), f10));
                    }
                    pkVar.setTextColor(-1);
                } else {
                    int i12 = org.telegram.ui.ActionBar.n6.f29731s8;
                    if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i12, i6Var)) > 0.8f) {
                        m5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29633n6, i6Var)));
                    } else if (org.telegram.messenger.g0.B(org.telegram.ui.ActionBar.n6.w0(i12, i6Var)) < 0.2f) {
                        m5Var3.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.r1(0.5f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A8, i6Var))));
                    } else {
                        m5Var3.k(Integer.valueOf(jm0.B0(org.telegram.ui.ActionBar.n6.w0(i12, i6Var))));
                    }
                    int i13 = org.telegram.ui.ActionBar.n6.f29702qi;
                    m5Var.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i13, i6Var)));
                    m5Var2.k(Integer.valueOf(org.telegram.ui.ActionBar.n6.w0(i13, i6Var)));
                    n5Var.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.B8, i6Var));
                    pkVar.setTextColor(org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.A8, i6Var));
                }
                invalidate();
            } catch (Exception e12) {
                org.telegram.messenger.a8.g(e12, true);
            }
        }
    }
}
