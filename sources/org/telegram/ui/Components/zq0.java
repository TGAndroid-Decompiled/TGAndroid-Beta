package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class zq0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final yu0 f30638a;
    public final TL_stories.StoryItem f30639b;

    public zq0(yu0 yu0Var, TL_stories.StoryItem storyItem) {
        this.f30638a = yu0Var;
        this.f30639b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f30639b);
        yu0 yu0Var = this.f30638a;
        org.telegram.ui.ActionBar.n2 n2Var = yu0Var.f30389v1;
        n2Var.getMessagesController().getStoriesController().s(yu0Var.f30364j1, arrayList);
        vc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        yu0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f30364j1, str, new org.telegram.ui.nf(22, this.f30638a, this.f30639b));
    }
}
