package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.dw0;
public final class b6 implements p2 {
    public final org.telegram.ui.ActionBar.f2 f28951a;
    public final Context f28952b;
    public final dw0 f28953c;

    public b6(dw0 dw0Var, org.telegram.ui.ActionBar.f2 f2Var, Context context) {
        this.f28953c = dw0Var;
        this.f28951a = f2Var;
        this.f28952b = context;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void q() {
        boolean z9;
        org.telegram.ui.ActionBar.f2 f2Var = this.f28951a;
        di.z6 P1 = f2Var.getMessagesController().P1();
        ArrayList arrayList = P1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (P1.E(0, org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long o4 = org.telegram.messenger.m5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer);
            if (!z9 || P1.E(0, o4) != 0) {
                arrayList2.add(Long.valueOf(o4));
            }
        }
        f2Var.getOrCreateStoryViewer().M(this.f28952b, null, arrayList2, 0, null, null, new di.i7(this.f28953c), false);
    }

    @Override
    public final void u(t2 t2Var) {
        org.telegram.ui.ActionBar.f2 f2Var = this.f28951a;
        if (f2Var.getMessagesController().P1().K(t2Var.getDialogId())) {
            f2Var.getOrCreateStoryViewer().getClass();
            f2Var.getOrCreateStoryViewer().J(f2Var.getContext(), t2Var.getDialogId(), new di.i7(this.f28953c));
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
