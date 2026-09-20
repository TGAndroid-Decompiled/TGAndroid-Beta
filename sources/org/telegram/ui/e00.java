package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e00 implements org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.a2 {
    public final int f33191a;
    public final f10 f33192b;

    public e00(f10 f10Var, int i10) {
        this.f33191a = i10;
        this.f33192b = f10Var;
    }

    @Override
    public boolean d(int i10, View view) {
        f10 f10Var = this.f33192b;
        w00 w00Var = (w00) f10Var.P.get(i10);
        if (w00Var != null && (view instanceof org.telegram.ui.Cells.ab)) {
            org.telegram.ui.Cells.ab abVar = (org.telegram.ui.Cells.ab) view;
            f10Var.v0(w00Var, abVar.getName(), abVar.getCurrentObject(), w00Var.f38632g);
            return true;
        }
        return false;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33191a) {
            case 1:
                f10 f10Var = this.f33192b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (f10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(f10Var.getParentActivity(), 3, null);
                    b2Var3.f18690g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18451id = f10Var.f33439r.f15822id;
                f10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new oo(20, f10Var, b2Var2));
                return;
            case 2:
                this.f33192b.q0();
                return;
            case 3:
                this.f33192b.q0();
                return;
            default:
                this.f33192b.finishFragment();
                return;
        }
    }
}
