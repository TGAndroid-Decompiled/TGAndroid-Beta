package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.r01;
public final class u6 extends i51 {
    public static final int f24211a = 0;

    static {
        i51.setup(new i51());
    }

    @Override
    public final void bindView(View view, j51 j51Var, boolean z4, x51 x51Var, i61 i61Var) {
        Object obj = j51Var.G;
        if (obj instanceof r01) {
            r01 r01Var = (r01) obj;
            ((w6) view).b(j51Var.f28014l, r01Var.d, r01Var.f40740e, z4);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((w6) view).a(j51Var.f28014l, ((MessagesController.FaqSearchResult) obj).path, true, z4);
        }
    }

    @Override
    public final View createView(Context context, tl0 tl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new w6(context);
    }
}
