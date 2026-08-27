package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;

public final class j1 extends f2.w {

    public final n1 f39220c;

    public j1(n1 n1Var) {
        this.f39220c = n1Var;
    }

    @Override
    public final int i(int i10) {
        n1 n1Var = this.f39220c;
        ArrayList<TL_iv.PageBlock> arrayList = n1Var.f40634s.items;
        return ((MessageObject.GroupedMessagePosition) n1Var.v.f40283b.get(arrayList.get((arrayList.size() - i10) - 1))).spanSize;
    }
}
