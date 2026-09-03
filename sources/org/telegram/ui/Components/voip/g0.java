package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.x30;
public final class g0 extends UndoView {
    public final x30 f29607c0;

    public g0(x30 x30Var, Context context) {
        super(context);
        this.f29607c0 = x30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f29607c0.invalidate();
    }
}
