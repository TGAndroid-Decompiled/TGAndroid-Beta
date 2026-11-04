package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class hp0 implements org.telegram.messenger.or, org.telegram.ui.ActionBar.p1 {
    public final ws0 f34469a;
    public final TL_stories.StoryItem f34470b;

    public hp0(ws0 ws0Var, TL_stories.StoryItem storyItem) {
        this.f34469a = ws0Var;
        this.f34470b = storyItem;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.m1, str, new ei(9, this.f34469a, this.f34470b));
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f34470b);
        ws0 ws0Var = this.f34469a;
        org.telegram.ui.ActionBar.d2 d2Var = ws0Var.f40142y1;
        d2Var.getMessagesController().P1().s(arrayList, ws0Var.m1);
        fc.a0(d2Var).Q(2131624051, 36, org.telegram.messenger.bd.G(1, "StoriesDeleted", new Object[0])).j();
        ws0Var.V(false);
    }
}
