package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.o01;
public final class w6 extends k61 {
    public static final int f23913a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, a71 a71Var, i71 i71Var) {
        Object obj = l61Var.G;
        if (obj instanceof o01) {
            o01 o01Var = (o01) obj;
            ((y6) view).b(l61Var.f28227l, o01Var.d, o01Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((y6) view).a(l61Var.f28227l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, lm0 lm0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new y6(context);
    }
}
