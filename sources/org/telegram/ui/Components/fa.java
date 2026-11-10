package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class fa extends ma {
    public final LinearLayout S1;
    public FrameLayout T1;
    public fi.d U1;

    public fa(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, false, false, h6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.S1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final oj0 L0(pj0 pj0Var) {
        return new bi.k5(this, 2);
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f35902o1.setTitle(charSequence);
    }
}
