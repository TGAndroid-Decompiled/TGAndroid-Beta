package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class hc0 extends org.telegram.ui.Components.qu0 {
    public final rc0 f38848b2;

    public hc0(rc0 rc0Var, Context context, org.telegram.ui.Components.iu0 iu0Var, rc0 rc0Var2, gc0 gc0Var, org.telegram.ui.ActionBar.c6 c6Var) {
        super(context, 0L, iu0Var, 0, null, null, null, 8, 0, rc0Var2, gc0Var, 0, c6Var, null);
        this.f38848b2 = rc0Var;
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
        return this.f38848b2.I0;
    }
}
