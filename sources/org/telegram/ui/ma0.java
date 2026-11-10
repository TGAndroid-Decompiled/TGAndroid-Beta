package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class ma0 extends org.telegram.ui.Components.ys0 {
    public final sa0 f47871w2;

    public ma0(sa0 sa0Var, Context context, org.telegram.ui.Components.qs0 qs0Var, sa0 sa0Var2, la0 la0Var, org.telegram.ui.ActionBar.h6 h6Var) {
        super(context, 0L, qs0Var, 0, null, null, null, 8, 0, sa0Var2, la0Var, 0, h6Var, null);
        this.f47871w2 = sa0Var;
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
        return this.f47871w2.N0;
    }
}
