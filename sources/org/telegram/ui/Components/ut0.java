package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ut0 implements sn0 {
    public final cw0 f31719a;

    public ut0(cw0 cw0Var) {
        this.f31719a = cw0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        cw0 cw0Var = this.f31719a;
        vu0[] vu0VarArr = cw0Var.f25512k0;
        int i10 = vu0VarArr[0].F;
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
        vu0 vu0Var = vu0VarArr[0];
        if (vu0Var.F == 0) {
            L0 = (vu0Var.f32559x.L0() / cw0Var.f25515m1[0]) * a2;
        } else {
            L0 = vu0Var.f32559x.L0() * a2;
        }
        if (L0 >= vu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ul0 ul0Var = vu0VarArr[0].E;
            ul0Var.f31630b = 1;
            ul0Var.c(0, 0, false, false);
            return;
        }
        vu0VarArr[0].h.x0(0);
    }

    @Override
    public final void d(int i10, boolean z10) {
        cw0 cw0Var = this.f31719a;
        vu0[] vu0VarArr = cw0Var.f25512k0;
        if (vu0VarArr[0].F == i10) {
            return;
        }
        xs0 xs0Var = cw0Var.W;
        if (xs0Var != null && i10 == 8) {
            xs0Var.f44590n.f(1.0f, 0);
        }
        vu0 vu0Var = vu0VarArr[1];
        vu0Var.F = i10;
        vu0Var.setVisibility(0);
        cw0Var.k0();
        cw0Var.m1(true);
        cw0Var.f25507h1 = z10;
        cw0Var.L0();
        cw0Var.A(!cw0Var.s0(i10), true);
        cw0Var.q1(true);
    }

    @Override
    public final boolean k1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        cw0 cw0Var = this.f31719a;
        org.telegram.ui.ActionBar.m2 m2Var = cw0Var.f25536v1;
        if (m2Var != null && cw0.d0(i10, cw0Var.f25497d1 instanceof TLRPC.TL_channelFull) != null) {
            if (cw0Var.f25497d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(m2Var.getMessagesController().getChat(Long.valueOf(cw0Var.f25497d1.f20069id)), 5)) {
                    profileTab = cw0Var.f25497d1.main_tab;
                    if (profileTab != null || (i10 != cw0.e0(profileTab) && cw0Var.R1 != i10)) {
                        p80 H = p80.H(m2Var, view);
                        H.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new nd(this, i10, 10), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (cw0Var.f25511j1 == m2Var.getUserConfig().getClientUserId() && (userFull = cw0Var.f25500e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                p80 H2 = p80.H(m2Var, view);
                H2.W(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20822d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new nd(this, i10, 10), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void u0(float f7) {
        vu0 vu0Var;
        int i10;
        int i11;
        vu0 vu0Var2;
        cw0 cw0Var = this.f31719a;
        org.telegram.ui.ActionBar.u0 u0Var = cw0Var.f25517n0;
        vu0[] vu0VarArr = cw0Var.f25512k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || vu0VarArr[1].getVisibility() == 0) {
            if (cw0Var.f25507h1) {
                vu0VarArr[0].setTranslationX((-f7) * vu0Var2.getMeasuredWidth());
                vu0VarArr[1].setTranslationX(vu0VarArr[0].getMeasuredWidth() - (vu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                vu0VarArr[0].setTranslationX(vu0Var.getMeasuredWidth() * f7);
                vu0VarArr[1].setTranslationX((vu0VarArr[0].getMeasuredWidth() * f7) - vu0VarArr[0].getMeasuredWidth());
            }
            cw0Var.M0(cw0Var.getTabProgress());
            float a02 = cw0Var.a0(f7);
            cw0Var.f25521p0 = a02;
            ImageView imageView = cw0Var.f25526r0;
            int i13 = 4;
            if (a02 != 0.0f && cw0Var.D() && !cw0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (u0Var != null && !cw0Var.D()) {
                if (cw0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                cw0Var.f25519o0 = 0.0f;
            } else {
                cw0Var.f25519o0 = cw0Var.b0(f7);
                cw0Var.t1();
            }
            cw0Var.q1(false);
            if (i12 == 0) {
                vu0 vu0Var3 = vu0VarArr[0];
                vu0VarArr[0] = vu0VarArr[1];
                vu0VarArr[1] = vu0Var3;
                vu0Var3.setVisibility(8);
                if (u0Var != null && cw0Var.f25541x0 == 2) {
                    if (cw0Var.v0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                cw0Var.f25541x0 = 0;
                cw0Var.f1();
            }
        }
    }
}
