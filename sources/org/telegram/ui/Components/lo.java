package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class lo implements o8 {
    public final org.telegram.ui.ActionBar.m1[] f28238a;
    public final oo f28239b;

    public lo(oo ooVar, org.telegram.ui.ActionBar.m1[] m1VarArr) {
        this.f28239b = ooVar;
        this.f28238a = m1VarArr;
    }

    @Override
    public final void H0(int i10, int i11) {
        int i12;
        org.telegram.ui.qn qnVar = this.f28239b.G;
        if (qnVar != null) {
            qnVar.getMessagesController().setDialogHistoryTTL(qnVar.a(), i10);
            TLRPC.ChatFull chatFull = qnVar.Z7;
            TLRPC.UserFull userFull = qnVar.f40623a8;
            if (userFull != null || chatFull != null) {
                qnVar.T7();
                UndoView undoView = qnVar.y3;
                if (undoView != null) {
                    long a2 = qnVar.a();
                    TLRPC.User i13 = qnVar.i();
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
        org.telegram.ui.ActionBar.m1 m1Var = this.f28238a[0];
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override
    public final void Y0() {
    }
}
