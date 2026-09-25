package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bt0 implements xm0 {
    public final jv0 f23091a;

    public bt0(jv0 jv0Var) {
        this.f23091a = jv0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        jv0 jv0Var = this.f23091a;
        cu0[] cu0VarArr = jv0Var.f25536k0;
        int i10 = cu0VarArr[0].F;
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
        cu0 cu0Var = cu0VarArr[0];
        if (cu0Var.F == 0) {
            L0 = (cu0Var.f23403x.L0() / jv0Var.f25539m1[0]) * a2;
        } else {
            L0 = cu0Var.f23403x.L0() * a2;
        }
        if (L0 >= cu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            zk0 zk0Var = cu0VarArr[0].E;
            zk0Var.f30915b = 1;
            zk0Var.c(0, 0, false, false);
            return;
        }
        cu0VarArr[0].h.x0(0);
    }

    @Override
    public final void C0(float f7) {
        int i10;
        int i11;
        jv0 jv0Var = this.f23091a;
        org.telegram.ui.ActionBar.u0 u0Var = jv0Var.f25541n0;
        cu0[] cu0VarArr = jv0Var.f25536k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || cu0VarArr[1].getVisibility() == 0) {
            if (jv0Var.f25531h1) {
                cu0 cu0Var = cu0VarArr[0];
                cu0Var.setTranslationX((-f7) * cu0Var.getMeasuredWidth());
                cu0VarArr[1].setTranslationX(cu0VarArr[0].getMeasuredWidth() - (cu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                cu0 cu0Var2 = cu0VarArr[0];
                cu0Var2.setTranslationX(cu0Var2.getMeasuredWidth() * f7);
                cu0VarArr[1].setTranslationX((cu0VarArr[0].getMeasuredWidth() * f7) - cu0VarArr[0].getMeasuredWidth());
            }
            jv0Var.M0(jv0Var.getTabProgress());
            float a02 = jv0Var.a0(f7);
            jv0Var.f25545p0 = a02;
            ImageView imageView = jv0Var.f25550r0;
            int i13 = 4;
            if (a02 != 0.0f && jv0Var.D() && !jv0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (u0Var != null && !jv0Var.D()) {
                if (jv0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                jv0Var.f25543o0 = 0.0f;
            } else {
                jv0Var.f25543o0 = jv0Var.b0(f7);
                jv0Var.t1();
            }
            jv0Var.q1(false);
            if (i12 == 0) {
                cu0 cu0Var3 = cu0VarArr[0];
                cu0VarArr[0] = cu0VarArr[1];
                cu0VarArr[1] = cu0Var3;
                cu0Var3.setVisibility(8);
                if (u0Var != null && jv0Var.f25565x0 == 2) {
                    if (jv0Var.v0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                jv0Var.f25565x0 = 0;
                jv0Var.f1();
            }
        }
    }

    @Override
    public final void d(int i10, boolean z10) {
        jv0 jv0Var = this.f23091a;
        cu0[] cu0VarArr = jv0Var.f25536k0;
        if (cu0VarArr[0].F == i10) {
            return;
        }
        es0 es0Var = jv0Var.W;
        if (es0Var != null && i10 == 8) {
            es0Var.f37567n.f(1.0f, 0);
        }
        cu0 cu0Var = cu0VarArr[1];
        cu0Var.F = i10;
        cu0Var.setVisibility(0);
        jv0Var.k0();
        jv0Var.m1(true);
        jv0Var.f25531h1 = z10;
        jv0Var.L0();
        jv0Var.A(!jv0Var.s0(i10), true);
        jv0Var.q1(true);
    }

    @Override
    public final boolean n1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        jv0 jv0Var = this.f23091a;
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.f25560v1;
        if (m2Var != null && jv0.d0(i10, jv0Var.f25522d1 instanceof TLRPC.TL_channelFull) != null) {
            if (jv0Var.f25522d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(m2Var.getMessagesController().getChat(Long.valueOf(jv0Var.f25522d1.f18337id)), 5)) {
                    profileTab = jv0Var.f25522d1.main_tab;
                    if (profileTab != null || (i10 != jv0.e0(profileTab) && jv0Var.R1 != i10)) {
                        y70 H = y70.H(m2Var, view);
                        H.W(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ld(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (jv0Var.f25535j1 == m2Var.getUserConfig().getClientUserId() && (userFull = jv0Var.f25524e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                y70 H2 = y70.H(m2Var, view);
                H2.W(org.telegram.ui.ActionBar.h6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.w0(null, org.telegram.ui.ActionBar.h6.f19060d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ld(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
