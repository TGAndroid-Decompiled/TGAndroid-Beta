package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class rs0 implements mm0 {
    public final zu0 f27686a;

    public rs0(zu0 zu0Var) {
        this.f27686a = zu0Var;
    }

    @Override
    public final void C() {
        int a2;
        int L0;
        zu0 zu0Var = this.f27686a;
        st0[] st0VarArr = zu0Var.f30632k0;
        int i10 = st0VarArr[0].F;
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
        st0 st0Var = st0VarArr[0];
        if (st0Var.F == 0) {
            L0 = (st0Var.f27925x.L0() / zu0Var.f30635m1[0]) * a2;
        } else {
            L0 = st0Var.f27925x.L0() * a2;
        }
        if (L0 >= st0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            pk0 pk0Var = st0VarArr[0].E;
            pk0Var.f27061b = 1;
            pk0Var.d(0, 0, false, false);
            return;
        }
        st0VarArr[0].h.y0(0);
    }

    @Override
    public final void C0(float f7) {
        int i10;
        int i11;
        zu0 zu0Var = this.f27686a;
        org.telegram.ui.ActionBar.w0 w0Var = zu0Var.f30637n0;
        st0[] st0VarArr = zu0Var.f30632k0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || st0VarArr[1].getVisibility() == 0) {
            if (zu0Var.f30627h1) {
                st0 st0Var = st0VarArr[0];
                st0Var.setTranslationX((-f7) * st0Var.getMeasuredWidth());
                st0VarArr[1].setTranslationX(st0VarArr[0].getMeasuredWidth() - (st0VarArr[0].getMeasuredWidth() * f7));
            } else {
                st0 st0Var2 = st0VarArr[0];
                st0Var2.setTranslationX(st0Var2.getMeasuredWidth() * f7);
                st0VarArr[1].setTranslationX((st0VarArr[0].getMeasuredWidth() * f7) - st0VarArr[0].getMeasuredWidth());
            }
            zu0Var.M0(zu0Var.getTabProgress());
            float a02 = zu0Var.a0(f7);
            zu0Var.f30641p0 = a02;
            ImageView imageView = zu0Var.f30646r0;
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
                zu0Var.f30639o0 = 0.0f;
            } else {
                zu0Var.f30639o0 = zu0Var.b0(f7);
                zu0Var.t1();
            }
            zu0Var.q1(false);
            if (i12 == 0) {
                st0 st0Var3 = st0VarArr[0];
                st0VarArr[0] = st0VarArr[1];
                st0VarArr[1] = st0Var3;
                st0Var3.setVisibility(8);
                if (w0Var != null && zu0Var.f30661x0 == 2) {
                    if (zu0Var.v0()) {
                        i13 = 8;
                    }
                    w0Var.setVisibility(i13);
                }
                zu0Var.f30661x0 = 0;
                zu0Var.f1();
            }
        }
    }

    @Override
    public final void d(int i10, boolean z10) {
        zu0 zu0Var = this.f27686a;
        st0[] st0VarArr = zu0Var.f30632k0;
        if (st0VarArr[0].F == i10) {
            return;
        }
        ur0 ur0Var = zu0Var.W;
        if (ur0Var != null && i10 == 8) {
            ur0Var.f32645n.f(1.0f, 0);
        }
        st0 st0Var = st0VarArr[1];
        st0Var.F = i10;
        st0Var.setVisibility(0);
        zu0Var.k0();
        zu0Var.m1(true);
        zu0Var.f30627h1 = z10;
        zu0Var.L0();
        zu0Var.A(!zu0Var.s0(i10), true);
        zu0Var.q1(true);
    }

    @Override
    public final boolean n1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        zu0 zu0Var = this.f27686a;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30656v1;
        if (o2Var != null && zu0.d0(i10, zu0Var.f30618d1 instanceof TLRPC.TL_channelFull) != null) {
            if (zu0Var.f30618d1 instanceof TLRPC.TL_channelFull) {
                if (ChatObject.canUserDoAction(o2Var.getMessagesController().getChat(Long.valueOf(zu0Var.f30618d1.f18122id)), 5)) {
                    profileTab = zu0Var.f30618d1.main_tab;
                    if (profileTab != null || (i10 != zu0.e0(profileTab) && zu0Var.R1 != i10)) {
                        n70 H = n70.H(o2Var, view);
                        H.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18862d6, false)));
                        H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new id(this, i10, 9), false);
                        H.Z();
                        return true;
                    }
                }
            } else if (zu0Var.f30631j1 == o2Var.getUserConfig().getClientUserId() && (userFull = zu0Var.f30620e1) != null) {
                profileTab = userFull.main_tab;
                if (profileTab != null) {
                }
                n70 H2 = n70.H(o2Var, view);
                H2.W(org.telegram.ui.ActionBar.j6.b0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18862d6, false)));
                H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new id(this, i10, 9), false);
                H2.Z();
                return true;
            }
        }
        return false;
    }
}
