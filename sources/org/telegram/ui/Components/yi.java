package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class yi extends FragmentContextView {
    public final FrameLayout Y0;
    public final cj Z0;

    public yi(cj cjVar, Context context, org.telegram.ui.ActionBar.h2 h2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, FrameLayout frameLayout2) {
        super(context, h2Var, frameLayout, false, i6Var);
        this.Z0 = cjVar;
        this.Y0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        cs csVar = this.Z0.f34034y;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        csVar.j(this.Y0, z10, true);
    }
}
