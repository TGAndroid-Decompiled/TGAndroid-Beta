package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class q3 extends m41 {
    public static final int f31375b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        r3 r3Var = (r3) view;
        r3Var.a((TLRPC.StickerSetCovered) n41Var.H, z10, n41Var.f37663u, false);
        r3Var.f31769f.a(n41Var.f37663u, false);
        r3Var.setAddOnClickListener(n41Var.E);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new r3(context, i6Var);
    }
}
