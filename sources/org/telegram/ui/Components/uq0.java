package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class uq0 implements yk0 {
    public final ws0 f38849a;

    public uq0(ws0 ws0Var) {
        this.f38849a = ws0Var;
    }

    @Override
    public final void A() {
        int a10;
        int L0;
        ws0 ws0Var = this.f38849a;
        rr0[] rr0VarArr = ws0Var.f40108n0;
        int i3 = rr0VarArr[0].F;
        if (i3 != 0) {
            if (i3 != 1 && i3 != 2) {
                if (i3 != 3) {
                    if (i3 != 4) {
                        if (i3 != 5) {
                            a10 = org.telegram.messenger.g0.L(58.0f);
                        } else {
                            a10 = org.telegram.messenger.g0.L(60.0f);
                        }
                    }
                } else {
                    a10 = org.telegram.messenger.g0.L(100.0f);
                }
            }
            a10 = org.telegram.messenger.g0.L(56.0f);
        } else {
            a10 = org.telegram.ui.Cells.o7.a(1);
        }
        rr0 rr0Var = rr0VarArr[0];
        if (rr0Var.F == 0) {
            L0 = (rr0Var.f37791x.L0() / ws0Var.f40115p1[0]) * a10;
        } else {
            L0 = rr0Var.f37791x.L0() * a10;
        }
        if (L0 >= rr0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            vi0 vi0Var = rr0VarArr[0].E;
            vi0Var.f39126b = 1;
            vi0Var.d(0, 0, false, false);
            return;
        }
        rr0VarArr[0].h.y0(0);
    }

    @Override
    public final void F0(float f10) {
        rr0 rr0Var;
        int i3;
        int i10;
        rr0 rr0Var2;
        ws0 ws0Var = this.f38849a;
        org.telegram.ui.ActionBar.q0 q0Var = ws0Var.f40117q0;
        rr0[] rr0VarArr = ws0Var.f40108n0;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i11 != 0 || rr0VarArr[1].getVisibility() == 0) {
            if (ws0Var.k1) {
                rr0VarArr[0].setTranslationX((-f10) * rr0Var2.getMeasuredWidth());
                rr0VarArr[1].setTranslationX(rr0VarArr[0].getMeasuredWidth() - (rr0VarArr[0].getMeasuredWidth() * f10));
            } else {
                rr0VarArr[0].setTranslationX(rr0Var.getMeasuredWidth() * f10);
                rr0VarArr[1].setTranslationX((rr0VarArr[0].getMeasuredWidth() * f10) - rr0VarArr[0].getMeasuredWidth());
            }
            ws0Var.X0(ws0Var.getTabProgress());
            float k02 = ws0Var.k0(f10);
            ws0Var.f40125s0 = k02;
            ImageView imageView = ws0Var.f40130u0;
            int i12 = 4;
            if (k02 != 0.0f && ws0Var.I() && !ws0Var.A0()) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            imageView.setVisibility(i3);
            if (q0Var != null && !ws0Var.I()) {
                if (ws0Var.H0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                ws0Var.setSearchItemVisibility(i10);
                ws0Var.f40121r0 = 0.0f;
            } else {
                ws0Var.f40121r0 = ws0Var.l0(f10);
                ws0Var.L1();
            }
            ws0Var.G1(false);
            if (i11 == 0) {
                rr0 rr0Var3 = rr0VarArr[0];
                rr0VarArr[0] = rr0VarArr[1];
                rr0VarArr[1] = rr0Var3;
                rr0Var3.setVisibility(8);
                if (q0Var != null && ws0Var.A0 == 2) {
                    if (ws0Var.H0()) {
                        i12 = 8;
                    }
                    ws0Var.setSearchItemVisibility(i12);
                }
                ws0Var.A0 = 0;
                ws0Var.s1();
            }
        }
    }

    @Override
    public final void f(int i3, boolean z10) {
        ws0 ws0Var = this.f38849a;
        rr0[] rr0VarArr = ws0Var.f40108n0;
        if (rr0VarArr[0].F == i3) {
            return;
        }
        yp0 yp0Var = ws0Var.f40076c0;
        if (yp0Var != null && i3 == 8) {
            yp0Var.f44467b.f(1.0f, 0);
        }
        rr0 rr0Var = rr0VarArr[1];
        rr0Var.F = i3;
        rr0Var.setVisibility(0);
        ws0Var.w0();
        ws0Var.z1(true);
        ws0Var.k1 = z10;
        ws0Var.W0();
        ws0Var.E(!ws0Var.E0(i3));
        ws0Var.G1(true);
    }

    @Override
    public final boolean k1(int i3, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        ws0 ws0Var = this.f38849a;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
        if (d2Var != null) {
            boolean C0 = ws0Var.C0();
            if (ws0.o0(i3, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.t3.w(5, d2Var.getMessagesController().M0(Long.valueOf(ws0Var.f40090g1.f27002id)))) {
                        profileTab = ws0Var.f40090g1.main_tab;
                        if (profileTab != null || (i3 != ws0.p0(profileTab) && ws0Var.V1 != i3)) {
                            f60 H = f60.H(d2Var, view);
                            H.W(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false)));
                            H.c(2131232771, org.telegram.messenger.bd.M0(2131746630, null), new ci.c8(this, C0, i3, 6), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (ws0Var.m1 == d2Var.getUserConfig().e() && (userFull = ws0Var.f40093h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    f60 H2 = f60.H(d2Var, view);
                    H2.W(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false)));
                    H2.c(2131232771, org.telegram.messenger.bd.M0(2131746630, null), new ci.c8(this, C0, i3, 6), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }
}
