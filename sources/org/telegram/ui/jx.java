package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class jx extends org.telegram.ui.ActionBar.f2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.rt0 rt0Var = new org.telegram.ui.Components.rt0(context, null);
        this.fragmentView = rt0Var;
        return rt0Var;
    }
}
