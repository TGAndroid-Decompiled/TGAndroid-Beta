package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.g30;
public final class g0 extends UndoView {
    public final g30 f33516b0;

    public g0(g30 g30Var, Context context) {
        super(context);
        this.f33516b0 = g30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f33516b0.invalidate();
    }
}
