package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
public final class n3 extends g61 {
    public static final int f22638a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        o3 o3Var = (o3) view;
        o3Var.a((TLRPC.StickerSetCovered) h61Var.G, z10, h61Var.f26790t, false);
        o3Var.e.a(h61Var.f26790t, false);
        o3Var.setAddOnClickListener(h61Var.D);
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new o3(context, d6Var);
    }
}
