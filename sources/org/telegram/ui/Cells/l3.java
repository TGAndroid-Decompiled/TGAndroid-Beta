package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
public final class l3 extends t61 {
    public static final int f24380a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        m3 m3Var = (m3) view;
        m3Var.a((TLRPC.StickerSetCovered) u61Var.G, z10, u61Var.f33257t, false);
        m3Var.f24440f.a(u61Var.f33257t, false);
        m3Var.setAddOnClickListener(u61Var.D);
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new m3(context, u6Var);
    }
}
