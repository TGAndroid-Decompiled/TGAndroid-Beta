package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class fa extends ma {
    public final LinearLayout Q1;
    public FrameLayout R1;
    public gi.d S1;

    public fa(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, e6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.Q1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final sj0 L0(tj0 tj0Var) {
        return new ci.r4(this, 2);
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.m1.setTitle(charSequence);
    }
}
