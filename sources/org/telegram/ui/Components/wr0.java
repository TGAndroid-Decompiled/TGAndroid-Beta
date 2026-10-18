package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class wr0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final sv0 f32207a;
    public final TL_stories.StoryItem f32208b;

    public wr0(sv0 sv0Var, TL_stories.StoryItem storyItem) {
        this.f32207a = sv0Var;
        this.f32208b = storyItem;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f32208b);
        sv0 sv0Var = this.f32207a;
        org.telegram.ui.ActionBar.n2 n2Var = sv0Var.f30388v1;
        n2Var.getMessagesController().getStoriesController().s(sv0Var.f30363j1, arrayList);
        xc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        sv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f30363j1, str, new qy(5, this.f32207a, this.f32208b));
    }
}
