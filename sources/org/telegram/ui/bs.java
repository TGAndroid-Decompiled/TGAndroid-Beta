package org.telegram.ui;

import android.view.ViewGroup;
public final class bs extends org.telegram.ui.ActionBar.g1 {
    public final gs f44458o;

    public bs(gs gsVar, ViewGroup viewGroup) {
        super(viewGroup, -2, -2);
        this.f44458o = gsVar;
    }

    @Override
    public final void dismiss() {
        d(true);
        ks ksVar = this.f44458o.f46062a;
        ksVar.f47256k = null;
        ksVar.K = false;
        if (ksVar.R) {
            ksVar.m();
        }
    }
}
