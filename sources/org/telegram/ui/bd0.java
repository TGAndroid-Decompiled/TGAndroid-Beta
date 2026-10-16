package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class bd0 extends org.telegram.ui.Components.xv0 {
    public final ld0 f34298f2;

    public bd0(ld0 ld0Var, Context context, org.telegram.ui.Components.pv0 pv0Var, ld0 ld0Var2, ad0 ad0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0L, pv0Var, 0, null, null, null, 8, 0, ld0Var2, ad0Var, 0, c6Var, null);
        this.f34298f2 = ld0Var;
    }

    @Override
    public final int C0() {
        return 32;
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final int T0() {
        return 3;
    }

    @Override
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f34298f2.M0;
    }
}
