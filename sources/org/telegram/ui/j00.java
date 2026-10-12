package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class j00 implements org.telegram.ui.Components.cm0, org.telegram.ui.ActionBar.z1 {
    public final int f37222a;
    public final l10 f37223b;

    public j00(l10 l10Var, int i10) {
        this.f37222a = i10;
        this.f37223b = l10Var;
    }

    @Override
    public boolean a(int i10, View view) {
        l10 l10Var = this.f37223b;
        c10 c10Var = (c10) l10Var.P.get(i10);
        if (c10Var != null && (view instanceof org.telegram.ui.Cells.xa)) {
            org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
            l10Var.v0(c10Var, xaVar.getName(), xaVar.getCurrentObject(), c10Var.f34666g);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37222a) {
            case 1:
                l10 l10Var = this.f37223b;
                org.telegram.ui.ActionBar.a2 a2Var2 = null;
                if (l10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(l10Var.getParentActivity(), 3, null);
                    a2Var3.f19569g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f19339id = l10Var.f37809r.f16708id;
                l10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new to(20, l10Var, a2Var2));
                return;
            case 2:
                this.f37223b.q0();
                return;
            case 3:
                this.f37223b.q0();
                return;
            default:
                this.f37223b.finishFragment();
                return;
        }
    }
}
