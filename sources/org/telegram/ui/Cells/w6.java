package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
import org.telegram.ui.o11;
public final class w6 extends k61 {
    public static final int f22619a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        Object obj = l61Var.G;
        if (obj instanceof o11) {
            o11 o11Var = (o11) obj;
            ((y6) view).b(l61Var.f26954l, o11Var.d, o11Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((y6) view).a(l61Var.f26954l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new y6(context);
    }
}
