package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.b71;
import org.telegram.ui.Components.f61;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.t61;
import org.telegram.ui.l01;
public final class u6 extends f61 {
    public static final int f23595a = 0;

    static {
        f61.setup(new f61());
    }

    @Override
    public final void bindView(View view, g61 g61Var, boolean z10, t61 t61Var, b71 b71Var) {
        Object obj = g61Var.G;
        if (obj instanceof l01) {
            l01 l01Var = (l01) obj;
            ((w6) view).b(g61Var.f26497l, l01Var.d, l01Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((w6) view).a(g61Var.f26497l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, im0 im0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new w6(context);
    }
}
