package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jd1 extends org.telegram.ui.Components.vk0 {
    public final ArrayList f39448c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public id1 f39449e;
    public int f39450f;
    public final kd1 h;

    public jd1(kd1 kd1Var) {
        this.h = kd1Var;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return true;
    }

    @Override
    public final int h() {
        return this.f39448c.size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        ArrayList arrayList = this.f39448c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i9);
        String str = (String) this.d.get(i9);
        org.telegram.ui.Cells.g4 g4Var = (org.telegram.ui.Cells.g4) q1Var.f5501a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i9 == arrayList.size() - 1) {
            z10 = false;
        }
        g4Var.e(chat, str2, str, z10);
        g4Var.c(this.h.f39816w.contains(Long.valueOf(chat.f22380id)), false);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        return new f2.q1(new org.telegram.ui.Cells.g4(viewGroup.getContext(), 1, 0, false));
    }
}
