package org.telegram.ui.Components;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.TLRPC;

public final class fx0 extends yk0 {

    public final Context f28464c;
    public final gx0 d;

    public fx0(gx0 gx0Var, Activity activity) {
        this.d = gx0Var;
        this.f28464c = activity;
    }

    @Override
    public final boolean D(f2.o1 o1Var) {
        return false;
    }

    @Override
    public final int h() {
        return this.d.f28864c.size();
    }

    @Override
    public final void v(f2.o1 o1Var, int i10) {
        org.telegram.ui.Cells.w wVar = (org.telegram.ui.Cells.w) o1Var.f5789a;
        ArrayList arrayList = this.d.f28864c;
        wVar.b((TLRPC.StickerSetCovered) arrayList.get(i10), i10 != arrayList.size() - 1);
    }

    @Override
    public final f2.o1 x(ViewGroup viewGroup, int i10) {
        org.telegram.ui.Cells.w wVar = new org.telegram.ui.Cells.w(this.f28464c, false);
        wVar.setLayoutParams(new f2.y0(-1, AndroidUtilities.dp(82.0f)));
        return new lk0(wVar);
    }
}
