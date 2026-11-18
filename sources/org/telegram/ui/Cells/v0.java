package org.telegram.ui.Cells;

import android.content.Context;
import org.telegram.ui.Components.RadioButton;
public final class v0 extends RadioButton {
    public final w0 f32150y;

    public v0(w0 w0Var, Context context) {
        super(context);
        this.f32150y = w0Var;
    }

    @Override
    public final void invalidate() {
        super.invalidate();
        this.f32150y.invalidate();
    }
}
