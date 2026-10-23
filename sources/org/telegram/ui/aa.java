package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class aa extends EditTextBoldCursor {
    public final int f35631b;
    public final ba f35632c;

    public aa(ba baVar, Context context, int i10) {
        super(context);
        this.f35631b = i10;
        this.f35632c = baVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourcesProvider() {
        switch (this.f35631b) {
            case 0:
                return this.f35632c.d;
            default:
                return this.f35632c.d;
        }
    }
}
