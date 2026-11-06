package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class ja0 extends org.telegram.ui.Components.xs0 {
    public final pa0 f46915w2;

    public ja0(pa0 pa0Var, Context context, org.telegram.ui.Components.ps0 ps0Var, pa0 pa0Var2, ia0 ia0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, ps0Var, 0, null, null, null, 8, 0, pa0Var2, ia0Var, 0, f6Var, null);
        this.f46915w2 = pa0Var;
    }

    @Override
    public final int N0() {
        return 32;
    }

    @Override
    public final boolean Y() {
        return true;
    }

    @Override
    public final int c1() {
        return 3;
    }

    @Override
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f46915w2.N0;
    }
}
