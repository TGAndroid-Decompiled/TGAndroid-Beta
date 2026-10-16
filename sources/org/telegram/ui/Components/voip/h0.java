package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.e40;
public final class h0 extends UndoView {
    public final e40 f29875f0;

    public h0(e40 e40Var, Context context) {
        super(context);
        this.f29875f0 = e40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f29875f0.invalidate();
    }
}
