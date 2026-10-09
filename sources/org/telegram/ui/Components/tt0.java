package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class tt0 implements rn0 {
    public final bw0 f31278a;

    public tt0(bw0 bw0Var) {
        this.f31278a = bw0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        bw0 bw0Var = this.f31278a;
        uu0[] uu0VarArr = bw0Var.f25142k0;
        int i10 = uu0VarArr[0].F;
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
            a2 = org.telegram.ui.Cells.u7.a(1);
        }
        uu0 uu0Var = uu0VarArr[0];
        if (uu0Var.F == 0) {
            L0 = (uu0Var.f31628x.L0() / bw0Var.f25145m1[0]) * a2;
        } else {
            L0 = uu0Var.f31628x.L0() * a2;
        }
        if (L0 >= uu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            tl0 tl0Var = uu0VarArr[0].E;
            tl0Var.f31224b = 1;
            tl0Var.c(0, 0, false, false);
            return;
        }
        uu0VarArr[0].h.x0(0);
    }

    @Override
    public final void d(int i10, boolean z10) {
        bw0 bw0Var = this.f31278a;
        uu0[] uu0VarArr = bw0Var.f25142k0;
        if (uu0VarArr[0].F == i10) {
            return;
        }
        ws0 ws0Var = bw0Var.W;
        if (ws0Var != null && i10 == 8) {
            ws0Var.f35809n.f(1.0f, 0);
        }
        uu0 uu0Var = uu0VarArr[1];
        uu0Var.F = i10;
        uu0Var.setVisibility(0);
        bw0Var.k0();
        bw0Var.m1(true);
        bw0Var.f25137h1 = z10;
        bw0Var.L0();
        bw0Var.A(!bw0Var.s0(i10), true);
        bw0Var.q1(true);
    }

    @Override
    public final boolean k1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        bw0 bw0Var = this.f31278a;
        org.telegram.ui.ActionBar.n2 n2Var = bw0Var.f25166v1;
        if (n2Var != null && bw0.d0(i10, bw0Var.f25127d1 instanceof TLRPC.TL_channelFull) != null) {
            if (bw0Var.f25127d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(bw0Var.f25127d1.f20039id)), 5)) {
                    profileTab = bw0Var.f25127d1.main_tab;
                    if (profileTab != null || (i10 != bw0.e0(profileTab) && bw0Var.R1 != i10)) {
                        p80 H = p80.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new nd(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (bw0Var.f25141j1 == n2Var.getUserConfig().getClientUserId() && (userFull = bw0Var.f25130e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                p80 H2 = p80.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.i6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20797d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new nd(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void u0(float f7) {
        uu0 uu0Var;
        int i10;
        int i11;
        uu0 uu0Var2;
        bw0 bw0Var = this.f31278a;
        org.telegram.ui.ActionBar.v0 v0Var = bw0Var.f25147n0;
        uu0[] uu0VarArr = bw0Var.f25142k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || uu0VarArr[1].getVisibility() == 0) {
            if (bw0Var.f25137h1) {
                uu0VarArr[0].setTranslationX((-f7) * uu0Var2.getMeasuredWidth());
                uu0VarArr[1].setTranslationX(uu0VarArr[0].getMeasuredWidth() - (uu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                uu0VarArr[0].setTranslationX(uu0Var.getMeasuredWidth() * f7);
                uu0VarArr[1].setTranslationX((uu0VarArr[0].getMeasuredWidth() * f7) - uu0VarArr[0].getMeasuredWidth());
            }
            bw0Var.M0(bw0Var.getTabProgress());
            float a02 = bw0Var.a0(f7);
            bw0Var.f25151p0 = a02;
            ImageView imageView = bw0Var.f25156r0;
            int i13 = 4;
            if (a02 != 0.0f && bw0Var.D() && !bw0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (v0Var != null && !bw0Var.D()) {
                if (bw0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                v0Var.setVisibility(i11);
                bw0Var.f25149o0 = 0.0f;
            } else {
                bw0Var.f25149o0 = bw0Var.b0(f7);
                bw0Var.t1();
            }
            bw0Var.q1(false);
            if (i12 == 0) {
                uu0 uu0Var3 = uu0VarArr[0];
                uu0VarArr[0] = uu0VarArr[1];
                uu0VarArr[1] = uu0Var3;
                uu0Var3.setVisibility(8);
                if (v0Var != null && bw0Var.f25171x0 == 2) {
                    if (bw0Var.v0()) {
                        i13 = 8;
                    }
                    v0Var.setVisibility(i13);
                }
                bw0Var.f25171x0 = 0;
                bw0Var.f1();
            }
        }
    }
}
