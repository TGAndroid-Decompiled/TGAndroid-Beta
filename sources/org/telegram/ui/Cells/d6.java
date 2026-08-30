package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.xz0;
public final class d6 implements n2 {
    public final org.telegram.ui.ActionBar.p2 f20942a;
    public final Context f20943b;
    public final xz0 f20944c;

    public d6(xz0 xz0Var, org.telegram.ui.ActionBar.p2 p2Var, Context context) {
        this.f20944c = xz0Var;
        this.f20942a = p2Var;
        this.f20943b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        boolean z4;
        org.telegram.ui.ActionBar.p2 p2Var = this.f20942a;
        nh.t6 storiesController = p2Var.getMessagesController().getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (storiesController.D(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z4 = true;
        } else {
            z4 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z4 || storiesController.D(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        p2Var.getOrCreateStoryViewer().F(this.f20943b, null, arrayList2, 0, null, null, new nh.c7(this.f20944c), false);
    }

    @Override
    public final void e(r2 r2Var) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f20942a;
        if (p2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            p2Var.getOrCreateStoryViewer().getClass();
            p2Var.getOrCreateStoryViewer().D(p2Var.getContext(), r2Var.getDialogId(), new nh.c7(this.f20944c));
        }
    }

    @Override
    public final void a(r2 r2Var) {
    }

    @Override
    public final void d(r2 r2Var) {
    }

    @Override
    public final void f(r2 r2Var) {
    }
}
