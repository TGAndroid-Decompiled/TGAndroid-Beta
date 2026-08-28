package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class wr0 implements wl0 {
    public final eu0 f34347a;

    public wr0(eu0 eu0Var) {
        this.f34347a = eu0Var;
    }

    @Override
    public final void b(int i9, boolean z10) {
        eu0 eu0Var = this.f34347a;
        xs0[] xs0VarArr = eu0Var.f28137g0;
        if (xs0VarArr[0].B == i9) {
            return;
        }
        zq0 zq0Var = eu0Var.S;
        if (zq0Var != null && i9 == 8) {
            zq0Var.f44301n.f(1.0f, 0);
        }
        xs0 xs0Var = xs0VarArr[1];
        xs0Var.B = i9;
        xs0Var.setVisibility(0);
        eu0Var.k0();
        eu0Var.m1(true);
        eu0Var.f28130d1 = z10;
        eu0Var.L0();
        eu0Var.A(!eu0Var.s0(i9), true);
        eu0Var.q1(true);
    }

    @Override
    public final boolean k1(int i9, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        eu0 eu0Var = this.f34347a;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
        if (o2Var != null && eu0.d0(i9, eu0Var.Z0 instanceof TLRPC.TL_channelFull) != null) {
            if (eu0Var.Z0 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(o2Var.getMessagesController().getChat(Long.valueOf(eu0Var.Z0.f22381id)), 5)) {
                    profileTab = eu0Var.Z0.main_tab;
                    if (profileTab != null || (i9 != eu0.e0(profileTab) && eu0Var.N1 != i9)) {
                        x60 H = x60.H(o2Var, view);
                        H.W(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new qd(this, i9, 8), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (eu0Var.f28136f1 == o2Var.getUserConfig().getClientUserId() && (userFull = eu0Var.f28122a1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                x60 H2 = x60.H(o2Var, view);
                H2.W(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23001d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new qd(this, i9, 8), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void p() {
        int a2;
        int L0;
        eu0 eu0Var = this.f34347a;
        xs0[] xs0VarArr = eu0Var.f28137g0;
        int i9 = xs0VarArr[0].B;
        if (i9 != 0) {
            if (i9 != 1 && i9 != 2) {
                if (i9 != 3) {
                    if (i9 != 4) {
                        if (i9 != 5) {
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
        xs0 xs0Var = xs0VarArr[0];
        if (xs0Var.B == 0) {
            L0 = (xs0Var.f34764x.L0() / eu0Var.f28142i1[0]) * a2;
        } else {
            L0 = xs0Var.f34764x.L0() * a2;
        }
        if (L0 >= xs0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            c2.y yVar = xs0VarArr[0].A;
            yVar.f2255b = 1;
            yVar.c(0, 0, false, false);
            return;
        }
        xs0VarArr[0].h.x0(0);
    }

    @Override
    public final void v0(float f10) {
        int i9;
        int i10;
        eu0 eu0Var = this.f34347a;
        org.telegram.ui.ActionBar.w0 w0Var = eu0Var.f28143j0;
        xs0[] xs0VarArr = eu0Var.f28137g0;
        int i11 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i11 != 0 || xs0VarArr[1].getVisibility() == 0) {
            if (eu0Var.f28130d1) {
                xs0 xs0Var = xs0VarArr[0];
                xs0Var.setTranslationX((-f10) * xs0Var.getMeasuredWidth());
                xs0VarArr[1].setTranslationX(xs0VarArr[0].getMeasuredWidth() - (xs0VarArr[0].getMeasuredWidth() * f10));
            } else {
                xs0 xs0Var2 = xs0VarArr[0];
                xs0Var2.setTranslationX(xs0Var2.getMeasuredWidth() * f10);
                xs0VarArr[1].setTranslationX((xs0VarArr[0].getMeasuredWidth() * f10) - xs0VarArr[0].getMeasuredWidth());
            }
            eu0Var.M0(eu0Var.getTabProgress());
            float a02 = eu0Var.a0(f10);
            eu0Var.f28147l0 = a02;
            ImageView imageView = eu0Var.f28150n0;
            int i12 = 4;
            if (a02 != 0.0f && eu0Var.D() && !eu0Var.q0()) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            imageView.setVisibility(i9);
            if (w0Var != null && !eu0Var.D()) {
                if (eu0Var.v0()) {
                    i10 = 8;
                } else {
                    i10 = 4;
                }
                w0Var.setVisibility(i10);
                eu0Var.f28145k0 = 0.0f;
            } else {
                eu0Var.f28145k0 = eu0Var.b0(f10);
                eu0Var.t1();
            }
            eu0Var.q1(false);
            if (i11 == 0) {
                xs0 xs0Var3 = xs0VarArr[0];
                xs0VarArr[0] = xs0VarArr[1];
                xs0VarArr[1] = xs0Var3;
                xs0Var3.setVisibility(8);
                if (w0Var != null && eu0Var.f28164t0 == 2) {
                    if (eu0Var.v0()) {
                        i12 = 8;
                    }
                    w0Var.setVisibility(i12);
                }
                eu0Var.f28164t0 = 0;
                eu0Var.f1();
            }
        }
    }
}
