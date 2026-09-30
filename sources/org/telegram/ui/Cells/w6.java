package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.yl0;
import org.telegram.ui.z01;
public final class w6 extends w51 {
    public static final int f21803a = 0;

    static {
        w51.setup(new w51());
    }

    @Override
    public final void bindView(View view, x51 x51Var, boolean z10, l61 l61Var, t61 t61Var) {
        Object obj = x51Var.G;
        if (obj instanceof z01) {
            z01 z01Var = (z01) obj;
            ((y6) view).b(x51Var.f30278l, z01Var.d, z01Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((y6) view).a(x51Var.f30278l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, yl0 yl0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y6(context);
    }
}
