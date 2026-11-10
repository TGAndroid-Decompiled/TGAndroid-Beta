package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class zv0 extends oj0 {
    public final Context f41143c;
    public final aw0 d;

    public zv0(aw0 aw0Var, Activity activity) {
        this.d = aw0Var;
        this.f41143c = activity;
    }

    @Override
    public final boolean D(v4.d1 d1Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.d.f32022c.size();
    }

    @Override
    public final void t(v4.d1 d1Var, int i7) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) d1Var.f57052a;
        ArrayList arrayList = this.d.f32022c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i7);
        boolean z9 = true;
        if (i7 == arrayList.size() - 1) {
            z9 = false;
        }
        vVar.b(stickerSetCovered, z9);
    }

    @Override
    public final v4.d1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.f41143c, false);
        vVar.setLayoutParams(new v4.o0(-1, org.telegram.messenger.g0.L(82.0f)));
        return new v4.d1(vVar);
    }
}
