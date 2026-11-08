package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class d1 extends g.p {
    public final h1 f44933c;

    public d1(h1 h1Var) {
        this.f44933c = h1Var;
    }

    @Override
    public final int i(int i7) {
        h1 h1Var = this.f44933c;
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.f46189s.items;
        return ((org.telegram.messenger.aj) h1Var.f46190w.f45752b.get(arrayList.get((arrayList.size() - i7) - 1))).f21447i;
    }
}
