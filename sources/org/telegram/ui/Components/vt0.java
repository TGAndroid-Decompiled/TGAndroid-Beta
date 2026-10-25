package org.telegram.ui.Components;

import android.view.View;
import android.widget.ImageView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class vt0 implements sn0 {
    public final aw0 f34257a;

    public vt0(aw0 aw0Var) {
        this.f34257a = aw0Var;
    }

    @Override
    public final void f(int i10, boolean z10) {
        aw0 aw0Var = this.f34257a;
        tu0[] tu0VarArr = aw0Var.m0;
        if (tu0VarArr[0].E == i10) {
            return;
        }
        zs0 zs0Var = aw0Var.f26638b0;
        if (zs0Var != null && i10 == 8) {
            zs0Var.f41109b.f(1.0f, 0);
        }
        tu0 tu0Var = tu0VarArr[1];
        tu0Var.E = i10;
        tu0Var.setVisibility(0);
        aw0Var.t0();
        aw0Var.v1(true);
        aw0Var.f26665j1 = z10;
        aw0Var.S0();
        aw0Var.D(!aw0Var.A0(i10));
        aw0Var.C1(true);
    }

    @Override
    public final boolean h1(int i10, View view) {
        TLRPC.UserFull userFull;
        TLRPC.ProfileTab profileTab;
        aw0 aw0Var = this.f34257a;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26702x1;
        if (r2Var != null) {
            boolean z02 = aw0Var.z0();
            if (aw0.l0(i10, z02) != null) {
                if (z02) {
                    if (ChatObject.canUserDoAction(r2Var.getMessagesController().getChat(Long.valueOf(aw0Var.f26653f1.f22028id)), 5)) {
                        profileTab = aw0Var.f26653f1.main_tab;
                        if (profileTab != null || (i10 != aw0.m0(profileTab) && aw0Var.U1 != i10)) {
                            k80 H = k80.H(r2Var, view);
                            H.W(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false)));
                            H.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new bi.u8(this, z02, i10, 4), false);
                            H.Z();
                            return true;
                        }
                    }
                } else if (aw0Var.l1 == r2Var.getUserConfig().getClientUserId() && (userFull = aw0Var.f26656g1) != null) {
                    profileTab = userFull.main_tab;
                    if (profileTab != null) {
                    }
                    k80 H2 = k80.H(r2Var, view);
                    H2.W(org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(24.0f), org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false)));
                    H2.c(R.drawable.tabs_reorder, LocaleController.getString(R.string.ProfileTabSetAsMain), new bi.u8(this, z02, i10, 4), false);
                    H2.Z();
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void z() {
        int a2;
        int L0;
        aw0 aw0Var = this.f34257a;
        tu0[] tu0VarArr = aw0Var.m0;
        int i10 = tu0VarArr[0].E;
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
            a2 = org.telegram.ui.Cells.x7.a(1);
        }
        tu0 tu0Var = tu0VarArr[0];
        if (tu0Var.E == 0) {
            L0 = (tu0Var.f33160w.L0() / aw0Var.f26679o1[0]) * a2;
        } else {
            L0 = tu0Var.f33160w.L0() * a2;
        }
        if (L0 >= tu0VarArr[0].h.getMeasuredHeight() * 1.2f) {
            pl0 pl0Var = tu0VarArr[0].f33162y;
            pl0Var.f31595b = 1;
            pl0Var.c(0, 0, false, false);
            return;
        }
        tu0VarArr[0].h.y0(0);
    }

    @Override
    public final void z0(float f7) {
        tu0 tu0Var;
        int i10;
        int i11;
        tu0 tu0Var2;
        aw0 aw0Var = this.f34257a;
        org.telegram.ui.ActionBar.w0 w0Var = aw0Var.f26681p0;
        tu0[] tu0VarArr = aw0Var.m0;
        int i12 = (f7 > 1.0f ? 1 : (f7 == 1.0f ? 0 : -1));
        if (i12 != 0 || tu0VarArr[1].getVisibility() == 0) {
            if (aw0Var.f26665j1) {
                tu0VarArr[0].setTranslationX((-f7) * tu0Var2.getMeasuredWidth());
                tu0VarArr[1].setTranslationX(tu0VarArr[0].getMeasuredWidth() - (tu0VarArr[0].getMeasuredWidth() * f7));
            } else {
                tu0VarArr[0].setTranslationX(tu0Var.getMeasuredWidth() * f7);
                tu0VarArr[1].setTranslationX((tu0VarArr[0].getMeasuredWidth() * f7) - tu0VarArr[0].getMeasuredWidth());
            }
            aw0Var.T0(aw0Var.getTabProgress());
            float h02 = aw0Var.h0(f7);
            aw0Var.f26686r0 = h02;
            ImageView imageView = aw0Var.f26691t0;
            int i13 = 4;
            if (h02 != 0.0f && aw0Var.G() && !aw0Var.x0()) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            imageView.setVisibility(i10);
            if (w0Var != null && !aw0Var.G()) {
                if (aw0Var.D0()) {
                    i11 = 8;
                } else {
                    i11 = 4;
                }
                aw0Var.setSearchItemVisibility(i11);
                aw0Var.f26683q0 = 0.0f;
            } else {
                aw0Var.f26683q0 = aw0Var.i0(f7);
                aw0Var.H1();
            }
            aw0Var.C1(false);
            if (i12 == 0) {
                tu0 tu0Var3 = tu0VarArr[0];
                tu0VarArr[0] = tu0VarArr[1];
                tu0VarArr[1] = tu0Var3;
                tu0Var3.setVisibility(8);
                if (w0Var != null && aw0Var.f26706z0 == 2) {
                    if (aw0Var.D0()) {
                        i13 = 8;
                    }
                    aw0Var.setSearchItemVisibility(i13);
                }
                aw0Var.f26706z0 = 0;
                aw0Var.o1();
            }
        }
    }
}
