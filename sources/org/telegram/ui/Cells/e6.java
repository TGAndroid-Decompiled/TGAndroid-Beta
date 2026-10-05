package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.j01;
public final class e6 implements o2 {
    public final org.telegram.ui.ActionBar.n2 f22043a;
    public final Context f22044b;
    public final j01 f22045c;

    public e6(j01 j01Var, org.telegram.ui.ActionBar.n2 n2Var, Context context) {
        this.f22045c = j01Var;
        this.f22043a = n2Var;
        this.f22044b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        boolean z10;
        org.telegram.ui.ActionBar.n2 n2Var = this.f22043a;
        ai.l9 storiesController = n2Var.getMessagesController().getStoriesController();
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
        n2Var.getOrCreateStoryViewer().G(this.f22044b, null, arrayList2, 0, null, null, new ai.u9(this.f22045c), false);
    }

    @Override
    public final void e(s2 s2Var) {
        org.telegram.ui.ActionBar.n2 n2Var = this.f22043a;
        if (n2Var.getMessagesController().getStoriesController().I(s2Var.getDialogId())) {
            n2Var.getOrCreateStoryViewer().getClass();
            n2Var.getOrCreateStoryViewer().D(n2Var.getContext(), s2Var.getDialogId(), new ai.u9(this.f22045c));
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
