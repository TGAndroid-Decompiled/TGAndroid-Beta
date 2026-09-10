package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class iy0 extends ul0 {
    public final Context f24168c;
    public final jy0 d;

    public iy0(jy0 jy0Var, Activity activity) {
        this.d = jy0Var;
        this.f24168c = activity;
    }

    @Override
    public final boolean D(s4.c1 c1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.f24522c.size();
    }

    @Override
    public final void v(s4.c1 c1Var, int i10) {
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) c1Var.f41610a;
        ArrayList arrayList = this.d.f24522c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        wVar.b(stickerSetCovered, z10);
    }

    @Override
    public final s4.c1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(this.f24168c, false);
        wVar.setLayoutParams(new s4.p0(-1, AndroidUtilities.dp(82.0f)));
        return new s4.c1(wVar);
    }
}
