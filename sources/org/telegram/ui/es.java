package org.telegram.ui;

import android.view.ViewGroup;
public final class es extends org.telegram.ui.ActionBar.g1 {
    public final js f47376o;

    public es(js jsVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f47376o = jsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ns nsVar = this.f47376o.f49087a;
        nsVar.f50297k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
    }
}
