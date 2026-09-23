package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class zq0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final yu0 f30642a;
    public final TL_stories.StoryItem f30643b;

    public zq0(yu0 yu0Var, TL_stories.StoryItem storyItem) {
        this.f30642a = yu0Var;
        this.f30643b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f30643b);
        yu0 yu0Var = this.f30642a;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30450v1;
        n2Var.getMessagesController().getStoriesController().s(yu0Var.f30425j1, arrayList);
        xc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        yu0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f30425j1, str, new org.telegram.ui.oc(29, this.f30642a, this.f30643b));
    }
}
