package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.k11;
public final class v6 extends i51 {
    public static final int f21486a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z10, x51 x51Var, f61 f61Var) {
        Object obj = j51Var.G;
        if (obj instanceof k11) {
            k11 k11Var = (k11) obj;
            ((x6) view).b(j51Var.f25124l, k11Var.d, k11Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((x6) view).a(j51Var.f25124l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, ml0 ml0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new x6(context);
    }
}
