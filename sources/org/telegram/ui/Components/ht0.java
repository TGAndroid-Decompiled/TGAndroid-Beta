package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ht0 implements dn0 {
    public final pv0 f27234a;

    public ht0(pv0 pv0Var) {
        this.f27234a = pv0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        pv0 pv0Var = this.f27234a;
        iu0[] iu0VarArr = pv0Var.f29777k0;
        int i10 = iu0VarArr[0].F;
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
        iu0 iu0Var = iu0VarArr[0];
        if (iu0Var.F == 0) {
            L0 = (iu0Var.f27505x.L0() / pv0Var.f29780m1[0]) * a2;
        } else {
            L0 = iu0Var.f27505x.L0() * a2;
        }
        if (L0 >= iu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            bl0 bl0Var = iu0VarArr[0].E;
            bl0Var.f24995b = 1;
            bl0Var.d(0, 0, false, false);
            return;
        }
        iu0VarArr[0].h.y0(0);
    }

    @Override
    public final void E0(float f7) {
        int i10;
        int i11;
        pv0 pv0Var = this.f27234a;
        org.telegram.ui.ActionBar.v0 v0Var = pv0Var.f29782n0;
        iu0[] iu0VarArr = pv0Var.f29777k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || iu0VarArr[1].getVisibility() == 0) {
            if (pv0Var.f29772h1) {
                iu0 iu0Var = iu0VarArr[0];
                iu0Var.setTranslationX((-f7) * iu0Var.getMeasuredWidth());
                iu0VarArr[1].setTranslationX(iu0VarArr[0].getMeasuredWidth() - (iu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                iu0 iu0Var2 = iu0VarArr[0];
                iu0Var2.setTranslationX(iu0Var2.getMeasuredWidth() * f7);
                iu0VarArr[1].setTranslationX((iu0VarArr[0].getMeasuredWidth() * f7) - iu0VarArr[0].getMeasuredWidth());
            }
            pv0Var.M0(pv0Var.getTabProgress());
            float a02 = pv0Var.a0(f7);
            pv0Var.f29786p0 = a02;
            ImageView imageView = pv0Var.f29791r0;
            int i13 = 4;
            if (a02 != 0.0f && pv0Var.D() && !pv0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (v0Var != null && !pv0Var.D()) {
                if (pv0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                v0Var.setVisibility(i11);
                pv0Var.f29784o0 = 0.0f;
            } else {
                pv0Var.f29784o0 = pv0Var.b0(f7);
                pv0Var.t1();
            }
            pv0Var.q1(false);
            if (i12 == 0) {
                iu0 iu0Var3 = iu0VarArr[0];
                iu0VarArr[0] = iu0VarArr[1];
                iu0VarArr[1] = iu0Var3;
                iu0Var3.setVisibility(8);
                if (v0Var != null && pv0Var.f29806x0 == 2) {
                    if (pv0Var.v0()) {
                        i13 = 8;
                    }
                    v0Var.setVisibility(i13);
                }
                pv0Var.f29806x0 = 0;
                pv0Var.f1();
            }
        }
    }

    @Override
    public final void b(int i10, boolean z10) {
        pv0 pv0Var = this.f27234a;
        iu0[] iu0VarArr = pv0Var.f29777k0;
        if (iu0VarArr[0].F == i10) {
            return;
        }
        ks0 ks0Var = pv0Var.W;
        if (ks0Var != null && i10 == 8) {
            ks0Var.f40668n.f(1.0f, 0);
        }
        iu0 iu0Var = iu0VarArr[1];
        iu0Var.F = i10;
        iu0Var.setVisibility(0);
        pv0Var.k0();
        pv0Var.m1(true);
        pv0Var.f29772h1 = z10;
        pv0Var.L0();
        pv0Var.A(!pv0Var.s0(i10), true);
        pv0Var.q1(true);
    }

    @Override
    public final boolean o1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        pv0 pv0Var = this.f27234a;
        org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29801v1;
        if (n2Var != null && pv0.d0(i10, pv0Var.f29762d1 instanceof TLRPC.TL_channelFull) != null) {
            if (pv0Var.f29762d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(pv0Var.f29762d1.f20039id)), 5)) {
                    profileTab = pv0Var.f29762d1.main_tab;
                    if (profileTab != null || (i10 != pv0.e0(profileTab) && pv0Var.R1 != i10)) {
                        b80 H = b80.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20818d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ld(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (pv0Var.f29776j1 == n2Var.getUserConfig().getClientUserId() && (userFull = pv0Var.f29765e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                b80 H2 = b80.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.i6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20818d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ld(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
