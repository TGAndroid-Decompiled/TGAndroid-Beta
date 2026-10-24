package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ot0 implements mn0 {
    public final wv0 f29380a;

    public ot0(wv0 wv0Var) {
        this.f29380a = wv0Var;
    }

    @Override
    public final boolean b1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        wv0 wv0Var = this.f29380a;
        org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
        if (o2Var != null) {
            boolean u02 = wv0Var.u0();
            if (wv0.f0(i10, u02) != null) {
                if (u02) {
                    if (ChatObject.canUserDoAction(o2Var.getMessagesController().getChat(Long.valueOf(wv0Var.f32369d1.f20345id)), 5)) {
                        profileTab = wv0Var.f32369d1.main_tab;
                        if (profileTab != null || (i10 != wv0.g0(profileTab) && wv0Var.S1 != i10)) {
                            h80 H = h80.H(o2Var, view);
                            H.W(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false)));
                            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new ai.z8(this, u02, i10, 4), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (wv0Var.f32385j1 == o2Var.getUserConfig().getClientUserId() && (userFull = wv0Var.f32372e1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    h80 H2 = h80.H(o2Var, view);
                    H2.W(org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false)));
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
        wv0 wv0Var = this.f29380a;
        pu0[] pu0VarArr = wv0Var.f32386k0;
        if (pu0VarArr[0].F == i10) {
            return;
        }
        rs0 rs0Var = wv0Var.W;
        if (rs0Var != null && i10 == 8) {
            rs0Var.f37714n.f(1.0f, 0);
        }
        pu0 pu0Var = pu0VarArr[1];
        pu0Var.F = i10;
        pu0Var.setVisibility(0);
        wv0Var.m0();
        wv0Var.p1(true);
        wv0Var.f32381h1 = z10;
        wv0Var.O0();
        wv0Var.A(!wv0Var.v0(i10), true);
        wv0Var.u1(true);
    }

    @Override
    public final void k0(float f7) {
        pu0 pu0Var;
        int i10;
        int i11;
        pu0 pu0Var2;
        wv0 wv0Var = this.f29380a;
        org.telegram.ui.ActionBar.u0 u0Var = wv0Var.f32391n0;
        pu0[] pu0VarArr = wv0Var.f32386k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || pu0VarArr[1].getVisibility() == 0) {
            if (wv0Var.f32381h1) {
                pu0VarArr[0].setTranslationX((-f7) * pu0Var2.getMeasuredWidth());
                pu0VarArr[1].setTranslationX(pu0VarArr[0].getMeasuredWidth() - (pu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                pu0VarArr[0].setTranslationX(pu0Var.getMeasuredWidth() * f7);
                pu0VarArr[1].setTranslationX((pu0VarArr[0].getMeasuredWidth() * f7) - pu0VarArr[0].getMeasuredWidth());
            }
            wv0Var.P0(wv0Var.getTabProgress());
            float b02 = wv0Var.b0(f7);
            wv0Var.f32395p0 = b02;
            ImageView imageView = wv0Var.f32400r0;
            int i13 = 4;
            if (b02 != 0.0f && wv0Var.E() && !wv0Var.s0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (u0Var != null && !wv0Var.E()) {
                if (wv0Var.y0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                u0Var.setVisibility(i11);
                wv0Var.f32393o0 = 0.0f;
            } else {
                wv0Var.f32393o0 = wv0Var.c0(f7);
                wv0Var.y1();
            }
            wv0Var.u1(false);
            if (i12 == 0) {
                pu0 pu0Var3 = pu0VarArr[0];
                pu0VarArr[0] = pu0VarArr[1];
                pu0VarArr[1] = pu0Var3;
                pu0Var3.setVisibility(8);
                if (u0Var != null && wv0Var.f32415x0 == 2) {
                    if (wv0Var.y0()) {
                        i13 = 8;
                    }
                    u0Var.setVisibility(i13);
                }
                wv0Var.f32415x0 = 0;
                wv0Var.i1();
            }
        }
    }

    @Override
    public final void x() {
        int a2;
        int L0;
        wv0 wv0Var = this.f29380a;
        pu0[] pu0VarArr = wv0Var.f32386k0;
        int i10 = pu0VarArr[0].F;
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
        pu0 pu0Var = pu0VarArr[0];
        if (pu0Var.F == 0) {
            L0 = (pu0Var.f29680x.L0() / wv0Var.f32389m1[0]) * a2;
        } else {
            L0 = pu0Var.f29680x.L0() * a2;
        }
        if (L0 >= pu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ol0 ol0Var = pu0VarArr[0].E;
            ol0Var.f29317b = 1;
            ol0Var.c(0, 0, false, false);
            return;
        }
        pu0VarArr[0].h.x0(0);
    }
}
