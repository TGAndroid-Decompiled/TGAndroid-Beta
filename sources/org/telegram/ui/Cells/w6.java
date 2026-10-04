package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.b11;
public final class w6 extends f61 {
    public static final int f23676a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, u61 u61Var, c71 c71Var) {
        Object obj = g61Var.G;
        if (obj instanceof b11) {
            b11 b11Var = (b11) obj;
            ((y6) view).b(g61Var.f26668l, b11Var.d, b11Var.f34954e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((y6) view).a(g61Var.f26668l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y6(context);
    }
}
