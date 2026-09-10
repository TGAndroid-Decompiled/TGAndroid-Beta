package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class zs0 implements vm0 {
    public final iv0 f29804a;

    public zs0(iv0 iv0Var) {
        this.f29804a = iv0Var;
    }

    @Override
    public final void B() {
        int a2;
        int L0;
        iv0 iv0Var = this.f29804a;
        au0[] au0VarArr = iv0Var.f24107k0;
        int i10 = au0VarArr[0].F;
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
            a2 = org.telegram.ui.Cells.v7.a(1);
        }
        au0 au0Var = au0VarArr[0];
        if (au0Var.F == 0) {
            L0 = (au0Var.f21598x.L0() / iv0Var.f24110m1[0]) * a2;
        } else {
            L0 = au0Var.f21598x.L0() * a2;
        }
        if (L0 >= au0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            yk0 yk0Var = au0VarArr[0].E;
            yk0Var.f29444b = 1;
            yk0Var.c(0, 0, false, false);
            return;
        }
        au0VarArr[0].h.x0(0);
    }

    @Override
    public final void d(int i10, boolean z10) {
        iv0 iv0Var = this.f29804a;
        au0[] au0VarArr = iv0Var.f24107k0;
        if (au0VarArr[0].F == i10) {
            return;
        }
        cs0 cs0Var = iv0Var.W;
        if (cs0Var != null && i10 == 8) {
            cs0Var.f33250n.f(1.0f, 0);
        }
        au0 au0Var = au0VarArr[1];
        au0Var.F = i10;
        au0Var.setVisibility(0);
        iv0Var.k0();
        iv0Var.m1(true);
        iv0Var.f24102h1 = z10;
        iv0Var.L0();
        iv0Var.A(!iv0Var.s0(i10), true);
        iv0Var.q1(true);
    }

    @Override
    public final boolean m1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        iv0 iv0Var = this.f29804a;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
        if (p2Var != null && iv0.d0(i10, iv0Var.f24093d1 instanceof TLRPC.TL_channelFull) != null) {
            if (iv0Var.f24093d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(p2Var.getMessagesController().getChat(Long.valueOf(iv0Var.f24093d1.f17196id)), 5)) {
                    profileTab = iv0Var.f24093d1.main_tab;
                    if (profileTab != null || (i10 != iv0.e0(profileTab) && iv0Var.R1 != i10)) {
                        w70 H = w70.H(p2Var, view);
                        H.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new zd(this, i10, 8), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (iv0Var.f24106j1 == p2Var.getUserConfig().getClientUserId() && (userFull = iv0Var.f24095e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                w70 H2 = w70.H(p2Var, view);
                H2.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f17928d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new zd(this, i10, 8), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }

    @Override
    public final void v0(float f7) {
        int i10;
        int i11;
        iv0 iv0Var = this.f29804a;
        org.telegram.ui.ActionBar.w0 w0Var = iv0Var.f24112n0;
        au0[] au0VarArr = iv0Var.f24107k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || au0VarArr[1].getVisibility() == 0) {
            if (iv0Var.f24102h1) {
                au0 au0Var = au0VarArr[0];
                au0Var.setTranslationX((-f7) * au0Var.getMeasuredWidth());
                au0VarArr[1].setTranslationX(au0VarArr[0].getMeasuredWidth() - (au0VarArr[0].getMeasuredWidth() * f7));
            } else {
                au0 au0Var2 = au0VarArr[0];
                au0Var2.setTranslationX(au0Var2.getMeasuredWidth() * f7);
                au0VarArr[1].setTranslationX((au0VarArr[0].getMeasuredWidth() * f7) - au0VarArr[0].getMeasuredWidth());
            }
            iv0Var.M0(iv0Var.getTabProgress());
            float a02 = iv0Var.a0(f7);
            iv0Var.f24116p0 = a02;
            ImageView imageView = iv0Var.f24121r0;
            int i13 = 4;
            if (a02 != 0.0f && iv0Var.D() && !iv0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (w0Var != null && !iv0Var.D()) {
                if (iv0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                w0Var.setVisibility(i11);
                iv0Var.f24114o0 = 0.0f;
            } else {
                iv0Var.f24114o0 = iv0Var.b0(f7);
                iv0Var.t1();
            }
            iv0Var.q1(false);
            if (i12 == 0) {
                au0 au0Var3 = au0VarArr[0];
                au0VarArr[0] = au0VarArr[1];
                au0VarArr[1] = au0Var3;
                au0Var3.setVisibility(8);
                if (w0Var != null && iv0Var.f24136x0 == 2) {
                    if (iv0Var.v0()) {
                        i13 = 8;
                    }
                    w0Var.setVisibility(i13);
                }
                iv0Var.f24136x0 = 0;
                iv0Var.f1();
            }
        }
    }
}
