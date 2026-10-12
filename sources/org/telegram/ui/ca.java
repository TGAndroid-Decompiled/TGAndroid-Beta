package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ca extends EditTextBoldCursor {
    public final int f36377b;
    public final da f36378c;

    public ca(da daVar, Context context, int i10) {
        super(context);
        this.f36377b = i10;
        this.f36378c = daVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        switch (this.f36377b) {
            case 0:
                return this.f36378c.d;
            default:
                return this.f36378c.d;
        }
    }
}
