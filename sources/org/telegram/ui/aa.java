package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class aa extends EditTextBoldCursor {
    public final int f34813b;
    public final ba f34814c;

    public aa(ba baVar, Context context, int i10) {
        super(context);
        this.f34813b = i10;
        this.f34814c = baVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        switch (this.f34813b) {
            case 0:
                return this.f34814c.d;
            default:
                return this.f34814c.d;
        }
    }
}
