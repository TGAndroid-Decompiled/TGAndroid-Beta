package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;

public abstract class ka extends qa {
    public final LinearLayout T;
    public FrameLayout U;
    public lh.d V;

    public ka(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, false, 1, c6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f31853e.setTitle(charSequence);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        return new ag.i(this, 2);
    }

    @Override
    public final CharSequence z() {
        return null;
    }
}
