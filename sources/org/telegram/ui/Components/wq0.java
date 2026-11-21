package org.telegram.ui.Components;

import android.content.Context;
public final class wq0 extends ClippingImageView {
    public final ek0 S;

    public wq0(Context context, cs0 cs0Var) {
        super(context);
        this.S = cs0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}
