package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class aa extends EditTextBoldCursor {
    public final int f31770b;
    public final ba f31771c;

    public aa(ba baVar, Context context, int i10) {
        super(context);
        this.f31770b = i10;
        this.f31771c = baVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        switch (this.f31770b) {
            case 0:
                return this.f31771c.d;
            default:
                return this.f31771c.d;
        }
    }
}
