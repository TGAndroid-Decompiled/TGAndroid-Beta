package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class xq0 implements vk0 {
    public final zs0 f40468a;

    public xq0(zs0 zs0Var) {
        this.f40468a = zs0Var;
    }

    @Override
    public final void F0(float f10) {
        ur0 ur0Var;
        int i7;
        int i10;
        ur0 ur0Var2;
        zs0 zs0Var = this.f40468a;
        org.telegram.ui.ActionBar.r0 r0Var = zs0Var.f41103p0;
        ur0[] ur0VarArr = zs0Var.m0;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i11 != 0 || ur0VarArr[1].getVisibility() == 0) {
            if (zs0Var.f41088j1) {
                ur0VarArr[0].setTranslationX((-f10) * ur0Var2.getMeasuredWidth());
                ur0VarArr[1].setTranslationX(ur0VarArr[0].getMeasuredWidth() - (ur0VarArr[0].getMeasuredWidth() * f10));
            } else {
                ur0VarArr[0].setTranslationX(ur0Var.getMeasuredWidth() * f10);
                ur0VarArr[1].setTranslationX((ur0VarArr[0].getMeasuredWidth() * f10) - ur0VarArr[0].getMeasuredWidth());
            }
            zs0Var.Z0(zs0Var.getTabProgress());
            float k02 = zs0Var.k0(f10);
            zs0Var.f41110r0 = k02;
            ImageView imageView = zs0Var.f41116t0;
            int i12 = 4;
            if (k02 != 0.0f && zs0Var.I() && !zs0Var.A0()) {
                i7 = 0;
            } else {
                i7 = 4;
            }
            imageView.setVisibility(i7);
            if (r0Var != null && !zs0Var.I()) {
                if (zs0Var.I0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                zs0Var.setSearchItemVisibility(i10);
                zs0Var.f41106q0 = 0.0f;
            } else {
                zs0Var.f41106q0 = zs0Var.l0(f10);
                zs0Var.N1();
            }
            zs0Var.I1(false);
            if (i11 == 0) {
                ur0 ur0Var3 = ur0VarArr[0];
                ur0VarArr[0] = ur0VarArr[1];
                ur0VarArr[1] = ur0Var3;
                ur0Var3.setVisibility(8);
                if (r0Var != null && zs0Var.f41131z0 == 2) {
                    if (zs0Var.I0()) {
                        i12 = 8;
                    }
                    zs0Var.setSearchItemVisibility(i12);
                }
                zs0Var.f41131z0 = 0;
                zs0Var.u1();
            }
        }
    }

    @Override
    public final void b(int i7, boolean z9) {
        zs0 zs0Var = this.f40468a;
        ur0[] ur0VarArr = zs0Var.m0;
        if (ur0VarArr[0].E == i7) {
            return;
        }
        zp0 zp0Var = zs0Var.f41061b0;
        if (zp0Var != null && i7 == 8) {
            zp0Var.f48546b.f(1.0f, 0);
        }
        ur0 ur0Var = ur0VarArr[1];
        ur0Var.E = i7;
        ur0Var.setVisibility(0);
        zs0Var.w0();
        zs0Var.B1(true);
        zs0Var.f41088j1 = z9;
        zs0Var.Y0();
        zs0Var.E(!zs0Var.F0(i7));
        zs0Var.I1(true);
    }

    @Override
    public final void c() {
        int a10;
        int L0;
        zs0 zs0Var = this.f40468a;
        ur0[] ur0VarArr = zs0Var.m0;
        int i7 = ur0VarArr[0].E;
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
        ur0 ur0Var = ur0VarArr[0];
        if (ur0Var.E == 0) {
            L0 = (ur0Var.f38796x.L0() / zs0Var.f41101o1[0]) * a10;
        } else {
            L0 = ur0Var.f38796x.L0() * a10;
        }
        if (L0 >= ur0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            si0 si0Var = ur0VarArr[0].D;
            si0Var.f38080b = 1;
            si0Var.d(0, 0, false, false);
            return;
        }
        ur0VarArr[0].h.y0(0);
    }

    @Override
    public final boolean m1(int i7, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        zs0 zs0Var = this.f40468a;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.f41127x1;
        if (f2Var != null) {
            boolean C0 = zs0Var.C0();
            if (zs0.o0(i7, C0) != null) {
                if (C0) {
                    if (org.telegram.messenger.t3.w(5, f2Var.getMessagesController().M0(Long.valueOf(zs0Var.f41076f1.f26957id)))) {
                        profileTab = zs0Var.f41076f1.main_tab;
                        if (profileTab != null || (i7 != zs0.p0(profileTab) && zs0Var.U1 != i7)) {
                            l60 H = l60.H(f2Var, view);
                            H.W(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false)));
                            H.c(2131232773, org.telegram.messenger.id.M0(2131746622, null), new bi.c9(this, C0, i7, 6), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (zs0Var.l1 == f2Var.getUserConfig().e() && (userFull = zs0Var.f41079g1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    l60 H2 = l60.H(f2Var, view);
                    H2.W(org.telegram.ui.ActionBar.l6.d0(org.telegram.messenger.g0.L(24.0f), org.telegram.ui.ActionBar.l6.x0(null, org.telegram.ui.ActionBar.l6.f27865d6, false)));
                    H2.c(2131232773, org.telegram.messenger.id.M0(2131746622, null), new bi.c9(this, C0, i7, 6), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }
}
