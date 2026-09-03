package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.w01;
public final class t6 extends h51 {
    public static final int f22336a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        Object obj = i51Var.G;
        if (obj instanceof w01) {
            w01 w01Var = (w01) obj;
            ((v6) view).b(i51Var.f25585l, w01Var.d, w01Var.e, z4);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((v6) view).a(i51Var.f25585l, ((MessagesController.FaqSearchResult) obj).path, true, z4);
        }
    }

    @Override
    public final View createView(Context context, rl0 rl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new v6(context);
    }
}
