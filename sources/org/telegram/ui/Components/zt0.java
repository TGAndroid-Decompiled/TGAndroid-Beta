package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zt0 implements xn0 {
    public final hw0 f33493a;

    public zt0(hw0 hw0Var) {
        this.f33493a = hw0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        hw0 hw0Var = this.f33493a;
        av0[] av0VarArr = hw0Var.f26933k0;
        int i10 = av0VarArr[0].F;
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
        av0 av0Var = av0VarArr[0];
        if (av0Var.F == 0) {
            L0 = (av0Var.f24491x.L0() / hw0Var.f26936m1[0]) * a2;
        } else {
            L0 = av0Var.f24491x.L0() * a2;
        }
        if (L0 >= av0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            zl0 zl0Var = av0VarArr[0].E;
            zl0Var.f33432b = 1;
            zl0Var.d(0, 0, false, false);
            return;
        }
        av0VarArr[0].h.x0(0);
    }

    @Override
    public final void d(int i10, boolean z10) {
        hw0 hw0Var = this.f33493a;
        av0[] av0VarArr = hw0Var.f26933k0;
        if (av0VarArr[0].F == i10) {
            return;
        }
        ct0 ct0Var = hw0Var.W;
        if (ct0Var != null && i10 == 8) {
            ct0Var.f36308n.f(1.0f, 0);
        }
        av0 av0Var = av0VarArr[1];
        av0Var.F = i10;
        av0Var.setVisibility(0);
        hw0Var.k0();
        hw0Var.m1(true);
        hw0Var.f26928h1 = z10;
        hw0Var.L0();
        hw0Var.A(!hw0Var.s0(i10), true);
        hw0Var.q1(true);
    }

    @Override
    public final boolean k1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        hw0 hw0Var = this.f33493a;
        org.telegram.ui.ActionBar.m2 m2Var = hw0Var.f26957v1;
        if (m2Var != null && hw0.d0(i10, hw0Var.f26918d1 instanceof TLRPC.TL_channelFull) != null) {
            if (hw0Var.f26918d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(m2Var.getMessagesController().getChat(Long.valueOf(hw0Var.f26918d1.f19804id)), 5)) {
                    profileTab = hw0Var.f26918d1.main_tab;
                    if (profileTab != null || (i10 != hw0.e0(profileTab) && hw0Var.R1 != i10)) {
                        s80 H = s80.H(m2Var, view);
                        H.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new nd(this, i10, 10), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (hw0Var.f26932j1 == m2Var.getUserConfig().getClientUserId() && (userFull = hw0Var.f26921e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                s80 H2 = s80.H(m2Var, view);
                H2.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20560d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new nd(this, i10, 10), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void v0(float f7) {
        av0 av0Var;
        int i10;
        int i11;
        av0 av0Var2;
        hw0 hw0Var = this.f33493a;
        org.telegram.ui.ActionBar.u0 u0Var = hw0Var.f26938n0;
        av0[] av0VarArr = hw0Var.f26933k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || av0VarArr[1].getVisibility() == 0) {
            if (hw0Var.f26928h1) {
                av0VarArr[0].setTranslationX((-f7) * av0Var2.getMeasuredWidth());
                av0VarArr[1].setTranslationX(av0VarArr[0].getMeasuredWidth() - (av0VarArr[0].getMeasuredWidth() * f7));
            } else {
                av0VarArr[0].setTranslationX(av0Var.getMeasuredWidth() * f7);
                av0VarArr[1].setTranslationX((av0VarArr[0].getMeasuredWidth() * f7) - av0VarArr[0].getMeasuredWidth());
            }
            hw0Var.M0(hw0Var.getTabProgress());
            float a02 = hw0Var.a0(f7);
            hw0Var.f26942p0 = a02;
            ImageView imageView = hw0Var.f26947r0;
            int i13 = 4;
            if (a02 != 0.0f && hw0Var.D() && !hw0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (u0Var != null && !hw0Var.D()) {
                if (hw0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                hw0Var.f26940o0 = 0.0f;
            } else {
                hw0Var.f26940o0 = hw0Var.b0(f7);
                hw0Var.t1();
            }
            hw0Var.q1(false);
            if (i12 == 0) {
                av0 av0Var3 = av0VarArr[0];
                av0VarArr[0] = av0VarArr[1];
                av0VarArr[1] = av0Var3;
                av0Var3.setVisibility(8);
                if (u0Var != null && hw0Var.f26962x0 == 2) {
                    if (hw0Var.v0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                hw0Var.f26962x0 = 0;
                hw0Var.f1();
            }
        }
    }
}
