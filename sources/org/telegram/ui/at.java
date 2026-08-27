package org.telegram.ui;

import android.view.ViewGroup;

public final class at extends org.telegram.ui.ActionBar.n1 {

    public final ft f36634o;

    public at(ft ftVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f36634o = ftVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        kt ktVar = this.f36634o.f38203a;
        ktVar.f39867k = null;
        ktVar.K = false;
        if (ktVar.R) {
            ktVar.n();
        }
    }
}
