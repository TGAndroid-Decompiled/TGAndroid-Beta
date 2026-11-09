package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ly implements org.telegram.ui.Components.ej0, org.telegram.ui.ActionBar.r1 {
    public final int f47694a;
    public final iz f47695b;

    public ly(iz izVar, int i7) {
        this.f47694a = i7;
        this.f47695b = izVar;
    }

    @Override
    public boolean c(int i7, View view) {
        iz izVar = this.f47695b;
        az azVar = (az) izVar.P.get(i7);
        if (azVar != null && (view instanceof org.telegram.ui.Cells.pa)) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            izVar.B0(azVar, paVar.getName(), paVar.getCurrentObject(), azVar.f43831g);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f47694a) {
            case 1:
                iz izVar = this.f47695b;
                org.telegram.ui.ActionBar.u1 u1Var2 = null;
                if (izVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, izVar.getParentActivity(), null);
                    u1Var3.f28563i0 = false;
                    u1Var3.show();
                    u1Var2 = u1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f27081id = izVar.f46795r.f26070a;
                izVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new ld(26, izVar, u1Var2));
                return;
            case 2:
                this.f47695b.w0();
                return;
            case 3:
                this.f47695b.w0();
                return;
            default:
                this.f47695b.finishFragment();
                return;
        }
    }
}
