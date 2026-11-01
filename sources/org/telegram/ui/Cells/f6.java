package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.mx0;
public final class f6 implements r2 {
    public final org.telegram.ui.ActionBar.k2 f21898a;
    public final Context f21899b;
    public final mx0 f21900c;

    public f6(mx0 mx0Var, org.telegram.ui.ActionBar.k2 k2Var, Context context) {
        this.f21900c = mx0Var;
        this.f21898a = k2Var;
        this.f21899b = context;
    }

    @Override
    public final boolean m() {
        return true;
    }

    @Override
    public final void q() {
        boolean z10;
        org.telegram.ui.ActionBar.k2 k2Var = this.f21898a;
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
        k2Var.getOrCreateStoryViewer().T(this.f21899b, null, arrayList2, 0, null, null, new th.n5(this.f21900c), false);
    }

    @Override
    public final void u(v2 v2Var) {
        org.telegram.ui.ActionBar.k2 k2Var = this.f21898a;
        if (k2Var.getMessagesController().O1().K(v2Var.getDialogId())) {
            k2Var.getOrCreateStoryViewer().getClass();
            k2Var.getOrCreateStoryViewer().R(k2Var.getContext(), v2Var.getDialogId(), new th.n5(this.f21900c));
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
