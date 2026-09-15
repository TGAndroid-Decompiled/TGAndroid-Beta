package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.a40;
public final class i0 extends UndoView {
    public final a40 f28990f0;

    public i0(a40 a40Var, Context context) {
        super(context);
        this.f28990f0 = a40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f28990f0.invalidate();
    }
}
