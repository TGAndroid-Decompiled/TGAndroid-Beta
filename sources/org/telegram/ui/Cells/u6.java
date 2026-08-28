package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.e01;
public final class u6 extends k41 {
    public static final int f25748a = 0;

    static {
        k41.setup(new k41());
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        Object obj = l41Var.G;
        if (obj instanceof e01) {
            e01 e01Var = (e01) obj;
            ((w6) view).b(l41Var.f30339l, e01Var.d, e01Var.f37779e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((w6) view).a(l41Var.f30339l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new w6(context);
    }
}
