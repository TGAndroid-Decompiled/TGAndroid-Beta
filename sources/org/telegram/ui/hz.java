package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class hz extends org.telegram.ui.ActionBar.n2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.mw0 mw0Var = new org.telegram.ui.Components.mw0(context, null);
        this.fragmentView = mw0Var;
        return mw0Var;
    }
}
