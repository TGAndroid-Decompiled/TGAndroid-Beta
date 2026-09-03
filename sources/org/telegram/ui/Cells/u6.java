package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.w01;
public final class u6 extends g51 {
    public static final int f24213a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        Object obj = h51Var.G;
        if (obj instanceof w01) {
            w01 w01Var = (w01) obj;
            ((w6) view).b(h51Var.f27375l, w01Var.d, w01Var.f42243e, z4);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((w6) view).a(h51Var.f27375l, ((MessagesController.FaqSearchResult) obj).path, true, z4);
        }
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.g6 g6Var) {
        return new w6(context);
    }
}
