package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ge1 extends org.telegram.ui.Components.rl0 {
    public final ArrayList f37085c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public fe1 f37086e;
    public int f37087f;
    public final he1 h;

    public ge1(he1 he1Var) {
        this.h = he1Var;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f37085c.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        ArrayList arrayList = this.f37085c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) m1Var.f5875a;
        String str2 = chat.title;
        boolean z4 = true;
        if (i10 == arrayList.size() - 1) {
            z4 = false;
        }
        g4Var.e(chat, str2, str, z4);
        g4Var.c(this.h.f37362w.contains(Long.valueOf(chat.f20845id)), false);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        return new f2.m1(new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false));
    }
}
