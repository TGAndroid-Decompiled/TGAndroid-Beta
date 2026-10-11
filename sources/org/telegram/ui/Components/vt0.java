package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class vt0 implements tn0 {
    public final dw0 f32481a;

    public vt0(dw0 dw0Var) {
        this.f32481a = dw0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        dw0 dw0Var = this.f32481a;
        wu0[] wu0VarArr = dw0Var.f25711k0;
        int i10 = wu0VarArr[0].F;
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
        wu0 wu0Var = wu0VarArr[0];
        if (wu0Var.F == 0) {
            L0 = (wu0Var.f32747x.L0() / dw0Var.f25714m1[0]) * a2;
        } else {
            L0 = wu0Var.f32747x.L0() * a2;
        }
        if (L0 >= wu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            vl0 vl0Var = wu0VarArr[0].E;
            vl0Var.f31837b = 1;
            vl0Var.c(0, 0, false, false);
            return;
        }
        wu0VarArr[0].h.x0(0);
    }

    @Override
    public final void d(int i10, boolean z10) {
        dw0 dw0Var = this.f32481a;
        wu0[] wu0VarArr = dw0Var.f25711k0;
        if (wu0VarArr[0].F == i10) {
            return;
        }
        ys0 ys0Var = dw0Var.W;
        if (ys0Var != null && i10 == 8) {
            ys0Var.f44556n.f(1.0f, 0);
        }
        wu0 wu0Var = wu0VarArr[1];
        wu0Var.F = i10;
        wu0Var.setVisibility(0);
        dw0Var.k0();
        dw0Var.m1(true);
        dw0Var.f25706h1 = z10;
        dw0Var.L0();
        dw0Var.A(!dw0Var.s0(i10), true);
        dw0Var.q1(true);
    }

    @Override
    public final boolean k1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        dw0 dw0Var = this.f32481a;
        org.telegram.ui.ActionBar.m2 m2Var = dw0Var.f25735v1;
        if (m2Var != null && dw0.d0(i10, dw0Var.f25696d1 instanceof TLRPC.TL_channelFull) != null) {
            if (dw0Var.f25696d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(m2Var.getMessagesController().getChat(Long.valueOf(dw0Var.f25696d1.f20033id)), 5)) {
                    profileTab = dw0Var.f25696d1.main_tab;
                    if (profileTab != null || (i10 != dw0.e0(profileTab) && dw0Var.R1 != i10)) {
                        q80 H = q80.H(m2Var, view);
                        H.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new nd(this, i10, 10), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (dw0Var.f25710j1 == m2Var.getUserConfig().getClientUserId() && (userFull = dw0Var.f25699e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                q80 H2 = q80.H(m2Var, view);
                H2.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20786d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new nd(this, i10, 10), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void u0(float f7) {
        wu0 wu0Var;
        int i10;
        int i11;
        wu0 wu0Var2;
        dw0 dw0Var = this.f32481a;
        org.telegram.ui.ActionBar.u0 u0Var = dw0Var.f25716n0;
        wu0[] wu0VarArr = dw0Var.f25711k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || wu0VarArr[1].getVisibility() == 0) {
            if (dw0Var.f25706h1) {
                wu0VarArr[0].setTranslationX((-f7) * wu0Var2.getMeasuredWidth());
                wu0VarArr[1].setTranslationX(wu0VarArr[0].getMeasuredWidth() - (wu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                wu0VarArr[0].setTranslationX(wu0Var.getMeasuredWidth() * f7);
                wu0VarArr[1].setTranslationX((wu0VarArr[0].getMeasuredWidth() * f7) - wu0VarArr[0].getMeasuredWidth());
            }
            dw0Var.M0(dw0Var.getTabProgress());
            float a02 = dw0Var.a0(f7);
            dw0Var.f25720p0 = a02;
            ImageView imageView = dw0Var.f25725r0;
            int i13 = 4;
            if (a02 != 0.0f && dw0Var.D() && !dw0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (u0Var != null && !dw0Var.D()) {
                if (dw0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                dw0Var.f25718o0 = 0.0f;
            } else {
                dw0Var.f25718o0 = dw0Var.b0(f7);
                dw0Var.t1();
            }
            dw0Var.q1(false);
            if (i12 == 0) {
                wu0 wu0Var3 = wu0VarArr[0];
                wu0VarArr[0] = wu0VarArr[1];
                wu0VarArr[1] = wu0Var3;
                wu0Var3.setVisibility(8);
                if (u0Var != null && dw0Var.f25740x0 == 2) {
                    if (dw0Var.v0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                dw0Var.f25740x0 = 0;
                dw0Var.f1();
            }
        }
    }
}
