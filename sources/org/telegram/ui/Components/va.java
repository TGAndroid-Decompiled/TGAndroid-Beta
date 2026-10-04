package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class va extends cb {
    public final LinearLayout X;
    public FrameLayout Y;
    public ci.d Z;

    public va(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, d6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f25307e.setTitle(charSequence);
    }

    @Override
    public final yl0 v(zl0 zl0Var) {
        return new gg.n0(this, 1);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
