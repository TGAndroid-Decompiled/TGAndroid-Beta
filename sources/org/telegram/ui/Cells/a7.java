package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
import org.telegram.ui.t01;
public final class a7 extends s61 {
    public static final int f23860a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        Object obj = t61Var.G;
        if (obj instanceof t01) {
            t01 t01Var = (t01) obj;
            ((c7) view).b(t61Var.f32875l, t01Var.d, t01Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((c7) view).a(t61Var.f32875l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new c7(context);
    }
}
