package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ae1 extends org.telegram.ui.Components.sl0 {
    public final ArrayList f35144c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public zd1 f35145e;
    public int f35146f;
    public final be1 h;

    public ae1(be1 be1Var) {
        this.h = be1Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f35144c.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        ArrayList arrayList = this.f35144c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) m1Var.f5875a;
        String str2 = chat.title;
        boolean z4 = true;
        if (i10 == arrayList.size() - 1) {
            z4 = false;
        }
        g4Var.e(chat, str2, str, z4);
        g4Var.c(this.h.f35499w.contains(Long.valueOf(chat.f20843id)), false);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false));
    }
}
