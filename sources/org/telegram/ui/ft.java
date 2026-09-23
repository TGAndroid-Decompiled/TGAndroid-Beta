package org.telegram.ui;

import android.view.ViewGroup;
public final class ft extends org.telegram.ui.ActionBar.n1 {
    public final lt f33364o;

    public ft(lt ltVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f33364o = ltVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        pt ptVar = this.f33364o.f35086a;
        ptVar.f36192k = null;
        ptVar.K = false;
        if (ptVar.R) {
            ptVar.n();
        }
    }
}
