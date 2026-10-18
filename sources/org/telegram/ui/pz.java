package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class pz implements org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.a2 {
    public final int f40281a;
    public final p00 f40282b;

    public pz(p00 p00Var, int i10) {
        this.f40281a = i10;
        this.f40282b = p00Var;
    }

    @Override
    public boolean a(int i10, View view) {
        p00 p00Var = this.f40282b;
        g00 g00Var = (g00) p00Var.P.get(i10);
        if (g00Var != null && (view instanceof org.telegram.ui.Cells.va)) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            p00Var.v0(g00Var, vaVar.getName(), vaVar.getCurrentObject(), g00Var.f37038g);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f40281a) {
            case 1:
                p00 p00Var = this.f40282b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (p00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(p00Var.getParentActivity(), 3, null);
                    b2Var3.f20668g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20402id = p00Var.f39944r.f17802id;
                p00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new xc(27, p00Var, b2Var2));
                return;
            case 2:
                this.f40282b.q0();
                return;
            case 3:
                this.f40282b.q0();
                return;
            default:
                this.f40282b.finishFragment();
                return;
        }
    }
}
