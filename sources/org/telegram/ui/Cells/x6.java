package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.y51;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.i11;
public final class x6 extends x51 {
    public static final int f21858a = 0;

    static {
        x51.setup(new x51());
    }

    @Override
    public final void bindView(View view, y51 y51Var, boolean z10, m61 m61Var, u61 u61Var) {
        Object obj = y51Var.G;
        if (obj instanceof i11) {
            i11 i11Var = (i11) obj;
            ((z6) view).b(y51Var.f30518l, i11Var.d, i11Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((z6) view).a(y51Var.f30518l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new z6(context);
    }
}
