package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.Components.v51;
public final class r3 extends a51 {
    public static final int f22870b = 0;

    static {
        a51.h(new a51());
    }

    @Override
    public final void b(View view, b51 b51Var, boolean z10, q51 q51Var, v51 v51Var) {
        s3 s3Var = (s3) view;
        s3Var.a((TLRPC.StickerSetCovered) b51Var.G, z10, b51Var.f24651t, false);
        s3Var.f23001f.a(b51Var.f24651t, false);
        s3Var.setAddOnClickListener(b51Var.D);
    }

    @Override
    public final View d(Context context, uk0 uk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new s3(context, p6Var);
    }
}
