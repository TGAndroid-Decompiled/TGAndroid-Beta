package org.telegram.ui.Components.voip;

import android.content.Context;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.a40;
public final class h0 extends UndoView {
    public final a40 f31513f0;

    public h0(a40 a40Var, Context context) {
        super(context);
        this.f31513f0 = a40Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f31513f0.invalidate();
    }
}
