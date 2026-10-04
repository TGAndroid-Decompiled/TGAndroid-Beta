package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class hz extends org.telegram.ui.ActionBar.n2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.lw0 lw0Var = new org.telegram.ui.Components.lw0(context, null);
        this.fragmentView = lw0Var;
        return lw0Var;
    }
}
