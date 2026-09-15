package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class sa extends za {
    public final LinearLayout X;
    public FrameLayout Y;
    public ci.d Z;

    public sa(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, e6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        return new gg.n0(this, 1);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
