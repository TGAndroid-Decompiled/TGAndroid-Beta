package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class fz extends org.telegram.ui.ActionBar.m2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.tw0 tw0Var = new org.telegram.ui.Components.tw0(context, null);
        this.fragmentView = tw0Var;
        return tw0Var;
    }
}
