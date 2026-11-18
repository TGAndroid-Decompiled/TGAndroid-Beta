package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class ka extends sa {
    public final LinearLayout T1;
    public FrameLayout U1;
    public hi.d V1;

    public ka(Context context, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, null, false, false, i6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final bk0 M0(ck0 ck0Var) {
        return new di.l4(this, 2);
    }

    @Override
    public final CharSequence P0() {
        return null;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f39535p1.setTitle(charSequence);
    }
}
