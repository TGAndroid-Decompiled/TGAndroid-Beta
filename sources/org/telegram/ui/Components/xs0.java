package org.telegram.ui.Components;

import android.content.Context;
public final class xs0 extends ClippingImageView {
    public final zl0 R;

    public xs0(Context context, iu0 iu0Var) {
        super(context);
        this.R = iu0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
