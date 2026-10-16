package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.a71;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.o11;
public final class v6 extends l61 {
    public static final int f22275a = 0;

    static {
        l61.setup(new l61());
    }

    @Override
    public final void bindView(View view, m61 m61Var, boolean z10, a71 a71Var, i71 i71Var) {
        Object obj = m61Var.G;
        if (obj instanceof o11) {
            o11 o11Var = (o11) obj;
            ((x6) view).b(m61Var.f26946l, o11Var.d, o11Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((x6) view).a(m61Var.f26946l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new x6(context);
    }
}
