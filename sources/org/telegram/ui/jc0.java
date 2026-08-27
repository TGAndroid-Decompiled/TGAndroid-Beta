package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;

public final class jc0 extends org.telegram.ui.Components.hu0 {

    public final tc0 f39334b2;

    public jc0(tc0 tc0Var, Context context, org.telegram.ui.Components.zt0 zt0Var, tc0 tc0Var2, ic0 ic0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0L, zt0Var, 0, null, null, null, 8, 0, tc0Var2, ic0Var, 0, c6Var, null);
        this.f39334b2 = tc0Var;
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
        return this.f39334b2.I0;
    }
}
