package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class h1 extends g.p {
    public final l1 f33231c;

    public h1(l1 l1Var) {
        this.f33231c = l1Var;
    }

    @Override
    public final int i(int i10) {
        l1 l1Var = this.f33231c;
        ArrayList<TL_iv.PageBlock> arrayList = l1Var.f34507s.items;
        return ((MessageObject.GroupedMessagePosition) l1Var.v.f34187b.get(arrayList.get((arrayList.size() - i10) - 1))).spanSize;
    }
}
