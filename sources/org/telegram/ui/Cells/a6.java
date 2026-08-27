package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.mz0;

public final class a6 implements l2 {

    public final org.telegram.ui.ActionBar.n2 f24063a;

    public final Context f24064b;

    public final mz0 f24065c;

    public a6(mz0 mz0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context) {
        this.f24065c = mz0Var;
        this.f24063a = n2Var;
        this.f24064b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        org.telegram.ui.ActionBar.n2 n2Var = this.f24063a;
        jh.s6 storiesController = n2Var.getMessagesController().getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        boolean z10 = storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0;
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        n2Var.getOrCreateStoryViewer().F(this.f24064b, null, arrayList2, 0, null, null, new jh.b7(this.f24065c), false);
    }

    @Override
    public final void e(p2 p2Var) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f24063a;
        if (n2Var.getMessagesController().getStoriesController().I(p2Var.getDialogId())) {
            n2Var.getOrCreateStoryViewer().getClass();
            n2Var.getOrCreateStoryViewer().D(n2Var.getContext(), p2Var.getDialogId(), new jh.b7(this.f24065c));
        }
    }

    @Override
    public final void a(p2 p2Var) {
    }

    @Override
    public final void d(p2 p2Var) {
    }

    @Override
    public final void f(p2 p2Var) {
    }
}
