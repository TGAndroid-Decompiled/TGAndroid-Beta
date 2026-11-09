package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class lx extends org.telegram.ui.ActionBar.f2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.tt0 tt0Var = new org.telegram.ui.Components.tt0(context, null);
        this.fragmentView = tt0Var;
        return tt0Var;
    }
}
