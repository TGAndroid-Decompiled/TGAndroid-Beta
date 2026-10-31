package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class qb0 extends org.telegram.ui.Components.zt0 {
    public final yb0 f40948w2;

    public qb0(yb0 yb0Var, Context context, org.telegram.ui.Components.rt0 rt0Var, yb0 yb0Var2, pb0 pb0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, 0L, rt0Var, 0, null, null, null, 8, 0, yb0Var2, pb0Var, 0, p6Var, null);
        this.f40948w2 = yb0Var;
    }

    @Override
    public final int K0() {
        return 32;
    }

    @Override
    public final boolean W() {
        return true;
    }

    @Override
    public final int Z0() {
        return 3;
    }

    @Override
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f40948w2.U0;
    }
}
