package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class hz extends org.telegram.ui.ActionBar.n2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.bw0 bw0Var = new org.telegram.ui.Components.bw0(context, null);
        this.fragmentView = bw0Var;
        return bw0Var;
    }
}
