package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.a51;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.z41;
public final class r3 extends z41 {
    public static final int f22869b = 0;

    static {
        z41.h(new z41());
    }

    @Override
    public final void b(View view, a51 a51Var, boolean z10, p51 p51Var, u51 u51Var) {
        s3 s3Var = (s3) view;
        s3Var.a((TLRPC.StickerSetCovered) a51Var.G, z10, a51Var.f24300t, false);
        s3Var.f23000f.a(a51Var.f24300t, false);
        s3Var.setAddOnClickListener(a51Var.D);
    }

    @Override
    public final View d(Context context, tk0 tk0Var, int i10, org.telegram.ui.ActionBar.p6 p6Var) {
        return new s3(context, p6Var);
    }
}
