package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class qd1 extends org.telegram.ui.Components.mm0 {
    public final ArrayList f42682c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public pd1 e;
    public int f42683f;
    public final rd1 h;

    public qd1(rd1 rd1Var) {
        this.h = rd1Var;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f42682c.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        ArrayList arrayList = this.f42682c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.k4 k4Var = (org.telegram.ui.Cells.k4) e1Var.f47773a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        k4Var.e(chat, str2, str, z10);
        k4Var.c(this.h.f42971w.contains(Long.valueOf(chat.f22028id)), false);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        return new s4.e1(new org.telegram.ui.Cells.k4(viewGroup.getContext(), 1, 0, false));
    }
}
