package org.telegram.ui.Components;

import android.content.Context;
public final class bt0 extends ClippingImageView {
    public final jm0 R;

    public bt0(Context context, mu0 mu0Var) {
        super(context);
        this.R = mu0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
