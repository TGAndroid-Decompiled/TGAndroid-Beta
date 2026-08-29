package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class ra extends xa {
    public final LinearLayout T;
    public FrameLayout U;
    public nh.d V;

    public ra(Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, null, false, false, false, 1, c6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f34660e.setTitle(charSequence);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        return new cg.g(this, 2);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
