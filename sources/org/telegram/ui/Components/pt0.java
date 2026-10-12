package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class pt0 implements nn0 {
    public final xv0 f28421a;

    public pt0(xv0 xv0Var) {
        this.f28421a = xv0Var;
    }

    @Override
    public final void B0(float f7) {
        qu0 qu0Var;
        int i10;
        int i11;
        qu0 qu0Var2;
        xv0 xv0Var = this.f28421a;
        org.telegram.ui.ActionBar.u0 u0Var = xv0Var.f31369n0;
        qu0[] qu0VarArr = xv0Var.f31364k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || qu0VarArr[1].getVisibility() == 0) {
            if (xv0Var.f31359h1) {
                qu0VarArr[0].setTranslationX((-f7) * qu0Var2.getMeasuredWidth());
                qu0VarArr[1].setTranslationX(qu0VarArr[0].getMeasuredWidth() - (qu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                qu0VarArr[0].setTranslationX(qu0Var.getMeasuredWidth() * f7);
                qu0VarArr[1].setTranslationX((qu0VarArr[0].getMeasuredWidth() * f7) - qu0VarArr[0].getMeasuredWidth());
            }
            xv0Var.M0(xv0Var.getTabProgress());
            float a02 = xv0Var.a0(f7);
            xv0Var.f31373p0 = a02;
            ImageView imageView = xv0Var.f31378r0;
            int i13 = 4;
            if (a02 != 0.0f && xv0Var.D() && !xv0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (u0Var != null && !xv0Var.D()) {
                if (xv0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                xv0Var.f31371o0 = 0.0f;
            } else {
                xv0Var.f31371o0 = xv0Var.b0(f7);
                xv0Var.t1();
            }
            xv0Var.q1(false);
            if (i12 == 0) {
                qu0 qu0Var3 = qu0VarArr[0];
                qu0VarArr[0] = qu0VarArr[1];
                qu0VarArr[1] = qu0Var3;
                qu0Var3.setVisibility(8);
                if (u0Var != null && xv0Var.f31393x0 == 2) {
                    if (xv0Var.v0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                xv0Var.f31393x0 = 0;
                xv0Var.f1();
            }
        }
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        xv0 xv0Var = this.f28421a;
        qu0[] qu0VarArr = xv0Var.f31364k0;
        int i10 = qu0VarArr[0].F;
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
        qu0 qu0Var = qu0VarArr[0];
        if (qu0Var.F == 0) {
            L0 = (qu0Var.f28683x.L0() / xv0Var.f31367m1[0]) * a2;
        } else {
            L0 = qu0Var.f28683x.L0() * a2;
        }
        if (L0 >= qu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            pl0 pl0Var = qu0VarArr[0].E;
            pl0Var.f28360b = 1;
            pl0Var.c(0, 0, false, false);
            return;
        }
        qu0VarArr[0].h.x0(0);
    }

    @Override
    public final void e(int i10, boolean z10) {
        xv0 xv0Var = this.f28421a;
        qu0[] qu0VarArr = xv0Var.f31364k0;
        if (qu0VarArr[0].F == i10) {
            return;
        }
        ss0 ss0Var = xv0Var.W;
        if (ss0Var != null && i10 == 8) {
            ss0Var.f36585n.f(1.0f, 0);
        }
        qu0 qu0Var = qu0VarArr[1];
        qu0Var.F = i10;
        qu0Var.setVisibility(0);
        xv0Var.k0();
        xv0Var.m1(true);
        xv0Var.f31359h1 = z10;
        xv0Var.L0();
        xv0Var.A(!xv0Var.s0(i10), true);
        xv0Var.q1(true);
    }

    @Override
    public final boolean n1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        xv0 xv0Var = this.f28421a;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31388v1;
        if (m2Var != null && xv0.d0(i10, xv0Var.f31350d1 instanceof TLRPC.TL_channelFull) != null) {
            if (xv0Var.f31350d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(m2Var.getMessagesController().getChat(Long.valueOf(xv0Var.f31350d1.f19217id)), 5)) {
                    profileTab = xv0Var.f31350d1.main_tab;
                    if (profileTab != null || (i10 != xv0.e0(profileTab) && xv0Var.R1 != i10)) {
                        m80 H = m80.H(m2Var, view);
                        H.W(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new o8(this, i10, 11), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (xv0Var.f31363j1 == m2Var.getUserConfig().getClientUserId() && (userFull = xv0Var.f31352e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                m80 H2 = m80.H(m2Var, view);
                H2.W(org.telegram.ui.ActionBar.g6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19901d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new o8(this, i10, 11), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
