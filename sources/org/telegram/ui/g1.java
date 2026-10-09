package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class g1 extends g.o {
    public final k1 f37737c;

    public g1(k1 k1Var) {
        this.f37737c = k1Var;
    }

    @Override
    public final int i(int i10) {
        k1 k1Var = this.f37737c;
        ArrayList<TL_iv.PageBlock> arrayList = k1Var.f39060s.items;
        return ((MessageObject.GroupedMessagePosition) k1Var.v.f38798b.get(arrayList.get((arrayList.size() - i10) - 1))).spanSize;
    }
}
