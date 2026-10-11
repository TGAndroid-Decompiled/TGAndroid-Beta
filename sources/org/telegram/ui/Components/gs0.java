package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class gs0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final cw0 f26866a;
    public final TL_stories.StoryItem f26867b;

    public gs0(cw0 cw0Var, TL_stories.StoryItem storyItem) {
        this.f26866a = cw0Var;
        this.f26867b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f26867b);
        cw0 cw0Var = this.f26866a;
        org.telegram.ui.ActionBar.m2 m2Var = cw0Var.f25536v1;
        m2Var.getMessagesController().getStoriesController().s(cw0Var.f25511j1, arrayList);
        ad.a0(m2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        cw0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f25511j1, str, new org.telegram.ui.oc(29, this.f26866a, this.f26867b));
    }
}
