package org.telegram.ui.Components;

import android.content.Context;
public final class lr0 extends ClippingImageView {
    public final wk0 N;

    public lr0(Context context, ws0 ws0Var) {
        super(context);
        this.N = ws0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.N.invalidate();
    }
}
