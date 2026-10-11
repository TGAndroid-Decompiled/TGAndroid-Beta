package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class d00 implements org.telegram.ui.Components.im0, org.telegram.ui.ActionBar.z1 {
    public final int f36862a;
    public final e10 f36863b;

    public d00(e10 e10Var, int i10) {
        this.f36862a = i10;
        this.f36863b = e10Var;
    }

    @Override
    public boolean d(int i10, View view) {
        e10 e10Var = this.f36863b;
        v00 v00Var = (v00) e10Var.P.get(i10);
        if (v00Var != null && (view instanceof org.telegram.ui.Cells.xa)) {
            org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
            e10Var.v0(v00Var, xaVar.getName(), xaVar.getCurrentObject(), v00Var.f42816g);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f36862a) {
            case 1:
                e10 e10Var = this.f36863b;
                org.telegram.ui.ActionBar.a2 a2Var2 = null;
                if (e10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(e10Var.getParentActivity(), 3, null);
                    a2Var3.f20390g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20155id = e10Var.f37175r.f17251id;
                e10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new oo(20, e10Var, a2Var2));
                return;
            case 2:
                this.f36863b.q0();
                return;
            case 3:
                this.f36863b.q0();
                return;
            default:
                this.f36863b.finishFragment();
                return;
        }
    }
}
