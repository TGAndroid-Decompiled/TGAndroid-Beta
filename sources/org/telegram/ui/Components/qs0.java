package org.telegram.ui.Components;

import android.content.Context;
public final class qs0 extends ClippingImageView {
    public final wl0 R;

    public qs0(Context context, bu0 bu0Var) {
        super(context);
        this.R = bu0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
