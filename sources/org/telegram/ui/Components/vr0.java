package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class vr0 implements xl0 {
    public final zt0 f31835a;

    public vr0(zt0 zt0Var) {
        this.f31835a = zt0Var;
    }

    @Override
    public final void D() {
        int a2;
        int L0;
        zt0 zt0Var = this.f31835a;
        ss0[] ss0VarArr = zt0Var.m0;
        int i10 = ss0VarArr[0].E;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            a2 = org.telegram.messenger.i0.L(58.0f);
                        } else {
                            a2 = org.telegram.messenger.i0.L(60.0f);
                        }
                    }
                } else {
                    a2 = org.telegram.messenger.i0.L(100.0f);
                }
            }
            a2 = org.telegram.messenger.i0.L(56.0f);
        } else {
            a2 = org.telegram.ui.Cells.t7.a(1);
        }
        ss0 ss0Var = ss0VarArr[0];
        if (ss0Var.E == 0) {
            L0 = (ss0Var.f30356x.L0() / zt0Var.f33214o1[0]) * a2;
        } else {
            L0 = ss0Var.f30356x.L0() * a2;
        }
        if (L0 >= ss0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            vj0 vj0Var = ss0VarArr[0].D;
            vj0Var.f31273b = 1;
            vj0Var.d(0, 0, false, false);
            return;
        }
        ss0VarArr[0].h.y0(0);
    }

    @Override
    public final void E0(float f7) {
        ss0 ss0Var;
        int i10;
        int i11;
        ss0 ss0Var2;
        zt0 zt0Var = this.f31835a;
        org.telegram.ui.ActionBar.t0 t0Var = zt0Var.f33216p0;
        ss0[] ss0VarArr = zt0Var.m0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || ss0VarArr[1].getVisibility() == 0) {
            if (zt0Var.f33200j1) {
                ss0VarArr[0].setTranslationX((-f7) * ss0Var2.getMeasuredWidth());
                ss0VarArr[1].setTranslationX(ss0VarArr[0].getMeasuredWidth() - (ss0VarArr[0].getMeasuredWidth() * f7));
            } else {
                ss0VarArr[0].setTranslationX(ss0Var.getMeasuredWidth() * f7);
                ss0VarArr[1].setTranslationX((ss0VarArr[0].getMeasuredWidth() * f7) - ss0VarArr[0].getMeasuredWidth());
            }
            zt0Var.U0(zt0Var.getTabProgress());
            float i02 = zt0Var.i0(f7);
            zt0Var.f33223r0 = i02;
            ImageView imageView = zt0Var.f33229t0;
            int i13 = 4;
            if (i02 != 0.0f && zt0Var.H() && !zt0Var.y0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (t0Var != null && !zt0Var.H()) {
                if (zt0Var.E0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                zt0Var.setSearchItemVisibility(i11);
                zt0Var.f33219q0 = 0.0f;
            } else {
                zt0Var.f33219q0 = zt0Var.j0(f7);
                zt0Var.I1();
            }
            zt0Var.D1(false);
            if (i12 == 0) {
                ss0 ss0Var3 = ss0VarArr[0];
                ss0VarArr[0] = ss0VarArr[1];
                ss0VarArr[1] = ss0Var3;
                ss0Var3.setVisibility(8);
                if (t0Var != null && zt0Var.f33244z0 == 2) {
                    if (zt0Var.E0()) {
                        i13 = 8;
                    }
                    zt0Var.setSearchItemVisibility(i13);
                }
                zt0Var.f33244z0 = 0;
                zt0Var.p1();
            }
        }
    }

    @Override
    public final boolean G1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        zt0 zt0Var = this.f31835a;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
        if (k2Var != null) {
            boolean A0 = zt0Var.A0();
            if (zt0.m0(i10, A0) != null) {
                if (A0) {
                    if (org.telegram.messenger.w3.w(5, k2Var.getMessagesController().L0(Long.valueOf(zt0Var.f33188f1.f19794id)))) {
                        profileTab = zt0Var.f33188f1.main_tab;
                        if (profileTab != null || (i10 != zt0.n0(profileTab) && zt0Var.U1 != i10)) {
                            z60 H = z60.H(k2Var, view);
                            H.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false)));
                            H.c(2131232770, org.telegram.messenger.cd.L0(2131746637, null), new i2.j0(this, A0, i10, 5), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (zt0Var.l1 == k2Var.getUserConfig().e() && (userFull = zt0Var.f33191g1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    z60 H2 = z60.H(k2Var, view);
                    H2.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false)));
                    H2.c(2131232770, org.telegram.messenger.cd.L0(2131746637, null), new i2.j0(this, A0, i10, 5), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void d(int i10, boolean z10) {
        zt0 zt0Var = this.f31835a;
        ss0[] ss0VarArr = zt0Var.m0;
        if (ss0VarArr[0].E == i10) {
            return;
        }
        zq0 zq0Var = zt0Var.f33173b0;
        if (zq0Var != null && i10 == 8) {
            zq0Var.f44254b.f(1.0f, 0);
        }
        ss0 ss0Var = ss0VarArr[1];
        ss0Var.E = i10;
        ss0Var.setVisibility(0);
        zt0Var.u0();
        zt0Var.w1(true);
        zt0Var.f33200j1 = z10;
        zt0Var.T0();
        zt0Var.D(!zt0Var.B0(i10));
        zt0Var.D1(true);
    }
}
