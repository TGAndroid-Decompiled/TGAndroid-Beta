package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class zx0 extends sl0 {
    public final Context f34043c;
    public final ay0 d;

    public zx0(ay0 ay0Var, Activity activity) {
        this.d = ay0Var;
        this.f34043c = activity;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.f25374c.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) m1Var.f5875a;
        ArrayList arrayList = this.d.f25374c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
        boolean z4 = true;
        if (i10 == arrayList.size() - 1) {
            z4 = false;
        }
        wVar.b(stickerSetCovered, z4);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(this.f34043c, false);
        wVar.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(82.0f)));
        return new f2.m1(wVar);
    }
}
