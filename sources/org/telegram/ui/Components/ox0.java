package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ox0 extends il0 {
    public final Context f31508c;
    public final px0 d;

    public ox0(px0 px0Var, Activity activity) {
        this.d = px0Var;
        this.f31508c = activity;
    }

    @Override
    public final boolean D(f2.n1 n1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.f31801c.size();
    }

    @Override
    public final void v(f2.n1 n1Var, int i10) {
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) n1Var.f6432a;
        ArrayList arrayList = this.d.f31801c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        wVar.b(stickerSetCovered, z10);
    }

    @Override
    public final f2.n1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(this.f31508c, false);
        wVar.setLayoutParams(new f2.x0(-1, AndroidUtilities.dp(82.0f)));
        return new f2.n1(wVar);
    }
}
