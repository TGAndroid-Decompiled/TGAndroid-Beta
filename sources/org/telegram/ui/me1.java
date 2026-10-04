package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class me1 extends org.telegram.ui.Components.yl0 {
    public final ArrayList f38579c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public le1 f38580e;
    public int f38581f;
    public final ne1 h;

    public me1(ne1 ne1Var) {
        this.h = ne1Var;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f38579c.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        ArrayList arrayList = this.f38579c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) c1Var.f46524a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        g4Var.e(chat, str2, str, z10);
        g4Var.c(this.h.f38964w.contains(Long.valueOf(chat.f20038id)), false);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        return new s4.c1(new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false));
    }
}
