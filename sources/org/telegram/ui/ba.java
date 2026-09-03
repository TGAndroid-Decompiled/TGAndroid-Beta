package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class ba extends EditTextBoldCursor {
    public final int f32803b;
    public final ca f32804c;

    public ba(ca caVar, Context context, int i10) {
        super(context);
        this.f32803b = i10;
        this.f32804c = caVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.f6 getResourcesProvider() {
        switch (this.f32803b) {
            case 0:
                return this.f32804c.d;
            default:
                return this.f32804c.d;
        }
    }
}
