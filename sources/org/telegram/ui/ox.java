package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class ox extends org.telegram.ui.ActionBar.g2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.du0 du0Var = new org.telegram.ui.Components.du0(context, null);
        this.fragmentView = du0Var;
        return du0Var;
    }
}
