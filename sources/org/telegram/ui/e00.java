package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class e00 implements org.telegram.ui.Components.bl0, org.telegram.ui.ActionBar.a2 {
    public final int f35930a;
    public final f10 f35931b;

    public e00(f10 f10Var, int i10) {
        this.f35930a = i10;
        this.f35931b = f10Var;
    }

    @Override
    public boolean a(int i10, View view) {
        f10 f10Var = this.f35931b;
        w00 w00Var = (w00) f10Var.P.get(i10);
        if (w00Var != null && (view instanceof org.telegram.ui.Cells.za)) {
            org.telegram.ui.Cells.za zaVar = (org.telegram.ui.Cells.za) view;
            f10Var.v0(w00Var, zaVar.getName(), zaVar.getCurrentObject(), w00Var.f41762g);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f35930a) {
            case 1:
                f10 f10Var = this.f35931b;
                org.telegram.ui.ActionBar.b2 b2Var2 = null;
                if (f10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(f10Var.getParentActivity(), 3, null);
                    b2Var3.f20264g0 = false;
                    b2Var3.show();
                    b2Var2 = b2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f20019id = f10Var.f36255r.f17107id;
                f10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new ro(20, f10Var, b2Var2));
                return;
            case 2:
                this.f35931b.q0();
                return;
            case 3:
                this.f35931b.q0();
                return;
            default:
                this.f35931b.finishFragment();
                return;
        }
    }
}
