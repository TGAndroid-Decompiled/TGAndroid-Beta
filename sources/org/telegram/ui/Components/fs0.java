package org.telegram.ui.Components;

import android.content.Context;
public final class fs0 extends ClippingImageView {
    public final ll0 R;

    public fs0(Context context, qt0 qt0Var) {
        super(context);
        this.R = qt0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
