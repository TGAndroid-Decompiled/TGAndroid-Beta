package org.telegram.ui.Components;

import org.telegram.tgnet.TLRPC;
public final class gn implements d8 {
    public final org.telegram.ui.ActionBar.f1[] f34154a;
    public final jn f34155b;

    public gn(jn jnVar, org.telegram.ui.ActionBar.f1[] f1VarArr) {
        this.f34155b = jnVar;
        this.f34154a = f1VarArr;
    }

    @Override
    public final void W0(int i3, int i10) {
        int i11;
        org.telegram.ui.wm wmVar = this.f34155b.H;
        if (wmVar != null) {
            wmVar.getMessagesController().I4(i3, wmVar.a());
            TLRPC.ChatFull chatFull = wmVar.f51453q8;
            TLRPC.UserFull userFull = wmVar.f51466r8;
            if (userFull != null || chatFull != null) {
                wmVar.f8();
                UndoView undoView = wmVar.N3;
                if (undoView != null) {
                    long a10 = wmVar.a();
                    TLRPC.User j10 = wmVar.j();
                    if (userFull != null) {
                        i11 = userFull.ttl_period;
                    } else {
                        i11 = chatFull.ttl_period;
                    }
                    undoView.k(a10, i10, j10, Integer.valueOf(i11), null, null);
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.f1 f1Var = this.f34154a[0];
        if (f1Var != null) {
            f1Var.dismiss();
        }
    }

    @Override
    public final void g1() {
    }
}
