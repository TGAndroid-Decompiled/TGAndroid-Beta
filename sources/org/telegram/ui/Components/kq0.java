package org.telegram.ui.Components;

import android.content.Context;
public final class kq0 extends ClippingImageView {
    public final pj0 R;

    public kq0(Context context, rr0 rr0Var) {
        super(context);
        this.R = rr0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
