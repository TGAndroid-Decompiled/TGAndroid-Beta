package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
public final class o3 extends o61 {
    public static final int f22588a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        p3 p3Var = (p3) view;
        p3Var.a((TLRPC.StickerSetCovered) p61Var.G, z10, p61Var.f29742t, false);
        p3Var.f22643e.a(p61Var.f29742t, false);
        p3Var.setAddOnClickListener(p61Var.D);
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new p3(context, e6Var);
    }
}
