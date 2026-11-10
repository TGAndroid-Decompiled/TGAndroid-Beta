package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o81 extends org.telegram.ui.Components.oj0 {
    public final ArrayList f48467c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public n81 f48468e;
    public int f48469f;
    public final p81 h;

    public o81(p81 p81Var) {
        this.h = p81Var;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f48467c.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        ArrayList arrayList = this.f48467c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i7);
        String str = (String) this.d.get(i7);
        org.telegram.ui.Cells.h4 h4Var = (org.telegram.ui.Cells.h4) d1Var.f57052a;
        String str2 = chat.title;
        boolean z9 = true;
        if (i7 == arrayList.size() - 1) {
            z9 = false;
        }
        h4Var.e(chat, str2, str, z9);
        h4Var.c(this.h.f48723x.contains(Long.valueOf(chat.f26960id)), false);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        return new v4.d1(new org.telegram.ui.Cells.h4(viewGroup.getContext(), 1, 0, false));
    }
}
