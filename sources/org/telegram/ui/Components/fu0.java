package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class fu0 extends org.telegram.ui.wn {
    public final aw0 f28317f;

    public fu0(aw0 aw0Var, Context context, org.telegram.ui.ActionBar.j5 j5Var, Bundle bundle) {
        super(context, j5Var, bundle);
        this.f28317f = aw0Var;
    }

    @Override
    public final void b(boolean z10) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f28317f.f26683p0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z10);
        }
    }
}
