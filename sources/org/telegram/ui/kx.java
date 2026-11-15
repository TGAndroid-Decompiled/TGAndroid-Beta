package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class kx extends org.telegram.ui.ActionBar.e2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.st0 st0Var = new org.telegram.ui.Components.st0(context, null);
        this.fragmentView = st0Var;
        return st0Var;
    }
}
