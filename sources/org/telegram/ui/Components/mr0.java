package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class mr0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final jv0 f26565a;
    public final TL_stories.StoryItem f26566b;

    public mr0(jv0 jv0Var, TL_stories.StoryItem storyItem) {
        this.f26565a = jv0Var;
        this.f26566b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f26566b);
        jv0 jv0Var = this.f26565a;
        org.telegram.ui.ActionBar.m2 m2Var = jv0Var.f25543v1;
        m2Var.getMessagesController().getStoriesController().s(jv0Var.f25518j1, arrayList);
        yc.a0(m2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        jv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f25518j1, str, new org.telegram.ui.oc(29, this.f26565a, this.f26566b));
    }
}
