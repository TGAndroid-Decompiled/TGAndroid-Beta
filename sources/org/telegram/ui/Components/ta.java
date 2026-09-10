package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class ta extends ab {
    public final LinearLayout X;
    public FrameLayout Y;
    public bi.d Z;

    public ta(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, f6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override
    public final ul0 v(vl0 vl0Var) {
        return new fg.n0(this, 1);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
