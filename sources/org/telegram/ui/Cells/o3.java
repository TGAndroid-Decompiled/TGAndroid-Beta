package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class o3 extends k61 {
    public static final int f21618a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        p3 p3Var = (p3) view;
        p3Var.a((TLRPC.StickerSetCovered) l61Var.G, z10, l61Var.f26962t, false);
        p3Var.e.a(l61Var.f26962t, false);
        p3Var.setAddOnClickListener(l61Var.D);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new p3(context, c6Var);
    }
}
