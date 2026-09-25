package org.telegram.ui;

import android.view.View;
public final class o80 extends s4.j {
    public final LanguageSelectActivity F;

    public o80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f31096b.invalidate();
        org.telegram.ui.Components.wl0 wl0Var = languageSelectActivity.f31096b;
        int i10 = wl0Var.E1;
        if (i10 != -1 && (view = wl0Var.F1) != null) {
            wl0Var.i1(i10, view);
            wl0Var.invalidate();
        }
    }
}
