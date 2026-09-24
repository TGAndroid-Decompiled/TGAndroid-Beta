package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ke1 extends org.telegram.ui.Components.vl0 {
    public final ArrayList f35032c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public je1 e;
    public int f35033f;
    public final le1 h;

    public ke1(le1 le1Var) {
        this.h = le1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f35032c.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        ArrayList arrayList = this.f35032c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) c1Var.f42946a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        g4Var.e(chat, str2, str, z10);
        g4Var.c(this.h.f35314w.contains(Long.valueOf(chat.f18321id)), false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false));
    }
}
