package org.telegram.ui.Components;

import android.content.Context;
public final class os0 extends ClippingImageView {
    public final vl0 R;

    public os0(Context context, zt0 zt0Var) {
        super(context);
        this.R = zt0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
