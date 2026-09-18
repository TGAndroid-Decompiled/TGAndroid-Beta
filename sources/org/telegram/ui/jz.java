package org.telegram.ui;

import android.content.Context;
import android.view.View;
public abstract class jz extends org.telegram.ui.ActionBar.o2 {
    @Override
    public final View createView(Context context) {
        org.telegram.ui.Components.qv0 qv0Var = new org.telegram.ui.Components.qv0(context, null);
        this.fragmentView = qv0Var;
        return qv0Var;
    }
}
