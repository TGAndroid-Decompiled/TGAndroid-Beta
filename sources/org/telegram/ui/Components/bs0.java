package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class bs0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final xv0 f25142a;
    public final TL_stories.StoryItem f25143b;

    public bs0(xv0 xv0Var, TL_stories.StoryItem storyItem) {
        this.f25142a = xv0Var;
        this.f25143b = storyItem;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f25143b);
        xv0 xv0Var = this.f25142a;
        org.telegram.ui.ActionBar.o2 o2Var = xv0Var.f32711v1;
        o2Var.getMessagesController().getStoriesController().s(xv0Var.f32686j1, arrayList);
        xc.a0(o2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        xv0Var.M(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f32686j1, str, new qy(5, this.f25142a, this.f25143b));
    }
}
