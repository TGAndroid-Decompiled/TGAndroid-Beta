package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class d1 extends g.p {
    public final h1 f46926c;

    public d1(h1 h1Var) {
        this.f46926c = h1Var;
    }

    @Override
    public final int i(int i7) {
        h1 h1Var = this.f46926c;
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.f48401s.items;
        return ((org.telegram.messenger.xi) h1Var.f48402w.f48019b.get(arrayList.get((arrayList.size() - i7) - 1))).f28002i;
    }
}
