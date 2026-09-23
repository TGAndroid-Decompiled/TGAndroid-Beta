package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.b11;
public final class v6 extends g51 {
    public static final int f21449a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        Object obj = h51Var.G;
        if (obj instanceof b11) {
            b11 b11Var = (b11) obj;
            ((x6) view).b(h51Var.f24507l, b11Var.d, b11Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((x6) view).a(h51Var.f24507l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new x6(context);
    }
}
