package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class kz implements org.telegram.ui.Components.ik0, org.telegram.ui.ActionBar.u1 {
    public final int f38998a;
    public final i00 f38999b;

    public kz(i00 i00Var, int i10) {
        this.f38998a = i10;
        this.f38999b = i00Var;
    }

    @Override
    public boolean f(int i10, View view) {
        i00 i00Var = this.f38999b;
        a00 a00Var = (a00) i00Var.P.get(i10);
        if (a00Var != null && (view instanceof org.telegram.ui.Cells.pa)) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            i00Var.A0(a00Var, paVar.getName(), paVar.getCurrentObject(), a00Var.f35497g);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f38998a) {
            case 1:
                i00 i00Var = this.f38999b;
                org.telegram.ui.ActionBar.x1 x1Var2 = null;
                if (i00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, i00Var.getParentActivity(), null);
                    x1Var3.f21488i0 = false;
                    x1Var3.show();
                    x1Var2 = x1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f19918id = i00Var.f38071r.f14645a;
                i00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new org.telegram.ui.Components.t20(10, i00Var, x1Var2));
                return;
            case 2:
                this.f38999b.v0();
                return;
            case 3:
                this.f38999b.v0();
                return;
            default:
                this.f38999b.finishFragment();
                return;
        }
    }
}
