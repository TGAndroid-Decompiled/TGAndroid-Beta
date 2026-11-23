package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class d1 extends g.p {
    public final h1 f46851c;

    public d1(h1 h1Var) {
        this.f46851c = h1Var;
    }

    @Override
    public final int i(int i7) {
        h1 h1Var = this.f46851c;
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.f48201s.items;
        return ((org.telegram.messenger.yi) h1Var.f48202w.f47904b.get(arrayList.get((arrayList.size() - i7) - 1))).f28098i;
    }
}
