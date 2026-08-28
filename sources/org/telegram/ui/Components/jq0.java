package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class jq0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.StringCallback {
    public final eu0 f29826a;
    public final TL_stories.StoryItem f29827b;

    public jq0(eu0 eu0Var, TL_stories.StoryItem storyItem) {
        this.f29826a = eu0Var;
        this.f29827b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f29827b);
        eu0 eu0Var = this.f29826a;
        org.telegram.ui.ActionBar.o2 o2Var = eu0Var.f28160r1;
        o2Var.getMessagesController().getStoriesController().s(eu0Var.f28136f1, arrayList);
        oc.a0(o2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        eu0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f28136f1, str, new org.telegram.ui.df(24, this.f29826a, this.f29827b));
    }
}
