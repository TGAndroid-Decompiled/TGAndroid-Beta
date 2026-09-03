package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class yx0 extends rl0 {
    public final Context f33682c;
    public final zx0 d;

    public yx0(zx0 zx0Var, Activity activity) {
        this.d = zx0Var;
        this.f33682c = activity;
    }

    @Override
    public final boolean D(f2.m1 m1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.f34042c.size();
    }

    @Override
    public final void v(f2.m1 m1Var, int i10) {
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) m1Var.f5875a;
        ArrayList arrayList = this.d.f34042c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
        boolean z4 = true;
        if (i10 == arrayList.size() - 1) {
            z4 = false;
        }
        wVar.b(stickerSetCovered, z4);
    }

    @Override
    public final f2.m1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(this.f33682c, false);
        wVar.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(82.0f)));
        return new f2.m1(wVar);
    }
}
