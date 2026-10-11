package org.telegram.ui.Components;

import android.content.Context;
public final class kt0 extends ClippingImageView {
    public final sm0 R;

    public kt0(Context context, vu0 vu0Var) {
        super(context);
        this.R = vu0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
