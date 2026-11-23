package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class hr0 implements jl0 {
    public final jt0 f35957a;

    public hr0(jt0 jt0Var) {
        this.f35957a = jt0Var;
    }

    @Override
    public final void D() {
        int a10;
        int L0;
        jt0 jt0Var = this.f35957a;
        ds0[] ds0VarArr = jt0Var.f36650n0;
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
            a10 = org.telegram.ui.Cells.q7.a(1);
        }
        ds0 ds0Var = ds0VarArr[0];
        if (ds0Var.F == 0) {
            L0 = (ds0Var.f34565x.L0() / jt0Var.f36656p1[0]) * a10;
        } else {
            L0 = ds0Var.f34565x.L0() * a10;
        }
        if (L0 >= ds0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            org.telegram.ui.ActionBar.k5 k5Var = ds0VarArr[0].E;
            k5Var.f29186b = 1;
            k5Var.k(0, 0, false, false);
            return;
        }
        ds0VarArr[0].h.y0(0);
    }

    @Override
    public final void a(int i7, boolean z10) {
        jt0 jt0Var = this.f35957a;
        ds0[] ds0VarArr = jt0Var.f36650n0;
        if (ds0VarArr[0].F == i7) {
            return;
        }
        jq0 jq0Var = jt0Var.f36617c0;
        if (jq0Var != null && i7 == 8) {
            jq0Var.f50348b.g(1.0f, 0);
        }
        ds0 ds0Var = ds0VarArr[1];
        ds0Var.F = i7;
        ds0Var.setVisibility(0);
        jt0Var.w0();
        jt0Var.B1(true);
        jt0Var.f36643k1 = z10;
        jt0Var.Y0();
        jt0Var.E(!jt0Var.F0(i7));
        jt0Var.I1(true);
    }

    @Override
    public final void g(float f10) {
        ds0 ds0Var;
        int i7;
        int i10;
        ds0 ds0Var2;
        jt0 jt0Var = this.f35957a;
        org.telegram.ui.ActionBar.q0 q0Var = jt0Var.f36658q0;
        ds0[] ds0VarArr = jt0Var.f36650n0;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i11 != 0 || ds0VarArr[1].getVisibility() == 0) {
            if (jt0Var.f36643k1) {
                ds0VarArr[0].setTranslationX((-f10) * ds0Var2.getMeasuredWidth());
                ds0VarArr[1].setTranslationX(ds0VarArr[0].getMeasuredWidth() - (ds0VarArr[0].getMeasuredWidth() * f10));
            } else {
                ds0VarArr[0].setTranslationX(ds0Var.getMeasuredWidth() * f10);
                ds0VarArr[1].setTranslationX((ds0VarArr[0].getMeasuredWidth() * f10) - ds0VarArr[0].getMeasuredWidth());
            }
            jt0Var.Z0(jt0Var.getTabProgress());
            float k02 = jt0Var.k0(f10);
            jt0Var.f36666s0 = k02;
            ImageView imageView = jt0Var.f36671u0;
            int i12 = 4;
            if (k02 != 0.0f && jt0Var.I() && !jt0Var.A0()) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            imageView.setVisibility(i7);
            if (q0Var != null && !jt0Var.I()) {
                if (jt0Var.I0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                jt0Var.setSearchItemVisibility(i10);
                jt0Var.f36662r0 = 0.0f;
            } else {
                jt0Var.f36662r0 = jt0Var.l0(f10);
                jt0Var.N1();
            }
            jt0Var.I1(false);
            if (i11 == 0) {
                ds0 ds0Var3 = ds0VarArr[0];
                ds0VarArr[0] = ds0VarArr[1];
                ds0VarArr[1] = ds0Var3;
                ds0Var3.setVisibility(8);
                if (q0Var != null && jt0Var.A0 == 2) {
                    if (jt0Var.I0()) {
                        i12 = 8;
                    }
                    jt0Var.setSearchItemVisibility(i12);
                }
                jt0Var.A0 = 0;
                jt0Var.u1();
            }
        }
    }

    @Override
    public final boolean h1(int i7, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        jt0 jt0Var = this.f35957a;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36683y1;
        if (g2Var != null) {
            boolean C0 = jt0Var.C0();
            if (jt0.o0(i7, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.v3.w(5, g2Var.getMessagesController().O0(Long.valueOf(jt0Var.f36631g1.f28435id)))) {
                        profileTab = jt0Var.f36631g1.main_tab;
                        if (profileTab != null || (i7 != jt0.p0(profileTab) && jt0Var.V1 != i7)) {
                            a70 I = a70.I(g2Var, view);
                            I.X(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29381d6, false)));
                            I.c(2131232775, org.telegram.messenger.hd.N0(2131746426, null), new di.x7(this, C0, i7, 6), false);
                            I.a0();
                            return true;
                        }
                    }
                } else if (jt0Var.f36647m1 == g2Var.getUserConfig().e() && (userFull = jt0Var.f36634h1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    a70 I2 = a70.I(g2Var, view);
                    I2.X(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.m6.x0(null, org.telegram.ui.ActionBar.m6.f29381d6, false)));
                    I2.c(2131232775, org.telegram.messenger.hd.N0(2131746426, null), new di.x7(this, C0, i7, 6), false);
                    I2.a0();
                    return true;
                }
            }
        }
        return false;
    }
}
