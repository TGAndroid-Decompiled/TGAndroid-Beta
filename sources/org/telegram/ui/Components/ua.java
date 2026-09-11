package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class ua extends bb {
    public final LinearLayout X;
    public FrameLayout Y;
    public di.d Z;

    public ua(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, f6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f24647e.setTitle(charSequence);
    }

    @Override
    public final kl0 v(ll0 ll0Var) {
        return new hg.n0(this, 1);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
