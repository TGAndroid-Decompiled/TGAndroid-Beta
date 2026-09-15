package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e00 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2 {
    public final int f33180a;
    public final f10 f33181b;

    public e00(f10 f10Var, int i10) {
        this.f33180a = i10;
        this.f33181b = f10Var;
    }

    @Override
    public boolean d(int i10, View view) {
        f10 f10Var = this.f33181b;
        w00 w00Var = (w00) f10Var.P.get(i10);
        if (w00Var != null && (view instanceof org.telegram.ui.Cells.ab)) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
            f10Var.v0(w00Var, abVar.getName(), abVar.getCurrentObject(), w00Var.f38728g);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33180a) {
            case 1:
                f10 f10Var = this.f33181b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (f10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(f10Var.getParentActivity(), 3, null);
                    b2Var3.f18473g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18235id = f10Var.f33446r.f15603id;
                f10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new qo(20, f10Var, b2Var2));
                return;
            case 2:
                this.f33181b.q0();
                return;
            case 3:
                this.f33181b.q0();
                return;
            default:
                this.f33181b.finishFragment();
                return;
        }
    }
}
