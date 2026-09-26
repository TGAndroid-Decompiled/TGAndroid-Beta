package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class dp extends org.telegram.ui.Components.vl0 {
    public final ep f33167c;

    public dp(ep epVar) {
        this.f33167c = epVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42963f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f33167c.f33455a3.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f33167c.f33455a3.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        ep epVar = this.f33167c;
        fp fpVar = epVar.f33455a3;
        int i11 = c1Var.f42963f;
        View view = c1Var.f42960a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    e9Var.setBackground(org.telegram.ui.ActionBar.h6.V0(epVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.h6.f19023b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) fpVar.N.get(i10 - 1);
            na naVar = (na) view;
            if (naVar.H) {
                fpVar.O = null;
            }
            if (i10 < fpVar.N.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            naVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                fpVar.O = naVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.v0(org.telegram.ui.ActionBar.h6.f19059d6, epVar.f30114p2));
        m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        ep epVar = this.f33167c;
        org.telegram.ui.ActionBar.d6 d6Var = epVar.f30114p2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.c1(new org.telegram.ui.Cells.e9(epVar.getContext(), 12, d6Var));
            }
            return new s4.c1(new ga(this, epVar.getContext(), d6Var));
        }
        return new s4.c1(new org.telegram.ui.Cells.m4(epVar.getContext(), d6Var));
    }
}
