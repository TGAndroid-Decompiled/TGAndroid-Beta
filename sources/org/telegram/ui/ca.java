package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ca extends EditTextBoldCursor {
    public final int f38226b;
    public final da f38227c;

    public ca(da daVar, Context context, int i10) {
        super(context);
        this.f38226b = i10;
        this.f38227c = daVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 getResourcesProvider() {
        switch (this.f38226b) {
            case 0:
                return this.f38227c.d;
            default:
                return this.f38227c.d;
        }
    }
}
