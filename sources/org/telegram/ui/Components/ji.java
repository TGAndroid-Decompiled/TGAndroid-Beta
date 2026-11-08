package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ji extends FragmentContextView {
    public final FrameLayout X0;
    public final ni Y0;

    public ji(ni niVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.f6 f6Var, FrameLayout frameLayout2) {
        super(context, f2Var, frameLayout, false, f6Var);
        this.Y0 = niVar;
        this.X0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        pr prVar = this.Y0.f36367y;
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        prVar.i(this.X0, z9, true);
    }
}
