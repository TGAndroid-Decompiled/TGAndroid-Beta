package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class n3 extends g51 {
    public static final int f23207a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        o3 o3Var = (o3) view;
        o3Var.a((TLRPC.StickerSetCovered) h51Var.G, z4, h51Var.f27383t, false);
        o3Var.f23293e.a(h51Var.f27383t, false);
        o3Var.setAddOnClickListener(h51Var.D);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new o3(context, g6Var);
    }
}
