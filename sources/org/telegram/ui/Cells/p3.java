package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
public final class p3 extends v51 {
    public static final int f20804a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        q3 q3Var = (q3) view;
        q3Var.a((TLRPC.StickerSetCovered) w51Var.G, z10, w51Var.f29956t, false);
        q3Var.e.a(w51Var.f29956t, false);
        q3Var.setAddOnClickListener(w51Var.D);
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new q3(context, f6Var);
    }
}
