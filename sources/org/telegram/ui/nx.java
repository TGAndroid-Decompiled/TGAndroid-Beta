package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class nx extends org.telegram.ui.ActionBar.g2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.cu0 cu0Var = new org.telegram.ui.Components.cu0(context, null);
        this.fragmentView = cu0Var;
        return cu0Var;
    }
}
