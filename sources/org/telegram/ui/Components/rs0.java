package org.telegram.ui.Components;

import android.content.Context;
public final class rs0 extends ClippingImageView {
    public final xl0 R;

    public rs0(Context context, cu0 cu0Var) {
        super(context);
        this.R = cu0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
