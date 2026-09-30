package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class co implements n8 {
    public final org.telegram.ui.ActionBar.m1[] f23353a;
    public final go f23354b;

    public co(go goVar, org.telegram.ui.ActionBar.m1[] m1VarArr) {
        this.f23354b = goVar;
        this.f23353a = m1VarArr;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        org.telegram.ui.wn wnVar = this.f23354b.G;
        if (wnVar != null) {
            wnVar.getMessagesController().setDialogHistoryTTL(wnVar.a(), i10);
            TLRPC.ChatFull chatFull = wnVar.Z7;
            TLRPC.UserFull userFull = wnVar.f39415a8;
            if (userFull != null || chatFull != null) {
                wnVar.Q7();
                UndoView undoView = wnVar.y3;
                if (undoView != null) {
                    long a2 = wnVar.a();
                    TLRPC.User i13 = wnVar.i();
                    if (userFull != null) {
                        i12 = userFull.ttl_period;
                    } else {
                        i12 = chatFull.ttl_period;
                    }
                    undoView.k(a2, i11, i13, Integer.valueOf(i12), null, null);
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.f23353a[0];
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override
    public final void j1() {
    }
}
