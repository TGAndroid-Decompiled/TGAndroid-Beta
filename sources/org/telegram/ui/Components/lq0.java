package org.telegram.ui.Components;

import android.content.Context;
public final class lq0 extends ClippingImageView {
    public final pj0 R;

    public lq0(Context context, sr0 sr0Var) {
        super(context);
        this.R = sr0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
