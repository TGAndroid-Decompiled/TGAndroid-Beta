package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class bu implements DialogInterface.OnShowListener {
    public final hu f24879a;

    public bu(hu huVar) {
        this.f24879a = huVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        m81 m81Var = this.f24879a.f26812j1;
        if (jf0.f27345p0.P && m81Var.f()) {
            m81Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.l1(this, 2));
        }
    }
}
