package org.telegram.ui.Components;

import android.content.Context;
public final class es0 extends ClippingImageView {
    public final sl0 O;

    public es0(Context context, pt0 pt0Var) {
        super(context);
        this.O = pt0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.O.invalidate();
    }
}
