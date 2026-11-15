package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class jp0 implements org.telegram.messenger.tr, org.telegram.ui.ActionBar.q1 {
    public final ys0 f36127a;
    public final TL_stories.StoryItem f36128b;

    public jp0(ys0 ys0Var, TL_stories.StoryItem storyItem) {
        this.f36127a = ys0Var;
        this.f36128b = storyItem;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.f42116m1, str, new gh(10, this.f36127a, this.f36128b));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f36128b);
        ys0 ys0Var = this.f36127a;
        org.telegram.ui.ActionBar.e2 e2Var = ys0Var.f42152y1;
        e2Var.getMessagesController().P1().s(arrayList, ys0Var.f42116m1);
        cc.a0(e2Var).Q(2131624052, 36, org.telegram.messenger.hd.G(1, "StoriesDeleted", new Object[0])).j();
        ys0Var.V(false);
    }
}
