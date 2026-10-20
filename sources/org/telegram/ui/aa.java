package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class aa extends EditTextBoldCursor {
    public final int f35320b;
    public final ba f35321c;

    public aa(ba baVar, Context context, int i10) {
        super(context);
        this.f35320b = i10;
        this.f35321c = baVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        switch (this.f35320b) {
            case 0:
                return this.f35321c.d;
            default:
                return this.f35321c.d;
        }
    }
}
