package org.telegram.ui;

import android.view.ViewGroup;
public final class bs extends org.telegram.ui.ActionBar.g1 {
    public final gs f44482o;

    public bs(gs gsVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f44482o = gsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ks ksVar = this.f44482o.f46088a;
        ksVar.f47281k = null;
        ksVar.K = false;
        if (ksVar.R) {
            ksVar.m();
        }
    }
}
