package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class pr0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final mv0 f27467a;
    public final TL_stories.StoryItem f27468b;

    public pr0(mv0 mv0Var, TL_stories.StoryItem storyItem) {
        this.f27467a = mv0Var;
        this.f27468b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f27468b);
        mv0 mv0Var = this.f27467a;
        org.telegram.ui.ActionBar.m2 m2Var = mv0Var.f26449v1;
        m2Var.getMessagesController().getStoriesController().s(mv0Var.f26424j1, arrayList);
        yc.a0(m2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        mv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f26424j1, str, new org.telegram.ui.oc(29, this.f27467a, this.f27468b));
    }
}
