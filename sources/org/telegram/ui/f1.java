package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class f1 extends g.o {
    public final j1 f37149c;

    public f1(j1 j1Var) {
        this.f37149c = j1Var;
    }

    @Override
    public final int i(int i10) {
        j1 j1Var = this.f37149c;
        ArrayList<TL_iv.PageBlock> arrayList = j1Var.f38410s.items;
        return ((org.telegram.messenger.bj) j1Var.f38411w.f38080b.get(arrayList.get((arrayList.size() - i10) - 1))).f14780i;
    }
}
