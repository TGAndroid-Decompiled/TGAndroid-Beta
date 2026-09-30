package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class or0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final lv0 f27180a;
    public final TL_stories.StoryItem f27181b;

    public or0(lv0 lv0Var, TL_stories.StoryItem storyItem) {
        this.f27180a = lv0Var;
        this.f27181b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f27181b);
        lv0 lv0Var = this.f27180a;
        org.telegram.ui.ActionBar.m2 m2Var = lv0Var.f26154v1;
        m2Var.getMessagesController().getStoriesController().s(lv0Var.f26129j1, arrayList);
        yc.a0(m2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        lv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f26129j1, str, new org.telegram.ui.oc(29, this.f27180a, this.f27181b));
    }
}
