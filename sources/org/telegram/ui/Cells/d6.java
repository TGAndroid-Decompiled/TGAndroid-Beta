package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.sz0;
public final class d6 implements n2 {
    public final org.telegram.ui.ActionBar.n2 f22139a;
    public final Context f22140b;
    public final sz0 f22141c;

    public d6(sz0 sz0Var, org.telegram.ui.ActionBar.n2 n2Var, Context context) {
        this.f22141c = sz0Var;
        this.f22139a = n2Var;
        this.f22140b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        boolean z10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f22139a;
        ci.i7 storiesController = n2Var.getMessagesController().getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        n2Var.getOrCreateStoryViewer().G(this.f22140b, null, arrayList2, 0, null, null, new ci.r7(this.f22141c), false);
    }

    @Override
    public final void f(r2 r2Var) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f22139a;
        if (n2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            n2Var.getOrCreateStoryViewer().getClass();
            n2Var.getOrCreateStoryViewer().D(n2Var.getContext(), r2Var.getDialogId(), new ci.r7(this.f22141c));
        }
    }

    @Override
    public final void a(r2 r2Var) {
    }

    @Override
    public final void e(r2 r2Var) {
    }

    @Override
    public final void g(r2 r2Var) {
    }
}
