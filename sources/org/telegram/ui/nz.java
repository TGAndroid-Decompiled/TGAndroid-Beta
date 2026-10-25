package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class nz implements org.telegram.ui.Components.bm0, org.telegram.ui.ActionBar.b2 {
    public final int f42035a;
    public final o00 f42036b;

    public nz(o00 o00Var, int i10) {
        this.f42035a = i10;
        this.f42036b = o00Var;
    }

    @Override
    public boolean c(int i10, View view) {
        o00 o00Var = this.f42036b;
        f00 f00Var = (f00) o00Var.P.get(i10);
        if (f00Var != null && (view instanceof org.telegram.ui.Cells.ab)) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
            o00Var.x0(f00Var, abVar.getName(), abVar.getCurrentObject(), f00Var.f39227g);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        switch (this.f42035a) {
            case 1:
                o00 o00Var = this.f42036b;
                org.telegram.ui.ActionBar.e2 e2Var2 = null;
                if (o00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2(o00Var.getParentActivity(), 3, null);
                    e2Var3.f22573i0 = false;
                    e2Var3.show();
                    e2Var2 = e2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f22150id = o00Var.f42056r.f19549id;
                o00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new z7(28, o00Var, e2Var2));
                return;
            case 2:
                this.f42036b.s0();
                return;
            case 3:
                this.f42036b.s0();
                return;
            default:
                this.f42036b.finishFragment();
                return;
        }
    }
}
