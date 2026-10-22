package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.l01;
public final class u6 extends g61 {
    public static final int f23601a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, u61 u61Var, c71 c71Var) {
        Object obj = h61Var.G;
        if (obj instanceof l01) {
            l01 l01Var = (l01) obj;
            ((w6) view).b(h61Var.f26785l, l01Var.d, l01Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((w6) view).a(h61Var.f26785l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, jm0 jm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new w6(context);
    }
}
