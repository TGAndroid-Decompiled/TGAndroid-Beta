package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class a00 implements org.telegram.ui.Components.kl0, org.telegram.ui.ActionBar.c2 {
    public final int f32424a;
    public final b10 f32425b;

    public a00(b10 b10Var, int i10) {
        this.f32424a = i10;
        this.f32425b = b10Var;
    }

    @Override
    public boolean f(int i10, View view) {
        b10 b10Var = this.f32425b;
        s00 s00Var = (s00) b10Var.M.get(i10);
        if (s00Var != null && (view instanceof org.telegram.ui.Cells.va)) {
            org.telegram.ui.Cells.va vaVar = (org.telegram.ui.Cells.va) view;
            b10Var.v0(s00Var, vaVar.getName(), vaVar.getCurrentObject(), s00Var.f38159g);
            return true;
        }
        return false;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f32424a) {
            case 1:
                b10 b10Var = this.f32425b;
                org.telegram.ui.ActionBar.d2 d2Var2 = null;
                if (b10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(b10Var.getParentActivity(), 3, null);
                    d2Var3.f19590d0 = false;
                    d2Var3.show();
                    d2Var2 = d2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f19307id = b10Var.f32764r.f16669id;
                b10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new lo(20, b10Var, d2Var2));
                return;
            case 2:
                this.f32425b.q0();
                return;
            case 3:
                this.f32425b.q0();
                return;
            default:
                this.f32425b.finishFragment();
                return;
        }
    }
}
