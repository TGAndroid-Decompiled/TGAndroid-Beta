package org.telegram.ui.Components;

import android.content.Context;
public final class ss0 extends ClippingImageView {
    public final yl0 R;

    public ss0(Context context, du0 du0Var) {
        super(context);
        this.R = du0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
