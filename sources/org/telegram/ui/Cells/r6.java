package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.f01;

public final class r6 extends m41 {

    public static final int f25220a = 0;

    static {
        m41.setup(new r6());
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        Object obj = n41Var.G;
        if (obj instanceof f01) {
            f01 f01Var = (f01) obj;
            ((t6) view).b(n41Var.f30844l, f01Var.d, f01Var.f37894e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((t6) view).a(n41Var.f30844l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new t6(context);
    }
}
