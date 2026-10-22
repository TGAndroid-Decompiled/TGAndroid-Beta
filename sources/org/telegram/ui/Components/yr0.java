package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stories;
public final class yr0 implements org.telegram.ui.ActionBar.a2, MessagesStorage.StringCallback {
    public final uv0 f32726a;
    public final TL_stories.StoryItem f32727b;

    public yr0(uv0 uv0Var, TL_stories.StoryItem storyItem) {
        this.f32726a = uv0Var;
        this.f32727b = storyItem;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f32727b);
        uv0 uv0Var = this.f32726a;
        org.telegram.ui.ActionBar.n2 n2Var = uv0Var.f31074v1;
        n2Var.getMessagesController().getStoriesController().s(uv0Var.f31049j1, arrayList);
        xc.a0(n2Var).Q(R.raw.ic_delete, 36, LocaleController.formatPluralString("StoriesDeleted", 1, new Object[0])).j();
        uv0Var.L(false);
    }

    @Override
    public void run(String str) {
        r0.getStoriesController().r(r0.f31049j1, str, new qy(5, this.f32726a, this.f32727b));
    }
}
