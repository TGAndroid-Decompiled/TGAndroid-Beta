package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class q3 extends k41 {
    public static final int f31288b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        r3 r3Var = (r3) view;
        r3Var.a((TLRPC.StickerSetCovered) l41Var.H, z10, l41Var.f37026u, false);
        r3Var.f31688f.a(l41Var.f37026u, false);
        r3Var.setAddOnClickListener(l41Var.E);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new r3(context, i6Var);
    }
}
