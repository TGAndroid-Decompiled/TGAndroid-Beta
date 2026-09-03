package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.e01;
public final class d6 implements n2 {
    public final org.telegram.ui.ActionBar.p2 f22679a;
    public final Context f22680b;
    public final e01 f22681c;

    public d6(e01 e01Var, org.telegram.ui.ActionBar.p2 p2Var, Context context) {
        this.f22681c = e01Var;
        this.f22679a = p2Var;
        this.f22680b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        boolean z4;
        org.telegram.ui.ActionBar.p2 p2Var = this.f22679a;
        oh.t6 storiesController = p2Var.getMessagesController().getStoriesController();
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
        p2Var.getOrCreateStoryViewer().F(this.f22680b, null, arrayList2, 0, null, null, new oh.c7(this.f22681c), false);
    }

    @Override
    public final void e(r2 r2Var) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f22679a;
        if (p2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            p2Var.getOrCreateStoryViewer().getClass();
            p2Var.getOrCreateStoryViewer().D(p2Var.getContext(), r2Var.getDialogId(), new oh.c7(this.f22681c));
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
