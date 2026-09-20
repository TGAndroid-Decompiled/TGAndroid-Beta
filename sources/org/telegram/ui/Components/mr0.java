package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class mr0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final jv0 f26487a;
    public final TL_stories.StoryItem f26488b;

    public mr0(jv0 jv0Var, TL_stories.StoryItem storyItem) {
        this.f26487a = jv0Var;
        this.f26488b = storyItem;
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f26488b);
        jv0 jv0Var = this.f26487a;
        org.telegram.ui.ActionBar.n2 n2Var = jv0Var.f25528v1;
        n2Var.getMessagesController().getStoriesController().s(jv0Var.f25503j1, arrayList);
        xc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        jv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f25503j1, str, new org.telegram.ui.of(22, this.f26487a, this.f26488b));
    }
}
