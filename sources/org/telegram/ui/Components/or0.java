package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class or0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final lv0 f27175a;
    public final TL_stories.StoryItem f27176b;

    public or0(lv0 lv0Var, TL_stories.StoryItem storyItem) {
        this.f27175a = lv0Var;
        this.f27176b = storyItem;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f27176b);
        lv0 lv0Var = this.f27175a;
        org.telegram.ui.ActionBar.n2 n2Var = lv0Var.f26234v1;
        n2Var.getMessagesController().getStoriesController().s(lv0Var.f26209j1, arrayList);
        xc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        lv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f26209j1, str, new org.telegram.ui.of(22, this.f27175a, this.f27176b));
    }
}
