package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class ka0 extends org.telegram.ui.Components.gt0 {
    public final qa0 f49223x2;

    public ka0(qa0 qa0Var, Context context, org.telegram.ui.Components.ys0 ys0Var, qa0 qa0Var2, ja0 ja0Var, org.telegram.ui.ActionBar.i6 i6Var) {
        super(context, 0L, ys0Var, 0, null, null, null, 8, 0, qa0Var2, ja0Var, 0, i6Var, null);
        this.f49223x2 = qa0Var;
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
        return this.f49223x2.T0;
    }
}
