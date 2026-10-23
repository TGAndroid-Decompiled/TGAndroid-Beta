package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class ld1 extends org.telegram.ui.Components.lm0 {
    public final ArrayList f39225c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public kd1 e;
    public int f39226f;
    public final md1 h;

    public ld1(md1 md1Var) {
        this.h = md1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f39225c.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        ArrayList arrayList = this.f39225c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) b1Var.f46343a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        f4Var.e(chat, str2, str, z10);
        f4Var.c(this.h.f39518w.contains(Long.valueOf(chat.f20343id)), false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new org.telegram.ui.Cells.f4(viewGroup.getContext(), 1, 0, false));
    }
}
