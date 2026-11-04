package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ii extends FragmentContextView {
    public final FrameLayout Y0;
    public final ni Z0;

    public ii(ni niVar, Context context, org.telegram.ui.ActionBar.d2 d2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, FrameLayout frameLayout2) {
        super(context, d2Var, frameLayout, false, e6Var);
        this.Z0 = niVar;
        this.Y0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i3) {
        boolean z10;
        pr prVar = this.Z0.f36562y;
        if (i3 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        prVar.i(this.Y0, z10, true);
    }
}
