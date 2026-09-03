package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class dt0 extends org.telegram.ui.bo {
    public final yu0 f24385f;

    public dt0(yu0 yu0Var, Context context, org.telegram.ui.ActionBar.e5 e5Var, Bundle bundle) {
        super(context, e5Var, bundle);
        this.f24385f = yu0Var;
    }

    @Override
    public final void b(boolean z4) {
        org.telegram.ui.ActionBar.w0 w0Var = this.f24385f.f31137k0;
        if (w0Var != null) {
            w0Var.setShowSearchProgress(z4);
        }
    }
}
