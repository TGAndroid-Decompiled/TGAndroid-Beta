package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class ly extends org.telegram.ui.ActionBar.k2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.vu0 vu0Var = new org.telegram.ui.Components.vu0(context, null);
        this.fragmentView = vu0Var;
        return vu0Var;
    }
}
