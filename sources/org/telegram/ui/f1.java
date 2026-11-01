package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f1 extends g.o {
    public final j1 f36954c;

    public f1(j1 j1Var) {
        this.f36954c = j1Var;
    }

    @Override
    public final int i(int i10) {
        j1 j1Var = this.f36954c;
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.f38247s.items;
        return ((org.telegram.messenger.cj) j1Var.f38248w.f37922b.get(arrayList.get((arrayList.size() - i10) - 1))).f15163i;
    }
}
