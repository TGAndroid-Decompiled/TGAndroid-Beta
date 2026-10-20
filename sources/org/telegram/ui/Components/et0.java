package org.telegram.ui.Components;

import android.content.Context;
public final class et0 extends tx0 {
    public final uv0 K;

    public et0(uv0 uv0Var, Context context, b10 b10Var) {
        super(context, b10Var, 1, null);
        this.K = uv0Var;
    }

    @Override
    public final void a() {
        invalidate();
        this.K.G0();
    }
}
