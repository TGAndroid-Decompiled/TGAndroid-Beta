package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;
public final class t0 extends RadioButton {
    public final u0 f23065y;

    public t0(u0 u0Var, Context context) {
        super(context);
        this.f23065y = u0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f23065y.invalidate();
    }
}
