package org.telegram.ui.Components;

import android.content.Context;
public final class lt0 extends ay0 {
    public final bw0 K;

    public lt0(bw0 bw0Var, Context context, j10 j10Var) {
        super(context, j10Var, 1, null);
        this.K = bw0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.E0();
    }
}
