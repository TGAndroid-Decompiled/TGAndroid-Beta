package org.telegram.ui.Components;

import android.content.Context;
public final class et0 extends ClippingImageView {
    public final mm0 R;

    public et0(Context context, pu0 pu0Var) {
        super(context);
        this.R = pu0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
