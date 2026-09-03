package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.e01;
public final class c6 implements m2 {
    public final org.telegram.ui.ActionBar.p2 f20877a;
    public final Context f20878b;
    public final e01 f20879c;

    public c6(e01 e01Var, org.telegram.ui.ActionBar.p2 p2Var, Context context) {
        this.f20879c = e01Var;
        this.f20877a = p2Var;
        this.f20878b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        boolean z4;
        org.telegram.ui.ActionBar.p2 p2Var = this.f20877a;
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
        p2Var.getOrCreateStoryViewer().F(this.f20878b, null, arrayList2, 0, null, null, new nh.c7(this.f20879c), false);
    }

    @Override
    public final void e(q2 q2Var) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f20877a;
        if (p2Var.getMessagesController().getStoriesController().I(q2Var.getDialogId())) {
            p2Var.getOrCreateStoryViewer().getClass();
            p2Var.getOrCreateStoryViewer().D(p2Var.getContext(), q2Var.getDialogId(), new nh.c7(this.f20879c));
        }
    }

    @Override
    public final void a(q2 q2Var) {
    }

    @Override
    public final void d(q2 q2Var) {
    }

    @Override
    public final void f(q2 q2Var) {
    }
}
