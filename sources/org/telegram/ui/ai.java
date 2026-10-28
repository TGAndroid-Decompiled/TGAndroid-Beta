package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ai implements org.telegram.ui.Components.q8 {
    public final wn f37784a;

    public ai(wn wnVar) {
        this.f37784a = wnVar;
    }

    @Override
    public final void T0(int i10, int i11) {
        int i12;
        wn wnVar = this.f37784a;
        wnVar.getMessagesController().setDialogHistoryTTL(wnVar.f45168j6, i10);
        if (wnVar.f45255q8 != null || wnVar.f45245p8 != null) {
            wnVar.Z7();
            UndoView undoView = wnVar.K3;
            if (undoView == null) {
                return;
            }
            long j10 = wnVar.f45168j6;
            TLRPC.User user = wnVar.f45113f;
            TLRPC.UserFull userFull = wnVar.f45255q8;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = wnVar.f45245p8.ttl_period;
            }
            undoView.k(j10, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.o1 o1Var = this.f37784a.f45134g9;
        if (o1Var != null) {
            o1Var.dismiss();
        }
    }

    @Override
    public final void e1() {
    }
}
