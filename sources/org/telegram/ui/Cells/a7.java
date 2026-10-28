package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.s71;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.v01;
public final class a7 extends t61 {
    public static final int f23861a = 0;

    static {
        t61.setup(new t61());
    }

    @Override
    public final void bindView(View view, u61 u61Var, boolean z10, k71 k71Var, s71 s71Var) {
        Object obj = u61Var.G;
        if (obj instanceof v01) {
            v01 v01Var = (v01) obj;
            ((c7) view).b(u61Var.f33249l, v01Var.d, v01Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((c7) view).a(u61Var.f33249l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, nm0 nm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new c7(context);
    }
}
