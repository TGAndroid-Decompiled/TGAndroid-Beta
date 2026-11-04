package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class yv0 extends sj0 {
    public final Context f40839c;
    public final zv0 d;

    public yv0(zv0 zv0Var, Activity activity) {
        this.d = zv0Var;
        this.f40839c = activity;
    }

    @Override
    public final boolean D(u4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.d.f41137c.size();
    }

    @Override
    public final void t(u4.d1 d1Var, int i3) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) d1Var.f55540a;
        ArrayList arrayList = this.d.f41137c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i3);
        boolean z10 = true;
        if (i3 == arrayList.size() - 1) {
            z10 = false;
        }
        vVar.b(stickerSetCovered, z10);
    }

    @Override
    public final u4.d1 x(ViewGroup viewGroup, int i3) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.f40839c, false);
        vVar.setLayoutParams(new u4.p0(-1, org.telegram.messenger.g0.L(82.0f)));
        return new u4.d1(vVar);
    }
}
