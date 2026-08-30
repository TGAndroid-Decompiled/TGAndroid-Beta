package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class h1 extends f2.v {
    public final l1 f34726c;

    public h1(l1 l1Var) {
        this.f34726c = l1Var;
    }

    @Override
    public final int i(int i10) {
        l1 l1Var = this.f34726c;
        ArrayList<TL_iv.PageBlock> arrayList = l1Var.f35869s.items;
        return ((MessageObject.GroupedMessagePosition) l1Var.v.f35542b.get(arrayList.get((arrayList.size() - i10) - 1))).spanSize;
    }
}
