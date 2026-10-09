package org.telegram.ui.Components;

import android.content.Context;
public final class it0 extends ClippingImageView {
    public final qm0 R;

    public it0(Context context, tu0 tu0Var) {
        super(context);
        this.R = tu0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
