package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class fc0 extends org.telegram.ui.Components.eu0 {
    public final pc0 f38209b2;

    public fc0(pc0 pc0Var, Context context, org.telegram.ui.Components.wt0 wt0Var, pc0 pc0Var2, ec0 ec0Var, org.telegram.ui.ActionBar.b6 b6Var) {
        super(context, 0L, wt0Var, 0, null, null, null, 8, 0, pc0Var2, ec0Var, 0, b6Var, null);
        this.f38209b2 = pc0Var;
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
        return this.f38209b2.I0;
    }
}
