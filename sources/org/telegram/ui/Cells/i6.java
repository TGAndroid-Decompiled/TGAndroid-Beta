package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.c01;
public final class i6 implements l2 {
    public final org.telegram.ui.ActionBar.r2 f24242a;
    public final Context f24243b;
    public final c01 f24244c;

    public i6(c01 c01Var, org.telegram.ui.ActionBar.r2 r2Var, Context context) {
        this.f24244c = c01Var;
        this.f24242a = r2Var;
        this.f24243b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        boolean z10;
        org.telegram.ui.ActionBar.r2 r2Var = this.f24242a;
        di.h7 storiesController = r2Var.getMessagesController().getStoriesController();
        ArrayList arrayList = storiesController.h;
        if (arrayList.isEmpty()) {
            return;
        }
        if (storiesController.E(0, DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(0)).peer)) != 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            long peerDialogId = DialogObject.getPeerDialogId(((TL_stories.PeerStories) arrayList.get(i10)).peer);
            if (!z10 || storiesController.E(0, peerDialogId) != 0) {
                arrayList2.add(Long.valueOf(peerDialogId));
            }
        }
        r2Var.getOrCreateStoryViewer().H(this.f24243b, null, arrayList2, 0, null, null, new di.q7(this.f24244c), false);
    }

    @Override
    public final void e(p2 p2Var) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f24242a;
        if (r2Var.getMessagesController().getStoriesController().K(p2Var.getDialogId())) {
            r2Var.getOrCreateStoryViewer().getClass();
            r2Var.getOrCreateStoryViewer().E(r2Var.getContext(), p2Var.getDialogId(), new di.q7(this.f24244c));
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
