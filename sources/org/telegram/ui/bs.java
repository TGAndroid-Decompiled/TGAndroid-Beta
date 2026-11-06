package org.telegram.ui;

import android.view.ViewGroup;
public final class bs extends org.telegram.ui.ActionBar.g1 {
    public final gs f44481o;

    public bs(gs gsVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f44481o = gsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ks ksVar = this.f44481o.f46087a;
        ksVar.f47280k = null;
        ksVar.K = false;
        if (ksVar.R) {
            ksVar.m();
        }
    }
}
