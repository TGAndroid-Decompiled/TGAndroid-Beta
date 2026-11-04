package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class fa0 extends org.telegram.ui.Components.ws0 {
    public final la0 f45228x2;

    public fa0(la0 la0Var, Context context, org.telegram.ui.Components.os0 os0Var, la0 la0Var2, ea0 ea0Var, org.telegram.ui.ActionBar.e6 e6Var) {
        super(context, 0L, os0Var, 0, null, null, null, 8, 0, la0Var2, ea0Var, 0, e6Var, null);
        this.f45228x2 = la0Var;
    }

    @Override
    public final int N0() {
        return 32;
    }

    @Override
    public final boolean Y() {
        return true;
    }

    @Override
    public final int c1() {
        return 3;
    }

    @Override
    public final TL_stories.MediaArea getStoriesArea() {
        return this.f45228x2.O0;
    }
}
