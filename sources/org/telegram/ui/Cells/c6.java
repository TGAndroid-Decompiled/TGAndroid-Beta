package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.bw0;
public final class c6 implements q2 {
    public final org.telegram.ui.ActionBar.h2 f30478a;
    public final Context f30479b;
    public final bw0 f30480c;

    public c6(bw0 bw0Var, org.telegram.ui.ActionBar.h2 h2Var, Context context) {
        this.f30480c = bw0Var;
        this.f30478a = h2Var;
        this.f30479b = context;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void q() {
        boolean z10;
        org.telegram.ui.ActionBar.h2 h2Var = this.f30478a;
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
        h2Var.getOrCreateStoryViewer().M(this.f30479b, null, arrayList2, 0, null, null, new fi.y6(this.f30480c), false);
    }

    @Override
    public final void u(u2 u2Var) {
        org.telegram.ui.ActionBar.h2 h2Var = this.f30478a;
        if (h2Var.getMessagesController().R1().K(u2Var.getDialogId())) {
            h2Var.getOrCreateStoryViewer().getClass();
            h2Var.getOrCreateStoryViewer().J(h2Var.getContext(), u2Var.getDialogId(), new fi.y6(this.f30480c));
        }
    }

    @Override
    public final void l(u2 u2Var) {
    }

    @Override
    public final void r(u2 u2Var) {
    }

    @Override
    public final void w(u2 u2Var) {
    }
}
