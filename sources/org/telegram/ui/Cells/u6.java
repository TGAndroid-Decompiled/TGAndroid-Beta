package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.q01;
public final class u6 extends h51 {
    public static final int f22402a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        Object obj = i51Var.G;
        if (obj instanceof q01) {
            q01 q01Var = (q01) obj;
            ((w6) view).b(i51Var.f25565l, q01Var.d, q01Var.e, z4);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((w6) view).a(i51Var.f25565l, ((MessagesController.FaqSearchResult) obj).path, true, z4);
        }
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new w6(context);
    }
}
