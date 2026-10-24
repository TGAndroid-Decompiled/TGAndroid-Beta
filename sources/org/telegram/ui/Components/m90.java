package org.telegram.ui.Components;

import android.content.Context;
public final class m90 extends ij0 {
    public final p90 f28535s;

    public m90(p90 p90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f28535s = p90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f28535s.E = null;
    }
}
