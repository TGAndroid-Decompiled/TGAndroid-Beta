package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class fp0 implements org.telegram.messenger.wr, org.telegram.ui.ActionBar.r1 {
    public final ys0 f33621a;
    public final TL_stories.StoryItem f33622b;

    public fp0(ys0 ys0Var, TL_stories.StoryItem storyItem) {
        this.f33621a = ys0Var;
        this.f33622b = storyItem;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new ex(5, this.f33621a, this.f33622b));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f33622b);
        ys0 ys0Var = this.f33621a;
        org.telegram.ui.ActionBar.f2 f2Var = ys0Var.f40719x1;
        f2Var.getMessagesController().P1().s(arrayList, ys0Var.l1);
        gc.a0(f2Var).Q(2131624051, 36, org.telegram.messenger.id.G(1, "StoriesDeleted", new Object[0])).j();
        ys0Var.V(false);
    }
}
