package org.telegram.ui;

import android.view.ViewGroup;
public final class ht extends org.telegram.ui.ActionBar.n1 {
    public final nt f37174o;

    public ht(nt ntVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f37174o = ntVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        rt rtVar = this.f37174o.f39042a;
        rtVar.f40276k = null;
        rtVar.K = false;
        if (rtVar.R) {
            rtVar.n();
        }
    }
}
