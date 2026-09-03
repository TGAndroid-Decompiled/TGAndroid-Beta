package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class fe1 extends org.telegram.ui.Components.ql0 {
    public final ArrayList f34059c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public ee1 e;
    public int f34060f;
    public final ge1 h;

    public fe1(ge1 ge1Var) {
        this.h = ge1Var;
    }

    @Override
    public final boolean D(f2.l1 l1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f34059c.size();
    }

    @Override
    public final void v(f2.l1 l1Var, int i10) {
        ArrayList arrayList = this.f34059c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) l1Var.f5774a;
        String str2 = chat.title;
        boolean z4 = true;
        if (i10 == arrayList.size() - 1) {
            z4 = false;
        }
        f4Var.e(chat, str2, str, z4);
        f4Var.c(this.h.f34434w.contains(Long.valueOf(chat.f19159id)), false);
    }

    @Override
    public final f2.l1 x(ViewGroup viewGroup, int i10) {
        return new f2.l1(new org.telegram.ui.Cells.f4(viewGroup.getContext(), 1, 0, false));
    }
}
