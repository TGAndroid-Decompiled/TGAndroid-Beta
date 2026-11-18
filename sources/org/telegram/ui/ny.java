package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ny implements org.telegram.ui.Components.qj0, org.telegram.ui.ActionBar.r1 {
    public final int f50361a;
    public final kz f50362b;

    public ny(kz kzVar, int i7) {
        this.f50361a = i7;
        this.f50362b = kzVar;
    }

    @Override
    public boolean c(int i7, View view) {
        kz kzVar = this.f50362b;
        cz czVar = (cz) kzVar.Q.get(i7);
        if (czVar != null && (view instanceof org.telegram.ui.Cells.qa)) {
            org.telegram.ui.Cells.qa qaVar = (org.telegram.ui.Cells.qa) view;
            kzVar.B0(czVar, qaVar.getName(), qaVar.getCurrentObject(), czVar.f46796g);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50361a) {
            case 1:
                kz kzVar = this.f50362b;
                org.telegram.ui.ActionBar.u1 u1Var2 = null;
                if (kzVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, kzVar.getParentActivity(), null);
                    u1Var3.f30049j0 = false;
                    u1Var3.show();
                    u1Var2 = u1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f28530id = kzVar.f49381r.f26674a;
                kzVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new u7(28, kzVar, u1Var2));
                return;
            case 2:
                this.f50362b.w0();
                return;
            case 3:
                this.f50362b.w0();
                return;
            default:
                this.f50362b.finishFragment();
                return;
        }
    }
}
