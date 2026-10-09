package org.telegram.ui;

import android.view.ViewGroup;
public final class ht extends org.telegram.ui.ActionBar.n1 {
    public final nt f38396o;

    public ht(nt ntVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f38396o = ntVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        rt rtVar = this.f38396o.f40360a;
        rtVar.f41495k = null;
        rtVar.K = false;
        if (rtVar.R) {
            rtVar.n();
        }
    }
}
