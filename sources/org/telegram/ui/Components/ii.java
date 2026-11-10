package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class ii extends FragmentContextView {
    public final FrameLayout X0;
    public final mi Y0;

    public ii(mi miVar, Context context, org.telegram.ui.ActionBar.f2 f2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, FrameLayout frameLayout2) {
        super(context, f2Var, frameLayout, false, h6Var);
        this.Y0 = miVar;
        this.X0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z9;
        or orVar = this.Y0.f35978y;
        if (i7 == 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        orVar.i(this.X0, z9, true);
    }
}
