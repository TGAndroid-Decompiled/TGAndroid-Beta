package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.h30;
public final class h0 extends UndoView {
    public final h30 f31442f0;

    public h0(h30 h30Var, Context context) {
        super(context);
        this.f31442f0 = h30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31442f0.invalidate();
    }
}
