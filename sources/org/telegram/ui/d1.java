package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class d1 extends g.p {
    public final h1 f46818c;

    public d1(h1 h1Var) {
        this.f46818c = h1Var;
    }

    @Override
    public final int i(int i7) {
        h1 h1Var = this.f46818c;
        ArrayList<TL_iv.PageBlock> arrayList = h1Var.f48192s.items;
        return ((org.telegram.messenger.xi) h1Var.f48193w.f47868b.get(arrayList.get((arrayList.size() - i7) - 1))).f27888i;
    }
}
