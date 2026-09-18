package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class ao implements l8 {
    public final org.telegram.ui.ActionBar.o1[] f22449a;
    public final eo f22450b;

    public ao(eo eoVar, org.telegram.ui.ActionBar.o1[] o1VarArr) {
        this.f22450b = eoVar;
        this.f22449a = o1VarArr;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        org.telegram.ui.bo boVar = this.f22450b.G;
        if (boVar != null) {
            boVar.getMessagesController().setDialogHistoryTTL(boVar.a(), i10);
            TLRPC.ChatFull chatFull = boVar.Z7;
            TLRPC.UserFull userFull = boVar.f32225a8;
            if (userFull != null || chatFull != null) {
                boVar.Q7();
                UndoView undoView = boVar.y3;
                if (undoView != null) {
                    long a2 = boVar.a();
                    TLRPC.User i13 = boVar.i();
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
        org.telegram.ui.ActionBar.o1 o1Var = this.f22449a[0];
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override
    public final void j1() {
    }
}
