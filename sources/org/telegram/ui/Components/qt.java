package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class qt implements DialogInterface.OnShowListener {
    public final wt f37418a;

    public qt(wt wtVar) {
        this.f37418a = wtVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        wt wtVar = this.f37418a;
        l71 l71Var = wtVar.f40042j1;
        if (wtVar.M0() && l71Var.f()) {
            l71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
