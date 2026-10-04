package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class fp extends org.telegram.ui.Components.yl0 {
    public final gp f36356c;

    public fp(gp gpVar) {
        this.f36356c = gpVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f46528f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f36356c.f36696h3.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f36356c.f36696h3.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        boolean z10;
        gp gpVar = this.f36356c;
        hp hpVar = gpVar.f36696h3;
        int i11 = c1Var.f46528f;
        View view = c1Var.f46524a;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    e9Var.setBackground(org.telegram.ui.ActionBar.i6.V0(gpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.i6.f20782b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) hpVar.N.get(i10 - 1);
            pa paVar = (pa) view;
            if (paVar.H) {
                hpVar.O = null;
            }
            if (i10 < hpVar.N.size()) {
                z10 = true;
            } else {
                z10 = false;
            }
            paVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                hpVar.O = paVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20818d6, gpVar.f33546p2));
        m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        gp gpVar = this.f36356c;
        org.telegram.ui.ActionBar.d6 d6Var = gpVar.f33546p2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.c1(new org.telegram.ui.Cells.e9(gpVar.getContext(), 12, d6Var));
            }
            return new s4.c1(new ia(this, gpVar.getContext(), d6Var));
        }
        return new s4.c1(new org.telegram.ui.Cells.m4(gpVar.getContext(), d6Var));
    }
}
