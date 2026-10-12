package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.p71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.j11;
public final class v6 extends t61 {
    public static final int f23318a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, h71 h71Var, p71 p71Var) {
        Object obj = u61Var.G;
        if (obj instanceof j11) {
            j11 j11Var = (j11) obj;
            ((x6) view).b(u61Var.f31076l, j11Var.d, j11Var.f39078e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((x6) view).a(u61Var.f31076l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, wm0 wm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new x6(context);
    }
}
