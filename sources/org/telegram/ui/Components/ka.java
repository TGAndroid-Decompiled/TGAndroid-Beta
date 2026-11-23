package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class ka extends sa {
    public final LinearLayout T1;
    public FrameLayout U1;
    public hi.e V1;

    public ka(Context context, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, null, false, false, h6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final dk0 M0(ek0 ek0Var) {
        return new di.l4(this, 2);
    }

    @Override
    public final CharSequence P0() {
        return null;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f39532p1.setTitle(charSequence);
    }
}
