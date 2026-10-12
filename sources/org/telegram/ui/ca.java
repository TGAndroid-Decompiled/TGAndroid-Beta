package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ca extends EditTextBoldCursor {
    public final int f36375b;
    public final da f36376c;

    public ca(da daVar, Context context, int i10) {
        super(context);
        this.f36375b = i10;
        this.f36376c = daVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        switch (this.f36375b) {
            case 0:
                return this.f36376c.d;
            default:
                return this.f36376c.d;
        }
    }
}
