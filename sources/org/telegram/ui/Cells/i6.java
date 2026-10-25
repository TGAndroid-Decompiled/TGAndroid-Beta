package org.telegram.ui.Cells;

import android.content.Context;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.a01;
public final class i6 implements l2 {
    public final org.telegram.ui.ActionBar.r2 f24238a;
    public final Context f24239b;
    public final a01 f24240c;

    public i6(a01 a01Var, org.telegram.ui.ActionBar.r2 r2Var, Context context) {
        this.f24240c = a01Var;
        this.f24238a = r2Var;
        this.f24239b = context;
    }

    @Override
    public final boolean b() {
        return true;
    }

    @Override
    public final void c() {
        boolean z10;
        org.telegram.ui.ActionBar.r2 r2Var = this.f24238a;
        di.h7 storiesController = r2Var.getMessagesController().getStoriesController();
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
        r2Var.getOrCreateStoryViewer().G(this.f24239b, null, arrayList2, 0, null, null, new di.q7(this.f24240c), false);
    }

    @Override
    public final void e(p2 p2Var) {
        org.telegram.ui.ActionBar.r2 r2Var = this.f24238a;
        if (r2Var.getMessagesController().getStoriesController().I(p2Var.getDialogId())) {
            r2Var.getOrCreateStoryViewer().getClass();
            r2Var.getOrCreateStoryViewer().D(r2Var.getContext(), p2Var.getDialogId(), new di.q7(this.f24240c));
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
