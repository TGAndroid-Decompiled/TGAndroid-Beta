package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class i1 extends f2.x {
    public final m1 f38984c;

    public i1(m1 m1Var) {
        this.f38984c = m1Var;
    }

    @Override
    public final int i(int i9) {
        m1 m1Var = this.f38984c;
        ArrayList<TL_iv.PageBlock> arrayList = m1Var.f40291s.items;
        return ((MessageObject.GroupedMessagePosition) m1Var.v.f39966b.get(arrayList.get((arrayList.size() - i9) - 1))).spanSize;
    }
}
