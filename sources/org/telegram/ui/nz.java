package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class nz implements org.telegram.ui.Components.yl0, org.telegram.ui.ActionBar.a2 {
    public final int f39718a;
    public final n00 f39719b;

    public nz(n00 n00Var, int i10) {
        this.f39718a = i10;
        this.f39719b = n00Var;
    }

    @Override
    public boolean a(int i10, View view) {
        n00 n00Var = this.f39719b;
        e00 e00Var = (e00) n00Var.P.get(i10);
        if (e00Var != null && (view instanceof org.telegram.ui.Cells.va)) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            n00Var.v0(e00Var, vaVar.getName(), vaVar.getCurrentObject(), e00Var.f36477g);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f39718a) {
            case 1:
                n00 n00Var = this.f39719b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (n00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(n00Var.getParentActivity(), 3, null);
                    b2Var3.f20664g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20398id = n00Var.f39378r.f17801id;
                n00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new vc(27, n00Var, b2Var2));
                return;
            case 2:
                this.f39719b.q0();
                return;
            case 3:
                this.f39719b.q0();
                return;
            default:
                this.f39719b.finishFragment();
                return;
        }
    }
}
