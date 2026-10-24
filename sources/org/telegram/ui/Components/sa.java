package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class sa extends za {
    public final LinearLayout X;
    public FrameLayout Y;
    public ei.d Z;

    public sa(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, g6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        return new ai.m5(this, 2);
    }

    @Override
    public final CharSequence z() {
        return null;
    }
}
