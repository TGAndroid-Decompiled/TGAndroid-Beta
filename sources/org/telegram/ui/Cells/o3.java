package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
public final class o3 extends p61 {
    public static final int f22592a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        p3 p3Var = (p3) view;
        p3Var.a((TLRPC.StickerSetCovered) q61Var.G, z10, q61Var.f30071t, false);
        p3Var.f22647e.a(q61Var.f30071t, false);
        p3Var.setAddOnClickListener(q61Var.D);
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new p3(context, e6Var);
    }
}
