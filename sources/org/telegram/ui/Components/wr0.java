package org.telegram.ui.Components;

import android.content.Context;
public final class wr0 extends ClippingImageView {
    public final jl0 N;

    public wr0(Context context, ht0 ht0Var) {
        super(context);
        this.N = ht0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.N.invalidate();
    }
}
