package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class et0 implements an0 {
    public final mv0 f24046a;

    public et0(mv0 mv0Var) {
        this.f24046a = mv0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        mv0 mv0Var = this.f24046a;
        fu0[] fu0VarArr = mv0Var.f26425k0;
        int i10 = fu0VarArr[0].F;
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
        fu0 fu0Var = fu0VarArr[0];
        if (fu0Var.F == 0) {
            L0 = (fu0Var.f24359x.L0() / mv0Var.f26428m1[0]) * a2;
        } else {
            L0 = fu0Var.f24359x.L0() * a2;
        }
        if (L0 >= fu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            cl0 cl0Var = fu0VarArr[0].E;
            cl0Var.f23356b = 1;
            cl0Var.d(0, 0, false, false);
            return;
        }
        fu0VarArr[0].h.y0(0);
    }

    @Override
    public final void C0(float f7) {
        int i10;
        int i11;
        mv0 mv0Var = this.f24046a;
        org.telegram.ui.ActionBar.u0 u0Var = mv0Var.f26430n0;
        fu0[] fu0VarArr = mv0Var.f26425k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || fu0VarArr[1].getVisibility() == 0) {
            if (mv0Var.f26420h1) {
                fu0 fu0Var = fu0VarArr[0];
                fu0Var.setTranslationX((-f7) * fu0Var.getMeasuredWidth());
                fu0VarArr[1].setTranslationX(fu0VarArr[0].getMeasuredWidth() - (fu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                fu0 fu0Var2 = fu0VarArr[0];
                fu0Var2.setTranslationX(fu0Var2.getMeasuredWidth() * f7);
                fu0VarArr[1].setTranslationX((fu0VarArr[0].getMeasuredWidth() * f7) - fu0VarArr[0].getMeasuredWidth());
            }
            mv0Var.M0(mv0Var.getTabProgress());
            float a02 = mv0Var.a0(f7);
            mv0Var.f26434p0 = a02;
            ImageView imageView = mv0Var.f26439r0;
            int i13 = 4;
            if (a02 != 0.0f && mv0Var.D() && !mv0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (u0Var != null && !mv0Var.D()) {
                if (mv0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                mv0Var.f26432o0 = 0.0f;
            } else {
                mv0Var.f26432o0 = mv0Var.b0(f7);
                mv0Var.t1();
            }
            mv0Var.q1(false);
            if (i12 == 0) {
                fu0 fu0Var3 = fu0VarArr[0];
                fu0VarArr[0] = fu0VarArr[1];
                fu0VarArr[1] = fu0Var3;
                fu0Var3.setVisibility(8);
                if (u0Var != null && mv0Var.f26454x0 == 2) {
                    if (mv0Var.v0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                mv0Var.f26454x0 = 0;
                mv0Var.f1();
            }
        }
    }

    @Override
    public final void d(int i10, boolean z10) {
        mv0 mv0Var = this.f24046a;
        fu0[] fu0VarArr = mv0Var.f26425k0;
        if (fu0VarArr[0].F == i10) {
            return;
        }
        hs0 hs0Var = mv0Var.W;
        if (hs0Var != null && i10 == 8) {
            hs0Var.f37662n.f(1.0f, 0);
        }
        fu0 fu0Var = fu0VarArr[1];
        fu0Var.F = i10;
        fu0Var.setVisibility(0);
        mv0Var.k0();
        mv0Var.m1(true);
        mv0Var.f26420h1 = z10;
        mv0Var.L0();
        mv0Var.A(!mv0Var.s0(i10), true);
        mv0Var.q1(true);
    }

    @Override
    public final boolean n1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        mv0 mv0Var = this.f24046a;
        org.telegram.ui.ActionBar.m2 m2Var = mv0Var.f26449v1;
        if (m2Var != null && mv0.d0(i10, mv0Var.f26411d1 instanceof TLRPC.TL_channelFull) != null) {
            if (mv0Var.f26411d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(m2Var.getMessagesController().getChat(Long.valueOf(mv0Var.f26411d1.f18353id)), 5)) {
                    profileTab = mv0Var.f26411d1.main_tab;
                    if (profileTab != null || (i10 != mv0.e0(profileTab) && mv0Var.R1 != i10)) {
                        b80 H = b80.H(m2Var, view);
                        H.W(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19076d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new md(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (mv0Var.f26424j1 == m2Var.getUserConfig().getClientUserId() && (userFull = mv0Var.f26413e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                b80 H2 = b80.H(m2Var, view);
                H2.W(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19076d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new md(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
