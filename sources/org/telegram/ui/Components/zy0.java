package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class zy0 extends qm0 {
    public final Context f33727c;
    public final az0 d;

    public zy0(az0 az0Var, Activity activity) {
        this.d = az0Var;
        this.f33727c = activity;
    }

    @Override
    public final boolean D(s4.d1 d1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.f24671c.size();
    }

    @Override
    public final void v(s4.d1 d1Var, int i10) {
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) d1Var.f47702a;
        ArrayList arrayList = this.d.f24671c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        wVar.b(stickerSetCovered, z10);
    }

    @Override
    public final s4.d1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(this.f33727c, false);
        wVar.setLayoutParams(new s4.q0(-1, AndroidUtilities.dp(82.0f)));
        return new s4.d1(wVar);
    }
}
