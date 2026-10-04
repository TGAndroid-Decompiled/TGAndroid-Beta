package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class rr0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final pv0 f30494a;
    public final TL_stories.StoryItem f30495b;

    public rr0(pv0 pv0Var, TL_stories.StoryItem storyItem) {
        this.f30494a = pv0Var;
        this.f30495b = storyItem;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f30495b);
        pv0 pv0Var = this.f30494a;
        org.telegram.ui.ActionBar.n2 n2Var = pv0Var.f29800v1;
        n2Var.getMessagesController().getStoriesController().s(pv0Var.f29775j1, arrayList);
        yc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        pv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f29775j1, str, new org.telegram.ui.qc(29, this.f30494a, this.f30495b));
    }
}
