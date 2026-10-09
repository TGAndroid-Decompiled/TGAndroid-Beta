package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.c71;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.o61;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.qm0;
import org.telegram.ui.h11;
public final class w6 extends o61 {
    public static final int f23673a = 0;

    static {
        o61.setup(new o61());
    }

    @Override
    public final void bindView(View view, p61 p61Var, boolean z10, c71 c71Var, k71 k71Var) {
        Object obj = p61Var.G;
        if (obj instanceof h11) {
            h11 h11Var = (h11) obj;
            ((y6) view).b(p61Var.f29734l, h11Var.d, h11Var.f38193e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((y6) view).a(p61Var.f29734l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, qm0 qm0Var, int i10, int i11, org.telegram.ui.ActionBar.e6 e6Var) {
        return new y6(context);
    }
}
