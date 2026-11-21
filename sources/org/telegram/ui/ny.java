package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ny implements org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.q1 {
    public final int f50352a;
    public final kz f50353b;

    public ny(kz kzVar, int i7) {
        this.f50352a = i7;
        this.f50353b = kzVar;
    }

    @Override
    public boolean c(int i7, View view) {
        kz kzVar = this.f50353b;
        cz czVar = (cz) kzVar.Q.get(i7);
        if (czVar != null && (view instanceof org.telegram.ui.Cells.ra)) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
            kzVar.B0(czVar, raVar.getName(), raVar.getCurrentObject(), czVar.f46832g);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f50352a) {
            case 1:
                kz kzVar = this.f50353b;
                org.telegram.ui.ActionBar.t1 t1Var2 = null;
                if (kzVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, kzVar.getParentActivity(), null);
                    t1Var3.f30030j0 = false;
                    t1Var3.show();
                    t1Var2 = t1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f28556id = kzVar.f49428r.f26700a;
                kzVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new u7(28, kzVar, t1Var2));
                return;
            case 2:
                this.f50353b.w0();
                return;
            case 3:
                this.f50353b.w0();
                return;
            default:
                this.f50353b.finishFragment();
                return;
        }
    }
}
