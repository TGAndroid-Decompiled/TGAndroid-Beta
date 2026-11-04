package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.sv0;
public final class a6 implements p2 {
    public final org.telegram.ui.ActionBar.d2 f28947a;
    public final Context f28948b;
    public final sv0 f28949c;

    public a6(sv0 sv0Var, org.telegram.ui.ActionBar.d2 d2Var, Context context) {
        this.f28949c = sv0Var;
        this.f28947a = d2Var;
        this.f28948b = context;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void q() {
        boolean z10;
        org.telegram.ui.ActionBar.d2 d2Var = this.f28947a;
        ei.z6 P1 = d2Var.getMessagesController().P1();
        ArrayList arrayList = P1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (P1.E(0, org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            long o10 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i3)).peer);
            if (!z10 || P1.E(0, o10) != 0) {
                arrayList2.add(Long.valueOf(o10));
            }
        }
        d2Var.getOrCreateStoryViewer().U(this.f28948b, null, arrayList2, 0, null, null, new ei.i7(this.f28949c), false);
    }

    @Override
    public final void u(t2 t2Var) {
        org.telegram.ui.ActionBar.d2 d2Var = this.f28947a;
        if (d2Var.getMessagesController().P1().K(t2Var.getDialogId())) {
            d2Var.getOrCreateStoryViewer().getClass();
            d2Var.getOrCreateStoryViewer().R(d2Var.getContext(), t2Var.getDialogId(), new ei.i7(this.f28949c));
        }
    }

    @Override
    public final void l(t2 t2Var) {
    }

    @Override
    public final void r(t2 t2Var) {
    }

    @Override
    public final void w(t2 t2Var) {
    }
}
