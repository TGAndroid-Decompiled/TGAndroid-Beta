package org.telegram.ui;

import android.view.ViewGroup;
public final class gt extends org.telegram.ui.ActionBar.o1 {
    public final mt f34038o;

    public gt(mt mtVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f34038o = mtVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        qt qtVar = this.f34038o.f35750a;
        qtVar.f36895k = null;
        qtVar.K = false;
        if (qtVar.R) {
            qtVar.n();
        }
    }
}
