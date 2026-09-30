package org.telegram.ui.Components;

import android.content.Context;
public final class ts0 extends ClippingImageView {
    public final zl0 R;

    public ts0(Context context, eu0 eu0Var) {
        super(context);
        this.R = eu0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
