package org.telegram.ui;

import android.content.Context;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class da extends EditTextBoldCursor {
    public final int f35196b;
    public final ea f35197c;

    public da(ea eaVar, Context context, int i10) {
        super(context);
        this.f35196b = i10;
        this.f35197c = eaVar;
    }

    @Override
    public final org.telegram.ui.ActionBar.c6 getResourcesProvider() {
        switch (this.f35196b) {
            case 0:
                return this.f35197c.d;
            default:
                return this.f35197c.d;
        }
    }
}
