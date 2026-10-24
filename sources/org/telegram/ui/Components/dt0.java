package org.telegram.ui.Components;

import android.content.Context;
public final class dt0 extends ClippingImageView {
    public final lm0 R;

    public dt0(Context context, ou0 ou0Var) {
        super(context);
        this.R = ou0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
