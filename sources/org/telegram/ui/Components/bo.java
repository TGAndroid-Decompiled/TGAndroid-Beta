package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class bo implements n8 {
    public final org.telegram.ui.ActionBar.m1[] f23057a;
    public final fo f23058b;

    public bo(fo foVar, org.telegram.ui.ActionBar.m1[] m1VarArr) {
        this.f23058b = foVar;
        this.f23057a = m1VarArr;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        org.telegram.ui.wn wnVar = this.f23058b.G;
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
        org.telegram.ui.ActionBar.m1 m1Var = this.f23057a[0];
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override
    public final void j1() {
    }
}
