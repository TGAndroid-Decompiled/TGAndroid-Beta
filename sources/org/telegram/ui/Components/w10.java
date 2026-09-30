package org.telegram.ui.Components;

import android.content.Context;
public final class w10 extends l40 {
    public final FragmentContextView I;

    public w10(FragmentContextView fragmentContextView, Context context) {
        super(6, context, null, true);
        this.I = fragmentContextView;
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0) {
            try {
                this.I.B0.removeView(this);
            } catch (Exception unused) {
            }
        }
    }
}
