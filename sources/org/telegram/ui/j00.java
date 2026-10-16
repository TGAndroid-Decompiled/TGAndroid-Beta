package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j00 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.z1 {
    public final int f36897a;
    public final k10 f36898b;

    public j00(k10 k10Var, int i10) {
        this.f36897a = i10;
        this.f36898b = k10Var;
    }

    @Override
    public boolean a(int i10, View view) {
        k10 k10Var = this.f36898b;
        b10 b10Var = (b10) k10Var.P.get(i10);
        if (b10Var != null && (view instanceof org.telegram.ui.Cells.xa)) {
            org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
            k10Var.v0(b10Var, xaVar.getName(), xaVar.getCurrentObject(), b10Var.f34142g);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36897a) {
            case 1:
                k10 k10Var = this.f36898b;
                org.telegram.ui.ActionBar.a2 a2Var2 = null;
                if (k10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(k10Var.getParentActivity(), 3, null);
                    a2Var3.f19269g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f19039id = k10Var.f37203r.f16400id;
                k10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new to(20, k10Var, a2Var2));
                return;
            case 2:
                this.f36898b.q0();
                return;
            case 3:
                this.f36898b.q0();
                return;
            default:
                this.f36898b.finishFragment();
                return;
        }
    }
}
