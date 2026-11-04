package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tj0;
public final class p3 extends q31 {
    public static final int f29800b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        q3 q3Var = (q3) view;
        q3Var.a((TLRPC.StickerSetCovered) r31Var.G, z10, r31Var.f37635t, false);
        q3Var.f30190f.a(r31Var.f37635t, false);
        q3Var.setAddOnClickListener(r31Var.D);
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        return new q3(context, e6Var);
    }
}
