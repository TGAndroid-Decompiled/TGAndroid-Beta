package org.telegram.ui;

import android.view.ViewGroup;
public final class es extends org.telegram.ui.ActionBar.g1 {
    public final js f45439o;

    public es(js jsVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f45439o = jsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ns nsVar = this.f45439o.f47066a;
        nsVar.f48266k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
    }
}
