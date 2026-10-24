package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class aa extends EditTextBoldCursor {
    public final int f35715b;
    public final ba f35716c;

    public aa(ba baVar, Context context, int i10) {
        super(context);
        this.f35715b = i10;
        this.f35716c = baVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.g6 getResourcesProvider() {
        switch (this.f35715b) {
            case 0:
                return this.f35716c.d;
            default:
                return this.f35716c.d;
        }
    }
}
