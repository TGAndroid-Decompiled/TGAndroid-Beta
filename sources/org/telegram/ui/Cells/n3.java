package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class n3 extends h51 {
    public static final int f21429a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        o3 o3Var = (o3) view;
        o3Var.a((TLRPC.StickerSetCovered) i51Var.G, z4, i51Var.f25573t, false);
        o3Var.e.a(i51Var.f25573t, false);
        o3Var.setAddOnClickListener(i51Var.D);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new o3(context, f6Var);
    }
}
