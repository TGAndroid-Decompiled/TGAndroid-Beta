package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class dj extends FragmentContextView {
    public final FrameLayout Q0;
    public final ij R0;

    public dj(ij ijVar, Context context, org.telegram.ui.ActionBar.m2 m2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.d6 d6Var, FrameLayout frameLayout2) {
        super(context, m2Var, frameLayout, false, d6Var);
        this.R0 = ijVar;
        this.Q0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        ms msVar = this.R0.f25120x;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        msVar.i(this.Q0, z10, true);
    }
}
