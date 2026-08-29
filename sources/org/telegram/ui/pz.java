package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class pz implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.b2 {
    public final int f41492a;
    public final p00 f41493b;

    public pz(p00 p00Var, int i10) {
        this.f41492a = i10;
        this.f41493b = p00Var;
    }

    @Override
    public boolean c(int i10, View view) {
        p00 p00Var = this.f41493b;
        g00 g00Var = (g00) p00Var.L.get(i10);
        if (g00Var != null && (view instanceof org.telegram.ui.Cells.sa)) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            p00Var.v0(g00Var, saVar.getName(), saVar.getCurrentObject(), g00Var.f38404g);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f41492a) {
            case 1:
                p00 p00Var = this.f41493b;
                org.telegram.ui.ActionBar.c2 c2Var2 = null;
                if (p00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(p00Var.getParentActivity(), 3, null);
                    c2Var3.f22783c0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f22515id = p00Var.f41266r.f19620id;
                p00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new zg(23, p00Var, c2Var2));
                return;
            case 2:
                this.f41493b.q0();
                return;
            case 3:
                this.f41493b.q0();
                return;
            default:
                this.f41493b.finishFragment();
                return;
        }
    }
}
