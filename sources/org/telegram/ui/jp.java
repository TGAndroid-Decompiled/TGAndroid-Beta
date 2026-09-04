package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class jp extends org.telegram.ui.Components.kl0 {
    public final kp f37825c;

    public jp(kp kpVar) {
        this.f37825c = kpVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f45742f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f37825c.f38100a3.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f37825c.f38100a3.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        kp kpVar = this.f37825c;
        lp lpVar = kpVar.f38100a3;
        int i11 = c1Var.f45742f;
        View view = c1Var.f45738a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(kpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f20627b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) lpVar.N.get(i10 - 1);
            na naVar = (na) view;
            if (naVar.H) {
                lpVar.O = null;
            }
            if (i10 < lpVar.N.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            naVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                lpVar.O = naVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.l4 l4Var = (org.telegram.ui.Cells.l4) view;
        l4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f20663d6, kpVar.f28224p2));
        l4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        kp kpVar = this.f37825c;
        org.telegram.ui.ActionBar.f6 f6Var = kpVar.f28224p2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.c1(new org.telegram.ui.Cells.e9(kpVar.getContext(), 12, f6Var));
            }
            return new s4.c1(new ga(this, kpVar.getContext(), f6Var));
        }
        return new s4.c1(new org.telegram.ui.Cells.l4(kpVar.getContext(), f6Var));
    }
}
