package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g00 implements org.telegram.ui.Components.mm0, org.telegram.ui.ActionBar.z1 {
    public final int f37881a;
    public final h10 f37882b;

    public g00(h10 h10Var, int i10) {
        this.f37881a = i10;
        this.f37882b = h10Var;
    }

    @Override
    public boolean d(int i10, View view) {
        h10 h10Var = this.f37882b;
        y00 y00Var = (y00) h10Var.P.get(i10);
        if (y00Var != null && (view instanceof org.telegram.ui.Cells.xa)) {
            org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) view;
            h10Var.v0(y00Var, xaVar.getName(), xaVar.getCurrentObject(), y00Var.f44228g);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f37881a) {
            case 1:
                h10 h10Var = this.f37882b;
                org.telegram.ui.ActionBar.a2 a2Var2 = null;
                if (h10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(h10Var.getParentActivity(), 3, null);
                    a2Var3.f20164g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f19926id = h10Var.f38218r.f17004id;
                h10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new so(20, h10Var, a2Var2));
                return;
            case 2:
                this.f37882b.q0();
                return;
            case 3:
                this.f37882b.q0();
                return;
            default:
                this.f37882b.finishFragment();
                return;
        }
    }
}
