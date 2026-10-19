package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class py extends org.telegram.ui.ActionBar.n2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.kw0 kw0Var = new org.telegram.ui.Components.kw0(context, null);
        this.fragmentView = kw0Var;
        return kw0Var;
    }
}
