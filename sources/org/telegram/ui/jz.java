package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class jz implements org.telegram.ui.Components.jk0, org.telegram.ui.ActionBar.u1 {
    public final int f38604a;
    public final h00 f38605b;

    public jz(h00 h00Var, int i10) {
        this.f38604a = i10;
        this.f38605b = h00Var;
    }

    @Override
    public boolean f(int i10, View view) {
        h00 h00Var = this.f38605b;
        zz zzVar = (zz) h00Var.P.get(i10);
        if (zzVar != null && (view instanceof org.telegram.ui.Cells.pa)) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            h00Var.B0(zzVar, paVar.getName(), paVar.getCurrentObject(), zzVar.f44258g);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f38604a) {
            case 1:
                h00 h00Var = this.f38605b;
                org.telegram.ui.ActionBar.x1 x1Var2 = null;
                if (h00Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.x1 x1Var3 = new org.telegram.ui.ActionBar.x1(3, h00Var.getParentActivity(), null);
                    x1Var3.f21489i0 = false;
                    x1Var3.show();
                    x1Var2 = x1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f19919id = h00Var.f37606r.f15000a;
                h00Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new org.telegram.ui.Components.t20(10, h00Var, x1Var2));
                return;
            case 2:
                this.f38605b.w0();
                return;
            case 3:
                this.f38605b.w0();
                return;
            default:
                this.f38605b.finishFragment();
                return;
        }
    }
}
