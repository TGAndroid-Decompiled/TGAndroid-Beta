package org.telegram.ui;

import android.view.View;
public final class g70 extends s4.j {
    public final LanguageSelectActivity F;

    public g70(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.c1 c1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f33349b.invalidate();
        org.telegram.ui.Components.uk0 uk0Var = languageSelectActivity.f33349b;
        int i10 = uk0Var.C1;
        if (i10 != -1 && (view = uk0Var.D1) != null) {
            uk0Var.k1(i10, view);
            uk0Var.invalidate();
        }
    }
}
