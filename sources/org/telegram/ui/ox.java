package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class ox extends org.telegram.ui.ActionBar.h2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.au0 au0Var = new org.telegram.ui.Components.au0(context, null);
        this.fragmentView = au0Var;
        return au0Var;
    }
}
