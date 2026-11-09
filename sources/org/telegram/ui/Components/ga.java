package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class ga extends na {
    public final LinearLayout P1;
    public FrameLayout Q1;
    public fi.d R1;

    public ga(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, g6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.P1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final pj0 L0(qj0 qj0Var) {
        return new bi.k5(this, 2);
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.l1.setTitle(charSequence);
    }
}
