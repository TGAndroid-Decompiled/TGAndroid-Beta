package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class gp extends org.telegram.ui.Components.ul0 {
    public final hp f33946c;

    public gp(hp hpVar) {
        this.f33946c = hpVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42977f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f33946c.f34250a3.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f33946c.f34250a3.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        hp hpVar = this.f33946c;
        ip ipVar = hpVar.f34250a3;
        int i11 = c1Var.f42977f;
        View view = c1Var.f42974a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.f9 f9Var = (org.telegram.ui.Cells.f9) view;
                    f9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    f9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(hpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19058b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) ipVar.N.get(i10 - 1);
            oa oaVar = (oa) view;
            if (oaVar.H) {
                ipVar.O = null;
            }
            if (i10 < ipVar.N.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            oaVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                ipVar.O = oaVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.n4 n4Var = (org.telegram.ui.Cells.n4) view;
        n4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19094d6, hpVar.f29207p2));
        n4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        hp hpVar = this.f33946c;
        org.telegram.ui.ActionBar.f6 f6Var = hpVar.f29207p2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.c1(new org.telegram.ui.Cells.f9(hpVar.getContext(), 12, f6Var));
            }
            return new s4.c1(new ha(this, hpVar.getContext(), f6Var));
        }
        return new s4.c1(new org.telegram.ui.Cells.n4(hpVar.getContext(), f6Var));
    }
}
