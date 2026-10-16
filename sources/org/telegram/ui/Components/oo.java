package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class oo implements r8 {
    public final org.telegram.ui.ActionBar.m1[] f27694a;
    public final ro f27695b;

    public oo(ro roVar, org.telegram.ui.ActionBar.m1[] m1VarArr) {
        this.f27695b = roVar;
        this.f27694a = m1VarArr;
    }

    @Override
    public final void X0(int i10, int i11) {
        int i12;
        org.telegram.ui.fo foVar = this.f27695b.G;
        if (foVar != null) {
            foVar.getMessagesController().setDialogHistoryTTL(foVar.a(), i10);
            TLRPC.ChatFull chatFull = foVar.Z7;
            TLRPC.UserFull userFull = foVar.f35579a8;
            if (userFull != null || chatFull != null) {
                foVar.T7();
                UndoView undoView = foVar.y3;
                if (undoView != null) {
                    long a2 = foVar.a();
                    TLRPC.User i13 = foVar.i();
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
        org.telegram.ui.ActionBar.m1 m1Var = this.f27694a[0];
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override
    public final void k1() {
    }
}
