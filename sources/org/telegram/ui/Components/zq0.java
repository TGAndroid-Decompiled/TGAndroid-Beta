package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class zq0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final xu0 f33212a;
    public final TL_stories.StoryItem f33213b;

    public zq0(xu0 xu0Var, TL_stories.StoryItem storyItem) {
        this.f33212a = xu0Var;
        this.f33213b = storyItem;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f33213b);
        xu0 xu0Var = this.f33212a;
        org.telegram.ui.ActionBar.n2 n2Var = xu0Var.f32727v1;
        n2Var.getMessagesController().getStoriesController().s(xu0Var.f32702j1, arrayList);
        yc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        xu0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f32702j1, str, new org.telegram.ui.nf(22, this.f33212a, this.f33213b));
    }
}
