package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class rt0 extends org.telegram.ui.zn {
    public final lv0 f28091f;

    public rt0(lv0 lv0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f28091f = lv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f28091f.f26193n0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
    }
}
