package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class mt0 implements kn0 {
    public final uv0 f28598a;

    public mt0(uv0 uv0Var) {
        this.f28598a = uv0Var;
    }

    @Override
    public final boolean b1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        uv0 uv0Var = this.f28598a;
        org.telegram.ui.ActionBar.n2 n2Var = uv0Var.f31070v1;
        if (n2Var != null) {
            boolean t02 = uv0Var.t0();
            if (uv0.e0(i10, t02) != null) {
                if (t02) {
                    if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(uv0Var.f31032d1.f20277id)), 5)) {
                        profileTab = uv0Var.f31032d1.main_tab;
                        if (profileTab != null || (i10 != uv0.f0(profileTab) && uv0Var.R1 != i10)) {
                            i80 H = i80.H(n2Var, view);
                            H.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false)));
                            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.z8(this, t02, i10, 4), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (uv0Var.f31045j1 == n2Var.getUserConfig().getClientUserId() && (userFull = uv0Var.f31034e1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    i80 H2 = i80.H(n2Var, view);
                    H2.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20990d6, false)));
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.z8(this, t02, i10, 4), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void f(int i10, boolean z10) {
        uv0 uv0Var = this.f28598a;
        nu0[] nu0VarArr = uv0Var.f31046k0;
        if (nu0VarArr[0].F == i10) {
            return;
        }
        ps0 ps0Var = uv0Var.W;
        if (ps0Var != null && i10 == 8) {
            ps0Var.f36518n.f(1.0f, 0);
        }
        nu0 nu0Var = nu0VarArr[1];
        nu0Var.F = i10;
        nu0Var.setVisibility(0);
        uv0Var.l0();
        uv0Var.o1(true);
        uv0Var.f31041h1 = z10;
        uv0Var.N0();
        uv0Var.A(!uv0Var.u0(i10), true);
        uv0Var.s1(true);
    }

    @Override
    public final void k0(float f7) {
        nu0 nu0Var;
        int i10;
        int i11;
        nu0 nu0Var2;
        uv0 uv0Var = this.f28598a;
        org.telegram.ui.ActionBar.u0 u0Var = uv0Var.f31051n0;
        nu0[] nu0VarArr = uv0Var.f31046k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || nu0VarArr[1].getVisibility() == 0) {
            if (uv0Var.f31041h1) {
                nu0VarArr[0].setTranslationX((-f7) * nu0Var2.getMeasuredWidth());
                nu0VarArr[1].setTranslationX(nu0VarArr[0].getMeasuredWidth() - (nu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                nu0VarArr[0].setTranslationX(nu0Var.getMeasuredWidth() * f7);
                nu0VarArr[1].setTranslationX((nu0VarArr[0].getMeasuredWidth() * f7) - nu0VarArr[0].getMeasuredWidth());
            }
            uv0Var.O0(uv0Var.getTabProgress());
            float a02 = uv0Var.a0(f7);
            uv0Var.f31055p0 = a02;
            ImageView imageView = uv0Var.f31060r0;
            int i13 = 4;
            if (a02 != 0.0f && uv0Var.D() && !uv0Var.r0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (u0Var != null && !uv0Var.D()) {
                if (uv0Var.x0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                uv0Var.f31053o0 = 0.0f;
            } else {
                uv0Var.f31053o0 = uv0Var.b0(f7);
                uv0Var.w1();
            }
            uv0Var.s1(false);
            if (i12 == 0) {
                nu0 nu0Var3 = nu0VarArr[0];
                nu0VarArr[0] = nu0VarArr[1];
                nu0VarArr[1] = nu0Var3;
                nu0Var3.setVisibility(8);
                if (u0Var != null && uv0Var.f31075x0 == 2) {
                    if (uv0Var.x0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                uv0Var.f31075x0 = 0;
                uv0Var.h1();
            }
        }
    }

    @Override
    public final void x() {
        int a2;
        int L0;
        uv0 uv0Var = this.f28598a;
        nu0[] nu0VarArr = uv0Var.f31046k0;
        int i10 = nu0VarArr[0].F;
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
            a2 = org.telegram.ui.Cells.t7.a(1);
        }
        nu0 nu0Var = nu0VarArr[0];
        if (nu0Var.F == 0) {
            L0 = (nu0Var.f28883x.L0() / uv0Var.f31049m1[0]) * a2;
        } else {
            L0 = nu0Var.f28883x.L0() * a2;
        }
        if (L0 >= nu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ml0 ml0Var = nu0VarArr[0].E;
            ml0Var.f28543b = 1;
            ml0Var.c(0, 0, false, false);
            return;
        }
        nu0VarArr[0].h.x0(0);
    }
}
