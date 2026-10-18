package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ca extends EditTextBoldCursor {
    public final int f35857b;
    public final da f35858c;

    public ca(da daVar, Context context, int i10) {
        super(context);
        this.f35857b = i10;
        this.f35858c = daVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        switch (this.f35857b) {
            case 0:
                return this.f35858c.d;
            default:
                return this.f35858c.d;
        }
    }
}
