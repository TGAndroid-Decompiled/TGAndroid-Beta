package org.telegram.ui.Components;

import android.content.Context;
public final class jt0 extends ClippingImageView {
    public final rm0 R;

    public jt0(Context context, uu0 uu0Var) {
        super(context);
        this.R = uu0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
