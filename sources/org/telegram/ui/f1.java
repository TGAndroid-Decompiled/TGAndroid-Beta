package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.tl.TL_iv;
public final class f1 extends g.p {
    public final j1 f33440c;

    public f1(j1 j1Var) {
        this.f33440c = j1Var;
    }

    @Override
    public final int i(int i10) {
        j1 j1Var = this.f33440c;
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.f34776s.items;
        return ((MessageObject.GroupedMessagePosition) j1Var.v.f34376b.get(arrayList.get((arrayList.size() - i10) - 1))).spanSize;
    }
}
