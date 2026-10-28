package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class hc0 extends org.telegram.ui.Components.bw0 {
    public final rc0 f39851r2;

    public hc0(rc0 rc0Var, Context context, org.telegram.ui.Components.tv0 tv0Var, rc0 rc0Var2, gc0 gc0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 0L, tv0Var, 0, null, null, null, 8, 0, rc0Var2, gc0Var, 0, u6Var, null);
        this.f39851r2 = rc0Var;
    }

    @Override
    public final int J0() {
        return 32;
    }

    @Override
    public final boolean V() {
        return true;
    }

    @Override
    public final int Y0() {
        return 3;
    }

    @Override
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f39851r2.L0;
    }
}
