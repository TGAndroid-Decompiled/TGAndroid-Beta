package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class mo implements q8 {
    public final org.telegram.ui.ActionBar.o1[] f30565a;
    public final po f30566b;

    public mo(po poVar, org.telegram.ui.ActionBar.o1[] o1VarArr) {
        this.f30566b = poVar;
        this.f30565a = o1VarArr;
    }

    @Override
    public final void T0(int i10, int i11) {
        int i12;
        org.telegram.ui.wn wnVar = this.f30566b.G;
        if (wnVar != null) {
            wnVar.getMessagesController().setDialogHistoryTTL(wnVar.a(), i10);
            TLRPC.ChatFull chatFull = wnVar.f45245p8;
            TLRPC.UserFull userFull = wnVar.f45255q8;
            if (userFull != null || chatFull != null) {
                wnVar.Z7();
                UndoView undoView = wnVar.K3;
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
        org.telegram.ui.ActionBar.o1 o1Var = this.f30565a[0];
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override
    public final void e1() {
    }
}
