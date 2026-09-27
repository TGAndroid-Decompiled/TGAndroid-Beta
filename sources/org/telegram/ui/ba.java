package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ba extends EditTextBoldCursor {
    public final int f32296b;
    public final ca f32297c;

    public ba(ca caVar, Context context, int i10) {
        super(context);
        this.f32296b = i10;
        this.f32297c = caVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.e6 getResourcesProvider() {
        switch (this.f32296b) {
            case 0:
                return this.f32297c.d;
            default:
                return this.f32297c.d;
        }
    }
}
