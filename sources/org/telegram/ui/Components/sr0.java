package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class sr0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final qv0 f30937a;
    public final TL_stories.StoryItem f30938b;

    public sr0(qv0 qv0Var, TL_stories.StoryItem storyItem) {
        this.f30937a = qv0Var;
        this.f30938b = storyItem;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f30938b);
        qv0 qv0Var = this.f30937a;
        org.telegram.ui.ActionBar.n2 n2Var = qv0Var.f30263v1;
        n2Var.getMessagesController().getStoriesController().s(qv0Var.f30238j1, arrayList);
        yc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        qv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f30238j1, str, new org.telegram.ui.qc(29, this.f30937a, this.f30938b));
    }
}
