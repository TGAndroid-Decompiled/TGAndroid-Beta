package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
public final class n3 extends u51 {
    public static final int f19558a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        o3 o3Var = (o3) view;
        o3Var.a((TLRPC.StickerSetCovered) v51Var.G, z10, v51Var.f27837t, false);
        o3Var.e.a(v51Var.f27837t, false);
        o3Var.setAddOnClickListener(v51Var.D);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new o3(context, f6Var);
    }
}
