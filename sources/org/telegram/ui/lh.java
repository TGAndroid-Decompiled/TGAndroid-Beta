package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class lh implements org.telegram.ui.Components.k8 {
    public final bn f49604a;

    public lh(bn bnVar) {
        this.f49604a = bnVar;
    }

    @Override
    public final void R0(int i7, int i10) {
        int i11;
        bn bnVar = this.f49604a;
        bnVar.getMessagesController().T4(i7, bnVar.f46085l6);
        if (bnVar.f46176s8 != null || bnVar.f46163r8 != null) {
            bnVar.h8();
            UndoView undoView = bnVar.N3;
            if (undoView == null) {
                return;
            }
            long j3 = bnVar.f46085l6;
            TLRPC.User user = bnVar.f46001f;
            TLRPC.UserFull userFull = bnVar.f46176s8;
            if (userFull != null) {
                i11 = userFull.ttl_period;
            } else {
                i11 = bnVar.f46163r8.ttl_period;
            }
            undoView.k(j3, i10, user, Integer.valueOf(i11), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.h1 h1Var = this.f49604a.f46023g9;
        if (h1Var != null) {
            h1Var.dismiss();
        }
    }

    @Override
    public final void d1() {
    }
}
