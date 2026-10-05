package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
public final class o3 extends g61 {
    public static final int f22601a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        p3 p3Var = (p3) view;
        p3Var.a((TLRPC.StickerSetCovered) h61Var.G, z10, h61Var.f27101t, false);
        p3Var.f22649e.a(h61Var.f27101t, false);
        p3Var.setAddOnClickListener(h61Var.D);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new p3(context, d6Var);
    }
}
