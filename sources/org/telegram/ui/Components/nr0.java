package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class nr0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final kv0 f26868a;
    public final TL_stories.StoryItem f26869b;

    public nr0(kv0 kv0Var, TL_stories.StoryItem storyItem) {
        this.f26868a = kv0Var;
        this.f26869b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f26869b);
        kv0 kv0Var = this.f26868a;
        org.telegram.ui.ActionBar.m2 m2Var = kv0Var.f25866v1;
        m2Var.getMessagesController().getStoriesController().s(kv0Var.f25841j1, arrayList);
        xc.a0(m2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        kv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f25841j1, str, new org.telegram.ui.oc(29, this.f26868a, this.f26869b));
    }
}
