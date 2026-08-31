package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class qs0 implements um0 {
    public final zu0 f30476a;

    public qs0(zu0 zu0Var) {
        this.f30476a = zu0Var;
    }

    @Override
    public final void B() {
        int a2;
        int L0;
        zu0 zu0Var = this.f30476a;
        rt0[] rt0VarArr = zu0Var.f33980h0;
        int i10 = rt0VarArr[0].C;
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
        rt0 rt0Var = rt0VarArr[0];
        if (rt0Var.C == 0) {
            L0 = (rt0Var.f30853x.L0() / zu0Var.f33985j1[0]) * a2;
        } else {
            L0 = rt0Var.f30853x.L0() * a2;
        }
        if (L0 >= rt0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            c2.y yVar = rt0VarArr[0].B;
            yVar.f2206b = 1;
            yVar.c(0, 0, false, false);
            return;
        }
        rt0VarArr[0].h.x0(0);
    }

    @Override
    public final void f(int i10, boolean z4) {
        zu0 zu0Var = this.f30476a;
        rt0[] rt0VarArr = zu0Var.f33980h0;
        if (rt0VarArr[0].C == i10) {
            return;
        }
        tr0 tr0Var = zu0Var.T;
        if (tr0Var != null && i10 == 8) {
            tr0Var.f38931n.f(1.0f, 0);
        }
        rt0 rt0Var = rt0VarArr[1];
        rt0Var.C = i10;
        rt0Var.setVisibility(0);
        zu0Var.k0();
        zu0Var.m1(true);
        zu0Var.f33974e1 = z4;
        zu0Var.L0();
        zu0Var.A(!zu0Var.s0(i10), true);
        zu0Var.q1(true);
    }

    @Override
    public final boolean j1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        zu0 zu0Var = this.f30476a;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
        if (p2Var != null && zu0.d0(i10, zu0Var.f33963a1 instanceof TLRPC.TL_channelFull) != null) {
            if (zu0Var.f33963a1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(p2Var.getMessagesController().getChat(Long.valueOf(zu0Var.f33963a1.f20844id)), 5)) {
                    profileTab = zu0Var.f33963a1.main_tab;
                    if (profileTab != null || (i10 != zu0.e0(profileTab) && zu0Var.O1 != i10)) {
                        q70 H = q70.H(p2Var, view);
                        H.W(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new jm(this, i10, 7), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (zu0Var.f33979g1 == p2Var.getUserConfig().getClientUserId() && (userFull = zu0Var.f33966b1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                q70 H2 = q70.H(p2Var, view);
                H2.W(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21659d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new jm(this, i10, 7), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void w0(float f10) {
        int i10;
        int i11;
        zu0 zu0Var = this.f30476a;
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.f33986k0;
        rt0[] rt0VarArr = zu0Var.f33980h0;
        int i12 = (f10 > 1.0f ? 1 : (f10 == 1.0f ? 0 : -1));
        if (i12 != 0 || rt0VarArr[1].getVisibility() == 0) {
            if (zu0Var.f33974e1) {
                rt0 rt0Var = rt0VarArr[0];
                rt0Var.setTranslationX((-f10) * rt0Var.getMeasuredWidth());
                rt0VarArr[1].setTranslationX(rt0VarArr[0].getMeasuredWidth() - (rt0VarArr[0].getMeasuredWidth() * f10));
            } else {
                rt0 rt0Var2 = rt0VarArr[0];
                rt0Var2.setTranslationX(rt0Var2.getMeasuredWidth() * f10);
                rt0VarArr[1].setTranslationX((rt0VarArr[0].getMeasuredWidth() * f10) - rt0VarArr[0].getMeasuredWidth());
            }
            zu0Var.M0(zu0Var.getTabProgress());
            float a02 = zu0Var.a0(f10);
            zu0Var.m0 = a02;
            ImageView imageView = zu0Var.f33993o0;
            int i13 = 4;
            if (a02 != 0.0f && zu0Var.D() && !zu0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (w0Var != null && !zu0Var.D()) {
                if (zu0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                w0Var.setVisibility(i11);
                zu0Var.f33988l0 = 0.0f;
            } else {
                zu0Var.f33988l0 = zu0Var.b0(f10);
                zu0Var.t1();
            }
            zu0Var.q1(false);
            if (i12 == 0) {
                rt0 rt0Var3 = rt0VarArr[0];
                rt0VarArr[0] = rt0VarArr[1];
                rt0VarArr[1] = rt0Var3;
                rt0Var3.setVisibility(8);
                if (w0Var != null && zu0Var.f34007u0 == 2) {
                    if (zu0Var.v0()) {
                        i13 = 8;
                    }
                    w0Var.setVisibility(i13);
                }
                zu0Var.f34007u0 = 0;
                zu0Var.f1();
            }
        }
    }
}
