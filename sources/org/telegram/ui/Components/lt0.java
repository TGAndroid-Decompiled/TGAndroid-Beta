package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lt0 implements jn0 {
    public final tv0 f28305a;

    public lt0(tv0 tv0Var) {
        this.f28305a = tv0Var;
    }

    @Override
    public final boolean b1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        tv0 tv0Var = this.f28305a;
        org.telegram.ui.ActionBar.n2 n2Var = tv0Var.f30732v1;
        if (n2Var != null) {
            boolean t02 = tv0Var.t0();
            if (tv0.e0(i10, t02) != null) {
                if (t02) {
                    if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(tv0Var.f30694d1.f20274id)), 5)) {
                        profileTab = tv0Var.f30694d1.main_tab;
                        if (profileTab != null || (i10 != tv0.f0(profileTab) && tv0Var.R1 != i10)) {
                            i80 H = i80.H(n2Var, view);
                            H.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false)));
                            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.z8(this, t02, i10, 4), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (tv0Var.f30707j1 == n2Var.getUserConfig().getClientUserId() && (userFull = tv0Var.f30696e1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    i80 H2 = i80.H(n2Var, view);
                    H2.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20987d6, false)));
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
        tv0 tv0Var = this.f28305a;
        mu0[] mu0VarArr = tv0Var.f30708k0;
        if (mu0VarArr[0].F == i10) {
            return;
        }
        os0 os0Var = tv0Var.W;
        if (os0Var != null && i10 == 8) {
            os0Var.f36512n.f(1.0f, 0);
        }
        mu0 mu0Var = mu0VarArr[1];
        mu0Var.F = i10;
        mu0Var.setVisibility(0);
        tv0Var.l0();
        tv0Var.o1(true);
        tv0Var.f30703h1 = z10;
        tv0Var.N0();
        tv0Var.A(!tv0Var.u0(i10), true);
        tv0Var.s1(true);
    }

    @Override
    public final void k0(float f7) {
        mu0 mu0Var;
        int i10;
        int i11;
        mu0 mu0Var2;
        tv0 tv0Var = this.f28305a;
        org.telegram.ui.ActionBar.u0 u0Var = tv0Var.f30713n0;
        mu0[] mu0VarArr = tv0Var.f30708k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || mu0VarArr[1].getVisibility() == 0) {
            if (tv0Var.f30703h1) {
                mu0VarArr[0].setTranslationX((-f7) * mu0Var2.getMeasuredWidth());
                mu0VarArr[1].setTranslationX(mu0VarArr[0].getMeasuredWidth() - (mu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                mu0VarArr[0].setTranslationX(mu0Var.getMeasuredWidth() * f7);
                mu0VarArr[1].setTranslationX((mu0VarArr[0].getMeasuredWidth() * f7) - mu0VarArr[0].getMeasuredWidth());
            }
            tv0Var.O0(tv0Var.getTabProgress());
            float a02 = tv0Var.a0(f7);
            tv0Var.f30717p0 = a02;
            ImageView imageView = tv0Var.f30722r0;
            int i13 = 4;
            if (a02 != 0.0f && tv0Var.D() && !tv0Var.r0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (u0Var != null && !tv0Var.D()) {
                if (tv0Var.x0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                tv0Var.f30715o0 = 0.0f;
            } else {
                tv0Var.f30715o0 = tv0Var.b0(f7);
                tv0Var.w1();
            }
            tv0Var.s1(false);
            if (i12 == 0) {
                mu0 mu0Var3 = mu0VarArr[0];
                mu0VarArr[0] = mu0VarArr[1];
                mu0VarArr[1] = mu0Var3;
                mu0Var3.setVisibility(8);
                if (u0Var != null && tv0Var.f30737x0 == 2) {
                    if (tv0Var.x0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                tv0Var.f30737x0 = 0;
                tv0Var.h1();
            }
        }
    }

    @Override
    public final void x() {
        int a2;
        int L0;
        tv0 tv0Var = this.f28305a;
        mu0[] mu0VarArr = tv0Var.f30708k0;
        int i10 = mu0VarArr[0].F;
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
        mu0 mu0Var = mu0VarArr[0];
        if (mu0Var.F == 0) {
            L0 = (mu0Var.f28612x.L0() / tv0Var.f30711m1[0]) * a2;
        } else {
            L0 = mu0Var.f28612x.L0() * a2;
        }
        if (L0 >= mu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ll0 ll0Var = mu0VarArr[0].E;
            ll0Var.f28242b = 1;
            ll0Var.c(0, 0, false, false);
            return;
        }
        mu0VarArr[0].h.x0(0);
    }
}
