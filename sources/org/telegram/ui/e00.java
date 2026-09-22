package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e00 implements org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.a2 {
    public final int f33211a;
    public final f10 f33212b;

    public e00(f10 f10Var, int i10) {
        this.f33211a = i10;
        this.f33212b = f10Var;
    }

    @Override
    public boolean d(int i10, View view) {
        f10 f10Var = this.f33212b;
        w00 w00Var = (w00) f10Var.P.get(i10);
        if (w00Var != null && (view instanceof org.telegram.ui.Cells.ab)) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
            f10Var.v0(w00Var, abVar.getName(), abVar.getCurrentObject(), w00Var.f38653g);
            return true;
        }
        return false;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33211a) {
            case 1:
                f10 f10Var = this.f33212b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (f10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(f10Var.getParentActivity(), 3, null);
                    b2Var3.f18705g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18466id = f10Var.f33464r.f15837id;
                f10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new oo(20, f10Var, b2Var2));
                return;
            case 2:
                this.f33212b.q0();
                return;
            case 3:
                this.f33212b.q0();
                return;
            default:
                this.f33212b.finishFragment();
                return;
        }
    }
}
