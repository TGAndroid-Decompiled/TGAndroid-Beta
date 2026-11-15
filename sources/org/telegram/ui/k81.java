package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class k81 extends org.telegram.ui.Components.tj0 {
    public final ArrayList f48645c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public j81 f48646e;
    public int f48647f;
    public final l81 h;

    public k81(l81 l81Var) {
        this.h = l81Var;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f48645c.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        ArrayList arrayList = this.f48645c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i7);
        String str = (String) this.d.get(i7);
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) e1Var.f58535a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i7 == arrayList.size() - 1) {
            z10 = false;
        }
        h4Var.e(chat, str2, str, z10);
        h4Var.c(this.h.f48904x.contains(Long.valueOf(chat.f28051id)), false);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        return new v4.e1(new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false));
    }
}
