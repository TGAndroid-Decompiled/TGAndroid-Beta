package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class jq0 implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.fs {
    public final zt0 f27473a;
    public final TL_stories.StoryItem f27474b;

    public jq0(zt0 zt0Var, TL_stories.StoryItem storyItem) {
        this.f27473a = zt0Var;
        this.f27474b = storyItem;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new vg(13, this.f27473a, this.f27474b));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f27474b);
        zt0 zt0Var = this.f27473a;
        org.telegram.ui.ActionBar.k2 k2Var = zt0Var.f33240x1;
        k2Var.getMessagesController().O1().s(arrayList, zt0Var.l1);
        cc.a0(k2Var).Q(2131624050, 36, org.telegram.messenger.cd.G(1, "StoriesDeleted", new Object[0])).j();
        zt0Var.T(false);
    }
}
