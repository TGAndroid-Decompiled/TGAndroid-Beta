package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.j30;
public final class h0 extends UndoView {
    public final j30 f31477f0;

    public h0(j30 j30Var, Context context) {
        super(context);
        this.f31477f0 = j30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31477f0.invalidate();
    }
}
