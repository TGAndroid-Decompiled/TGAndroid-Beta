package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class b00 implements org.telegram.ui.Components.cl0, org.telegram.ui.ActionBar.a2 {
    public final int f31914a;
    public final c10 f31915b;

    public b00(c10 c10Var, int i10) {
        this.f31914a = i10;
        this.f31915b = c10Var;
    }

    @Override
    public boolean d(int i10, View view) {
        c10 c10Var = this.f31915b;
        t00 t00Var = (t00) c10Var.P.get(i10);
        if (t00Var != null && (view instanceof org.telegram.ui.Cells.bb)) {
            org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
            c10Var.v0(t00Var, bbVar.getName(), bbVar.getCurrentObject(), t00Var.f37479g);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f31914a) {
            case 1:
                c10 c10Var = this.f31915b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (c10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(c10Var.getParentActivity(), 3, null);
                    b2Var3.f18459g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18206id = c10Var.f32224r.f15577id;
                c10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new mo(20, c10Var, b2Var2));
                return;
            case 2:
                this.f31915b.q0();
                return;
            case 3:
                this.f31915b.q0();
                return;
            default:
                this.f31915b.finishFragment();
                return;
        }
    }
}
