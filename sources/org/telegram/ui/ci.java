package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ci implements org.telegram.ui.Components.n8 {
    public final wn f32731a;

    public ci(wn wnVar) {
        this.f32731a = wnVar;
    }

    @Override
    public final void U0(int i10, int i11) {
        int i12;
        wn wnVar = this.f32731a;
        wnVar.getMessagesController().setDialogHistoryTTL(wnVar.T5, i10);
        if (wnVar.f39416a8 != null || wnVar.Z7 != null) {
            wnVar.Q7();
            UndoView undoView = wnVar.y3;
            if (undoView == null) {
                return;
            }
            long j3 = wnVar.T5;
            TLRPC.User user = wnVar.f39472f;
            TLRPC.UserFull userFull = wnVar.f39416a8;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = wnVar.Z7.ttl_period;
            }
            undoView.k(j3, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.f32731a.Q8;
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override
    public final void j1() {
    }
}
