package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class pt0 implements nn0 {
    public final xv0 f29670a;

    public pt0(xv0 xv0Var) {
        this.f29670a = xv0Var;
    }

    @Override
    public final boolean b1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        xv0 xv0Var = this.f29670a;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.f32711v1;
        if (o2Var != null) {
            boolean u02 = xv0Var.u0();
            if (xv0.f0(i10, u02) != null) {
                if (u02) {
                    if (ChatObject.canUserDoAction(o2Var.getMessagesController().getChat(Long.valueOf(xv0Var.f32670d1.f20344id)), 5)) {
                        profileTab = xv0Var.f32670d1.main_tab;
                        if (profileTab != null || (i10 != xv0.g0(profileTab) && xv0Var.S1 != i10)) {
                            j80 H = j80.H(o2Var, view);
                            H.W(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false)));
                            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.z8(this, u02, i10, 4), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (xv0Var.f32686j1 == o2Var.getUserConfig().getClientUserId() && (userFull = xv0Var.f32673e1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    j80 H2 = j80.H(o2Var, view);
                    H2.W(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21183d6, false)));
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.z8(this, u02, i10, 4), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void d(int i10, boolean z10) {
        xv0 xv0Var = this.f29670a;
        qu0[] qu0VarArr = xv0Var.f32687k0;
        if (qu0VarArr[0].F == i10) {
            return;
        }
        ss0 ss0Var = xv0Var.W;
        if (ss0Var != null && i10 == 8) {
            ss0Var.f38037n.f(1.0f, 0);
        }
        qu0 qu0Var = qu0VarArr[1];
        qu0Var.F = i10;
        qu0Var.setVisibility(0);
        xv0Var.m0();
        xv0Var.p1(true);
        xv0Var.f32682h1 = z10;
        xv0Var.O0();
        xv0Var.A(!xv0Var.v0(i10), true);
        xv0Var.u1(true);
    }

    @Override
    public final void k0(float f7) {
        qu0 qu0Var;
        int i10;
        int i11;
        qu0 qu0Var2;
        xv0 xv0Var = this.f29670a;
        org.telegram.ui.ActionBar.u0 u0Var = xv0Var.f32692n0;
        qu0[] qu0VarArr = xv0Var.f32687k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || qu0VarArr[1].getVisibility() == 0) {
            if (xv0Var.f32682h1) {
                qu0VarArr[0].setTranslationX((-f7) * qu0Var2.getMeasuredWidth());
                qu0VarArr[1].setTranslationX(qu0VarArr[0].getMeasuredWidth() - (qu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                qu0VarArr[0].setTranslationX(qu0Var.getMeasuredWidth() * f7);
                qu0VarArr[1].setTranslationX((qu0VarArr[0].getMeasuredWidth() * f7) - qu0VarArr[0].getMeasuredWidth());
            }
            xv0Var.P0(xv0Var.getTabProgress());
            float b02 = xv0Var.b0(f7);
            xv0Var.f32696p0 = b02;
            ImageView imageView = xv0Var.f32701r0;
            int i13 = 4;
            if (b02 != 0.0f && xv0Var.E() && !xv0Var.s0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (u0Var != null && !xv0Var.E()) {
                if (xv0Var.y0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                xv0Var.f32694o0 = 0.0f;
            } else {
                xv0Var.f32694o0 = xv0Var.c0(f7);
                xv0Var.y1();
            }
            xv0Var.u1(false);
            if (i12 == 0) {
                qu0 qu0Var3 = qu0VarArr[0];
                qu0VarArr[0] = qu0VarArr[1];
                qu0VarArr[1] = qu0Var3;
                qu0Var3.setVisibility(8);
                if (u0Var != null && xv0Var.f32716x0 == 2) {
                    if (xv0Var.y0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                xv0Var.f32716x0 = 0;
                xv0Var.i1();
            }
        }
    }

    @Override
    public final void x() {
        int a2;
        int L0;
        xv0 xv0Var = this.f29670a;
        qu0[] qu0VarArr = xv0Var.f32687k0;
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
            a2 = org.telegram.ui.Cells.t7.a(1);
        }
        qu0 qu0Var = qu0VarArr[0];
        if (qu0Var.F == 0) {
            L0 = (qu0Var.f30007x.L0() / xv0Var.f32690m1[0]) * a2;
        } else {
            L0 = qu0Var.f30007x.L0() * a2;
        }
        if (L0 >= qu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            pl0 pl0Var = qu0VarArr[0].E;
            pl0Var.f29589b = 1;
            pl0Var.c(0, 0, false, false);
            return;
        }
        qu0VarArr[0].h.x0(0);
    }
}
