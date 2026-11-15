package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class ja0 extends org.telegram.ui.Components.ys0 {
    public final pa0 f48273x2;

    public ja0(pa0 pa0Var, Context context, org.telegram.ui.Components.qs0 qs0Var, pa0 pa0Var2, ia0 ia0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, qs0Var, 0, null, null, null, 8, 0, pa0Var2, ia0Var, 0, e6Var, null);
        this.f48273x2 = pa0Var;
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
        return this.f48273x2.O0;
    }
}
