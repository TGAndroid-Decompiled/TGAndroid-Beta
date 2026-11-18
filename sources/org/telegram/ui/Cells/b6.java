package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.bw0;
public final class b6 implements p2 {
    public final org.telegram.ui.ActionBar.h2 f30432a;
    public final Context f30433b;
    public final bw0 f30434c;

    public b6(bw0 bw0Var, org.telegram.ui.ActionBar.h2 h2Var, Context context) {
        this.f30434c = bw0Var;
        this.f30432a = h2Var;
        this.f30433b = context;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void q() {
        boolean z10;
        org.telegram.ui.ActionBar.h2 h2Var = this.f30432a;
        fi.p6 R1 = h2Var.getMessagesController().R1();
        ArrayList arrayList = R1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (R1.E(0, org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i7 = 0; i7 < arrayList.size(); i7++) {
            long o4 = org.telegram.messenger.n5.o(((TL_stories.PeerStories) arrayList.get(i7)).peer);
            if (!z10 || R1.E(0, o4) != 0) {
                arrayList2.add(Long.valueOf(o4));
            }
        }
        h2Var.getOrCreateStoryViewer().M(this.f30433b, null, arrayList2, 0, null, null, new fi.y6(this.f30434c), false);
    }

    @Override
    public final void u(t2 t2Var) {
        org.telegram.ui.ActionBar.h2 h2Var = this.f30432a;
        if (h2Var.getMessagesController().R1().K(t2Var.getDialogId())) {
            h2Var.getOrCreateStoryViewer().getClass();
            h2Var.getOrCreateStoryViewer().J(h2Var.getContext(), t2Var.getDialogId(), new fi.y6(this.f30434c));
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
