package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class d1 extends g.p {
    public final h1 f46281c;

    public d1(h1 h1Var) {
        this.f46281c = h1Var;
    }

    @Override
    public final int i(int i7) {
        h1 h1Var = this.f46281c;
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.f47578s.items;
        return ((org.telegram.messenger.yi) h1Var.f47579w.f47268b.get(arrayList.get((arrayList.size() - i7) - 1))).f27750i;
    }
}
