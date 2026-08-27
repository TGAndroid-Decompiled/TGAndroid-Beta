package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;

public final class kq0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {

    public final hu0 f30168a;

    public final TL_stories.StoryItem f30169b;

    public kq0(hu0 hu0Var, TL_stories.StoryItem storyItem) {
        this.f30168a = hu0Var;
        this.f30169b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f30169b);
        hu0 hu0Var = this.f30168a;
        org.telegram.ui.ActionBar.n2 n2Var = hu0Var.f29145r1;
        n2Var.getMessagesController().getStoriesController().s(hu0Var.f29121f1, arrayList);
        mc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        hu0Var.L(false);
    }

    @Override
    public void run(String str) {
        hu0 hu0Var = this.f30168a;
        hu0Var.getStoriesController().r(hu0Var.f29121f1, str, new org.telegram.ui.df(24, hu0Var, this.f30169b));
    }
}
