package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class od1 extends org.telegram.ui.Components.lm0 {
    public final ArrayList f42161c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public nd1 e;
    public int f42162f;
    public final pd1 h;

    public od1(pd1 pd1Var) {
        this.h = pd1Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f42161c.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        ArrayList arrayList = this.f42161c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) e1Var.f47735a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        k4Var.e(chat, str2, str, z10);
        k4Var.c(this.h.f42475w.contains(Long.valueOf(chat.f22027id)), false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(new org.telegram.ui.Cells.k4(viewGroup.getContext(), 1, 0, false));
    }
}
