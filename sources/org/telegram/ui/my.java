package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class my implements org.telegram.ui.Components.sj0, org.telegram.ui.ActionBar.q1 {
    public final int f50146a;
    public final jz f50147b;

    public my(jz jzVar, int i7) {
        this.f50146a = i7;
        this.f50147b = jzVar;
    }

    @Override
    public boolean b(int i7, View view) {
        jz jzVar = this.f50147b;
        bz bzVar = (bz) jzVar.Q.get(i7);
        if (bzVar != null && (view instanceof org.telegram.ui.Cells.sa)) {
            org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) view;
            jzVar.B0(bzVar, saVar.getName(), saVar.getCurrentObject(), bzVar.f46668g);
            return true;
        }
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f50146a) {
            case 1:
                jz jzVar = this.f50147b;
                org.telegram.ui.ActionBar.t1 t1Var2 = null;
                if (jzVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, jzVar.getParentActivity(), null);
                    t1Var3.f30091j0 = false;
                    t1Var3.show();
                    t1Var2 = t1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f28617id = jzVar.f49254r.f26773a;
                jzVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new v7(28, jzVar, t1Var2));
                return;
            case 2:
                this.f50147b.w0();
                return;
            case 3:
                this.f50147b.w0();
                return;
            default:
                this.f50147b.finishFragment();
                return;
        }
    }
}
