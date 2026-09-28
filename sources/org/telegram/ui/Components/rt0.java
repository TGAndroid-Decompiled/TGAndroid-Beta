package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class rt0 extends org.telegram.ui.yn {
    public final lv0 f28053f;

    public rt0(lv0 lv0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f28053f = lv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.u0 u0Var = this.f28053f.f26140n0;
        if (u0Var != null) {
            u0Var.setShowSearchProgress(z10);
        }
    }
}
