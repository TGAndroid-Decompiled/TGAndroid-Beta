package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class gp0 implements org.telegram.messenger.wr, org.telegram.ui.ActionBar.r1 {
    public final zs0 f34027a;
    public final TL_stories.StoryItem f34028b;

    public gp0(zs0 zs0Var, TL_stories.StoryItem storyItem) {
        this.f34027a = zs0Var;
        this.f34028b = storyItem;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new fx(5, this.f34027a, this.f34028b));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f34028b);
        zs0 zs0Var = this.f34027a;
        org.telegram.ui.ActionBar.f2 f2Var = zs0Var.f41127x1;
        f2Var.getMessagesController().P1().s(arrayList, zs0Var.l1);
        hc.a0(f2Var).Q(2131624051, 36, org.telegram.messenger.id.G(1, "StoriesDeleted", new Object[0])).j();
        zs0Var.V(false);
    }
}
