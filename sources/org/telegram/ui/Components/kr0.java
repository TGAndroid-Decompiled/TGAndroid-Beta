package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class kr0 implements org.telegram.ui.ActionBar.c2, MessagesStorage.StringCallback {
    public final iv0 f24800a;
    public final TL_stories.StoryItem f24801b;

    public kr0(iv0 iv0Var, TL_stories.StoryItem storyItem) {
        this.f24800a = iv0Var;
        this.f24801b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f24801b);
        iv0 iv0Var = this.f24800a;
        org.telegram.ui.ActionBar.p2 p2Var = iv0Var.f24131v1;
        p2Var.getMessagesController().getStoriesController().s(iv0Var.f24106j1, arrayList);
        wc.a0(p2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        iv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f24106j1, str, new org.telegram.ui.pf(22, this.f24800a, this.f24801b));
    }
}
