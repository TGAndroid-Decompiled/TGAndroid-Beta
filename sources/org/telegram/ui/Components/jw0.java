package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class jw0 extends bk0 {
    public final Context f36542c;
    public final kw0 d;

    public jw0(kw0 kw0Var, Activity activity) {
        this.d = kw0Var;
        this.f36542c = activity;
    }

    @Override
    public final boolean D(v4.f1 f1Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.d.f36906c.size();
    }

    @Override
    public final void t(v4.f1 f1Var, int i7) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) f1Var.f59122a;
        ArrayList arrayList = this.d.f36906c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i7);
        boolean z10 = true;
        if (i7 == arrayList.size() - 1) {
            z10 = false;
        }
        vVar.b(stickerSetCovered, z10);
    }

    @Override
    public final v4.f1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.f36542c, false);
        vVar.setLayoutParams(new v4.q0(-1, org.telegram.messenger.g0.L(82.0f)));
        return new v4.f1(vVar);
    }
}
