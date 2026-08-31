package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class dr0 implements org.telegram.ui.ActionBar.c2, MessagesStorage.StringCallback {
    public final zu0 f26313a;
    public final TL_stories.StoryItem f26314b;

    public dr0(zu0 zu0Var, TL_stories.StoryItem storyItem) {
        this.f26313a = zu0Var;
        this.f26314b = storyItem;
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f26314b);
        zu0 zu0Var = this.f26313a;
        org.telegram.ui.ActionBar.p2 p2Var = zu0Var.f34004s1;
        p2Var.getMessagesController().getStoriesController().s(zu0Var.f33979g1, arrayList);
        qc.a0(p2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        zu0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f33979g1, str, new xk(9, this.f26313a, this.f26314b));
    }
}
