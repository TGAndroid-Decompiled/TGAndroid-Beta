package org.telegram.ui.Components;

import android.content.Context;
public final class at0 extends ClippingImageView {
    public final im0 R;

    public at0(Context context, lu0 lu0Var) {
        super(context);
        this.R = lu0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
