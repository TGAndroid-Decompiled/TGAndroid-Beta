package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class aa extends EditTextBoldCursor {
    public final int f34747b;
    public final ba f34748c;

    public aa(ba baVar, Context context, int i10) {
        super(context);
        this.f34747b = i10;
        this.f34748c = baVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        switch (this.f34747b) {
            case 0:
                return this.f34748c.d;
            default:
                return this.f34748c.d;
        }
    }
}
