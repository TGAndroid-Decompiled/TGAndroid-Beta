package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class gp extends org.telegram.ui.Components.vl0 {
    public final hp f33910c;

    public gp(hp hpVar) {
        this.f33910c = hpVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f42932f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f33910c.f34202a3.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f33910c.f34202a3.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        hp hpVar = this.f33910c;
        ip ipVar = hpVar.f34202a3;
        int i11 = c1Var.f42932f;
        View view = c1Var.f42929a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    e9Var.setBackground(org.telegram.ui.ActionBar.j6.V0(hpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.j6.f19026b7));
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
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.f19062d6, hpVar.f30090p2));
        m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        hp hpVar = this.f33910c;
        org.telegram.ui.ActionBar.e6 e6Var = hpVar.f30090p2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.c1(new org.telegram.ui.Cells.e9(hpVar.getContext(), 12, e6Var));
            }
            return new s4.c1(new ha(this, hpVar.getContext(), e6Var));
        }
        return new s4.c1(new org.telegram.ui.Cells.m4(hpVar.getContext(), e6Var));
    }
}
