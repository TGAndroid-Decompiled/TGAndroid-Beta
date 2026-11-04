package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;
public final class u0 extends RadioButton {
    public final v0 f30624y;

    public u0(v0 v0Var, Context context) {
        super(context);
        this.f30624y = v0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f30624y.invalidate();
    }
}
