package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class fc0 extends org.telegram.ui.Components.aw0 {
    public final pc0 f39338r2;

    public fc0(pc0 pc0Var, Context context, org.telegram.ui.Components.sv0 sv0Var, pc0 pc0Var2, ec0 ec0Var, org.telegram.ui.ActionBar.u6 u6Var) {
        super(context, 0L, sv0Var, 0, null, null, null, 8, 0, pc0Var2, ec0Var, 0, u6Var, null);
        this.f39338r2 = pc0Var;
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
        return this.f39338r2.L0;
    }
}
