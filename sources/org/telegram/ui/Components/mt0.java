package org.telegram.ui.Components;

import android.content.Context;
public final class mt0 extends ClippingImageView {
    public final nm0 R;

    public mt0(Context context, tu0 tu0Var) {
        super(context);
        this.R = tu0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
