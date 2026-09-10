package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.b40;
public final class i0 extends UndoView {
    public final b40 f28166f0;

    public i0(b40 b40Var, Context context) {
        super(context);
        this.f28166f0 = b40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f28166f0.invalidate();
    }
}
