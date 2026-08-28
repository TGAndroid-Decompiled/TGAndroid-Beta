package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class dx0 extends vk0 {
    public final Context f27838c;
    public final ex0 d;

    public dx0(ex0 ex0Var, Activity activity) {
        this.d = ex0Var;
        this.f27838c = activity;
    }

    @Override
    public final boolean D(f2.q1 q1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.f28214c.size();
    }

    @Override
    public final void v(f2.q1 q1Var, int i9) {
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) q1Var.f5501a;
        ArrayList arrayList = this.d.f28214c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i9);
        boolean z10 = true;
        if (i9 == arrayList.size() - 1) {
            z10 = false;
        }
        wVar.b(stickerSetCovered, z10);
    }

    @Override
    public final f2.q1 x(ViewGroup viewGroup, int i9) {
        org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(this.f27838c, false);
        wVar.setLayoutParams(new f2.a1(-1, AndroidUtilities.dp(82.0f)));
        return new f2.q1(wVar);
    }
}
