package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class gi implements org.telegram.ui.Components.l8 {
    public final bo f33984a;

    public gi(bo boVar) {
        this.f33984a = boVar;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        bo boVar = this.f33984a;
        boVar.getMessagesController().setDialogHistoryTTL(boVar.T5, i10);
        if (boVar.f32225a8 != null || boVar.Z7 != null) {
            boVar.Q7();
            UndoView undoView = boVar.y3;
            if (undoView == null) {
                return;
            }
            long j3 = boVar.T5;
            TLRPC.User user = boVar.f32281f;
            TLRPC.UserFull userFull = boVar.f32225a8;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = boVar.Z7.ttl_period;
            }
            undoView.k(j3, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.f33984a.Q8;
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override
    public final void j1() {
    }
}
