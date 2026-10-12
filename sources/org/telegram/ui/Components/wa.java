package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class wa extends db {
    public final LinearLayout X;
    public FrameLayout Y;
    public ci.d Z;

    public wa(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, c6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final CharSequence A() {
        return null;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f25295e.setTitle(charSequence);
    }

    @Override
    public final vm0 x(wm0 wm0Var) {
        return new gg.m0(this, 1);
    }
}
