package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class c00 implements org.telegram.ui.Components.jl0, org.telegram.ui.ActionBar.c2 {
    public final int f32970a;
    public final c10 f32971b;

    public c00(c10 c10Var, int i10) {
        this.f32970a = i10;
        this.f32971b = c10Var;
    }

    @Override
    public boolean d(int i10, View view) {
        c10 c10Var = this.f32971b;
        t00 t00Var = (t00) c10Var.M.get(i10);
        if (t00Var != null && (view instanceof org.telegram.ui.Cells.ua)) {
            org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) view;
            c10Var.v0(t00Var, uaVar.getName(), uaVar.getCurrentObject(), t00Var.f38345g);
            return true;
        }
        return false;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f32970a) {
            case 1:
                c10 c10Var = this.f32971b;
                org.telegram.ui.ActionBar.d2 d2Var2 = null;
                if (c10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(c10Var.getParentActivity(), 3, null);
                    d2Var3.f19565d0 = false;
                    d2Var3.show();
                    d2Var2 = d2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f19282id = c10Var.f32981r.f16649id;
                c10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new no(20, c10Var, d2Var2));
                return;
            case 2:
                this.f32971b.q0();
                return;
            case 3:
                this.f32971b.q0();
                return;
            default:
                this.f32971b.finishFragment();
                return;
        }
    }
}
