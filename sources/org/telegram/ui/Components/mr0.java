package org.telegram.ui.Components;

import android.content.Context;

public final class mr0 extends ClippingImageView {
    public final zk0 N;

    public mr0(Context context, ys0 ys0Var) {
        super(context);
        this.N = ys0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.N.invalidate();
    }
}
