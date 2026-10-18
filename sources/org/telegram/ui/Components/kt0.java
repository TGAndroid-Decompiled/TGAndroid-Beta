package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class kt0 implements jn0 {
    public final sv0 f27985a;

    public kt0(sv0 sv0Var) {
        this.f27985a = sv0Var;
    }

    @Override
    public final boolean b1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        sv0 sv0Var = this.f27985a;
        org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30388v1;
        if (n2Var != null) {
            boolean t02 = sv0Var.t0();
            if (sv0.e0(i10, t02) != null) {
                if (t02) {
                    if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(sv0Var.f30350d1.f20273id)), 5)) {
                        profileTab = sv0Var.f30350d1.main_tab;
                        if (profileTab != null || (i10 != sv0.f0(profileTab) && sv0Var.R1 != i10)) {
                            i80 H = i80.H(n2Var, view);
                            H.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false)));
                            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.y8(this, t02, i10, 4), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (sv0Var.f30363j1 == n2Var.getUserConfig().getClientUserId() && (userFull = sv0Var.f30352e1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    i80 H2 = i80.H(n2Var, view);
                    H2.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20986d6, false)));
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.y8(this, t02, i10, 4), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void f(int i10, boolean z10) {
        sv0 sv0Var = this.f27985a;
        lu0[] lu0VarArr = sv0Var.f30364k0;
        if (lu0VarArr[0].F == i10) {
            return;
        }
        ns0 ns0Var = sv0Var.W;
        if (ns0Var != null && i10 == 8) {
            ns0Var.f37043n.f(1.0f, 0);
        }
        lu0 lu0Var = lu0VarArr[1];
        lu0Var.F = i10;
        lu0Var.setVisibility(0);
        sv0Var.l0();
        sv0Var.o1(true);
        sv0Var.f30359h1 = z10;
        sv0Var.N0();
        sv0Var.A(!sv0Var.u0(i10), true);
        sv0Var.s1(true);
    }

    @Override
    public final void k0(float f7) {
        lu0 lu0Var;
        int i10;
        int i11;
        lu0 lu0Var2;
        sv0 sv0Var = this.f27985a;
        org.telegram.ui.ActionBar.u0 u0Var = sv0Var.f30369n0;
        lu0[] lu0VarArr = sv0Var.f30364k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || lu0VarArr[1].getVisibility() == 0) {
            if (sv0Var.f30359h1) {
                lu0VarArr[0].setTranslationX((-f7) * lu0Var2.getMeasuredWidth());
                lu0VarArr[1].setTranslationX(lu0VarArr[0].getMeasuredWidth() - (lu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                lu0VarArr[0].setTranslationX(lu0Var.getMeasuredWidth() * f7);
                lu0VarArr[1].setTranslationX((lu0VarArr[0].getMeasuredWidth() * f7) - lu0VarArr[0].getMeasuredWidth());
            }
            sv0Var.O0(sv0Var.getTabProgress());
            float a02 = sv0Var.a0(f7);
            sv0Var.f30373p0 = a02;
            ImageView imageView = sv0Var.f30378r0;
            int i13 = 4;
            if (a02 != 0.0f && sv0Var.D() && !sv0Var.r0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (u0Var != null && !sv0Var.D()) {
                if (sv0Var.x0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                sv0Var.f30371o0 = 0.0f;
            } else {
                sv0Var.f30371o0 = sv0Var.b0(f7);
                sv0Var.w1();
            }
            sv0Var.s1(false);
            if (i12 == 0) {
                lu0 lu0Var3 = lu0VarArr[0];
                lu0VarArr[0] = lu0VarArr[1];
                lu0VarArr[1] = lu0Var3;
                lu0Var3.setVisibility(8);
                if (u0Var != null && sv0Var.f30393x0 == 2) {
                    if (sv0Var.x0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                sv0Var.f30393x0 = 0;
                sv0Var.h1();
            }
        }
    }

    @Override
    public final void x() {
        int a2;
        int L0;
        sv0 sv0Var = this.f27985a;
        lu0[] lu0VarArr = sv0Var.f30364k0;
        int i10 = lu0VarArr[0].F;
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
        lu0 lu0Var = lu0VarArr[0];
        if (lu0Var.F == 0) {
            L0 = (lu0Var.f28335x.L0() / sv0Var.f30367m1[0]) * a2;
        } else {
            L0 = lu0Var.f28335x.L0() * a2;
        }
        if (L0 >= lu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ll0 ll0Var = lu0VarArr[0].E;
            ll0Var.f28257b = 1;
            ll0Var.c(0, 0, false, false);
            return;
        }
        lu0VarArr[0].h.x0(0);
    }
}
