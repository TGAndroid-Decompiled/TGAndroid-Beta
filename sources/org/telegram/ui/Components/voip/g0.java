package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.v30;
public final class g0 extends UndoView {
    public final v30 f29635c0;

    public g0(v30 v30Var, Context context) {
        super(context);
        this.f29635c0 = v30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f29635c0.invalidate();
    }
}
