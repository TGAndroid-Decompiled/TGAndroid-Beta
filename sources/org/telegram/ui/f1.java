package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class f1 extends g.o {
    public final j1 f39233c;

    public f1(j1 j1Var) {
        this.f39233c = j1Var;
    }

    @Override
    public final int i(int i10) {
        j1 j1Var = this.f39233c;
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.f40383s.items;
        return ((MessageObject.GroupedMessagePosition) j1Var.v.f40111b.get(arrayList.get((arrayList.size() - i10) - 1))).spanSize;
    }
}
