package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class cw0 extends tj0 {
    public final Context f33716c;
    public final dw0 d;

    public cw0(dw0 dw0Var, Activity activity) {
        this.d = dw0Var;
        this.f33716c = activity;
    }

    @Override
    public final boolean D(v4.e1 e1Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.d.f34083c.size();
    }

    @Override
    public final void t(v4.e1 e1Var, int i7) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) e1Var.f58535a;
        ArrayList arrayList = this.d.f34083c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i7);
        boolean z10 = true;
        if (i7 == arrayList.size() - 1) {
            z10 = false;
        }
        vVar.b(stickerSetCovered, z10);
    }

    @Override
    public final v4.e1 x(ViewGroup viewGroup, int i7) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.f33716c, false);
        vVar.setLayoutParams(new v4.p0(-1, org.telegram.messenger.g0.L(82.0f)));
        return new v4.e1(vVar);
    }
}
