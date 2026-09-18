package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g00 implements org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.b2 {
    public final int f33812a;
    public final h10 f33813b;

    public g00(h10 h10Var, int i10) {
        this.f33812a = i10;
        this.f33813b = h10Var;
    }

    @Override
    public boolean d(int i10, View view) {
        h10 h10Var = this.f33813b;
        y00 y00Var = (y00) h10Var.P.get(i10);
        if (y00Var != null && (view instanceof org.telegram.ui.Cells.ab)) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
            h10Var.v0(y00Var, abVar.getName(), abVar.getCurrentObject(), y00Var.f39749g);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f33812a) {
            case 1:
                h10 h10Var = this.f33813b;
                org.telegram.ui.ActionBar.c2 c2Var2 = null;
                if (h10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(h10Var.getParentActivity(), 3, null);
                    c2Var3.f18503g0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18244id = h10Var.f34096r.f15613id;
                h10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new qo(20, h10Var, c2Var2));
                return;
            case 2:
                this.f33813b.q0();
                return;
            case 3:
                this.f33813b.q0();
                return;
            default:
                this.f33813b.finishFragment();
                return;
        }
    }
}
