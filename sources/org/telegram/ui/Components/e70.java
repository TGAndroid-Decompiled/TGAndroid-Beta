package org.telegram.ui.Components;

import android.view.View;
import android.view.ViewGroup;
public final class e70 extends org.telegram.ui.ActionBar.o1 {
    public final ViewGroup f27939o;
    public final j70 f27940p;

    public e70(j70 j70Var, View view, ViewGroup viewGroup) {
        super(view, -2, -2);
        this.f27940p = j70Var;
        this.f27939o = viewGroup;
    }

    @Override
    public final void dismiss() {
        d(true);
        ViewGroup viewGroup = this.f27939o;
        j70 j70Var = this.f27940p;
        j70.a(j70Var, viewGroup);
        Runnable runnable = j70Var.f29595p;
        if (runnable != null) {
            runnable.run();
            j70Var.f29595p = null;
        }
    }
}
