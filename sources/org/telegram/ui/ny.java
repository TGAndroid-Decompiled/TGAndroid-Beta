package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ny implements org.telegram.ui.Components.qj0, org.telegram.ui.ActionBar.r1 {
    public final int f50345a;
    public final kz f50346b;

    public ny(kz kzVar, int i7) {
        this.f50345a = i7;
        this.f50346b = kzVar;
    }

    @Override
    public boolean c(int i7, View view) {
        kz kzVar = this.f50346b;
        cz czVar = (cz) kzVar.Q.get(i7);
        if (czVar != null && (view instanceof org.telegram.ui.Cells.ra)) {
            org.telegram.ui.Cells.ra raVar = (org.telegram.ui.Cells.ra) view;
            kzVar.B0(czVar, raVar.getName(), raVar.getCurrentObject(), czVar.f46776g);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f50345a) {
            case 1:
                kz kzVar = this.f50346b;
                org.telegram.ui.ActionBar.u1 u1Var2 = null;
                if (kzVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, kzVar.getParentActivity(), null);
                    u1Var3.f30047j0 = false;
                    u1Var3.show();
                    u1Var2 = u1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f28528id = kzVar.f49387r.f26672a;
                kzVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new u7(28, kzVar, u1Var2));
                return;
            case 2:
                this.f50346b.w0();
                return;
            case 3:
                this.f50346b.w0();
                return;
            default:
                this.f50346b.finishFragment();
                return;
        }
    }
}
