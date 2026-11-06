package org.telegram.ui.Components;

import android.content.Context;
import android.os.Bundle;
public final class er0 extends org.telegram.ui.cn {
    public final xs0 f33315f;

    public er0(xs0 xs0Var, Context context, org.telegram.ui.ActionBar.q4 q4Var, Bundle bundle) {
        super(context, q4Var, bundle);
        this.f33315f = xs0Var;
    }

    @Override
    public final void b(boolean z9) {
        org.telegram.ui.ActionBar.r0 r0Var = this.f33315f.f40400p0;
        if (r0Var != null) {
            r0Var.setShowSearchProgress(z9);
        }
    }
}
