package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class fy implements org.telegram.ui.Components.hj0, org.telegram.ui.ActionBar.p1 {
    public final int f45404a;
    public final ez f45405b;

    public fy(ez ezVar, int i3) {
        this.f45404a = i3;
        this.f45405b = ezVar;
    }

    @Override
    public boolean f(int i3, View view) {
        ez ezVar = this.f45405b;
        vy vyVar = (vy) ezVar.Q.get(i3);
        if (vyVar != null && (view instanceof org.telegram.ui.Cells.pa)) {
            org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) view;
            ezVar.B0(vyVar, paVar.getName(), paVar.getCurrentObject(), vyVar.f50635g);
            return true;
        }
        return false;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f45404a) {
            case 1:
                ez ezVar = this.f45405b;
                org.telegram.ui.ActionBar.s1 s1Var2 = null;
                if (ezVar.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.s1 s1Var3 = new org.telegram.ui.ActionBar.s1(3, ezVar.getParentActivity(), null);
                    s1Var3.f28546j0 = false;
                    s1Var3.show();
                    s1Var2 = s1Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f27126id = ezVar.f45107r.f24237a;
                ezVar.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new org.telegram.ui.ActionBar.h6(29, ezVar, s1Var2));
                return;
            case 2:
                this.f45405b.w0();
                return;
            case 3:
                this.f45405b.w0();
                return;
            default:
                this.f45405b.finishFragment();
                return;
        }
    }
}
