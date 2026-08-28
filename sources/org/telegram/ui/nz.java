package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class nz implements org.telegram.ui.Components.ok0, org.telegram.ui.ActionBar.b2 {
    public final int f40851a;
    public final n00 f40852b;

    public nz(n00 n00Var, int i9) {
        this.f40851a = i9;
        this.f40852b = n00Var;
    }

    @Override
    public boolean a(int i9, View view) {
        n00 n00Var = this.f40852b;
        e00 e00Var = (e00) n00Var.L.get(i9);
        if (e00Var != null && (view instanceof org.telegram.ui.Cells.va)) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            n00Var.u0(e00Var, vaVar.getName(), vaVar.getCurrentObject(), e00Var.f37770g);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f40851a) {
            case 1:
                n00 n00Var = this.f40852b;
                org.telegram.ui.ActionBar.c2 c2Var2 = null;
                if (n00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(n00Var.getParentActivity(), 3, null);
                    c2Var3.f22766c0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f22503id = n00Var.f40570r.f19649id;
                n00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new rc(27, n00Var, c2Var2));
                return;
            case 2:
                this.f40852b.p0();
                return;
            case 3:
                this.f40852b.p0();
                return;
            default:
                this.f40852b.finishFragment();
                return;
        }
    }
}
