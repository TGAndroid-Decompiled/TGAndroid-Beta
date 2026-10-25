package org.telegram.ui.Components;

import android.content.Context;
public final class lt0 extends ClippingImageView {
    public final mm0 R;

    public lt0(Context context, su0 su0Var) {
        super(context);
        this.R = su0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
