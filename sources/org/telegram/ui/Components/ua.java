package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class ua extends bb {
    public final LinearLayout X;
    public FrameLayout Y;
    public ei.d Z;

    public ua(Context context, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, null, false, false, d6Var);
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
        this.e.setTitle(charSequence);
    }

    @Override
    public final hm0 x(im0 im0Var) {
        return new ai.l5(this, 2);
    }
}
