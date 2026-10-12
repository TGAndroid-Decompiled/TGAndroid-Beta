package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class iz extends org.telegram.ui.ActionBar.m2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.yw0 yw0Var = new org.telegram.ui.Components.yw0(context, null);
        this.fragmentView = yw0Var;
        return yw0Var;
    }
}
