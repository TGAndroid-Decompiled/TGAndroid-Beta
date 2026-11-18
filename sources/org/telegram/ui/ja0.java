package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class ja0 extends org.telegram.ui.Components.gt0 {
    public final pa0 f48933x2;

    public ja0(pa0 pa0Var, Context context, org.telegram.ui.Components.ys0 ys0Var, pa0 pa0Var2, ia0 ia0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, 0L, ys0Var, 0, null, null, null, 8, 0, pa0Var2, ia0Var, 0, i6Var, null);
        this.f48933x2 = pa0Var;
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
        return this.f48933x2.T0;
    }
}
