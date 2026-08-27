package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;

public final class l3 extends m41 {

    public static final int f24616a = 0;

    static {
        m41.setup(new l3());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        m3 m3Var = (m3) view;
        m3Var.a((TLRPC.StickerSetCovered) n41Var.G, z10, n41Var.f30852t, false);
        m3Var.f24671e.a(n41Var.f30852t, false);
        m3Var.setAddOnClickListener(n41Var.D);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new m3(context, c6Var);
    }
}
