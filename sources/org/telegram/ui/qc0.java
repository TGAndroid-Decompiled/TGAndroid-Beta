package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class qc0 extends org.telegram.ui.Components.yu0 {
    public final ad0 f37722c2;

    public qc0(ad0 ad0Var, Context context, org.telegram.ui.Components.qu0 qu0Var, ad0 ad0Var2, pc0 pc0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, qu0Var, 0, null, null, null, 8, 0, ad0Var2, pc0Var, 0, f6Var, null);
        this.f37722c2 = ad0Var;
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
        return this.f37722c2.J0;
    }
}
