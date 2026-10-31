package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.nx0;
public final class f6 implements r2 {
    public final org.telegram.ui.ActionBar.k2 f21897a;
    public final Context f21898b;
    public final nx0 f21899c;

    public f6(nx0 nx0Var, org.telegram.ui.ActionBar.k2 k2Var, Context context) {
        this.f21899c = nx0Var;
        this.f21897a = k2Var;
        this.f21898b = context;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void q() {
        boolean z10;
        org.telegram.ui.ActionBar.k2 k2Var = this.f21897a;
        th.e5 O1 = k2Var.getMessagesController().O1();
        ArrayList arrayList = O1.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (O1.E(0, org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long o10 = org.telegram.messenger.o5.o(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || O1.E(0, o10) != 0) {
                arrayList2.add(Long.valueOf(o10));
            }
        }
        k2Var.getOrCreateStoryViewer().T(this.f21898b, null, arrayList2, 0, null, null, new th.n5(this.f21899c), false);
    }

    @Override
    public final void u(v2 v2Var) {
        org.telegram.ui.ActionBar.k2 k2Var = this.f21897a;
        if (k2Var.getMessagesController().O1().K(v2Var.getDialogId())) {
            k2Var.getOrCreateStoryViewer().getClass();
            k2Var.getOrCreateStoryViewer().R(k2Var.getContext(), v2Var.getDialogId(), new th.n5(this.f21899c));
        }
    }

    @Override
    public final void l(v2 v2Var) {
    }

    @Override
    public final void r(v2 v2Var) {
    }

    @Override
    public final void x(v2 v2Var) {
    }
}
