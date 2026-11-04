package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class ih implements org.telegram.ui.Components.d8 {
    public final wm f46265a;

    public ih(wm wmVar) {
        this.f46265a = wmVar;
    }

    @Override
    public final void W0(int i3, int i10) {
        int i11;
        wm wmVar = this.f46265a;
        wmVar.getMessagesController().I4(i3, wmVar.f51376k6);
        if (wmVar.f51466r8 != null || wmVar.f51453q8 != null) {
            wmVar.f8();
            UndoView undoView = wmVar.N3;
            if (undoView == null) {
                return;
            }
            long j10 = wmVar.f51376k6;
            TLRPC.User user = wmVar.f51306f;
            TLRPC.UserFull userFull = wmVar.f51466r8;
            if (userFull != null) {
                i11 = userFull.ttl_period;
            } else {
                i11 = wmVar.f51453q8.ttl_period;
            }
            undoView.k(j10, i10, user, Integer.valueOf(i11), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.f1 f1Var = this.f46265a.f51316f9;
        if (f1Var != null) {
            f1Var.dismiss();
        }
    }

    @Override
    public final void g1() {
    }
}
