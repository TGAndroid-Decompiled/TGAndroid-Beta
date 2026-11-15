package org.telegram.ui.Components;

import android.content.Context;
public final class mq0 extends ClippingImageView {
    public final uj0 S;

    public mq0(Context context, sr0 sr0Var) {
        super(context);
        this.S = sr0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}
