package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class gx extends org.telegram.ui.ActionBar.d2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.qt0 qt0Var = new org.telegram.ui.Components.qt0(context, null);
        this.fragmentView = qt0Var;
        return qt0Var;
    }
}
