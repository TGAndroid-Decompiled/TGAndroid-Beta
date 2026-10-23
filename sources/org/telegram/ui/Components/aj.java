package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class aj extends FragmentContextView {
    public final FrameLayout X0;
    public final fj Y0;

    public aj(fj fjVar, Context context, org.telegram.ui.ActionBar.o2 o2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.g6 g6Var, FrameLayout frameLayout2) {
        super(context, o2Var, frameLayout, false, g6Var);
        this.Y0 = fjVar;
        this.X0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i10) {
        boolean z10;
        us usVar = this.Y0.f26359x;
        if (i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        usVar.i(this.X0, z10, true);
    }
}
