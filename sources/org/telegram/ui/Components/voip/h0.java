package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.m30;
public final class h0 extends UndoView {
    public final m30 f33830j0;

    public h0(m30 m30Var, Context context) {
        super(context);
        this.f33830j0 = m30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f33830j0.invalidate();
    }
}
