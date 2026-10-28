package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.o30;
public final class h0 extends UndoView {
    public final o30 f33935j0;

    public h0(o30 o30Var, Context context) {
        super(context);
        this.f33935j0 = o30Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f33935j0.invalidate();
    }
}
