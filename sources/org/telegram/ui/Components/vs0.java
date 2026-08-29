package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class vs0 extends org.telegram.ui.vn {
    public final qu0 f34178f;

    public vs0(qu0 qu0Var, Context context, org.telegram.ui.ActionBar.b5 b5Var, Bundle bundle) {
        super(context, b5Var, bundle);
        this.f34178f = qu0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f34178f.f32076j0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
    }
}
