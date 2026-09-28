package org.telegram.ui.Components;

import android.content.Context;
public final class f90 extends wi0 {
    public final i90 f24160n;

    public f90(i90 i90Var, Context context, String str, String str2, String str3) {
        super(context, str, str2, str3, false);
        this.f24160n = i90Var;
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        this.f24160n.E = null;
    }
}
