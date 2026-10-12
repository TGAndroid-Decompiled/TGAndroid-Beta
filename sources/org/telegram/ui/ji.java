package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ji implements org.telegram.ui.Components.r8 {
    public final fo f37385a;

    public ji(fo foVar) {
        this.f37385a = foVar;
    }

    @Override
    public final void X0(int i10, int i11) {
        int i12;
        fo foVar = this.f37385a;
        foVar.getMessagesController().setDialogHistoryTTL(foVar.T5, i10);
        if (foVar.f35878a8 != null || foVar.Z7 != null) {
            foVar.T7();
            UndoView undoView = foVar.y3;
            if (undoView == null) {
                return;
            }
            long j10 = foVar.T5;
            TLRPC.User user = foVar.f35935f;
            TLRPC.UserFull userFull = foVar.f35878a8;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = foVar.Z7.ttl_period;
            }
            undoView.k(j10, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.m1 m1Var = this.f37385a.Q8;
        if (m1Var != null) {
            m1Var.dismiss();
        }
    }

    @Override
    public final void l1() {
    }
}
