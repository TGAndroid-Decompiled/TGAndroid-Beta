package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class mh implements org.telegram.ui.Components.i8 {
    public final bn f50071a;

    public mh(bn bnVar) {
        this.f50071a = bnVar;
    }

    @Override
    public final void B0(int i7, int i10) {
        int i11;
        bn bnVar = this.f50071a;
        bnVar.getMessagesController().T4(i7, bnVar.f46271l6);
        if (bnVar.f46362s8 != null || bnVar.f46349r8 != null) {
            bnVar.h8();
            UndoView undoView = bnVar.N3;
            if (undoView == null) {
                return;
            }
            long j3 = bnVar.f46271l6;
            TLRPC.User user = bnVar.f46187f;
            TLRPC.UserFull userFull = bnVar.f46362s8;
            if (userFull != null) {
                i11 = userFull.ttl_period;
            } else {
                i11 = bnVar.f46349r8.ttl_period;
            }
            undoView.k(j3, i10, user, Integer.valueOf(i11), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f50071a.f46209g9;
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override
    public final void X0() {
    }
}
