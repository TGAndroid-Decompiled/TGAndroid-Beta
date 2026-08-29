package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class j1 extends f2.v {
    public final n1 f39393c;

    public j1(n1 n1Var) {
        this.f39393c = n1Var;
    }

    @Override
    public final int i(int i10) {
        n1 n1Var = this.f39393c;
        ArrayList<TL_iv.PageBlock> arrayList = n1Var.f40682s.items;
        return ((MessageObject.GroupedMessagePosition) n1Var.v.f40338b.get(arrayList.get((arrayList.size() - i10) - 1))).spanSize;
    }
}
