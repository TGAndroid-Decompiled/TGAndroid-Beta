package org.telegram.ui.Components;

import android.content.Context;
public final class ws0 extends ClippingImageView {
    public final zl0 R;

    public ws0(Context context, hu0 hu0Var) {
        super(context);
        this.R = hu0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
