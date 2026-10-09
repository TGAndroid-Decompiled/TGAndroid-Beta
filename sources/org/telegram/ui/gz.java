package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class gz extends org.telegram.ui.ActionBar.n2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.sw0 sw0Var = new org.telegram.ui.Components.sw0(context, null);
        this.fragmentView = sw0Var;
        return sw0Var;
    }
}
