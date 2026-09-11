package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class hz extends org.telegram.ui.ActionBar.n2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.ov0 ov0Var = new org.telegram.ui.Components.ov0(context, null);
        this.fragmentView = ov0Var;
        return ov0Var;
    }
}
