package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.vz0;
public final class e6 implements m2 {
    public final org.telegram.ui.ActionBar.o2 f22326a;
    public final Context f22327b;
    public final vz0 f22328c;

    public e6(vz0 vz0Var, org.telegram.ui.ActionBar.o2 o2Var, Context context) {
        this.f22328c = vz0Var;
        this.f22326a = o2Var;
        this.f22327b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        boolean z10;
        org.telegram.ui.ActionBar.o2 o2Var = this.f22326a;
        ci.h7 storiesController = o2Var.getMessagesController().getStoriesController();
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
        o2Var.getOrCreateStoryViewer().G(this.f22327b, null, arrayList2, 0, null, null, new ci.q7(this.f22328c), false);
    }

    @Override
    public final void e(q2 q2Var) {
        org.telegram.ui.ActionBar.o2 o2Var = this.f22326a;
        if (o2Var.getMessagesController().getStoriesController().I(q2Var.getDialogId())) {
            o2Var.getOrCreateStoryViewer().getClass();
            o2Var.getOrCreateStoryViewer().D(o2Var.getContext(), q2Var.getDialogId(), new ci.q7(this.f22328c));
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
