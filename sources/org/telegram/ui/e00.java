package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e00 implements org.telegram.ui.Components.ml0, org.telegram.ui.ActionBar.a2 {
    public final int f33140a;
    public final f10 f33141b;

    public e00(f10 f10Var, int i10) {
        this.f33140a = i10;
        this.f33141b = f10Var;
    }

    @Override
    public boolean d(int i10, View view) {
        f10 f10Var = this.f33141b;
        w00 w00Var = (w00) f10Var.P.get(i10);
        if (w00Var != null && (view instanceof org.telegram.ui.Cells.za)) {
            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
            f10Var.v0(w00Var, zaVar.getName(), zaVar.getCurrentObject(), w00Var.f38652g);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f33140a) {
            case 1:
                f10 f10Var = this.f33141b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (f10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(f10Var.getParentActivity(), 3, null);
                    b2Var3.f18658g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18419id = f10Var.f33395r.f15790id;
                f10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new oo(20, f10Var, b2Var2));
                return;
            case 2:
                this.f33141b.q0();
                return;
            case 3:
                this.f33141b.q0();
                return;
            default:
                this.f33141b.finishFragment();
                return;
        }
    }
}
