package org.telegram.ui;

import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class g00 implements org.telegram.ui.Components.ll0, org.telegram.ui.ActionBar.c2 {
    public final int f32954a;
    public final h10 f32955b;

    public g00(h10 h10Var, int i10) {
        this.f32954a = i10;
        this.f32955b = h10Var;
    }

    @Override
    public boolean d(int i10, View view) {
        h10 h10Var = this.f32955b;
        y00 y00Var = (y00) h10Var.P.get(i10);
        if (y00Var != null && (view instanceof org.telegram.ui.Cells.bb)) {
            org.telegram.ui.Cells.bb bbVar = (org.telegram.ui.Cells.bb) view;
            h10Var.v0(y00Var, bbVar.getName(), bbVar.getCurrentObject(), y00Var.f38859g);
            return true;
        }
        return false;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f32954a) {
            case 1:
                h10 h10Var = this.f32955b;
                org.telegram.ui.ActionBar.d2 d2Var2 = null;
                if (h10Var.getParentActivity() != null) {
                    org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(h10Var.getParentActivity(), 3, null);
                    d2Var3.f17621g0 = false;
                    d2Var3.show();
                    d2Var2 = d2Var3;
                }
                TLRPC.TL_messages_updateDialogFilter tL_messages_updateDialogFilter = new TLRPC.TL_messages_updateDialogFilter();
                tL_messages_updateDialogFilter.f17318id = h10Var.f33237r.f14645id;
                h10Var.getConnectionsManager().sendRequest(tL_messages_updateDialogFilter, new org.telegram.ui.Components.th(15, h10Var, d2Var2));
                return;
            case 2:
                this.f32955b.q0();
                return;
            case 3:
                this.f32955b.q0();
                return;
            default:
                this.f32955b.finishFragment();
                return;
        }
    }
}
