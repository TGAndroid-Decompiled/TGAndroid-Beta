package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class aj extends FragmentContextView {
    public final FrameLayout Y0;
    public final ej Z0;

    public aj(ej ejVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.h6 h6Var, FrameLayout frameLayout2) {
        super(context, g2Var, frameLayout, false, h6Var);
        this.Z0 = ejVar;
        this.Y0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        es esVar = this.Z0.f34819y;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        esVar.j(this.Y0, z10, true);
    }
}
