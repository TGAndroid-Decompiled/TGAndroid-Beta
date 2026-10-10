package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class xa extends eb {
    public final LinearLayout X;
    public FrameLayout Y;
    public ci.d Z;

    public xa(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, e6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final CharSequence B() {
        return null;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f25983e.setTitle(charSequence);
    }

    @Override
    public final qm0 x(rm0 rm0Var) {
        return new gg.m0(this, 1);
    }
}
