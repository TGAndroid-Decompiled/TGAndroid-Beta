package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class fs0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final bw0 f26478a;
    public final TL_stories.StoryItem f26479b;

    public fs0(bw0 bw0Var, TL_stories.StoryItem storyItem) {
        this.f26478a = bw0Var;
        this.f26479b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f26479b);
        bw0 bw0Var = this.f26478a;
        org.telegram.ui.ActionBar.n2 n2Var = bw0Var.f25166v1;
        n2Var.getMessagesController().getStoriesController().s(bw0Var.f25141j1, arrayList);
        ad.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        bw0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f25141j1, str, new org.telegram.ui.pc(29, this.f26478a, this.f26479b));
    }
}
