package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qs0 implements lm0 {
    public final yu0 f27441a;

    public qs0(yu0 yu0Var) {
        this.f27441a = yu0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        yu0 yu0Var = this.f27441a;
        rt0[] rt0VarArr = yu0Var.f30368k0;
        int i10 = rt0VarArr[0].F;
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
        rt0 rt0Var = rt0VarArr[0];
        if (rt0Var.F == 0) {
            L0 = (rt0Var.f27691x.L0() / yu0Var.f30371m1[0]) * a2;
        } else {
            L0 = rt0Var.f27691x.L0() * a2;
        }
        if (L0 >= rt0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ok0 ok0Var = rt0VarArr[0].E;
            ok0Var.f26830b = 1;
            ok0Var.d(0, 0, false, false);
            return;
        }
        rt0VarArr[0].h.x0(0);
    }

    @Override
    public final void C0(float f7) {
        int i10;
        int i11;
        yu0 yu0Var = this.f27441a;
        org.telegram.ui.ActionBar.v0 v0Var = yu0Var.f30373n0;
        rt0[] rt0VarArr = yu0Var.f30368k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || rt0VarArr[1].getVisibility() == 0) {
            if (yu0Var.f30363h1) {
                rt0 rt0Var = rt0VarArr[0];
                rt0Var.setTranslationX((-f7) * rt0Var.getMeasuredWidth());
                rt0VarArr[1].setTranslationX(rt0VarArr[0].getMeasuredWidth() - (rt0VarArr[0].getMeasuredWidth() * f7));
            } else {
                rt0 rt0Var2 = rt0VarArr[0];
                rt0Var2.setTranslationX(rt0Var2.getMeasuredWidth() * f7);
                rt0VarArr[1].setTranslationX((rt0VarArr[0].getMeasuredWidth() * f7) - rt0VarArr[0].getMeasuredWidth());
            }
            yu0Var.M0(yu0Var.getTabProgress());
            float a02 = yu0Var.a0(f7);
            yu0Var.f30377p0 = a02;
            ImageView imageView = yu0Var.f30382r0;
            int i13 = 4;
            if (a02 != 0.0f && yu0Var.D() && !yu0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (v0Var != null && !yu0Var.D()) {
                if (yu0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                v0Var.setVisibility(i11);
                yu0Var.f30375o0 = 0.0f;
            } else {
                yu0Var.f30375o0 = yu0Var.b0(f7);
                yu0Var.t1();
            }
            yu0Var.q1(false);
            if (i12 == 0) {
                rt0 rt0Var3 = rt0VarArr[0];
                rt0VarArr[0] = rt0VarArr[1];
                rt0VarArr[1] = rt0Var3;
                rt0Var3.setVisibility(8);
                if (v0Var != null && yu0Var.f30397x0 == 2) {
                    if (yu0Var.v0()) {
                        i13 = 8;
                    }
                    v0Var.setVisibility(i13);
                }
                yu0Var.f30397x0 = 0;
                yu0Var.f1();
            }
        }
    }

    @Override
    public final void d(int i10, boolean z10) {
        yu0 yu0Var = this.f27441a;
        rt0[] rt0VarArr = yu0Var.f30368k0;
        if (rt0VarArr[0].F == i10) {
            return;
        }
        tr0 tr0Var = yu0Var.W;
        if (tr0Var != null && i10 == 8) {
            tr0Var.f32030n.f(1.0f, 0);
        }
        rt0 rt0Var = rt0VarArr[1];
        rt0Var.F = i10;
        rt0Var.setVisibility(0);
        yu0Var.k0();
        yu0Var.m1(true);
        yu0Var.f30363h1 = z10;
        yu0Var.L0();
        yu0Var.A(!yu0Var.s0(i10), true);
        yu0Var.q1(true);
    }

    @Override
    public final boolean n1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        yu0 yu0Var = this.f27441a;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30392v1;
        if (n2Var != null && yu0.d0(i10, yu0Var.f30354d1 instanceof TLRPC.TL_channelFull) != null) {
            if (yu0Var.f30354d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(yu0Var.f30354d1.f18113id)), 5)) {
                    profileTab = yu0Var.f30354d1.main_tab;
                    if (profileTab != null || (i10 != yu0.e0(profileTab) && yu0Var.R1 != i10)) {
                        n70 H = n70.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new id(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (yu0Var.f30367j1 == n2Var.getUserConfig().getClientUserId() && (userFull = yu0Var.f30356e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                n70 H2 = n70.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f18836d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new id(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
