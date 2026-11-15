package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class qi extends FragmentContextView {
    public final FrameLayout Y0;
    public final vi Z0;

    public qi(vi viVar, Context context, org.telegram.ui.ActionBar.e2 e2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.e6 e6Var, FrameLayout frameLayout2) {
        super(context, e2Var, frameLayout, false, e6Var);
        this.Z0 = viVar;
        this.Y0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        vr vrVar = this.Z0.f40445y;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        vrVar.i(this.Y0, z10, true);
    }
}
