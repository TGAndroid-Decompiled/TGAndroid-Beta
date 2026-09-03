package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class dz extends org.telegram.ui.ActionBar.p2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.pv0 pv0Var = new org.telegram.ui.Components.pv0(context, null);
        this.fragmentView = pv0Var;
        return pv0Var;
    }
}
