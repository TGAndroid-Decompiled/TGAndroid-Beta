package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ca extends EditTextBoldCursor {
    public final int f35903b;
    public final da f35904c;

    public ca(da daVar, Context context, int i10) {
        super(context);
        this.f35903b = i10;
        this.f35904c = daVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        switch (this.f35903b) {
            case 0:
                return this.f35904c.d;
            default:
                return this.f35904c.d;
        }
    }
}
