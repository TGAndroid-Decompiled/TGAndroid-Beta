package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class aa extends EditTextBoldCursor {
    public final int f31766b;
    public final ba f31767c;

    public aa(ba baVar, Context context, int i10) {
        super(context);
        this.f31766b = i10;
        this.f31767c = baVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        switch (this.f31766b) {
            case 0:
                return this.f31767c.d;
            default:
                return this.f31767c.d;
        }
    }
}
