package org.telegram.ui.Cells;

import android.content.Context;
import android.view.View;
import org.telegram.messenger.MessagesController;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.v51;
import org.telegram.ui.Components.vl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.i11;
public final class x6 extends v51 {
    public static final int f21843a = 0;

    static {
        v51.setup(new v51());
    }

    @Override
    public final void bindView(View view, w51 w51Var, boolean z10, k61 k61Var, s61 s61Var) {
        Object obj = w51Var.G;
        if (obj instanceof i11) {
            i11 i11Var = (i11) obj;
            ((z6) view).b(w51Var.f29948l, i11Var.d, i11Var.e, z10);
        } else if (obj instanceof MessagesController.FaqSearchResult) {
            ((z6) view).a(w51Var.f29948l, ((MessagesController.FaqSearchResult) obj).path, true, z10);
        }
    }

    @Override
    public final View createView(Context context, vl0 vl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        return new z6(context);
    }
}
