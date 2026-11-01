package org.telegram.ui.Components;

import android.content.Context;
public final class mr0 extends ClippingImageView {
    public final uk0 R;

    public mr0(Context context, ss0 ss0Var) {
        super(context);
        this.R = ss0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
