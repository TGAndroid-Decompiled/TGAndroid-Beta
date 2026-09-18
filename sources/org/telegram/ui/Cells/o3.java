package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.wl0;
import org.telegram.ui.Components.x51;
public final class o3 extends w51 {
    public static final int f20722a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        p3 p3Var = (p3) view;
        p3Var.a((TLRPC.StickerSetCovered) x51Var.G, z10, x51Var.f30256t, false);
        p3Var.e.a(x51Var.f30256t, false);
        p3Var.setAddOnClickListener(x51Var.D);
    }

    @Override
    public final View createView(Context context, wl0 wl0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new p3(context, e6Var);
    }
}
