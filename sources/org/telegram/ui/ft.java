package org.telegram.ui;

import android.view.ViewGroup;
public final class ft extends org.telegram.ui.ActionBar.p1 {
    public final lt f34352o;

    public ft(lt ltVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f34352o = ltVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        pt ptVar = this.f34352o.f36133a;
        ptVar.f37523k = null;
        ptVar.K = false;
        if (ptVar.R) {
            ptVar.n();
        }
    }
}
