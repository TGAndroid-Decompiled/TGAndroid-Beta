package org.telegram.ui.Components;

import android.content.Context;
public final class lr0 extends ClippingImageView {
    public final tk0 R;

    public lr0(Context context, rs0 rs0Var) {
        super(context);
        this.R = rs0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
