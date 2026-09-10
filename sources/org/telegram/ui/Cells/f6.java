package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.w01;
public final class f6 implements n2 {
    public final org.telegram.ui.ActionBar.p2 f19116a;
    public final Context f19117b;
    public final w01 f19118c;

    public f6(w01 w01Var, org.telegram.ui.ActionBar.p2 p2Var, Context context) {
        this.f19118c = w01Var;
        this.f19116a = p2Var;
        this.f19117b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        boolean z10;
        org.telegram.ui.ActionBar.p2 p2Var = this.f19116a;
        zh.i5 storiesController = p2Var.getMessagesController().getStoriesController();
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
        p2Var.getOrCreateStoryViewer().F(this.f19117b, null, arrayList2, 0, null, null, new zh.s5(this.f19118c), false);
    }

    @Override
    public final void e(r2 r2Var) {
        org.telegram.ui.ActionBar.p2 p2Var = this.f19116a;
        if (p2Var.getMessagesController().getStoriesController().I(r2Var.getDialogId())) {
            p2Var.getOrCreateStoryViewer().getClass();
            p2Var.getOrCreateStoryViewer().D(p2Var.getContext(), r2Var.getDialogId(), new zh.s5(this.f19118c));
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
