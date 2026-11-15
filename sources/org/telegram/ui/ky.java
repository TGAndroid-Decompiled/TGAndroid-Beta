package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class ky implements org.telegram.ui.Components.ij0, org.telegram.ui.ActionBar.q1 {
    public final int f48786a;
    public final hz f48787b;

    public ky(hz hzVar, int i7) {
        this.f48786a = i7;
        this.f48787b = hzVar;
    }

    @Override
    public boolean b(int i7, View view) {
        hz hzVar = this.f48787b;
        zy zyVar = (zy) hzVar.Q.get(i7);
        if (zyVar != null && (view instanceof org.telegram.ui.Cells.pa)) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            hzVar.B0(zyVar, paVar.getName(), paVar.getCurrentObject(), zyVar.f54063g);
            return true;
        }
        return false;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        switch (this.f48786a) {
            case 1:
                hz hzVar = this.f48787b;
                org.telegram.ui.ActionBar.t1 t1Var2 = null;
                if (hzVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.t1 t1Var3 = new org.telegram.ui.ActionBar.t1(3, hzVar.getParentActivity(), null);
                    t1Var3.f29637j0 = false;
                    t1Var3.show();
                    t1Var2 = t1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f28176id = hzVar.f47849r.f26552a;
                hzVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new v7(28, hzVar, t1Var2));
                return;
            case 2:
                this.f48787b.w0();
                return;
            case 3:
                this.f48787b.w0();
                return;
            default:
                this.f48787b.finishFragment();
                return;
        }
    }
}
