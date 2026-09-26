package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class g1 extends g.p {
    public final k1 f33797c;

    public g1(k1 k1Var) {
        this.f33797c = k1Var;
    }

    @Override
    public final int i(int i10) {
        k1 k1Var = this.f33797c;
        ArrayList<TL_iv.PageBlock> arrayList = k1Var.f34911s.items;
        return ((MessageObject.GroupedMessagePosition) k1Var.v.f34617b.get(arrayList.get((arrayList.size() - i10) - 1))).spanSize;
    }
}
