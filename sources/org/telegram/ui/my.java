package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class my implements org.telegram.ui.Components.dj0, org.telegram.ui.ActionBar.r1 {
    public final int f48069a;
    public final jz f48070b;

    public my(jz jzVar, int i7) {
        this.f48069a = i7;
        this.f48070b = jzVar;
    }

    @Override
    public boolean c(int i7, View view) {
        jz jzVar = this.f48070b;
        bz bzVar = (bz) jzVar.P.get(i7);
        if (bzVar != null && (view instanceof org.telegram.ui.Cells.pa)) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            jzVar.B0(bzVar, paVar.getName(), paVar.getCurrentObject(), bzVar.f44178g);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f48069a) {
            case 1:
                jz jzVar = this.f48070b;
                org.telegram.ui.ActionBar.u1 u1Var2 = null;
                if (jzVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.u1 u1Var3 = new org.telegram.ui.ActionBar.u1(3, jzVar.getParentActivity(), null);
                    u1Var3.f28558i0 = false;
                    u1Var3.show();
                    u1Var2 = u1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f27085id = jzVar.f47114r.f26074a;
                jzVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new ld(26, jzVar, u1Var2));
                return;
            case 2:
                this.f48070b.w0();
                return;
            case 3:
                this.f48070b.w0();
                return;
            default:
                this.f48070b.finishFragment();
                return;
        }
    }
}
