package org.telegram.ui.Components;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stories;
public final class up0 implements org.telegram.messenger.rr, org.telegram.ui.ActionBar.q1 {
    public final it0 f40428a;
    public final TL_stories.StoryItem f40429b;

    public up0(it0 it0Var, TL_stories.StoryItem storyItem) {
        this.f40428a = it0Var;
        this.f40429b = storyItem;
    }

    @Override
    public void a(String str) {
        r0.getStoriesController().r(r0.f36130m1, str, new ph(11, this.f40428a, this.f40429b));
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        ArrayList arrayList = new ArrayList(1);
        arrayList.add(this.f40429b);
        it0 it0Var = this.f40428a;
        org.telegram.ui.ActionBar.g2 g2Var = it0Var.f36166y1;
        g2Var.getMessagesController().R1().s(arrayList, it0Var.f36130m1);
        kc.b0(g2Var).Q(2131624052, 36, org.telegram.messenger.gd.G(1, "StoriesDeleted", new Object[0])).j();
        it0Var.V(false);
    }
}
