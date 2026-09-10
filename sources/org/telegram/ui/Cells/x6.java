package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.j61;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.o11;
public final class x6 extends u51 {
    public static final int f20711a = 0;

    static {
        u51.setup(new u51());
    }

    @Override
    public final void bindView(View view, v51 v51Var, boolean z10, j61 j61Var, r61 r61Var) {
        Object obj = v51Var.G;
        if (obj instanceof o11) {
            o11 o11Var = (o11) obj;
            ((z6) view).b(v51Var.f27829l, o11Var.d, o11Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((z6) view).a(v51Var.f27829l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new z6(context);
    }
}
