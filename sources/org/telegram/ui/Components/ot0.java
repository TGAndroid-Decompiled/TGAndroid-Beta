package org.telegram.ui.Components;

import android.content.Context;
public final class ot0 extends ClippingImageView {
    public final wm0 R;

    public ot0(Context context, zu0 zu0Var) {
        super(context);
        this.R = zu0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.R.invalidate();
    }
}
