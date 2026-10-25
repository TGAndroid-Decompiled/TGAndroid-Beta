package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class l3 extends s61 {
    public static final int f24376a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        m3 m3Var = (m3) view;
        m3Var.a((TLRPC.StickerSetCovered) t61Var.G, z10, t61Var.f32880t, false);
        m3Var.f24436f.a(t61Var.f32880t, false);
        m3Var.setAddOnClickListener(t61Var.D);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new m3(context, u6Var);
    }
}
