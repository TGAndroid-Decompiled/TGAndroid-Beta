package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class i1 extends g.o {
    public final m1 f37835c;

    public i1(m1 m1Var) {
        this.f37835c = m1Var;
    }

    @Override
    public final int i(int i10) {
        m1 m1Var = this.f37835c;
        ArrayList<TL_iv.PageBlock> arrayList = m1Var.f39094s.items;
        return ((MessageObject.GroupedMessagePosition) m1Var.v.f38723b.get(arrayList.get((arrayList.size() - i10) - 1))).spanSize;
    }
}
