package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class nr0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.StringCallback {
    public final lv0 f26885a;
    public final TL_stories.StoryItem f26886b;

    public nr0(lv0 lv0Var, TL_stories.StoryItem storyItem) {
        this.f26885a = lv0Var;
        this.f26886b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f26886b);
        lv0 lv0Var = this.f26885a;
        org.telegram.ui.ActionBar.o2 o2Var = lv0Var.f26212v1;
        o2Var.getMessagesController().getStoriesController().s(lv0Var.f26187j1, arrayList);
        xc.a0(o2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        lv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f26187j1, str, new org.telegram.ui.qc(29, this.f26885a, this.f26886b));
    }
}
