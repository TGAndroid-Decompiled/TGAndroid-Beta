package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class kq0 implements org.telegram.ui.ActionBar.u1, org.telegram.messenger.gs {
    public final au0 f27942a;
    public final TL_stories.StoryItem f27943b;

    public kq0(au0 au0Var, TL_stories.StoryItem storyItem) {
        this.f27942a = au0Var;
        this.f27943b = storyItem;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.l1, str, new vg(13, this.f27942a, this.f27943b));
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f27943b);
        au0 au0Var = this.f27942a;
        org.telegram.ui.ActionBar.k2 k2Var = au0Var.f24568x1;
        k2Var.getMessagesController().O1().s(arrayList, au0Var.l1);
        cc.a0(k2Var).Q(2131624050, 36, org.telegram.messenger.dd.G(1, "StoriesDeleted", new Object[0])).j();
        au0Var.U(false);
    }
}
