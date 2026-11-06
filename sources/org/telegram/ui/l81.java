package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class l81 extends org.telegram.ui.Components.oj0 {
    public final ArrayList f47471c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public k81 f47472e;
    public int f47473f;
    public final m81 h;

    public l81(m81 m81Var) {
        this.h = m81Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f47471c.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        ArrayList arrayList = this.f47471c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i7);
        String str = (String) this.d.get(i7);
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) d1Var.f56951a;
        String str2 = chat.title;
        boolean z9 = true;
        if (i7 == arrayList.size() - 1) {
            z9 = false;
        }
        h4Var.e(chat, str2, str, z9);
        h4Var.c(this.h.f47734x.contains(Long.valueOf(chat.f26953id)), false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false));
    }
}
