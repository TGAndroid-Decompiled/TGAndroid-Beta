package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.v01;
public final class e6 implements o2 {
    public final org.telegram.ui.ActionBar.m2 f20828a;
    public final Context f20829b;
    public final v01 f20830c;

    public e6(v01 v01Var, org.telegram.ui.ActionBar.m2 m2Var, Context context) {
        this.f20830c = v01Var;
        this.f20828a = m2Var;
        this.f20829b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        boolean z10;
        org.telegram.ui.ActionBar.m2 m2Var = this.f20828a;
        bi.x8 storiesController = m2Var.getMessagesController().getStoriesController();
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
        m2Var.getOrCreateStoryViewer().G(this.f20829b, null, arrayList2, 0, null, null, new bi.g9(this.f20830c), false);
    }

    @Override
    public final void f(s2 s2Var) {
        org.telegram.ui.ActionBar.m2 m2Var = this.f20828a;
        if (m2Var.getMessagesController().getStoriesController().I(s2Var.getDialogId())) {
            m2Var.getOrCreateStoryViewer().getClass();
            m2Var.getOrCreateStoryViewer().D(m2Var.getContext(), s2Var.getDialogId(), new bi.g9(this.f20830c));
        }
    }

    @Override
    public final void a(s2 s2Var) {
    }

    @Override
    public final void e(s2 s2Var) {
    }

    @Override
    public final void g(s2 s2Var) {
    }
}
