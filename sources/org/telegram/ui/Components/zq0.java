package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class zq0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final yu0 f30641a;
    public final TL_stories.StoryItem f30642b;

    public zq0(yu0 yu0Var, TL_stories.StoryItem storyItem) {
        this.f30641a = yu0Var;
        this.f30642b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f30642b);
        yu0 yu0Var = this.f30641a;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30392v1;
        n2Var.getMessagesController().getStoriesController().s(yu0Var.f30367j1, arrayList);
        vc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        yu0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f30367j1, str, new org.telegram.ui.nf(22, this.f30641a, this.f30642b));
    }
}
