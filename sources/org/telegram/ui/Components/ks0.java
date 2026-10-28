package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class ks0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.StringCallback {
    public final bw0 f30021a;
    public final TL_stories.StoryItem f30022b;

    public ks0(bw0 bw0Var, TL_stories.StoryItem storyItem) {
        this.f30021a = bw0Var;
        this.f30022b = storyItem;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f30022b);
        bw0 bw0Var = this.f30021a;
        org.telegram.ui.ActionBar.r2 r2Var = bw0Var.f26992x1;
        r2Var.getMessagesController().getStoriesController().s(bw0Var.l1, arrayList);
        wc.b0(r2Var).R(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        bw0Var.S(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.l1, str, new oy(6, this.f30021a, this.f30022b));
    }
}
