package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class uq0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.StringCallback {
    public final qu0 f33298a;
    public final TL_stories.StoryItem f33299b;

    public uq0(qu0 qu0Var, TL_stories.StoryItem storyItem) {
        this.f33298a = qu0Var;
        this.f33299b = storyItem;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f33299b);
        qu0 qu0Var = this.f33298a;
        org.telegram.ui.ActionBar.o2 o2Var = qu0Var.f32093r1;
        o2Var.getMessagesController().getStoriesController().s(qu0Var.f32069f1, arrayList);
        tc.a0(o2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        qu0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f32069f1, str, new org.telegram.ui.tm(17, this.f33298a, this.f33299b));
    }
}
