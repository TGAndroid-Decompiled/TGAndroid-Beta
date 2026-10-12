package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class ls0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final hw0 f28270a;
    public final TL_stories.StoryItem f28271b;

    public ls0(hw0 hw0Var, TL_stories.StoryItem storyItem) {
        this.f28270a = hw0Var;
        this.f28271b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f28271b);
        hw0 hw0Var = this.f28270a;
        org.telegram.ui.ActionBar.m2 m2Var = hw0Var.f26957v1;
        m2Var.getMessagesController().getStoriesController().s(hw0Var.f26932j1, arrayList);
        zc.a0(m2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        hw0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f26932j1, str, new org.telegram.ui.tc(29, this.f28270a, this.f28271b));
    }
}
