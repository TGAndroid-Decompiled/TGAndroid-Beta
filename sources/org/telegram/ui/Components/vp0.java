package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class vp0 implements org.telegram.messenger.sr, org.telegram.ui.ActionBar.q1 {
    public final jt0 f41523a;
    public final TL_stories.StoryItem f41524b;

    public vp0(jt0 jt0Var, TL_stories.StoryItem storyItem) {
        this.f41523a = jt0Var;
        this.f41524b = storyItem;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.f36648m1, str, new rh(10, this.f41523a, this.f41524b));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f41524b);
        jt0 jt0Var = this.f41523a;
        org.telegram.ui.ActionBar.g2 g2Var = jt0Var.f36684y1;
        g2Var.getMessagesController().R1().s(arrayList, jt0Var.f36648m1);
        lc.b0(g2Var).Q(2131624052, 36, org.telegram.messenger.hd.G(1, "StoriesDeleted", new Object[0])).j();
        jt0Var.V(false);
    }
}
