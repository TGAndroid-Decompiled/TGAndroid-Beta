package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ct0 implements ym0 {
    public final kv0 f23325a;

    public ct0(kv0 kv0Var) {
        this.f23325a = kv0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        kv0 kv0Var = this.f23325a;
        du0[] du0VarArr = kv0Var.f25824k0;
        int i10 = du0VarArr[0].F;
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
        du0 du0Var = du0VarArr[0];
        if (du0Var.F == 0) {
            L0 = (du0Var.f23688x.L0() / kv0Var.f25827m1[0]) * a2;
        } else {
            L0 = du0Var.f23688x.L0() * a2;
        }
        if (L0 >= du0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            zk0 zk0Var = du0VarArr[0].E;
            zk0Var.f30833b = 1;
            zk0Var.d(0, 0, false, false);
            return;
        }
        du0VarArr[0].h.y0(0);
    }

    @Override
    public final void C0(float f7) {
        int i10;
        int i11;
        kv0 kv0Var = this.f23325a;
        org.telegram.ui.ActionBar.v0 v0Var = kv0Var.f25829n0;
        du0[] du0VarArr = kv0Var.f25824k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || du0VarArr[1].getVisibility() == 0) {
            if (kv0Var.f25819h1) {
                du0 du0Var = du0VarArr[0];
                du0Var.setTranslationX((-f7) * du0Var.getMeasuredWidth());
                du0VarArr[1].setTranslationX(du0VarArr[0].getMeasuredWidth() - (du0VarArr[0].getMeasuredWidth() * f7));
            } else {
                du0 du0Var2 = du0VarArr[0];
                du0Var2.setTranslationX(du0Var2.getMeasuredWidth() * f7);
                du0VarArr[1].setTranslationX((du0VarArr[0].getMeasuredWidth() * f7) - du0VarArr[0].getMeasuredWidth());
            }
            kv0Var.M0(kv0Var.getTabProgress());
            float a02 = kv0Var.a0(f7);
            kv0Var.f25833p0 = a02;
            ImageView imageView = kv0Var.f25838r0;
            int i13 = 4;
            if (a02 != 0.0f && kv0Var.D() && !kv0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (v0Var != null && !kv0Var.D()) {
                if (kv0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                v0Var.setVisibility(i11);
                kv0Var.f25831o0 = 0.0f;
            } else {
                kv0Var.f25831o0 = kv0Var.b0(f7);
                kv0Var.t1();
            }
            kv0Var.q1(false);
            if (i12 == 0) {
                du0 du0Var3 = du0VarArr[0];
                du0VarArr[0] = du0VarArr[1];
                du0VarArr[1] = du0Var3;
                du0Var3.setVisibility(8);
                if (v0Var != null && kv0Var.f25853x0 == 2) {
                    if (kv0Var.v0()) {
                        i13 = 8;
                    }
                    v0Var.setVisibility(i13);
                }
                kv0Var.f25853x0 = 0;
                kv0Var.f1();
            }
        }
    }

    @Override
    public final void d(int i10, boolean z10) {
        kv0 kv0Var = this.f23325a;
        du0[] du0VarArr = kv0Var.f25824k0;
        if (du0VarArr[0].F == i10) {
            return;
        }
        fs0 fs0Var = kv0Var.W;
        if (fs0Var != null && i10 == 8) {
            fs0Var.f31923n.f(1.0f, 0);
        }
        du0 du0Var = du0VarArr[1];
        du0Var.F = i10;
        du0Var.setVisibility(0);
        kv0Var.k0();
        kv0Var.m1(true);
        kv0Var.f25819h1 = z10;
        kv0Var.L0();
        kv0Var.A(!kv0Var.s0(i10), true);
        kv0Var.q1(true);
    }

    @Override
    public final boolean n1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        kv0 kv0Var = this.f23325a;
        org.telegram.ui.ActionBar.n2 n2Var = kv0Var.f25848v1;
        if (n2Var != null && kv0.d0(i10, kv0Var.f25810d1 instanceof TLRPC.TL_channelFull) != null) {
            if (kv0Var.f25810d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(kv0Var.f25810d1.f18297id)), 5)) {
                    profileTab = kv0Var.f25810d1.main_tab;
                    if (profileTab != null || (i10 != kv0.e0(profileTab) && kv0Var.R1 != i10)) {
                        w70 H = w70.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new x2(this, i10, 11), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (kv0Var.f25823j1 == n2Var.getUserConfig().getClientUserId() && (userFull = kv0Var.f25812e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                w70 H2 = w70.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f19062d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new x2(this, i10, 11), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
