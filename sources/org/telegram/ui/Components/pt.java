package org.telegram.ui.Components;

import android.content.DialogInterface;
public final class pt implements DialogInterface.OnShowListener {
    public final vt f37073a;

    public pt(vt vtVar) {
        this.f37073a = vtVar;
    }

    @Override
    public final void onShow(DialogInterface dialogInterface) {
        vt vtVar = this.f37073a;
        l71 l71Var = vtVar.f39686j1;
        if (vtVar.M0() && l71Var.f()) {
            l71Var.getViewTreeObserver().addOnPreDrawListener(new org.telegram.ui.ActionBar.h1(this, 2));
        }
    }
}
