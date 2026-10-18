package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class hd1 extends org.telegram.ui.Components.hm0 {
    public final ArrayList f37501c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public gd1 e;
    public int f37502f;
    public final id1 h;

    public hd1(id1 id1Var) {
        this.h = id1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f37501c.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        ArrayList arrayList = this.f37501c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) b1Var.f45910a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        f4Var.e(chat, str2, str, z10);
        f4Var.c(this.h.f37835w.contains(Long.valueOf(chat.f20272id)), false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new org.telegram.ui.Cells.f4(viewGroup.getContext(), 1, 0, false));
    }
}
