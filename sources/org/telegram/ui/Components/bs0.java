package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class bs0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final xv0 f23849a;
    public final TL_stories.StoryItem f23850b;

    public bs0(xv0 xv0Var, TL_stories.StoryItem storyItem) {
        this.f23849a = xv0Var;
        this.f23850b = storyItem;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f23850b);
        xv0 xv0Var = this.f23849a;
        org.telegram.ui.ActionBar.m2 m2Var = xv0Var.f31388v1;
        m2Var.getMessagesController().getStoriesController().s(xv0Var.f31363j1, arrayList);
        zc.a0(m2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        xv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f31363j1, str, new org.telegram.ui.vc(29, this.f23849a, this.f23850b));
    }
}
