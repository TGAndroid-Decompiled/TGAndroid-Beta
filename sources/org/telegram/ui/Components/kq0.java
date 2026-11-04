package org.telegram.ui.Components;

import android.content.Context;
public final class kq0 extends ClippingImageView {
    public final tj0 S;

    public kq0(Context context, qr0 qr0Var) {
        super(context);
        this.S = qr0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.S.invalidate();
    }
}
