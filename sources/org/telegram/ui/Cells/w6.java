package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.e71;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.w61;
import org.telegram.ui.Components.zl0;
import org.telegram.ui.b11;
public final class w6 extends g61 {
    public static final int f23684a = 0;

    static {
        g61.setup(new g61());
    }

    @Override
    public final void bindView(View view, h61 h61Var, boolean z10, w61 w61Var, e71 e71Var) {
        Object obj = h61Var.G;
        if (obj instanceof b11) {
            b11 b11Var = (b11) obj;
            ((y6) view).b(h61Var.f27093l, b11Var.d, b11Var.f35011e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((y6) view).a(h61Var.f27093l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, zl0 zl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y6(context);
    }
}
