package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.mz0;
public final class b6 implements l2 {
    public final org.telegram.ui.ActionBar.o2 f24118a;
    public final Context f24119b;
    public final mz0 f24120c;

    public b6(mz0 mz0Var, org.telegram.ui.ActionBar.o2 o2Var, Context context) {
        this.f24120c = mz0Var;
        this.f24118a = o2Var;
        this.f24119b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        boolean z10;
        org.telegram.ui.ActionBar.o2 o2Var = this.f24118a;
        lh.s6 storiesController = o2Var.getMessagesController().getStoriesController();
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
        o2Var.getOrCreateStoryViewer().F(this.f24119b, null, arrayList2, 0, null, null, new lh.b7(this.f24120c), false);
    }

    @Override
    public final void e(p2 p2Var) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f24118a;
        if (o2Var.getMessagesController().getStoriesController().I(p2Var.getDialogId())) {
            o2Var.getOrCreateStoryViewer().getClass();
            o2Var.getOrCreateStoryViewer().D(o2Var.getContext(), p2Var.getDialogId(), new lh.b7(this.f24120c));
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
