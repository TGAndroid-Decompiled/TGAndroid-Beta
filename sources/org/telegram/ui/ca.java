package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ca extends EditTextBoldCursor {
    public final int f38411b;
    public final da f38412c;

    public ca(da daVar, Context context, int i10) {
        super(context);
        this.f38411b = i10;
        this.f38412c = daVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.u6 getResourcesProvider() {
        switch (this.f38411b) {
            case 0:
                return this.f38412c.d;
            default:
                return this.f38412c.d;
        }
    }
}
