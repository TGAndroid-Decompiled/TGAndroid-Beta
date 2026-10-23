package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;
public final class ry0 extends im0 {
    public final Context f30062c;
    public final sy0 d;

    public ry0(sy0 sy0Var, Activity activity) {
        this.d = sy0Var;
        this.f30062c = activity;
    }

    @Override
    public final boolean D(s4.b1 b1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.f30378c.size();
    }

    @Override
    public final void v(s4.b1 b1Var, int i10) {
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) b1Var.f45921a;
        ArrayList arrayList = this.d.f30378c;
        TLRPC.StickerSetCovered stickerSetCovered = (TLRPC.StickerSetCovered) arrayList.get(i10);
        boolean z10 = true;
        if (i10 == arrayList.size() - 1) {
            z10 = false;
        }
        wVar.b(stickerSetCovered, z10);
    }

    @Override
    public final s4.b1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(this.f30062c, false);
        wVar.setLayoutParams(new s4.o0(-1, AndroidUtilities.dp(82.0f)));
        return new s4.b1(wVar);
    }
}
