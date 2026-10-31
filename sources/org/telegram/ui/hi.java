package org.telegram.ui;

import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.UndoView;
public final class hi implements org.telegram.ui.Components.a8 {
    public final un f37968a;

    public hi(un unVar) {
        this.f37968a = unVar;
    }

    @Override
    public final void Y0(int i10, int i11) {
        int i12;
        un unVar = this.f37968a;
        unVar.getMessagesController().F4(i10, unVar.f42297j6);
        if (unVar.f42385q8 != null || unVar.f42374p8 != null) {
            unVar.Y7();
            UndoView undoView = unVar.M3;
            if (undoView == null) {
                return;
            }
            long j10 = unVar.f42297j6;
            TLRPC.User user = unVar.f42243f;
            TLRPC.UserFull userFull = unVar.f42385q8;
            if (userFull != null) {
                i12 = userFull.ttl_period;
            } else {
                i12 = unVar.f42374p8.ttl_period;
            }
            undoView.k(j10, i11, user, Integer.valueOf(i12), null, null);
        }
    }

    @Override
    public final void dismiss() {
        org.telegram.ui.ActionBar.k1 k1Var = this.f37968a.f42240e9;
        if (k1Var != null) {
            k1Var.dismiss();
        }
    }

    @Override
    public final void t1() {
    }
}
