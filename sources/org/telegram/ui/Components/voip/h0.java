package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.k30;
public final class h0 extends UndoView {
    public final k30 f31593j0;

    public h0(k30 k30Var, Context context) {
        super(context);
        this.f31593j0 = k30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31593j0.invalidate();
    }
}
