package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class as0 implements org.telegram.ui.ActionBar.z1, MessagesStorage.StringCallback {
    public final wv0 f24795a;
    public final TL_stories.StoryItem f24796b;

    public as0(wv0 wv0Var, TL_stories.StoryItem storyItem) {
        this.f24795a = wv0Var;
        this.f24796b = storyItem;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f24796b);
        wv0 wv0Var = this.f24795a;
        org.telegram.ui.ActionBar.o2 o2Var = wv0Var.f32410v1;
        o2Var.getMessagesController().getStoriesController().s(wv0Var.f32385j1, arrayList);
        vc.a0(o2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        wv0Var.M(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f32385j1, str, new oy(5, this.f24795a, this.f24796b));
    }
}
