package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class ua extends bb {
    public final LinearLayout X;
    public FrameLayout Y;
    public fi.d Z;

    public ua(Context context, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, null, false, false, u6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.X = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override
    public final lm0 v(mm0 mm0Var) {
        return new bi.h5(this, 2);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
