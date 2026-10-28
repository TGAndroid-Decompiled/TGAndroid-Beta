package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
public final class ap extends org.telegram.ui.Components.mm0 {
    public final bp f37805c;

    public ap(bp bpVar) {
        this.f37805c = bpVar;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        if (e1Var.f47776f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int h() {
        return this.f37805c.f38083i3.N.size() + 2;
    }

    @Override
    public final int j(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f37805c.f38083i3.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        bp bpVar = this.f37805c;
        cp cpVar = bpVar.f38083i3;
        int i11 = e1Var.f47776f;
        View view = e1Var.f47773a;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    ((org.telegram.ui.Cells.i9) view).setText(LocaleController.getString(R.string.UsernamesChannelHelp));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) cpVar.N.get(i10 - 1);
            qa qaVar = (qa) view;
            if (qaVar.H) {
                cpVar.O = null;
            }
            if (i10 >= cpVar.N.size()) {
                z10 = false;
            }
            qaVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                cpVar.O = qaVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.q4 q4Var = (org.telegram.ui.Cells.q4) view;
        org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.f23357d6, q4Var, bpVar.f30988n2);
        q4Var.setText(LocaleController.getString(R.string.UsernamesChannelHeader));
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        bp bpVar = this.f37805c;
        org.telegram.ui.ActionBar.u6 u6Var = bpVar.f30988n2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.e1(new org.telegram.ui.Cells.i9(bpVar.getContext(), 12, u6Var));
            }
            return new s4.e1(new ja(this, bpVar.getContext(), u6Var));
        }
        return new s4.e1(new org.telegram.ui.Cells.q4(bpVar.getContext(), u6Var));
    }
}
