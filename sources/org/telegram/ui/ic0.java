package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class ic0 extends org.telegram.ui.Components.xv0 {
    public final sc0 f38142i2;

    public ic0(sc0 sc0Var, Context context, org.telegram.ui.Components.pv0 pv0Var, sc0 sc0Var2, hc0 hc0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, pv0Var, 0, null, null, null, 8, 0, sc0Var2, hc0Var, 0, g6Var, null);
        this.f38142i2 = sc0Var;
    }

    @Override
    public final int E0() {
        return 32;
    }

    @Override
    public final boolean O() {
        return true;
    }

    @Override
    public final int V0() {
        return 3;
    }

    @Override
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f38142i2.M0;
    }
}
