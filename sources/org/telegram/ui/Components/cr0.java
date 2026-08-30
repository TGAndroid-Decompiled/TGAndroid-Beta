package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class cr0 implements org.telegram.ui.ActionBar.c2, MessagesStorage.StringCallback {
    public final yu0 f24042a;
    public final TL_stories.StoryItem f24043b;

    public cr0(yu0 yu0Var, TL_stories.StoryItem storyItem) {
        this.f24042a = yu0Var;
        this.f24043b = storyItem;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f24043b);
        yu0 yu0Var = this.f24042a;
        org.telegram.ui.ActionBar.p2 p2Var = yu0Var.f31144s1;
        p2Var.getMessagesController().getStoriesController().s(yu0Var.f31119g1, arrayList);
        qc.a0(p2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        yu0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f31119g1, str, new vk(9, this.f24042a, this.f24043b));
    }
}
