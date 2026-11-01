package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ba1 extends org.telegram.ui.Components.tk0 {
    public final ArrayList f36017c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public aa1 e;
    public int f36018f;
    public final ca1 h;

    public ba1(ca1 ca1Var) {
        this.h = ca1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f36017c.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        ArrayList arrayList = this.f36017c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.j4 j4Var = (org.telegram.ui.Cells.j4) c1Var.f47909a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        j4Var.e(chat, str2, str, z10);
        j4Var.c(this.h.f36278x.contains(Long.valueOf(chat.f19794id)), false);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Cells.j4(viewGroup.getContext(), 1, 0, false));
    }
}
