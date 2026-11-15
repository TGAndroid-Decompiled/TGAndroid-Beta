package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class mh implements org.telegram.ui.Components.c8 {
    public final an f49232a;

    public mh(an anVar) {
        this.f49232a = anVar;
    }

    @Override
    public final void R0(int i7, int i10) {
        int i11;
        an anVar = this.f49232a;
        anVar.getMessagesController().J4(i7, anVar.f45259k6);
        if (anVar.f45348r8 != null || anVar.f45334q8 != null) {
            anVar.h8();
            UndoView undoView = anVar.N3;
            if (undoView == null) {
                return;
            }
            long j3 = anVar.f45259k6;
            TLRPC.User user = anVar.f45187f;
            TLRPC.UserFull userFull = anVar.f45348r8;
            if (userFull != null) {
                i11 = userFull.ttl_period;
            } else {
                i11 = anVar.f45334q8.ttl_period;
            }
            undoView.k(j3, i10, user, Integer.valueOf(i11), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f49232a.f45197f9;
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override
    public final void g1() {
    }
}
