package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class bp extends org.telegram.ui.Components.sl0 {
    public final dp f35573c;

    public bp(dp dpVar) {
        this.f35573c = dpVar;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        if (m1Var.f5879f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f35573c.X2.K.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f35573c.X2.K.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        boolean z4;
        dp dpVar = this.f35573c;
        ep epVar = dpVar.X2;
        int i11 = m1Var.f5879f;
        View view = m1Var.f5875a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.a9 a9Var = (org.telegram.ui.Cells.a9) view;
                    a9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    a9Var.setBackground(org.telegram.ui.ActionBar.k6.V0(dpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.k6.f21624b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) epVar.K.get(i10 - 1);
            ma maVar = (ma) view;
            if (maVar.E) {
                epVar.L = null;
            }
            if (i10 < epVar.K.size()) {
                z4 = true;
            } else {
                z4 = false;
            }
            maVar.a(tL_username, z4, false, 0L);
            if (tL_username != null && tL_username.editable) {
                epVar.L = maVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21659d6, dpVar.f31383m2));
        m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        dp dpVar = this.f35573c;
        org.telegram.ui.ActionBar.g6 g6Var = dpVar.f31383m2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new f2.m1(new org.telegram.ui.Cells.a9(dpVar.getContext(), 12, g6Var));
            }
            return new f2.m1(new fa(this, dpVar.getContext(), g6Var));
        }
        return new f2.m1(new org.telegram.ui.Cells.m4(dpVar.getContext(), g6Var));
    }
}
