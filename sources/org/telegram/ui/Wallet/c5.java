package org.telegram.ui.Wallet;

import android.content.Context;
import android.view.View;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.r71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.t61;
public final class c5 extends s61 {
    public static final int f36428a = 0;

    static {
        s61.setup(new s61());
    }

    @Override
    public final void bindView(View view, t61 t61Var, boolean z10, j71 j71Var, r71 r71Var) {
        ((d5) view).a(t61Var.f32875l, t61Var.f32876m, t61Var.f32874k);
    }

    @Override
    public final View createView(Context context, mm0 mm0Var, int i10, int i11, org.telegram.ui.ActionBar.u6 u6Var) {
        return new d5(context, u6Var);
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
