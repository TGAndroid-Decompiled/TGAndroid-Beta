package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
public final class dx0 extends sk0 {
    public final Context f25562c;
    public final ex0 d;

    public dx0(ex0 ex0Var, Activity activity) {
        this.d = ex0Var;
        this.f25562c = activity;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int b() {
        return this.d.f25887c.size();
    }

    @Override
    public final void t(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) c1Var.f47898a;
        ArrayList arrayList = this.d.f25887c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        vVar.b(stickerSetCovered, z10);
    }

    @Override
    public final s4.c1 w(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.f25562c, false);
        vVar.setLayoutParams(new s4.o0(-1, org.telegram.messenger.i0.L(82.0f)));
        return new s4.c1(vVar);
    }
}
