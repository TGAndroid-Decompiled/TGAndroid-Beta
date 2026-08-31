package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;
public final class w0 extends RadioButton {
    public final x0 f24343x;

    public w0(x0 x0Var, Context context) {
        super(context);
        this.f24343x = x0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f24343x.invalidate();
    }
}
