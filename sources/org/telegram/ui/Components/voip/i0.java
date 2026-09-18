package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.c40;
public final class i0 extends UndoView {
    public final c40 f28970f0;

    public i0(c40 c40Var, Context context) {
        super(context);
        this.f28970f0 = c40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f28970f0.invalidate();
    }
}
