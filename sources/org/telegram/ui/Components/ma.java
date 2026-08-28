package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class ma extends sa {
    public final LinearLayout T;
    public FrameLayout U;
    public kh.d V;

    public ma(Context context, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, null, false, false, false, 1, b6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f32408e.setTitle(charSequence);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        return new gh.t3(this, 2);
    }

    @Override
    public final CharSequence y() {
        return null;
    }
}
