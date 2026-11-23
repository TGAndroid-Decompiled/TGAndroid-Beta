package org.telegram.ui.Components;

import android.content.Context;
import android.widget.FrameLayout;
public final class zi extends FragmentContextView {
    public final FrameLayout Y0;
    public final dj Z0;

    public zi(dj djVar, Context context, org.telegram.ui.ActionBar.g2 g2Var, FrameLayout frameLayout, org.telegram.ui.ActionBar.i6 i6Var, FrameLayout frameLayout2) {
        super(context, g2Var, frameLayout, false, i6Var);
        this.Z0 = djVar;
        this.Y0 = frameLayout2;
    }

    @Override
    public final void setVisibility(int i7) {
        boolean z10;
        bs bsVar = this.Z0.f34369y;
        if (i7 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        bsVar.j(this.Y0, z10, true);
    }
}
