package org.telegram.ui;

import android.view.View;
import android.view.ViewGroup;
import org.telegram.tgnet.TLRPC;
public final class ap extends org.telegram.ui.Components.sk0 {
    public final bp f35689c;

    public ap(bp bpVar) {
        this.f35689c = bpVar;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        if (c1Var.f47901f == 1) {
            return true;
        }
        return false;
    }

    @Override
    public final int b() {
        return this.f35689c.f36291h3.N.size() + 2;
    }

    @Override
    public final int d(int i10) {
        if (i10 == 0) {
            return 0;
        }
        if (i10 <= this.f35689c.f36291h3.N.size()) {
            return 1;
        }
        return 2;
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        bp bpVar = this.f35689c;
        cp cpVar = bpVar.f36291h3;
        int i11 = c1Var.f47901f;
        View view = c1Var.f47898a;
        if (i11 != 0) {
            boolean z10 = true;
            if (i11 != 1) {
                if (i11 == 2) {
                    ((org.telegram.ui.Cells.b9) view).setText(org.telegram.messenger.cd.L0(2131743669, null));
                    return;
                }
                return;
            }
            TLRPC.TL_username tL_username = (TLRPC.TL_username) cpVar.N.get(i10 - 1);
            la laVar = (la) view;
            if (laVar.H) {
                cpVar.O = null;
            }
            if (i10 >= cpVar.N.size()) {
                z10 = false;
            }
            laVar.a(tL_username, z10, false, 0L);
            if (tL_username != null && tL_username.editable) {
                cpVar.O = laVar;
                return;
            }
            return;
        }
        org.telegram.ui.Cells.p4 p4Var = (org.telegram.ui.Cells.p4) view;
        org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.f20929d6, p4Var, bpVar.f30625n2);
        p4Var.setText(org.telegram.messenger.cd.L0(2131743670, null));
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        bp bpVar = this.f35689c;
        org.telegram.ui.ActionBar.p6 p6Var = bpVar.f30625n2;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 != 2) {
                    return null;
                }
                return new s4.c1(new org.telegram.ui.Cells.b9(12, bpVar.getContext(), p6Var));
            }
            return new s4.c1(new fa(this, bpVar.getContext(), p6Var));
        }
        return new s4.c1(new org.telegram.ui.Cells.p4(bpVar.getContext(), p6Var));
    }
}
