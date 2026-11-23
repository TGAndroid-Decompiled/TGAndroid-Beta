package org.telegram.ui;

import android.view.ViewGroup;
public final class es extends org.telegram.ui.ActionBar.g1 {
    public final js f47332o;

    public es(js jsVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f47332o = jsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ns nsVar = this.f47332o.f49052a;
        nsVar.f50301k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
    }
}
