package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class jz extends org.telegram.ui.ActionBar.p2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.aw0 aw0Var = new org.telegram.ui.Components.aw0(context, null);
        this.fragmentView = aw0Var;
        return aw0Var;
    }
}
