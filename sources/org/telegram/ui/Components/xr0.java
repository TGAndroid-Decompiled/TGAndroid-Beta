package org.telegram.ui.Components;

import android.view.View;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;

public final class xr0 implements zl0 {

    public final hu0 f34689a;

    public xr0(hu0 hu0Var) {
        this.f34689a = hu0Var;
    }

    @Override
    public final void b(int i10, boolean z10) {
        hu0 hu0Var = this.f34689a;
        zs0[] zs0VarArr = hu0Var.f29122g0;
        if (zs0VarArr[0].B == i10) {
            return;
        }
        ar0 ar0Var = hu0Var.S;
        if (ar0Var != null && i10 == 8) {
            ar0Var.f44655n.f(1.0f, 0);
        }
        zs0 zs0Var = zs0VarArr[1];
        zs0Var.B = i10;
        zs0Var.setVisibility(0);
        hu0Var.k0();
        hu0Var.m1(true);
        hu0Var.f29115d1 = z10;
        hu0Var.L0();
        hu0Var.A(!hu0Var.s0(i10), true);
        hu0Var.q1(true);
    }

    @Override
    public final boolean l1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        hu0 hu0Var = this.f34689a;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
        if (n2Var != null && hu0.d0(i10, hu0Var.Z0 instanceof TLRPC.TL_channelFull) != null) {
            if (hu0Var.Z0 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(hu0Var.Z0.f22381id)), 5)) {
                    profileTab = hu0Var.Z0.main_tab;
                    if (profileTab != null || (i10 != hu0.e0(profileTab) && hu0Var.N1 != i10)) {
                        b70 b70VarH = b70.H(n2Var, view);
                        b70VarH.W(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false)));
                        b70VarH.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new xl(this, i10, 7), false);
                        b70VarH.Z();
                        return true;
                    }
                }
            } else if (hu0Var.f29121f1 == n2Var.getUserConfig().getClientUserId() && (userFull = hu0Var.f29107a1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                b70 b70VarH2 = b70.H(n2Var, view);
                b70VarH2.W(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23053d6, false)));
                b70VarH2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new xl(this, i10, 7), false);
                b70VarH2.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void o0(float f10) {
        hu0 hu0Var = this.f34689a;
        org.telegram.ui.ActionBar.v0 v0Var = hu0Var.f29128j0;
        zs0[] zs0VarArr = hu0Var.f29122g0;
        if (f10 != 1.0f || zs0VarArr[1].getVisibility() == 0) {
            if (hu0Var.f29115d1) {
                zs0 zs0Var = zs0VarArr[0];
                zs0Var.setTranslationX((-f10) * zs0Var.getMeasuredWidth());
                zs0VarArr[1].setTranslationX(zs0VarArr[0].getMeasuredWidth() - (zs0VarArr[0].getMeasuredWidth() * f10));
            } else {
                zs0 zs0Var2 = zs0VarArr[0];
                zs0Var2.setTranslationX(zs0Var2.getMeasuredWidth() * f10);
                zs0VarArr[1].setTranslationX((zs0VarArr[0].getMeasuredWidth() * f10) - zs0VarArr[0].getMeasuredWidth());
            }
            hu0Var.M0(hu0Var.getTabProgress());
            float fA0 = hu0Var.a0(f10);
            hu0Var.f29132l0 = fA0;
            hu0Var.f29135n0.setVisibility((fA0 == 0.0f || !hu0Var.D() || hu0Var.q0()) ? 4 : 0);
            if (v0Var == null || hu0Var.D()) {
                hu0Var.f29130k0 = hu0Var.b0(f10);
                hu0Var.t1();
            } else {
                v0Var.setVisibility(hu0Var.v0() ? 8 : 4);
                hu0Var.f29130k0 = 0.0f;
            }
            hu0Var.q1(false);
            if (f10 == 1.0f) {
                zs0 zs0Var3 = zs0VarArr[0];
                zs0VarArr[0] = zs0VarArr[1];
                zs0VarArr[1] = zs0Var3;
                zs0Var3.setVisibility(8);
                if (v0Var != null && hu0Var.f29149t0 == 2) {
                    v0Var.setVisibility(hu0Var.v0() ? 8 : 4);
                }
                hu0Var.f29149t0 = 0;
                hu0Var.f1();
            }
        }
    }

    @Override
    public final void w() {
        int iA;
        hu0 hu0Var = this.f34689a;
        zs0[] zs0VarArr = hu0Var.f29122g0;
        int i10 = zs0VarArr[0].B;
        if (i10 == 0) {
            iA = org.telegram.ui.Cells.p7.a(1);
        } else if (i10 == 1 || i10 == 2) {
            iA = AndroidUtilities.dp(56.0f);
        } else if (i10 == 3) {
            iA = AndroidUtilities.dp(100.0f);
        } else if (i10 != 4) {
            iA = i10 != 5 ? AndroidUtilities.dp(58.0f) : AndroidUtilities.dp(60.0f);
        } else {
            iA = AndroidUtilities.dp(56.0f);
        }
        zs0 zs0Var = zs0VarArr[0];
        if ((zs0Var.B == 0 ? (zs0Var.f35343x.L0() / hu0Var.f29127i1[0]) * iA : zs0Var.f35343x.L0() * iA) < zs0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            zs0VarArr[0].h.x0(0);
            return;
        }
        c2.x xVar = zs0VarArr[0].A;
        xVar.f2367b = 1;
        xVar.d(0, 0, false, false);
    }
}
