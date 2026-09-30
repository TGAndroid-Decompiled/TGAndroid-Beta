package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.z01;
public final class w6 extends x51 {
    public static final int f21823a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        Object obj = y51Var.G;
        if (obj instanceof z01) {
            z01 z01Var = (z01) obj;
            ((y6) view).b(y51Var.f30637l, z01Var.d, z01Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((y6) view).a(y51Var.f30637l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y6(context);
    }
}
