package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
public final class o3 extends x51 {
    public static final int f20775a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        p3 p3Var = (p3) view;
        p3Var.a((TLRPC.StickerSetCovered) y51Var.G, z10, y51Var.f30645t, false);
        p3Var.e.a(y51Var.f30645t, false);
        p3Var.setAddOnClickListener(y51Var.D);
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new p3(context, d6Var);
    }
}
