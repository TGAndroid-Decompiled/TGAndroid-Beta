package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class my extends org.telegram.ui.ActionBar.k2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.uu0 uu0Var = new org.telegram.ui.Components.uu0(context, null);
        this.fragmentView = uu0Var;
        return uu0Var;
    }
}
