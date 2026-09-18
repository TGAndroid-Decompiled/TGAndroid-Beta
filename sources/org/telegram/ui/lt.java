package org.telegram.ui;

import android.view.ViewGroup;
public final class lt extends org.telegram.ui.ActionBar.o1 {
    public final qt f35624o;

    public lt(qt qtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f35624o = qtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ut utVar = this.f35624o.f37022a;
        utVar.f38212k = null;
        utVar.K = false;
        if (utVar.R) {
            utVar.n();
        }
    }
}
