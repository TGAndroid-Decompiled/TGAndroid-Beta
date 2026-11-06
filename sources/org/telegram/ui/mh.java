package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class mh implements org.telegram.ui.Components.f8 {
    public final an f47808a;

    public mh(an anVar) {
        this.f47808a = anVar;
    }

    @Override
    public final void X0(int i7, int i10) {
        int i11;
        an anVar = this.f47808a;
        anVar.getMessagesController().I4(i7, anVar.f43843j6);
        if (anVar.f43930q8 != null || anVar.f43917p8 != null) {
            anVar.f8();
            UndoView undoView = anVar.M3;
            if (undoView == null) {
                return;
            }
            long j3 = anVar.f43843j6;
            TLRPC.User user = anVar.f43786f;
            TLRPC.UserFull userFull = anVar.f43930q8;
            if (userFull != null) {
                i11 = userFull.ttl_period;
            } else {
                i11 = anVar.f43917p8.ttl_period;
            }
            undoView.k(j3, i10, user, Integer.valueOf(i11), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.g1 g1Var = this.f47808a.f43782e9;
        if (g1Var != null) {
            g1Var.dismiss();
        }
    }

    @Override
    public final void i1() {
    }
}
