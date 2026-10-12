package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.k61;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.z61;
public final class q4 extends k61 {
    public static final int f33623a = 0;

    static {
        k61.setup(new k61());
    }

    @Override
    public final void bindView(View view, l61 l61Var, boolean z10, z61 z61Var, h71 h71Var) {
        ((r4) view).a(l61Var.f26954l, l61Var.f26955m, l61Var.f26953k);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new r4(context, c6Var);
    }

    @Override
    public final boolean isClickable() {
        return false;
    }

    @Override
    public final boolean isShadow() {
        return true;
    }
}
