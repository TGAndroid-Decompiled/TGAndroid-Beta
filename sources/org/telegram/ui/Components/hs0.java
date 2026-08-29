package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class hs0 implements jm0 {
    public final qu0 f29223a;

    public hs0(qu0 qu0Var) {
        this.f29223a = qu0Var;
    }

    @Override
    public final void e(int i10, boolean z10) {
        qu0 qu0Var = this.f29223a;
        it0[] it0VarArr = qu0Var.f32070g0;
        if (it0VarArr[0].B == i10) {
            return;
        }
        kr0 kr0Var = qu0Var.S;
        if (kr0Var != null && i10 == 8) {
            kr0Var.f44686n.f(1.0f, 0);
        }
        it0 it0Var = it0VarArr[1];
        it0Var.B = i10;
        it0Var.setVisibility(0);
        qu0Var.k0();
        qu0Var.m1(true);
        qu0Var.f32063d1 = z10;
        qu0Var.L0();
        qu0Var.A(!qu0Var.s0(i10), true);
        qu0Var.q1(true);
    }

    @Override
    public final boolean i1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        qu0 qu0Var = this.f29223a;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
        if (o2Var != null && qu0.d0(i10, qu0Var.Z0 instanceof TLRPC.TL_channelFull) != null) {
            if (qu0Var.Z0 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(o2Var.getMessagesController().getChat(Long.valueOf(qu0Var.Z0.f22393id)), 5)) {
                    profileTab = qu0Var.Z0.main_tab;
                    if (profileTab != null || (i10 != qu0.e0(profileTab) && qu0Var.N1 != i10)) {
                        j70 H = j70.H(o2Var, view);
                        H.W(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new i8(this, i10, 10), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (qu0Var.f32069f1 == o2Var.getUserConfig().getClientUserId() && (userFull = qu0Var.f32055a1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                j70 H2 = j70.H(o2Var, view);
                H2.W(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23062d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new i8(this, i10, 10), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void u0(float f9) {
        int i10;
        int i11;
        qu0 qu0Var = this.f29223a;
        org.telegram.ui.ActionBar.w0 w0Var = qu0Var.f32076j0;
        it0[] it0VarArr = qu0Var.f32070g0;
        int i12 = (f9 > 1.0f ? 1 : (f9 == 1.0f ? 0 : -1));
        if (i12 != 0 || it0VarArr[1].getVisibility() == 0) {
            if (qu0Var.f32063d1) {
                it0 it0Var = it0VarArr[0];
                it0Var.setTranslationX((-f9) * it0Var.getMeasuredWidth());
                it0VarArr[1].setTranslationX(it0VarArr[0].getMeasuredWidth() - (it0VarArr[0].getMeasuredWidth() * f9));
            } else {
                it0 it0Var2 = it0VarArr[0];
                it0Var2.setTranslationX(it0Var2.getMeasuredWidth() * f9);
                it0VarArr[1].setTranslationX((it0VarArr[0].getMeasuredWidth() * f9) - it0VarArr[0].getMeasuredWidth());
            }
            qu0Var.M0(qu0Var.getTabProgress());
            float a02 = qu0Var.a0(f9);
            qu0Var.f32080l0 = a02;
            ImageView imageView = qu0Var.f32083n0;
            int i13 = 4;
            if (a02 != 0.0f && qu0Var.D() && !qu0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (w0Var != null && !qu0Var.D()) {
                if (qu0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                w0Var.setVisibility(i11);
                qu0Var.f32078k0 = 0.0f;
            } else {
                qu0Var.f32078k0 = qu0Var.b0(f9);
                qu0Var.t1();
            }
            qu0Var.q1(false);
            if (i12 == 0) {
                it0 it0Var3 = it0VarArr[0];
                it0VarArr[0] = it0VarArr[1];
                it0VarArr[1] = it0Var3;
                it0Var3.setVisibility(8);
                if (w0Var != null && qu0Var.f32097t0 == 2) {
                    if (qu0Var.v0()) {
                        i13 = 8;
                    }
                    w0Var.setVisibility(i13);
                }
                qu0Var.f32097t0 = 0;
                qu0Var.f1();
            }
        }
    }

    @Override
    public final void x() {
        int a2;
        int L0;
        qu0 qu0Var = this.f29223a;
        it0[] it0VarArr = qu0Var.f32070g0;
        int i10 = it0VarArr[0].B;
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
            a2 = org.telegram.ui.Cells.q7.a(1);
        }
        it0 it0Var = it0VarArr[0];
        if (it0Var.B == 0) {
            L0 = (it0Var.f29472x.L0() / qu0Var.f32075i1[0]) * a2;
        } else {
            L0 = it0Var.f29472x.L0() * a2;
        }
        if (L0 >= it0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            c2.z zVar = it0VarArr[0].A;
            zVar.f2933b = 1;
            zVar.c(0, 0, false, false);
            return;
        }
        it0VarArr[0].h.x0(0);
    }
}
