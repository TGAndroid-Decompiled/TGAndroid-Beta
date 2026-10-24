package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
public final class m3 extends k61 {
    public static final int f22718a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        n3 n3Var = (n3) view;
        n3Var.a((TLRPC.StickerSetCovered) l61Var.G, z10, l61Var.f28235t, false);
        n3Var.f22787f.a(l61Var.f28235t, false);
        n3Var.setAddOnClickListener(l61Var.D);
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new n3(context, g6Var);
    }
}
