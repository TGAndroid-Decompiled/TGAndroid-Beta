package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class c81 extends org.telegram.ui.Components.sj0 {
    public final ArrayList f44275c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public b81 f44276e;
    public int f44277f;
    public final d81 h;

    public c81(d81 d81Var) {
        this.h = d81Var;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f44275c.size();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        ArrayList arrayList = this.f44275c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i3);
        String str = (String) this.d.get(i3);
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) d1Var.f55540a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i3 == arrayList.size() - 1) {
            z10 = false;
        }
        h4Var.e(chat, str2, str, z10);
        h4Var.c(this.h.f44602x.contains(Long.valueOf(chat.f27001id)), false);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        return new u4.d1(new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false));
    }
}
