package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class gs0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final cw0 f26837a;
    public final TL_stories.StoryItem f26838b;

    public gs0(cw0 cw0Var, TL_stories.StoryItem storyItem) {
        this.f26837a = cw0Var;
        this.f26838b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f26838b);
        cw0 cw0Var = this.f26837a;
        org.telegram.ui.ActionBar.n2 n2Var = cw0Var.f25474v1;
        n2Var.getMessagesController().getStoriesController().s(cw0Var.f25449j1, arrayList);
        ad.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        cw0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f25449j1, str, new org.telegram.ui.pc(29, this.f26837a, this.f26838b));
    }
}
