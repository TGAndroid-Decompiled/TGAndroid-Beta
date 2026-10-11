package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.d71;
import org.telegram.ui.Components.l71;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.q61;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.g11;
public final class w6 extends p61 {
    public static final int f23701a = 0;

    static {
        p61.setup(new p61());
    }

    @Override
    public final void bindView(View view, q61 q61Var, boolean z10, d71 d71Var, l71 l71Var) {
        Object obj = q61Var.G;
        if (obj instanceof g11) {
            g11 g11Var = (g11) obj;
            ((y6) view).b(q61Var.f30167l, g11Var.d, g11Var.f37880e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((y6) view).a(q61Var.f30167l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, rm0 rm0Var, int i10, int i11, org.telegram.ui.ActionBar.d6 d6Var) {
        return new y6(context);
    }
}
