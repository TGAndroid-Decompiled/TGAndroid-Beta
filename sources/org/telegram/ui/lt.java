package org.telegram.ui;

import android.view.ViewGroup;
public final class lt extends org.telegram.ui.ActionBar.o1 {
    public final qt f35619o;

    public lt(qt qtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f35619o = qtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ut utVar = this.f35619o.f37017a;
        utVar.f38207k = null;
        utVar.K = false;
        if (utVar.R) {
            utVar.n();
        }
    }
}
