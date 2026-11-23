package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class lh implements org.telegram.ui.Components.j8 {
    public final bn f49597a;

    public lh(bn bnVar) {
        this.f49597a = bnVar;
    }

    @Override
    public final void R0(int i7, int i10) {
        int i11;
        bn bnVar = this.f49597a;
        bnVar.getMessagesController().T4(i7, bnVar.f46056l6);
        if (bnVar.f46147s8 != null || bnVar.f46134r8 != null) {
            bnVar.h8();
            UndoView undoView = bnVar.N3;
            if (undoView == null) {
                return;
            }
            long j3 = bnVar.f46056l6;
            TLRPC.User user = bnVar.f45972f;
            TLRPC.UserFull userFull = bnVar.f46147s8;
            if (userFull != null) {
                i11 = userFull.ttl_period;
            } else {
                i11 = bnVar.f46134r8.ttl_period;
            }
            undoView.k(j3, i10, user, Integer.valueOf(i11), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f49597a.f45994g9;
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override
    public final void d1() {
    }
}
