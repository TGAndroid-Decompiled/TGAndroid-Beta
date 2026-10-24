package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class hc0 extends org.telegram.ui.Components.wv0 {
    public final rc0 f37810i2;

    public hc0(rc0 rc0Var, Context context, org.telegram.ui.Components.ov0 ov0Var, rc0 rc0Var2, gc0 gc0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        super(context, 0L, ov0Var, 0, null, null, null, 8, 0, rc0Var2, gc0Var, 0, g6Var, null);
        this.f37810i2 = rc0Var;
    }

    @Override
    public final int E0() {
        return 32;
    }

    @Override
    public final boolean O() {
        return true;
    }

    @Override
    public final int V0() {
        return 3;
    }

    @Override
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f37810i2.L0;
    }
}
