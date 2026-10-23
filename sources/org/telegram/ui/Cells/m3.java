package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
public final class m3 extends l61 {
    public static final int f22717a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, b71 b71Var, j71 j71Var) {
        n3 n3Var = (n3) view;
        n3Var.a((TLRPC.StickerSetCovered) m61Var.G, z10, m61Var.f28567t, false);
        n3Var.f22786f.a(m61Var.f28567t, false);
        n3Var.setAddOnClickListener(m61Var.D);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new n3(context, g6Var);
    }
}
