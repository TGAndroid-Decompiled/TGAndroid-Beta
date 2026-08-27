package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;

public final class kd1 extends org.telegram.ui.Components.yk0 {

    public final ArrayList f39701c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public jd1 f39702e;

    public int f39703f;
    public final ld1 h;

    public kd1(ld1 ld1Var) {
        this.h = ld1Var;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f39701c.size();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        ArrayList arrayList = this.f39701c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.d4 d4Var = (org.telegram.ui.Cells.d4) o1Var.f5789a;
        d4Var.e(chat, chat.title, str, i10 != arrayList.size() - 1);
        d4Var.c(this.h.f40063w.contains(Long.valueOf(chat.f22380id)), false);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        return new org.telegram.ui.Components.lk0(new org.telegram.ui.Cells.d4(viewGroup.getContext(), 1, 0, false));
    }
}
