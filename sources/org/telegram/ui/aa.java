package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class aa extends EditTextBoldCursor {
    public final int f34748b;
    public final ba f34749c;

    public aa(ba baVar, Context context, int i10) {
        super(context);
        this.f34748b = i10;
        this.f34749c = baVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        switch (this.f34748b) {
            case 0:
                return this.f34749c.d;
            default:
                return this.f34749c.d;
        }
    }
}
