package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class gr0 implements jl0 {
    public final it0 f35522a;

    public gr0(it0 it0Var) {
        this.f35522a = it0Var;
    }

    @Override
    public final boolean Y0(int i7, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        it0 it0Var = this.f35522a;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
        if (g2Var != null) {
            boolean C0 = it0Var.C0();
            if (it0.o0(i7, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.v3.w(5, g2Var.getMessagesController().O0(Long.valueOf(it0Var.f36114g1.f28493id)))) {
                        profileTab = it0Var.f36114g1.main_tab;
                        if (profileTab != null || (i7 != it0.p0(profileTab) && it0Var.V1 != i7)) {
                            x60 I = x60.I(g2Var, view);
                            I.X(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false)));
                            I.c(2131232778, org.telegram.messenger.gd.N0(2131746426, null), new di.x7(this, C0, i7, 6), false);
                            I.a0();
                            return true;
                        }
                    }
                } else if (it0Var.f36130m1 == g2Var.getUserConfig().e() && (userFull = it0Var.f36117h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    x60 I2 = x60.I(g2Var, view);
                    I2.X(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.n6.x0(null, org.telegram.ui.ActionBar.n6.f29451d6, false)));
                    I2.c(2131232778, org.telegram.messenger.gd.N0(2131746426, null), new di.x7(this, C0, i7, 6), false);
                    I2.a0();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void a(int i7, boolean z10) {
        it0 it0Var = this.f35522a;
        ds0[] ds0VarArr = it0Var.f36133n0;
        if (ds0VarArr[0].F == i7) {
            return;
        }
        iq0 iq0Var = it0Var.f36100c0;
        if (iq0Var != null && i7 == 8) {
            iq0Var.f49870b.g(1.0f, 0);
        }
        ds0 ds0Var = ds0VarArr[1];
        ds0Var.F = i7;
        ds0Var.setVisibility(0);
        it0Var.w0();
        it0Var.B1(true);
        it0Var.f36126k1 = z10;
        it0Var.Y0();
        it0Var.E(!it0Var.F0(i7));
        it0Var.I1(true);
    }

    @Override
    public final void c(float f10) {
        ds0 ds0Var;
        int i7;
        int i10;
        ds0 ds0Var2;
        it0 it0Var = this.f35522a;
        org.telegram.ui.ActionBar.q0 q0Var = it0Var.f36141q0;
        ds0[] ds0VarArr = it0Var.f36133n0;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i11 != 0 || ds0VarArr[1].getVisibility() == 0) {
            if (it0Var.f36126k1) {
                ds0VarArr[0].setTranslationX((-f10) * ds0Var2.getMeasuredWidth());
                ds0VarArr[1].setTranslationX(ds0VarArr[0].getMeasuredWidth() - (ds0VarArr[0].getMeasuredWidth() * f10));
            } else {
                ds0VarArr[0].setTranslationX(ds0Var.getMeasuredWidth() * f10);
                ds0VarArr[1].setTranslationX((ds0VarArr[0].getMeasuredWidth() * f10) - ds0VarArr[0].getMeasuredWidth());
            }
            it0Var.Z0(it0Var.getTabProgress());
            float k02 = it0Var.k0(f10);
            it0Var.f36149s0 = k02;
            ImageView imageView = it0Var.f36154u0;
            int i12 = 4;
            if (k02 != 0.0f && it0Var.I() && !it0Var.A0()) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            imageView.setVisibility(i7);
            if (q0Var != null && !it0Var.I()) {
                if (it0Var.I0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                it0Var.setSearchItemVisibility(i10);
                it0Var.f36145r0 = 0.0f;
            } else {
                it0Var.f36145r0 = it0Var.l0(f10);
                it0Var.N1();
            }
            it0Var.I1(false);
            if (i11 == 0) {
                ds0 ds0Var3 = ds0VarArr[0];
                ds0VarArr[0] = ds0VarArr[1];
                ds0VarArr[1] = ds0Var3;
                ds0Var3.setVisibility(8);
                if (q0Var != null && it0Var.A0 == 2) {
                    if (it0Var.I0()) {
                        i12 = 8;
                    }
                    it0Var.setSearchItemVisibility(i12);
                }
                it0Var.A0 = 0;
                it0Var.u1();
            }
        }
    }

    @Override
    public final void y() {
        int a10;
        int L0;
        it0 it0Var = this.f35522a;
        ds0[] ds0VarArr = it0Var.f36133n0;
        int i7 = ds0VarArr[0].F;
        if (i7 != 0) {
            if (i7 != 1 && i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        if (i7 != 5) {
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
            a10 = org.telegram.ui.Cells.p7.a(1);
        }
        ds0 ds0Var = ds0VarArr[0];
        if (ds0Var.F == 0) {
            L0 = (ds0Var.f34450x.L0() / it0Var.f36139p1[0]) * a10;
        } else {
            L0 = ds0Var.f34450x.L0() * a10;
        }
        if (L0 >= ds0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            org.telegram.ui.ActionBar.l5 l5Var = ds0VarArr[0].E;
            l5Var.f29284b = 1;
            l5Var.k(0, 0, false, false);
            return;
        }
        ds0VarArr[0].h.y0(0);
    }
}
