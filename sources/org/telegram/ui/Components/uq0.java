package org.telegram.ui.Components;

import android.content.Context;
public final class uq0 extends ClippingImageView {
    public final ck0 S;

    public uq0(Context context, as0 as0Var) {
        super(context);
        this.S = as0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}
