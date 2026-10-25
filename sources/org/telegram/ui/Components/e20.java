package org.telegram.ui.Components;

import android.content.Context;
public final class e20 extends t40 {
    public final FragmentContextView I;

    public e20(FragmentContextView fragmentContextView, Context context) {
        super(6, context, null, true);
        this.I = fragmentContextView;
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 0) {
            try {
                this.I.C0.removeView(this);
            } catch (Exception unused) {
            }
        }
    }
}
