package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class d00 implements org.telegram.ui.Components.ol0, org.telegram.ui.ActionBar.b2 {
    public final int f32830a;
    public final e10 f32831b;

    public d00(e10 e10Var, int i10) {
        this.f32830a = i10;
        this.f32831b = e10Var;
    }

    @Override
    public boolean d(int i10, View view) {
        e10 e10Var = this.f32831b;
        v00 v00Var = (v00) e10Var.P.get(i10);
        if (v00Var != null && (view instanceof org.telegram.ui.Cells.za)) {
            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
            e10Var.v0(v00Var, zaVar.getName(), zaVar.getCurrentObject(), v00Var.f38399g);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f32830a) {
            case 1:
                e10 e10Var = this.f32831b;
                org.telegram.ui.ActionBar.c2 c2Var2 = null;
                if (e10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(e10Var.getParentActivity(), 3, null);
                    c2Var3.f18729g0 = false;
                    c2Var3.show();
                    c2Var2 = c2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18452id = e10Var.f33093r.f15826id;
                e10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new mo(20, e10Var, c2Var2));
                return;
            case 2:
                this.f32831b.q0();
                return;
            case 3:
                this.f32831b.q0();
                return;
            default:
                this.f32831b.finishFragment();
                return;
        }
    }
}
