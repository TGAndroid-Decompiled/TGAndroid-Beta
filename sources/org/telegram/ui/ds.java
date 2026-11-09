package org.telegram.ui;

import android.view.ViewGroup;
public final class ds extends org.telegram.ui.ActionBar.g1 {
    public final is f45111o;

    public ds(is isVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f45111o = isVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ms msVar = this.f45111o.f46750a;
        msVar.f47969k = null;
        msVar.K = false;
        if (msVar.R) {
            msVar.m();
        }
    }
}
