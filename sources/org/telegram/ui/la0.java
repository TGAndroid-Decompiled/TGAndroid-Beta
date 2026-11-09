package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class la0 extends org.telegram.ui.Components.zs0 {
    public final ra0 f47549w2;

    public la0(ra0 ra0Var, Context context, org.telegram.ui.Components.rs0 rs0Var, ra0 ra0Var2, ka0 ka0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, rs0Var, 0, null, null, null, 8, 0, ra0Var2, ka0Var, 0, g6Var, null);
        this.f47549w2 = ra0Var;
    }

    @Override
    public final int O0() {
        return 32;
    }

    @Override
    public final boolean Y() {
        return true;
    }

    @Override
    public final int e1() {
        return 3;
    }

    @Override
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f47549w2.N0;
    }
}
