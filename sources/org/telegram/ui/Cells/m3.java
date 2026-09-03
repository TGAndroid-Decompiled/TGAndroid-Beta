package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
public final class m3 extends h51 {
    public static final int f21348a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        n3 n3Var = (n3) view;
        n3Var.a((TLRPC.StickerSetCovered) i51Var.G, z4, i51Var.f25593t, false);
        n3Var.e.a(i51Var.f25593t, false);
        n3Var.setAddOnClickListener(i51Var.D);
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new n3(context, f6Var);
    }
}
