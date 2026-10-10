package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.y30;
public final class i0 extends UndoView {
    public final y30 f32046f0;

    public i0(y30 y30Var, Context context) {
        super(context);
        this.f32046f0 = y30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f32046f0.invalidate();
    }
}
