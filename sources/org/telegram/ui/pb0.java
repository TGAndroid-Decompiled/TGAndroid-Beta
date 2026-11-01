package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class pb0 extends org.telegram.ui.Components.au0 {
    public final xb0 f40444w2;

    public pb0(xb0 xb0Var, Context context, org.telegram.ui.Components.st0 st0Var, xb0 xb0Var2, ob0 ob0Var, org.telegram.ui.ActionBar.p6 p6Var) {
        super(context, 0L, st0Var, 0, null, null, null, 8, 0, xb0Var2, ob0Var, 0, p6Var, null);
        this.f40444w2 = xb0Var;
    }

    @Override
    public final int L0() {
        return 32;
    }

    @Override
    public final boolean X() {
        return true;
    }

    @Override
    public final int a1() {
        return 3;
    }

    @Override
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f40444w2.U0;
    }
}
