package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class o3 extends l61 {
    public static final int f21335a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        p3 p3Var = (p3) view;
        p3Var.a((TLRPC.StickerSetCovered) m61Var.G, z10, m61Var.f26954t, false);
        p3Var.e.a(m61Var.f26954t, false);
        p3Var.setAddOnClickListener(m61Var.D);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new p3(context, c6Var);
    }
}
