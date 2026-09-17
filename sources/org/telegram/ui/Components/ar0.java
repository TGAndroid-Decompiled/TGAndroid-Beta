package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class ar0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.StringCallback {
    public final zu0 f22467a;
    public final TL_stories.StoryItem f22468b;

    public ar0(zu0 zu0Var, TL_stories.StoryItem storyItem) {
        this.f22467a = zu0Var;
        this.f22468b = storyItem;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f22468b);
        zu0 zu0Var = this.f22467a;
        org.telegram.ui.ActionBar.o2 o2Var = zu0Var.f30656v1;
        o2Var.getMessagesController().getStoriesController().s(zu0Var.f30631j1, arrayList);
        vc.a0(o2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        zu0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f30631j1, str, new org.telegram.ui.pf(22, this.f22467a, this.f22468b));
    }
}
