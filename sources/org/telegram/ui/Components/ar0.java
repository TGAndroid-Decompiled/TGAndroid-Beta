package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class ar0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.StringCallback {
    public final zu0 f22470a;
    public final TL_stories.StoryItem f22471b;

    public ar0(zu0 zu0Var, TL_stories.StoryItem storyItem) {
        this.f22470a = zu0Var;
        this.f22471b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f22471b);
        zu0 zu0Var = this.f22470a;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30659v1;
        o2Var.getMessagesController().getStoriesController().s(zu0Var.f30634j1, arrayList);
        vc.a0(o2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        zu0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f30634j1, str, new org.telegram.ui.pf(22, this.f22470a, this.f22471b));
    }
}
