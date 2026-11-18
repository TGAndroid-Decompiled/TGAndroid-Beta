package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class d1 extends g.p {
    public final h1 f46798c;

    public d1(h1 h1Var) {
        this.f46798c = h1Var;
    }

    @Override
    public final int i(int i7) {
        h1 h1Var = this.f46798c;
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.f48120s.items;
        return ((org.telegram.messenger.xi) h1Var.f48121w.f47832b.get(arrayList.get((arrayList.size() - i7) - 1))).f27886i;
    }
}
