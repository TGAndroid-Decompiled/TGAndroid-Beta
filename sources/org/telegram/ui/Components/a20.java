package org.telegram.ui.Components;

import android.content.Context;
public final class a20 extends p40 {
    public final FragmentContextView I;

    public a20(FragmentContextView fragmentContextView, Context context) {
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
