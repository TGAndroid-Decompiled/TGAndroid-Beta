package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;

public final class on implements f8 {

    public final org.telegram.ui.ActionBar.n1[] f31365a;

    public final rn f31366b;

    public on(rn rnVar, org.telegram.ui.ActionBar.n1[] n1VarArr) {
        this.f31366b = rnVar;
        this.f31365a = n1VarArr;
    }

    @Override
    public final void V0(int i10, int i11) {
        org.telegram.ui.rn rnVar = this.f31366b.C;
        if (rnVar == null) {
            return;
        }
        rnVar.getMessagesController().setDialogHistoryTTL(rnVar.a(), i10);
        TLRPC.ChatFull chatFull = rnVar.V7;
        TLRPC.UserFull userFull = rnVar.W7;
        if (userFull == null && chatFull == null) {
            return;
        }
        rnVar.Q7();
        UndoView undoView = rnVar.f42229u3;
        if (undoView != null) {
            undoView.k(rnVar.a(), i11, rnVar.i(), Integer.valueOf(userFull != null ? userFull.ttl_period : chatFull.ttl_period), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.f31365a[0];
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override
    public final void j1() {
    }
}
