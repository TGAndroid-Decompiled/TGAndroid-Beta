package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class rt0 extends org.telegram.ui.bo {
    public final lv0 f28052f;

    public rt0(lv0 lv0Var, Context context, org.telegram.ui.ActionBar.d5 d5Var, Bundle bundle) {
        super(context, d5Var, bundle);
        this.f28052f = lv0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.v0 v0Var = this.f28052f.f26215n0;
        if (v0Var != null) {
            v0Var.setShowSearchProgress(z10);
        }
    }
}
