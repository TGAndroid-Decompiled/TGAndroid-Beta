package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class aa extends EditTextBoldCursor {
    public final int f35325b;
    public final ba f35326c;

    public aa(ba baVar, Context context, int i10) {
        super(context);
        this.f35325b = i10;
        this.f35326c = baVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        switch (this.f35325b) {
            case 0:
                return this.f35326c.d;
            default:
                return this.f35326c.d;
        }
    }
}
