package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
public abstract class ca extends ja {
    public final LinearLayout T1;
    public FrameLayout U1;
    public hi.d V1;

    public ca(Context context, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, null, false, false, e6Var);
        LinearLayout linearLayout = new LinearLayout(context);
        this.T1 = linearLayout;
        linearLayout.setOrientation(1);
    }

    @Override
    public final tj0 L0(uj0 uj0Var) {
        return new di.i4(this, 2);
    }

    @Override
    public final CharSequence O0() {
        return null;
    }

    @Override
    public final void setTitle(CharSequence charSequence) {
        this.f35932p1.setTitle(charSequence);
    }
}
