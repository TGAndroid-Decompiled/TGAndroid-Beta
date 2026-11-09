package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class n81 extends org.telegram.ui.Components.pj0 {
    public final ArrayList f48128c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public m81 f48129e;
    public int f48130f;
    public final o81 h;

    public n81(o81 o81Var) {
        this.h = o81Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f48128c.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        ArrayList arrayList = this.f48128c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i7);
        String str = (String) this.d.get(i7);
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) d1Var.f57056a;
        String str2 = chat.title;
        boolean z9 = true;
        if (i7 == arrayList.size() - 1) {
            z9 = false;
        }
        h4Var.e(chat, str2, str, z9);
        h4Var.c(this.h.f48408x.contains(Long.valueOf(chat.f26956id)), false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false));
    }
}
