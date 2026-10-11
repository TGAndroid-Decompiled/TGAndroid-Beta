package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.sm0;
import org.telegram.ui.g11;
public final class w6 extends q61 {
    public static final int f23665a = 0;

    static {
        q61.setup(new q61());
    }

    @Override
    public final void bindView(View view, r61 r61Var, boolean z10, e71 e71Var, m71 m71Var) {
        Object obj = r61Var.G;
        if (obj instanceof g11) {
            g11 g11Var = (g11) obj;
            ((y6) view).b(r61Var.f30361l, g11Var.d, g11Var.f37846e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((y6) view).a(r61Var.f30361l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, sm0 sm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y6(context);
    }
}
