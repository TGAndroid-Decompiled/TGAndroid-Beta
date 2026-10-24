package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class kd1 extends org.telegram.ui.Components.km0 {
    public final ArrayList f38898c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public jd1 e;
    public int f38899f;
    public final ld1 h;

    public kd1(ld1 ld1Var) {
        this.h = ld1Var;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f38898c.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        ArrayList arrayList = this.f38898c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i10);
        String str = (String) this.d.get(i10);
        org.telegram.ui.Cells.f4 f4Var = (org.telegram.ui.Cells.f4) b1Var.f46342a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        f4Var.e(chat, str2, str, z10);
        f4Var.c(this.h.f39209w.contains(Long.valueOf(chat.f20344id)), false);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        return new s4.b1(new org.telegram.ui.Cells.f4(viewGroup.getContext(), 1, 0, false));
    }
}
