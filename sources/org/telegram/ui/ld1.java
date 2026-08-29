package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ld1 extends org.telegram.ui.Components.il0 {
    public final ArrayList f40176c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public kd1 f40177e;
    public int f40178f;
    public final md1 h;

    public ld1(md1 md1Var) {
        this.h = md1Var;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f40176c.size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        ArrayList arrayList = this.f40176c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.e4 e4Var = (org.telegram.ui.Cells.e4) n1Var.f6432a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        e4Var.e(chat, str2, str, z10);
        e4Var.c(this.h.f40537w.contains(Long.valueOf(chat.f22392id)), false);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        return new f2.n1(new org.telegram.ui.Cells.e4(viewGroup.getContext(), 1, 0, false));
    }
}
