package org.telegram.ui;

import android.content.Context;
import org.telegram.tgnet.tl.TL_stories;
public final class ad0 extends org.telegram.ui.Components.zu0 {
    public final kd0 f31837f2;

    public ad0(kd0 kd0Var, Context context, org.telegram.ui.Components.ru0 ru0Var, kd0 kd0Var2, zc0 zc0Var, org.telegram.ui.ActionBar.f6 f6Var) {
        super(context, 0L, ru0Var, 0, null, null, null, 8, 0, kd0Var2, zc0Var, 0, f6Var, null);
        this.f31837f2 = kd0Var;
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
        return this.f31837f2.M0;
    }
}
