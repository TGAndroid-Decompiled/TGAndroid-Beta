package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class dz extends org.telegram.ui.ActionBar.m2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(context, null);
        this.fragmentView = dw0Var;
        return dw0Var;
    }
}
