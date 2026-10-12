package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;
public final class y0 extends RadioButton {
    public final z0 f22765x;

    public y0(z0 z0Var, Context context) {
        super(context);
        this.f22765x = z0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f22765x.invalidate();
    }
}
