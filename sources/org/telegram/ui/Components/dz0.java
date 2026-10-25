package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class dz0 extends lm0 {
    public final Context f27637c;
    public final ez0 d;

    public dz0(ez0 ez0Var, Activity activity) {
        this.d = ez0Var;
        this.f27637c = activity;
    }

    @Override
    public final boolean D(s4.e1 e1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.f28022c.size();
    }

    @Override
    public final void v(s4.e1 e1Var, int i10) {
        org.telegram.ui.Cells.v vVar = (org.telegram.ui.Cells.v) e1Var.f47735a;
        ArrayList arrayList = this.d.f28022c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        vVar.b(stickerSetCovered, z10);
    }

    @Override
    public final s4.e1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.v vVar = new org.telegram.ui.Cells.v(this.f27637c, false);
        vVar.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(82.0f)));
        return new s4.e1(vVar);
    }
}
