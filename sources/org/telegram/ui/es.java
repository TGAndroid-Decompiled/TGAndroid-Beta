package org.telegram.ui;

import android.view.ViewGroup;
public final class es extends org.telegram.ui.ActionBar.h1 {
    public final js f47303o;

    public es(js jsVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f47303o = jsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ns nsVar = this.f47303o.f49050a;
        nsVar.f50286k = null;
        nsVar.K = false;
        if (nsVar.R) {
            nsVar.m();
        }
    }
}
