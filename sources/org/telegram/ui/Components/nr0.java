package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class nr0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final kv0 f26755a;
    public final TL_stories.StoryItem f26756b;

    public nr0(kv0 kv0Var, TL_stories.StoryItem storyItem) {
        this.f26755a = kv0Var;
        this.f26756b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f26756b);
        kv0 kv0Var = this.f26755a;
        org.telegram.ui.ActionBar.n2 n2Var = kv0Var.f25848v1;
        n2Var.getMessagesController().getStoriesController().s(kv0Var.f25823j1, arrayList);
        xc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        kv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f25823j1, str, new org.telegram.ui.of(22, this.f26755a, this.f26756b));
    }
}
