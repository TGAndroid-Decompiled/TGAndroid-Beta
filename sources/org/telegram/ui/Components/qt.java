package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class qt implements DialogInterface.OnShowListener {
    public final wt f37475a;

    public qt(wt wtVar) {
        this.f37475a = wtVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        wt wtVar = this.f37475a;
        m71 m71Var = wtVar.f40150j1;
        if (wtVar.M0() && m71Var.f()) {
            m71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
