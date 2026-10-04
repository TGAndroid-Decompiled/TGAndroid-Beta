package org.telegram.ui;

import android.view.ViewGroup;
public final class ht extends org.telegram.ui.ActionBar.n1 {
    public final nt f37169o;

    public ht(nt ntVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f37169o = ntVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        rt rtVar = this.f37169o.f39037a;
        rtVar.f40271k = null;
        rtVar.K = false;
        if (rtVar.R) {
            rtVar.n();
        }
    }
}
