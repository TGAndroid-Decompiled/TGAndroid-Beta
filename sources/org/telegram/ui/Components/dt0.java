package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dt0 implements zm0 {
    public final lv0 f23745a;

    public dt0(lv0 lv0Var) {
        this.f23745a = lv0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        lv0 lv0Var = this.f23745a;
        eu0[] eu0VarArr = lv0Var.f26210k0;
        int i10 = eu0VarArr[0].F;
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
            a2 = org.telegram.ui.Cells.v7.a(1);
        }
        eu0 eu0Var = eu0VarArr[0];
        if (eu0Var.F == 0) {
            L0 = (eu0Var.f24046x.L0() / lv0Var.f26213m1[0]) * a2;
        } else {
            L0 = eu0Var.f24046x.L0() * a2;
        }
        if (L0 >= eu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            bl0 bl0Var = eu0VarArr[0].E;
            bl0Var.f23029b = 1;
            bl0Var.d(0, 0, false, false);
            return;
        }
        eu0VarArr[0].h.y0(0);
    }

    @Override
    public final void d(int i10, boolean z10) {
        lv0 lv0Var = this.f23745a;
        eu0[] eu0VarArr = lv0Var.f26210k0;
        if (eu0VarArr[0].F == i10) {
            return;
        }
        gs0 gs0Var = lv0Var.W;
        if (gs0Var != null && i10 == 8) {
            gs0Var.f31984n.f(1.0f, 0);
        }
        eu0 eu0Var = eu0VarArr[1];
        eu0Var.F = i10;
        eu0Var.setVisibility(0);
        lv0Var.k0();
        lv0Var.m1(true);
        lv0Var.f26205h1 = z10;
        lv0Var.L0();
        lv0Var.A(!lv0Var.s0(i10), true);
        lv0Var.q1(true);
    }

    @Override
    public final boolean m1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        lv0 lv0Var = this.f23745a;
        org.telegram.ui.ActionBar.n2 n2Var = lv0Var.f26234v1;
        if (n2Var != null && lv0.d0(i10, lv0Var.f26196d1 instanceof TLRPC.TL_channelFull) != null) {
            if (lv0Var.f26196d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(lv0Var.f26196d1.f18344id)), 5)) {
                    profileTab = lv0Var.f26196d1.main_tab;
                    if (profileTab != null || (i10 != lv0.e0(profileTab) && lv0Var.R1 != i10)) {
                        y70 H = y70.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new kd(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (lv0Var.f26209j1 == n2Var.getUserConfig().getClientUserId() && (userFull = lv0Var.f26198e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                y70 H2 = y70.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19109d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new kd(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void y0(float f7) {
        int i10;
        int i11;
        lv0 lv0Var = this.f23745a;
        org.telegram.ui.ActionBar.v0 v0Var = lv0Var.f26215n0;
        eu0[] eu0VarArr = lv0Var.f26210k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || eu0VarArr[1].getVisibility() == 0) {
            if (lv0Var.f26205h1) {
                eu0 eu0Var = eu0VarArr[0];
                eu0Var.setTranslationX((-f7) * eu0Var.getMeasuredWidth());
                eu0VarArr[1].setTranslationX(eu0VarArr[0].getMeasuredWidth() - (eu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                eu0 eu0Var2 = eu0VarArr[0];
                eu0Var2.setTranslationX(eu0Var2.getMeasuredWidth() * f7);
                eu0VarArr[1].setTranslationX((eu0VarArr[0].getMeasuredWidth() * f7) - eu0VarArr[0].getMeasuredWidth());
            }
            lv0Var.M0(lv0Var.getTabProgress());
            float a02 = lv0Var.a0(f7);
            lv0Var.f26219p0 = a02;
            ImageView imageView = lv0Var.f26224r0;
            int i13 = 4;
            if (a02 != 0.0f && lv0Var.D() && !lv0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (v0Var != null && !lv0Var.D()) {
                if (lv0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                v0Var.setVisibility(i11);
                lv0Var.f26217o0 = 0.0f;
            } else {
                lv0Var.f26217o0 = lv0Var.b0(f7);
                lv0Var.t1();
            }
            lv0Var.q1(false);
            if (i12 == 0) {
                eu0 eu0Var3 = eu0VarArr[0];
                eu0VarArr[0] = eu0VarArr[1];
                eu0VarArr[1] = eu0Var3;
                eu0Var3.setVisibility(8);
                if (v0Var != null && lv0Var.f26239x0 == 2) {
                    if (lv0Var.v0()) {
                        i13 = 8;
                    }
                    v0Var.setVisibility(i13);
                }
                lv0Var.f26239x0 = 0;
                lv0Var.f1();
            }
        }
    }
}
