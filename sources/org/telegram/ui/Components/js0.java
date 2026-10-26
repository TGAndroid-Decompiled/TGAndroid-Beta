package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class js0 implements org.telegram.ui.ActionBar.b2, MessagesStorage.StringCallback {
    public final aw0 f29714a;
    public final TL_stories.StoryItem f29715b;

    public js0(aw0 aw0Var, TL_stories.StoryItem storyItem) {
        this.f29714a = aw0Var;
        this.f29715b = storyItem;
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f29715b);
        aw0 aw0Var = this.f29714a;
        org.telegram.ui.ActionBar.r2 r2Var = aw0Var.f26704x1;
        r2Var.getMessagesController().getStoriesController().s(aw0Var.l1, arrayList);
        wc.b0(r2Var).R(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        aw0Var.S(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.l1, str, new oy(6, this.f29714a, this.f29715b));
    }
}
