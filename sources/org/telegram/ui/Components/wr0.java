package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.tgnet.TLRPC;
public final class wr0 implements yl0 {
    public final au0 f32302a;

    public wr0(au0 au0Var) {
        this.f32302a = au0Var;
    }

    @Override
    public final void D() {
        int a2;
        int L0;
        au0 au0Var = this.f32302a;
        ts0[] ts0VarArr = au0Var.m0;
        int i10 = ts0VarArr[0].E;
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
        ts0 ts0Var = ts0VarArr[0];
        if (ts0Var.E == 0) {
            L0 = (ts0Var.f30723x.L0() / au0Var.f24542o1[0]) * a2;
        } else {
            L0 = ts0Var.f30723x.L0() * a2;
        }
        if (L0 >= ts0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            wj0 wj0Var = ts0VarArr[0].D;
            wj0Var.f32267b = 1;
            wj0Var.d(0, 0, false, false);
            return;
        }
        ts0VarArr[0].h.y0(0);
    }

    @Override
    public final void E0(float f7) {
        ts0 ts0Var;
        int i10;
        int i11;
        ts0 ts0Var2;
        au0 au0Var = this.f32302a;
        org.telegram.ui.ActionBar.t0 t0Var = au0Var.f24544p0;
        ts0[] ts0VarArr = au0Var.m0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || ts0VarArr[1].getVisibility() == 0) {
            if (au0Var.f24528j1) {
                ts0VarArr[0].setTranslationX((-f7) * ts0Var2.getMeasuredWidth());
                ts0VarArr[1].setTranslationX(ts0VarArr[0].getMeasuredWidth() - (ts0VarArr[0].getMeasuredWidth() * f7));
            } else {
                ts0VarArr[0].setTranslationX(ts0Var.getMeasuredWidth() * f7);
                ts0VarArr[1].setTranslationX((ts0VarArr[0].getMeasuredWidth() * f7) - ts0VarArr[0].getMeasuredWidth());
            }
            au0Var.V0(au0Var.getTabProgress());
            float j02 = au0Var.j0(f7);
            au0Var.f24551r0 = j02;
            ImageView imageView = au0Var.f24557t0;
            int i13 = 4;
            if (j02 != 0.0f && au0Var.H() && !au0Var.z0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (t0Var != null && !au0Var.H()) {
                if (au0Var.F0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                au0Var.setSearchItemVisibility(i11);
                au0Var.f24547q0 = 0.0f;
            } else {
                au0Var.f24547q0 = au0Var.k0(f7);
                au0Var.J1();
            }
            au0Var.E1(false);
            if (i12 == 0) {
                ts0 ts0Var3 = ts0VarArr[0];
                ts0VarArr[0] = ts0VarArr[1];
                ts0VarArr[1] = ts0Var3;
                ts0Var3.setVisibility(8);
                if (t0Var != null && au0Var.f24572z0 == 2) {
                    if (au0Var.F0()) {
                        i13 = 8;
                    }
                    au0Var.setSearchItemVisibility(i13);
                }
                au0Var.f24572z0 = 0;
                au0Var.q1();
            }
        }
    }

    @Override
    public final boolean G1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        au0 au0Var = this.f32302a;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
        if (k2Var != null) {
            boolean B0 = au0Var.B0();
            if (au0.n0(i10, B0) != null) {
                if (B0) {
                    if (org.telegram.messenger.w3.w(5, k2Var.getMessagesController().L0(Long.valueOf(au0Var.f24516f1.f19795id)))) {
                        profileTab = au0Var.f24516f1.main_tab;
                        if (profileTab != null || (i10 != au0.o0(profileTab) && au0Var.U1 != i10)) {
                            z60 H = z60.H(k2Var, view);
                            H.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false)));
                            H.c(2131232770, org.telegram.messenger.dd.L0(2131746637, null), new i2.j0(this, B0, i10, 5), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (au0Var.l1 == k2Var.getUserConfig().e() && (userFull = au0Var.f24519g1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    z60 H2 = z60.H(k2Var, view);
                    H2.W(org.telegram.ui.ActionBar.t6.d0(org.telegram.messenger.i0.L(24.0f), org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20930d6, false)));
                    H2.c(2131232770, org.telegram.messenger.dd.L0(2131746637, null), new i2.j0(this, B0, i10, 5), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void d(int i10, boolean z10) {
        au0 au0Var = this.f32302a;
        ts0[] ts0VarArr = au0Var.m0;
        if (ts0VarArr[0].E == i10) {
            return;
        }
        ar0 ar0Var = au0Var.f24501b0;
        if (ar0Var != null && i10 == 8) {
            ar0Var.f43748b.f(1.0f, 0);
        }
        ts0 ts0Var = ts0VarArr[1];
        ts0Var.E = i10;
        ts0Var.setVisibility(0);
        au0Var.v0();
        au0Var.x1(true);
        au0Var.f24528j1 = z10;
        au0Var.U0();
        au0Var.D(!au0Var.C0(i10));
        au0Var.E1(true);
    }
}
