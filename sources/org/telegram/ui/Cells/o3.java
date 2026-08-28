package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class o3 extends k41 {
    public static final int f24827a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        p3 p3Var = (p3) view;
        p3Var.a((TLRPC.StickerSetCovered) l41Var.G, z10, l41Var.f30347t, false);
        p3Var.f24859e.a(l41Var.f30347t, false);
        p3Var.setAddOnClickListener(l41Var.D);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new p3(context, b6Var);
    }
}
