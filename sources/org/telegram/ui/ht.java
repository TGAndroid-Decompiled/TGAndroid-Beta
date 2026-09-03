package org.telegram.ui;

import android.view.ViewGroup;
public final class ht extends org.telegram.ui.ActionBar.p1 {
    public final nt f34749o;

    public ht(nt ntVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f34749o = ntVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        rt rtVar = this.f34749o.f36580a;
        rtVar.f38039k = null;
        rtVar.K = false;
        if (rtVar.R) {
            rtVar.n();
        }
    }
}
