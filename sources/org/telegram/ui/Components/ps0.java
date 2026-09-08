package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ps0 implements lm0 {
    public final xu0 f29512a;

    public ps0(xu0 xu0Var) {
        this.f29512a = xu0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        xu0 xu0Var = this.f29512a;
        qt0[] qt0VarArr = xu0Var.f32729k0;
        int i10 = qt0VarArr[0].F;
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
        qt0 qt0Var = qt0VarArr[0];
        if (qt0Var.F == 0) {
            L0 = (qt0Var.f29851x.L0() / xu0Var.f32732m1[0]) * a2;
        } else {
            L0 = qt0Var.f29851x.L0() * a2;
        }
        if (L0 >= qt0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            ok0 ok0Var = qt0VarArr[0].E;
            ok0Var.f29125b = 1;
            ok0Var.c(0, 0, false, false);
            return;
        }
        qt0VarArr[0].h.x0(0);
    }

    @Override
    public final void D0(float f7) {
        int i10;
        int i11;
        xu0 xu0Var = this.f29512a;
        org.telegram.ui.ActionBar.v0 v0Var = xu0Var.f32734n0;
        qt0[] qt0VarArr = xu0Var.f32729k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || qt0VarArr[1].getVisibility() == 0) {
            if (xu0Var.f32724h1) {
                qt0 qt0Var = qt0VarArr[0];
                qt0Var.setTranslationX((-f7) * qt0Var.getMeasuredWidth());
                qt0VarArr[1].setTranslationX(qt0VarArr[0].getMeasuredWidth() - (qt0VarArr[0].getMeasuredWidth() * f7));
            } else {
                qt0 qt0Var2 = qt0VarArr[0];
                qt0Var2.setTranslationX(qt0Var2.getMeasuredWidth() * f7);
                qt0VarArr[1].setTranslationX((qt0VarArr[0].getMeasuredWidth() * f7) - qt0VarArr[0].getMeasuredWidth());
            }
            xu0Var.M0(xu0Var.getTabProgress());
            float a02 = xu0Var.a0(f7);
            xu0Var.f32738p0 = a02;
            ImageView imageView = xu0Var.f32743r0;
            int i13 = 4;
            if (a02 != 0.0f && xu0Var.D() && !xu0Var.q0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (v0Var != null && !xu0Var.D()) {
                if (xu0Var.v0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                v0Var.setVisibility(i11);
                xu0Var.f32736o0 = 0.0f;
            } else {
                xu0Var.f32736o0 = xu0Var.b0(f7);
                xu0Var.t1();
            }
            xu0Var.q1(false);
            if (i12 == 0) {
                qt0 qt0Var3 = qt0VarArr[0];
                qt0VarArr[0] = qt0VarArr[1];
                qt0VarArr[1] = qt0Var3;
                qt0Var3.setVisibility(8);
                if (v0Var != null && xu0Var.f32758x0 == 2) {
                    if (xu0Var.v0()) {
                        i13 = 8;
                    }
                    v0Var.setVisibility(i13);
                }
                xu0Var.f32758x0 = 0;
                xu0Var.f1();
            }
        }
    }

    @Override
    public final void b(int i10, boolean z10) {
        xu0 xu0Var = this.f29512a;
        qt0[] qt0VarArr = xu0Var.f32729k0;
        if (qt0VarArr[0].F == i10) {
            return;
        }
        sr0 sr0Var = xu0Var.W;
        if (sr0Var != null && i10 == 8) {
            sr0Var.f35653n.f(1.0f, 0);
        }
        qt0 qt0Var = qt0VarArr[1];
        qt0Var.F = i10;
        qt0Var.setVisibility(0);
        xu0Var.k0();
        xu0Var.m1(true);
        xu0Var.f32724h1 = z10;
        xu0Var.L0();
        xu0Var.A(!xu0Var.s0(i10), true);
        xu0Var.q1(true);
    }

    @Override
    public final boolean n1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        xu0 xu0Var = this.f29512a;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32753v1;
        if (n2Var != null && xu0.d0(i10, xu0Var.f32714d1 instanceof TLRPC.TL_channelFull) != null) {
            if (xu0Var.f32714d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(n2Var.getMessagesController().getChat(Long.valueOf(xu0Var.f32714d1.f19897id)), 5)) {
                    profileTab = xu0Var.f32714d1.main_tab;
                    if (profileTab != null || (i10 != xu0.e0(profileTab) && xu0Var.R1 != i10)) {
                        n70 H = n70.H(n2Var, view);
                        H.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new m8(this, i10, 10), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (xu0Var.f32728j1 == n2Var.getUserConfig().getClientUserId() && (userFull = xu0Var.f32717e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                n70 H2 = n70.H(n2Var, view);
                H2.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20690d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new m8(this, i10, 10), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
