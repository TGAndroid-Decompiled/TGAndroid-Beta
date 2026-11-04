package org.telegram.ui;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_iv;
public final class e1 extends g.p {
    public final i1 f44852c;

    public e1(i1 i1Var) {
        this.f44852c = i1Var;
    }

    @Override
    public final int i(int i3) {
        i1 i1Var = this.f44852c;
        ArrayList<TL_iv.PageBlock> arrayList = i1Var.f46030s.items;
        return ((org.telegram.messenger.ri) i1Var.f46031w.f45773b.get(arrayList.get((arrayList.size() - i3) - 1))).f25146i;
    }
}
