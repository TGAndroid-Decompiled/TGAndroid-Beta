package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wt0 implements tn0 {
    public final bw0 f34574a;

    public wt0(bw0 bw0Var) {
        this.f34574a = bw0Var;
    }

    @Override
    public final void f(int i10, boolean z10) {
        bw0 bw0Var = this.f34574a;
        uu0[] uu0VarArr = bw0Var.m0;
        if (uu0VarArr[0].E == i10) {
            return;
        }
        at0 at0Var = bw0Var.f26928b0;
        if (at0Var != null && i10 == 8) {
            at0Var.f41609b.f(1.0f, 0);
        }
        uu0 uu0Var = uu0VarArr[1];
        uu0Var.E = i10;
        uu0Var.setVisibility(0);
        bw0Var.t0();
        bw0Var.v1(true);
        bw0Var.f26955j1 = z10;
        bw0Var.S0();
        bw0Var.D(!bw0Var.A0(i10));
        bw0Var.C1(true);
    }

    @Override
    public final boolean h1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        bw0 bw0Var = this.f34574a;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
        if (r2Var != null) {
            boolean z02 = bw0Var.z0();
            if (bw0.l0(i10, z02) != null) {
                if (z02) {
                    if (ChatObject.canUserDoAction(r2Var.getMessagesController().getChat(Long.valueOf(bw0Var.f26943f1.f22029id)), 5)) {
                        profileTab = bw0Var.f26943f1.main_tab;
                        if (profileTab != null || (i10 != bw0.m0(profileTab) && bw0Var.U1 != i10)) {
                            l80 H = l80.H(r2Var, view);
                            H.W(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false)));
                            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new bi.u8(this, z02, i10, 4), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (bw0Var.l1 == r2Var.getUserConfig().getClientUserId() && (userFull = bw0Var.f26946g1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    l80 H2 = l80.H(r2Var, view);
                    H2.W(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false)));
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new bi.u8(this, z02, i10, 4), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void z() {
        int a2;
        int L0;
        bw0 bw0Var = this.f34574a;
        uu0[] uu0VarArr = bw0Var.m0;
        int i10 = uu0VarArr[0].E;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            a2 = AndroidUtilities.dp(58.0f);
                        } else {
                            a2 = AndroidUtilities.dp(60.0f);
                        }
                    }
                } else {
                    a2 = AndroidUtilities.dp(100.0f);
                }
            }
            a2 = AndroidUtilities.dp(56.0f);
        } else {
            a2 = org.telegram.ui.Cells.x7.a(1);
        }
        uu0 uu0Var = uu0VarArr[0];
        if (uu0Var.E == 0) {
            L0 = (uu0Var.f33471w.L0() / bw0Var.f26969o1[0]) * a2;
        } else {
            L0 = uu0Var.f33471w.L0() * a2;
        }
        if (L0 >= uu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ql0 ql0Var = uu0VarArr[0].f33473y;
            ql0Var.f31934b = 1;
            ql0Var.c(0, 0, false, false);
            return;
        }
        uu0VarArr[0].h.y0(0);
    }

    @Override
    public final void z0(float f7) {
        uu0 uu0Var;
        int i10;
        int i11;
        uu0 uu0Var2;
        bw0 bw0Var = this.f34574a;
        org.telegram.ui.ActionBar.w0 w0Var = bw0Var.f26971p0;
        uu0[] uu0VarArr = bw0Var.m0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || uu0VarArr[1].getVisibility() == 0) {
            if (bw0Var.f26955j1) {
                uu0VarArr[0].setTranslationX((-f7) * uu0Var2.getMeasuredWidth());
                uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth() - (uu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                uu0VarArr[0].setTranslationX(uu0Var.getMeasuredWidth() * f7);
                uu0VarArr[1].setTranslationX((uu0VarArr[0].getMeasuredWidth() * f7) - uu0VarArr[0].getMeasuredWidth());
            }
            bw0Var.T0(bw0Var.getTabProgress());
            float h02 = bw0Var.h0(f7);
            bw0Var.f26976r0 = h02;
            ImageView imageView = bw0Var.f26981t0;
            int i13 = 4;
            if (h02 != 0.0f && bw0Var.G() && !bw0Var.x0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (w0Var != null && !bw0Var.G()) {
                if (bw0Var.D0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                bw0Var.setSearchItemVisibility(i11);
                bw0Var.f26973q0 = 0.0f;
            } else {
                bw0Var.f26973q0 = bw0Var.i0(f7);
                bw0Var.H1();
            }
            bw0Var.C1(false);
            if (i12 == 0) {
                uu0 uu0Var3 = uu0VarArr[0];
                uu0VarArr[0] = uu0VarArr[1];
                uu0VarArr[1] = uu0Var3;
                uu0Var3.setVisibility(8);
                if (w0Var != null && bw0Var.f26996z0 == 2) {
                    if (bw0Var.D0()) {
                        i13 = 8;
                    }
                    bw0Var.setSearchItemVisibility(i13);
                }
                bw0Var.f26996z0 = 0;
                bw0Var.o1();
            }
        }
    }
}
