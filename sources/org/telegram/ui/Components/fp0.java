package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class fp0 implements org.telegram.messenger.wr, org.telegram.ui.ActionBar.r1 {
    public final xs0 f33631a;
    public final TL_stories.StoryItem f33632b;

    public fp0(xs0 xs0Var, TL_stories.StoryItem storyItem) {
        this.f33631a = xs0Var;
        this.f33632b = storyItem;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new fx(5, this.f33631a, this.f33632b));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f33632b);
        xs0 xs0Var = this.f33631a;
        org.telegram.ui.ActionBar.f2 f2Var = xs0Var.f40461x1;
        f2Var.getMessagesController().P1().s(arrayList, xs0Var.l1);
        hc.a0(f2Var).Q(2131624051, 36, org.telegram.messenger.id.G(1, "StoriesDeleted", new Object[0])).j();
        xs0Var.V(false);
    }
}
