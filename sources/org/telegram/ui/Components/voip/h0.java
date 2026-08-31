package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.w30;
public final class h0 extends UndoView {
    public final w30 f32065c0;

    public h0(w30 w30Var, Context context) {
        super(context);
        this.f32065c0 = w30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f32065c0.invalidate();
    }
}
