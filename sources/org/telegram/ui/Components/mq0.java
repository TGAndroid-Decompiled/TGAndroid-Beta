package org.telegram.ui.Components;

import android.content.Context;
public final class mq0 extends ClippingImageView {
    public final qj0 R;

    public mq0(Context context, tr0 tr0Var) {
        super(context);
        this.R = tr0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
