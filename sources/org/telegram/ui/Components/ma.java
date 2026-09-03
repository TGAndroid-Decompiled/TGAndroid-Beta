package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class ma extends sa {
    public final LinearLayout U;
    public FrameLayout V;
    public ph.d W;

    public ma(Context context, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, null, false, false, false, 1, f6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.U = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.e.setTitle(charSequence);
    }

    @Override
    public final ql0 v(rl0 rl0Var) {
        return new eg.g(this, 2);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
