package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.s01;
public final class d6 implements n2 {
    public final org.telegram.ui.ActionBar.o2 f19936a;
    public final Context f19937b;
    public final s01 f19938c;

    public d6(s01 s01Var, org.telegram.ui.ActionBar.o2 o2Var, Context context) {
        this.f19938c = s01Var;
        this.f19936a = o2Var;
        this.f19937b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        boolean z10;
        org.telegram.ui.ActionBar.o2 o2Var = this.f19936a;
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
        o2Var.getOrCreateStoryViewer().G(this.f19937b, null, arrayList2, 0, null, null, new ai.u9(this.f19938c), false);
    }

    @Override
    public final void e(r2 r2Var) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f19936a;
        if (o2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            o2Var.getOrCreateStoryViewer().getClass();
            o2Var.getOrCreateStoryViewer().D(o2Var.getContext(), r2Var.getDialogId(), new ai.u9(this.f19938c));
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
