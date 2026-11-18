package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class tp0 implements org.telegram.messenger.rr, org.telegram.ui.ActionBar.r1 {
    public final gt0 f40067a;
    public final TL_stories.StoryItem f40068b;

    public tp0(gt0 gt0Var, TL_stories.StoryItem storyItem) {
        this.f40067a = gt0Var;
        this.f40068b = storyItem;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.f35606m1, str, new ph(10, this.f40067a, this.f40068b));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f40068b);
        gt0 gt0Var = this.f40067a;
        org.telegram.ui.ActionBar.h2 h2Var = gt0Var.f35642y1;
        h2Var.getMessagesController().R1().s(arrayList, gt0Var.f35606m1);
        lc.b0(h2Var).Q(2131624052, 36, org.telegram.messenger.gd.G(1, "StoriesDeleted", new Object[0])).j();
        gt0Var.V(false);
    }
}
