package org.telegram.ui.Components;

import android.content.Context;
public final class zs0 extends ClippingImageView {
    public final im0 R;

    public zs0(Context context, ku0 ku0Var) {
        super(context);
        this.R = ku0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
