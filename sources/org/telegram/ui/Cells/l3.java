package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class l3 extends v41 {
    public static final int f24623a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        m3 m3Var = (m3) view;
        m3Var.a((TLRPC.StickerSetCovered) w41Var.G, z10, w41Var.f34308t, false);
        m3Var.f24689e.a(w41Var.f34308t, false);
        m3Var.setAddOnClickListener(w41Var.D);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new m3(context, c6Var);
    }
}
