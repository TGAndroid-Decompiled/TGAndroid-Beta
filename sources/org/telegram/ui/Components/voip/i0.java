package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.x30;
public final class i0 extends UndoView {
    public final x30 f28961f0;

    public i0(x30 x30Var, Context context) {
        super(context);
        this.f28961f0 = x30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f28961f0.invalidate();
    }
}
