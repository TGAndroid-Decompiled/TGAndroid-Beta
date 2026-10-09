package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class gp extends org.telegram.ui.Components.pm0 {
    public final hp f38066c;

    public gp(hp hpVar) {
        this.f38066c = hpVar;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        if (d1Var.f47662f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f38066c.Y2.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f38066c.Y2.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        hp hpVar = this.f38066c;
        ip ipVar = hpVar.Y2;
        int i11 = d1Var.f47662f;
        View view = d1Var.f47658a;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    e9Var.setBackground(org.telegram.ui.ActionBar.i6.W0(hpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20761b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) ipVar.N.get(i10 - 1);
            oa oaVar = (oa) view;
            if (oaVar.H) {
                ipVar.O = null;
            }
            if (i10 >= ipVar.N.size()) {
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
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(org.telegram.ui.ActionBar.i6.f20797d6, hpVar.f30216n2));
        m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        hp hpVar = this.f38066c;
        org.telegram.ui.ActionBar.e6 e6Var = hpVar.f30216n2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.d1(new org.telegram.ui.Cells.e9(hpVar.getContext(), 12, e6Var));
            }
            return new s4.d1(new ha(this, hpVar.getContext(), e6Var));
        }
        return new s4.d1(new org.telegram.ui.Cells.m4(hpVar.getContext(), e6Var));
    }
}
