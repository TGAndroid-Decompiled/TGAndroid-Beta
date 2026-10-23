package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.k30;
public final class h0 extends UndoView {
    public final k30 f31623j0;

    public h0(k30 k30Var, Context context) {
        super(context);
        this.f31623j0 = k30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31623j0.invalidate();
    }
}
