package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class r60 extends org.telegram.ui.ActionBar.h1 {
    public final ViewGroup f39046o;
    public final y60 f39047p;

    public r60(y60 y60Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f39047p = y60Var;
        this.f39046o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f39046o;
        y60 y60Var = this.f39047p;
        y60.a(y60Var, viewGroup);
        Runnable runnable = y60Var.f42369p;
        if (runnable != null) {
            runnable.run();
            y60Var.f42369p = null;
        }
    }
}
