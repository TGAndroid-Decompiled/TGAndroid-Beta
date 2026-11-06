package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
public final class p3 extends q31 {
    public static final int f29730b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z9, f41 f41Var, k41 k41Var) {
        q3 q3Var = (q3) view;
        q3Var.a((TLRPC.StickerSetCovered) r31Var.G, z9, r31Var.f37606t, false);
        q3Var.f30113f.a(r31Var.f37606t, false);
        q3Var.setAddOnClickListener(r31Var.D);
    }

    @Override
    public final View d(Context context, pj0 pj0Var, int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q3(context, f6Var);
    }
}
