package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class fc0 extends org.telegram.ui.Components.sv0 {
    public final pc0 f36866f2;

    public fc0(pc0 pc0Var, Context context, org.telegram.ui.Components.kv0 kv0Var, pc0 pc0Var2, ec0 ec0Var, org.telegram.ui.ActionBar.d6 d6Var) {
        super(context, 0L, kv0Var, 0, null, null, null, 8, 0, pc0Var2, ec0Var, 0, d6Var, null);
        this.f36866f2 = pc0Var;
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
        return this.f36866f2.M0;
    }
}
