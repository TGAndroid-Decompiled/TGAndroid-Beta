package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class lp extends org.telegram.ui.Components.lm0 {
    public final mp f38062c;

    public lp(mp mpVar) {
        this.f38062c = mpVar;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        if (b1Var.f44841f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f38062c.Y2.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f38062c.Y2.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        mp mpVar = this.f38062c;
        np npVar = mpVar.Y2;
        int i11 = b1Var.f44841f;
        View view = b1Var.f44838a;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    org.telegram.ui.Cells.e9 e9Var = (org.telegram.ui.Cells.e9) view;
                    e9Var.setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    e9Var.setBackground(org.telegram.ui.ActionBar.g6.W0(mpVar.getContext(), R.drawable.greydivider_bottom, org.telegram.ui.ActionBar.g6.f19863b7));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) npVar.N.get(i10 - 1);
            sa saVar = (sa) view;
            if (saVar.H) {
                npVar.O = null;
            }
            if (i10 >= npVar.N.size()) {
                z10 = false;
            }
            saVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                npVar.O = saVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.m4 m4Var = (org.telegram.ui.Cells.m4) view;
        m4Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(org.telegram.ui.ActionBar.g6.f19901d6, mpVar.f27439n2));
        m4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        mp mpVar = this.f38062c;
        org.telegram.ui.ActionBar.c6 c6Var = mpVar.f27439n2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.b1(new org.telegram.ui.Cells.e9(mpVar.getContext(), 12, c6Var));
            }
            return new s4.b1(new la(this, mpVar.getContext(), c6Var));
        }
        return new s4.b1(new org.telegram.ui.Cells.m4(mpVar.getContext(), c6Var));
    }
}
