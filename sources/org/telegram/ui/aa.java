package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class aa extends EditTextBoldCursor {
    public final int f34753b;
    public final ba f34754c;

    public aa(ba baVar, Context context, int i10) {
        super(context);
        this.f34753b = i10;
        this.f34754c = baVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.d6 getResourcesProvider() {
        switch (this.f34753b) {
            case 0:
                return this.f34754c.d;
            default:
                return this.f34754c.d;
        }
    }
}
