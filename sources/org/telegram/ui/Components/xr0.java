package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class xr0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final tv0 f32445a;
    public final TL_stories.StoryItem f32446b;

    public xr0(tv0 tv0Var, TL_stories.StoryItem storyItem) {
        this.f32445a = tv0Var;
        this.f32446b = storyItem;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f32446b);
        tv0 tv0Var = this.f32445a;
        org.telegram.ui.ActionBar.n2 n2Var = tv0Var.f30732v1;
        n2Var.getMessagesController().getStoriesController().s(tv0Var.f30707j1, arrayList);
        xc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        tv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f30707j1, str, new qy(5, this.f32445a, this.f32446b));
    }
}
