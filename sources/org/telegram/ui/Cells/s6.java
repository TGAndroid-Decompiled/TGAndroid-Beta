package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
import org.telegram.ui.f01;
public final class s6 extends v41 {
    public static final int f25657a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        Object obj = w41Var.G;
        if (obj instanceof f01) {
            f01 f01Var = (f01) obj;
            ((u6) view).b(w41Var.f34300l, f01Var.d, f01Var.f37946e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((u6) view).a(w41Var.f34300l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new u6(context);
    }
}
