package org.telegram.ui;

import android.view.ViewGroup;
public final class es extends org.telegram.ui.ActionBar.g1 {
    public final js f46891o;

    public es(js jsVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f46891o = jsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ns nsVar = this.f46891o.f48406a;
        nsVar.f49655k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
    }
}
