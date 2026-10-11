package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class f1 extends g.o {
    public final j1 f37534c;

    public f1(j1 j1Var) {
        this.f37534c = j1Var;
    }

    @Override
    public final int i(int i10) {
        j1 j1Var = this.f37534c;
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.f38854s.items;
        return ((MessageObject.GroupedMessagePosition) j1Var.v.f38585b.get(arrayList.get((arrayList.size() - i10) - 1))).spanSize;
    }
}
