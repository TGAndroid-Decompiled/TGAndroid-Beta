package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;
public final class x0 extends RadioButton {
    public final y0 f23515x;

    public x0(y0 y0Var, Context context) {
        super(context);
        this.f23515x = y0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f23515x.invalidate();
    }
}
