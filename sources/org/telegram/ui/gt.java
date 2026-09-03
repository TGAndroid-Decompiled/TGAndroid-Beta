package org.telegram.ui;

import android.view.ViewGroup;
public final class gt extends org.telegram.ui.ActionBar.p1 {
    public final mt f37160o;

    public gt(mt mtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f37160o = mtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        qt qtVar = this.f37160o.f39067a;
        qtVar.f40656k = null;
        qtVar.K = false;
        if (qtVar.R) {
            qtVar.n();
        }
    }
}
