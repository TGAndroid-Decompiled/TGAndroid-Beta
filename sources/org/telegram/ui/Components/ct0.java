package org.telegram.ui.Components;

import android.content.Context;
public final class ct0 extends rx0 {
    public final sv0 K;

    public ct0(sv0 sv0Var, Context context, b10 b10Var) {
        super(context, b10Var, 1, null);
        this.K = sv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.G0();
    }
}
