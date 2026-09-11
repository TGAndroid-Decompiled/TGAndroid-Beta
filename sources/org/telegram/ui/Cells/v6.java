package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.d61;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.v51;
import org.telegram.ui.k11;
public final class v6 extends g51 {
    public static final int f23374a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z10, v51 v51Var, d61 d61Var) {
        Object obj = h51Var.G;
        if (obj instanceof k11) {
            k11 k11Var = (k11) obj;
            ((x6) view).b(h51Var.f26594l, k11Var.d, k11Var.f37891e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((x6) view).a(h51Var.f26594l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, ll0 ll0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new x6(context);
    }
}
