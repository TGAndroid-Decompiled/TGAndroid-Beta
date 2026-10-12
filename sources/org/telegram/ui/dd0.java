package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class dd0 extends org.telegram.ui.Components.xv0 {
    public final nd0 f35233f2;

    public dd0(nd0 nd0Var, Context context, org.telegram.ui.Components.pv0 pv0Var, nd0 nd0Var2, cd0 cd0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0L, pv0Var, 0, null, null, null, 8, 0, nd0Var2, cd0Var, 0, c6Var, null);
        this.f35233f2 = nd0Var;
    }

    @Override
    public final int B0() {
        return 32;
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final int S0() {
        return 3;
    }

    @Override
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f35233f2.M0;
    }
}
