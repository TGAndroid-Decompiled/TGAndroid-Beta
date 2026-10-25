package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class py extends org.telegram.ui.ActionBar.r2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.vw0 vw0Var = new org.telegram.ui.Components.vw0(context, null);
        this.fragmentView = vw0Var;
        return vw0Var;
    }
}
