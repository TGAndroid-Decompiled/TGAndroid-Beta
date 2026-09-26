package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a00 implements org.telegram.ui.Components.nl0, org.telegram.ui.ActionBar.z1 {
    public final int f31932a;
    public final b10 f31933b;

    public a00(b10 b10Var, int i10) {
        this.f31932a = i10;
        this.f31933b = b10Var;
    }

    @Override
    public boolean d(int i10, View view) {
        b10 b10Var = this.f31933b;
        s00 s00Var = (s00) b10Var.P.get(i10);
        if (s00Var != null && (view instanceof org.telegram.ui.Cells.za)) {
            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
            b10Var.v0(s00Var, zaVar.getName(), zaVar.getCurrentObject(), s00Var.f37556g);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        switch (this.f31932a) {
            case 1:
                b10 b10Var = this.f31933b;
                org.telegram.ui.ActionBar.a2 a2Var2 = null;
                if (b10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.a2 a2Var3 = new org.telegram.ui.ActionBar.a2(b10Var.getParentActivity(), 3, null);
                    a2Var3.f18682g0 = false;
                    a2Var3.show();
                    a2Var2 = a2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f18458id = b10Var.f32277r.f15832id;
                b10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new lo(20, b10Var, a2Var2));
                return;
            case 2:
                this.f31933b.q0();
                return;
            case 3:
                this.f31933b.q0();
                return;
            default:
                this.f31933b.finishFragment();
                return;
        }
    }
}
