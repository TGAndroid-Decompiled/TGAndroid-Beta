package org.telegram.ui;

import android.view.ViewGroup;
public final class es extends org.telegram.ui.ActionBar.g1 {
    public final js f46907o;

    public es(js jsVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f46907o = jsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ns nsVar = this.f46907o.f48452a;
        nsVar.f49665k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
    }
}
