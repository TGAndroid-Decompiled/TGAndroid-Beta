package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class fi implements org.telegram.ui.Components.p8 {
    public final co f36408a;

    public fi(co coVar) {
        this.f36408a = coVar;
    }

    @Override
    public final void Y0(int i10, int i11) {
        int i12;
        co coVar = this.f36408a;
        coVar.getMessagesController().setDialogHistoryTTL(coVar.T5, i10);
        if (coVar.f35192a8 != null || coVar.Z7 != null) {
            coVar.Q7();
            UndoView undoView = coVar.y3;
            if (undoView == null) {
                return;
            }
            long j3 = coVar.T5;
            TLRPC.User user = coVar.f35249f;
            TLRPC.UserFull userFull = coVar.f35192a8;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = coVar.Z7.ttl_period;
            }
            undoView.k(j3, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.n1 n1Var = this.f36408a.Q8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
    }

    @Override
    public final void l1() {
    }
}
