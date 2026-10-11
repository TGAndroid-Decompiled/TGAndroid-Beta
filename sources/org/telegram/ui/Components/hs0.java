package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class hs0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final dw0 f27069a;
    public final TL_stories.StoryItem f27070b;

    public hs0(dw0 dw0Var, TL_stories.StoryItem storyItem) {
        this.f27069a = dw0Var;
        this.f27070b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f27070b);
        dw0 dw0Var = this.f27069a;
        org.telegram.ui.ActionBar.m2 m2Var = dw0Var.f25735v1;
        m2Var.getMessagesController().getStoriesController().s(dw0Var.f25710j1, arrayList);
        ad.a0(m2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        dw0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f25710j1, str, new org.telegram.ui.oc(29, this.f27069a, this.f27070b));
    }
}
