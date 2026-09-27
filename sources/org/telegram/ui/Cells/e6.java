package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.j01;
public final class e6 implements o2 {
    public final org.telegram.ui.ActionBar.o2 f20245a;
    public final Context f20246b;
    public final j01 f20247c;

    public e6(j01 j01Var, org.telegram.ui.ActionBar.o2 o2Var, Context context) {
        this.f20247c = j01Var;
        this.f20245a = o2Var;
        this.f20246b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        boolean z10;
        org.telegram.ui.ActionBar.o2 o2Var = this.f20245a;
        ai.l9 storiesController = o2Var.getMessagesController().getStoriesController();
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
        o2Var.getOrCreateStoryViewer().G(this.f20246b, null, arrayList2, 0, null, null, new ai.u9(this.f20247c), false);
    }

    @Override
    public final void e(s2 s2Var) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f20245a;
        if (o2Var.getMessagesController().getStoriesController().I(s2Var.getDialogId())) {
            o2Var.getOrCreateStoryViewer().getClass();
            o2Var.getOrCreateStoryViewer().D(o2Var.getContext(), s2Var.getDialogId(), new ai.u9(this.f20247c));
        }
    }

    @Override
    public final void a(s2 s2Var) {
    }

    @Override
    public final void d(s2 s2Var) {
    }

    @Override
    public final void f(s2 s2Var) {
    }
}
