package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class da extends EditTextBoldCursor {
    public final int f34925b;
    public final ea f34926c;

    public da(ea eaVar, Context context, int i10) {
        super(context);
        this.f34925b = i10;
        this.f34926c = eaVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        switch (this.f34925b) {
            case 0:
                return this.f34926c.d;
            default:
                return this.f34926c.d;
        }
    }
}
