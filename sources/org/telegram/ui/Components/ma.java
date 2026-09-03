package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class ma extends sa {
    public final LinearLayout U;
    public FrameLayout V;
    public qh.d W;

    public ma(Context context, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, null, false, false, false, 1, g6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f31015e.setTitle(charSequence);
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        return new fg.g(this, 2);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
