package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.zv0;
public final class a6 implements p2 {
    public final org.telegram.ui.ActionBar.e2 f30006a;
    public final Context f30007b;
    public final zv0 f30008c;

    public a6(zv0 zv0Var, org.telegram.ui.ActionBar.e2 e2Var, Context context) {
        this.f30008c = zv0Var;
        this.f30006a = e2Var;
        this.f30007b = context;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void q() {
        boolean z10;
        org.telegram.ui.ActionBar.e2 e2Var = this.f30006a;
        fi.s6 P1 = e2Var.getMessagesController().P1();
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
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer);
            if (!z10 || P1.E(0, o4) != 0) {
                arrayList2.add(Long.valueOf(o4));
            }
        }
        e2Var.getOrCreateStoryViewer().M(this.f30007b, null, arrayList2, 0, null, null, new fi.b7(this.f30008c), false);
    }

    @Override
    public final void u(t2 t2Var) {
        org.telegram.ui.ActionBar.e2 e2Var = this.f30006a;
        if (e2Var.getMessagesController().P1().K(t2Var.getDialogId())) {
            e2Var.getOrCreateStoryViewer().getClass();
            e2Var.getOrCreateStoryViewer().J(e2Var.getContext(), t2Var.getDialogId(), new fi.b7(this.f30008c));
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
