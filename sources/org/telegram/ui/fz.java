package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class fz extends org.telegram.ui.ActionBar.m2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.uw0 uw0Var = new org.telegram.ui.Components.uw0(context, null);
        this.fragmentView = uw0Var;
        return uw0Var;
    }
}
