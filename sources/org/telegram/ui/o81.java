package org.telegram.ui;

import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class o81 extends org.telegram.ui.Components.bk0 {
    public final ArrayList f50494c = new ArrayList();
    public final ArrayList d = new ArrayList();
    public n81 f50495e;
    public int f50496f;
    public final p81 h;

    public o81(p81 p81Var) {
        this.h = p81Var;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return true;
    }

    @Override
    public final int b() {
        return this.f50494c.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        ArrayList arrayList = this.f50494c;
        TLRPC.Chat chat = (TLRPC.Chat) arrayList.get(i7);
        String str = (String) this.d.get(i7);
        org.telegram.ui.Cells.i4 i4Var = (org.telegram.ui.Cells.i4) f1Var.f59123a;
        String str2 = chat.title;
        boolean z10 = true;
        if (i7 == arrayList.size() - 1) {
            z10 = false;
        }
        i4Var.e(chat, str2, str, z10);
        i4Var.c(this.h.f50773x.contains(Long.valueOf(chat.f28403id)), false);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        return new v4.f1(new org.telegram.ui.Cells.i4(viewGroup.getContext(), 1, 0, false));
    }
}
