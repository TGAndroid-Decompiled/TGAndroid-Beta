package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class dc0 extends org.telegram.ui.Components.uv0 {
    public final nc0 f36334f2;

    public dc0(nc0 nc0Var, Context context, org.telegram.ui.Components.mv0 mv0Var, nc0 nc0Var2, cc0 cc0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, mv0Var, 0, null, null, null, 8, 0, nc0Var2, cc0Var, 0, d6Var, null);
        this.f36334f2 = nc0Var;
    }

    @Override
    public final int D0() {
        return 32;
    }

    @Override
    public final boolean N() {
        return true;
    }

    @Override
    public final int U0() {
        return 3;
    }

    @Override
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f36334f2.M0;
    }
}
