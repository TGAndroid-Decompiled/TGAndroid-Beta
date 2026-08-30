package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ps0 implements tm0 {
    public final yu0 f27979a;

    public ps0(yu0 yu0Var) {
        this.f27979a = yu0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        yu0 yu0Var = this.f27979a;
        qt0[] qt0VarArr = yu0Var.f31120h0;
        int i10 = qt0VarArr[0].C;
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
            a2 = org.telegram.ui.Cells.s7.a(1);
        }
        qt0 qt0Var = qt0VarArr[0];
        if (qt0Var.C == 0) {
            L0 = (qt0Var.f28245x.L0() / yu0Var.f31125j1[0]) * a2;
        } else {
            L0 = qt0Var.f28245x.L0() * a2;
        }
        if (L0 >= qt0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            c2.y yVar = qt0VarArr[0].B;
            yVar.f2031b = 1;
            yVar.c(0, 0, false, false);
            return;
        }
        qt0VarArr[0].h.x0(0);
    }

    @Override
    public final void f(int i10, boolean z4) {
        yu0 yu0Var = this.f27979a;
        qt0[] qt0VarArr = yu0Var.f31120h0;
        if (qt0VarArr[0].C == i10) {
            return;
        }
        sr0 sr0Var = yu0Var.T;
        if (sr0Var != null && i10 == 8) {
            sr0Var.f35201n.f(1.0f, 0);
        }
        qt0 qt0Var = qt0VarArr[1];
        qt0Var.C = i10;
        qt0Var.setVisibility(0);
        yu0Var.k0();
        yu0Var.m1(true);
        yu0Var.f31114e1 = z4;
        yu0Var.L0();
        yu0Var.A(!yu0Var.s0(i10), true);
        yu0Var.q1(true);
    }

    @Override
    public final boolean m1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        yu0 yu0Var = this.f27979a;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31144s1;
        if (p2Var != null && yu0.d0(i10, yu0Var.f31104a1 instanceof TLRPC.TL_channelFull) != null) {
            if (yu0Var.f31104a1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(p2Var.getMessagesController().getChat(Long.valueOf(yu0Var.f31104a1.f19185id)), 5)) {
                    profileTab = yu0Var.f31104a1.main_tab;
                    if (profileTab != null || (i10 != yu0.e0(profileTab) && yu0Var.O1 != i10)) {
                        o70 H = o70.H(p2Var, view);
                        H.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new hm(this, i10, 7), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (yu0Var.f31119g1 == p2Var.getUserConfig().getClientUserId() && (userFull = yu0Var.f31107b1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                o70 H2 = o70.H(p2Var, view);
                H2.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19906d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new hm(this, i10, 7), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void v0(float f10) {
        int i10;
        int i11;
        yu0 yu0Var = this.f27979a;
        org.telegram.ui.ActionBar.w0 w0Var = yu0Var.f31126k0;
        qt0[] qt0VarArr = yu0Var.f31120h0;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i12 != 0 || qt0VarArr[1].getVisibility() == 0) {
            if (yu0Var.f31114e1) {
                qt0 qt0Var = qt0VarArr[0];
                qt0Var.setTranslationX((-f10) * qt0Var.getMeasuredWidth());
                qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() - (qt0VarArr[0].getMeasuredWidth() * f10));
            } else {
                qt0 qt0Var2 = qt0VarArr[0];
                qt0Var2.setTranslationX(qt0Var2.getMeasuredWidth() * f10);
                qt0VarArr[1].setTranslationX((qt0VarArr[0].getMeasuredWidth() * f10) - qt0VarArr[0].getMeasuredWidth());
            }
            yu0Var.M0(yu0Var.getTabProgress());
            float a02 = yu0Var.a0(f10);
            yu0Var.m0 = a02;
            ImageView imageView = yu0Var.f31133o0;
            int i13 = 4;
            if (a02 != 0.0f && yu0Var.D() && !yu0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (w0Var != null && !yu0Var.D()) {
                if (yu0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                w0Var.setVisibility(i11);
                yu0Var.f31128l0 = 0.0f;
            } else {
                yu0Var.f31128l0 = yu0Var.b0(f10);
                yu0Var.t1();
            }
            yu0Var.q1(false);
            if (i12 == 0) {
                qt0 qt0Var3 = qt0VarArr[0];
                qt0VarArr[0] = qt0VarArr[1];
                qt0VarArr[1] = qt0Var3;
                qt0Var3.setVisibility(8);
                if (w0Var != null && yu0Var.f31147u0 == 2) {
                    if (yu0Var.v0()) {
                        i13 = 8;
                    }
                    w0Var.setVisibility(i13);
                }
                yu0Var.f31147u0 = 0;
                yu0Var.f1();
            }
        }
    }
}
