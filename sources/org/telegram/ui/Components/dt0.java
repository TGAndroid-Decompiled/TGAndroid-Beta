package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class dt0 extends org.telegram.ui.zn {
    public final yu0 f26363f;

    public dt0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.f5 f5Var, Bundle bundle) {
        super(context, f5Var, bundle);
        this.f26363f = yu0Var;
    }

    @Override
    public final void b(boolean z4) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f26363f.f33631k0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z4);
        }
    }
}
