package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class it0 implements dn0 {
    public final qv0 f27597a;

    public it0(qv0 qv0Var) {
        this.f27597a = qv0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        qv0 qv0Var = this.f27597a;
        ju0[] ju0VarArr = qv0Var.f30239k0;
        int i10 = ju0VarArr[0].F;
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
        ju0 ju0Var = ju0VarArr[0];
        if (ju0Var.F == 0) {
            L0 = (ju0Var.f27980x.L0() / qv0Var.f30242m1[0]) * a2;
        } else {
            L0 = ju0Var.f27980x.L0() * a2;
        }
        if (L0 >= ju0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            bl0 bl0Var = ju0VarArr[0].E;
            bl0Var.f25015b = 1;
            bl0Var.d(0, 0, false, false);
            return;
        }
        ju0VarArr[0].h.y0(0);
    }

    @Override
    public final void E0(float f7) {
        int i10;
        int i11;
        qv0 qv0Var = this.f27597a;
        org.telegram.ui.ActionBar.v0 v0Var = qv0Var.f30244n0;
        ju0[] ju0VarArr = qv0Var.f30239k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || ju0VarArr[1].getVisibility() == 0) {
            if (qv0Var.f30234h1) {
                ju0 ju0Var = ju0VarArr[0];
                ju0Var.setTranslationX((-f7) * ju0Var.getMeasuredWidth());
                ju0VarArr[1].setTranslationX(ju0VarArr[0].getMeasuredWidth() - (ju0VarArr[0].getMeasuredWidth() * f7));
            } else {
                ju0 ju0Var2 = ju0VarArr[0];
                ju0Var2.setTranslationX(ju0Var2.getMeasuredWidth() * f7);
                ju0VarArr[1].setTranslationX((ju0VarArr[0].getMeasuredWidth() * f7) - ju0VarArr[0].getMeasuredWidth());
            }
            qv0Var.M0(qv0Var.getTabProgress());
            float a02 = qv0Var.a0(f7);
            qv0Var.f30248p0 = a02;
            ImageView imageView = qv0Var.f30253r0;
            int i13 = 4;
            if (a02 != 0.0f && qv0Var.D() && !qv0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (v0Var != null && !qv0Var.D()) {
                if (qv0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                v0Var.setVisibility(i11);
                qv0Var.f30246o0 = 0.0f;
            } else {
                qv0Var.f30246o0 = qv0Var.b0(f7);
                qv0Var.t1();
            }
            qv0Var.q1(false);
            if (i12 == 0) {
                ju0 ju0Var3 = ju0VarArr[0];
                ju0VarArr[0] = ju0VarArr[1];
                ju0VarArr[1] = ju0Var3;
                ju0Var3.setVisibility(8);
                if (v0Var != null && qv0Var.f30268x0 == 2) {
                    if (qv0Var.v0()) {
                        i13 = 8;
                    }
                    v0Var.setVisibility(i13);
                }
                qv0Var.f30268x0 = 0;
                qv0Var.f1();
            }
        }
    }

    @Override
    public final void b(int i10, boolean z10) {
        qv0 qv0Var = this.f27597a;
        ju0[] ju0VarArr = qv0Var.f30239k0;
        if (ju0VarArr[0].F == i10) {
            return;
        }
        ls0 ls0Var = qv0Var.W;
        if (ls0Var != null && i10 == 8) {
            ls0Var.f40686n.f(1.0f, 0);
        }
        ju0 ju0Var = ju0VarArr[1];
        ju0Var.F = i10;
        ju0Var.setVisibility(0);
        qv0Var.k0();
        qv0Var.m1(true);
        qv0Var.f30234h1 = z10;
        qv0Var.L0();
        qv0Var.A(!qv0Var.s0(i10), true);
        qv0Var.q1(true);
    }

    @Override
    public final boolean o1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        qv0 qv0Var = this.f27597a;
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.f30263v1;
        if (n2Var != null && qv0.d0(i10, qv0Var.f30224d1 instanceof TLRPC.TL_channelFull) != null) {
            if (qv0Var.f30224d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(qv0Var.f30224d1.f20048id)), 5)) {
                    profileTab = qv0Var.f30224d1.main_tab;
                    if (profileTab != null || (i10 != qv0.e0(profileTab) && qv0Var.R1 != i10)) {
                        b80 H = b80.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ld(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (qv0Var.f30238j1 == n2Var.getUserConfig().getClientUserId() && (userFull = qv0Var.f30227e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                b80 H2 = b80.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20827d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ld(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
