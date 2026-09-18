package org.telegram.ui.Components;

import android.content.Context;
public final class gs0 extends ClippingImageView {
    public final ml0 R;

    public gs0(Context context, rt0 rt0Var) {
        super(context);
        this.R = rt0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
