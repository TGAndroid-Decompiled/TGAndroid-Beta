package org.telegram.ui;

import android.view.View;
public final class j60 extends v4.k {
    public final LanguageSelectActivity F;

    public j60(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(v4.d1 d1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f41244b.invalidate();
        org.telegram.ui.Components.pj0 pj0Var = languageSelectActivity.f41244b;
        int i7 = pj0Var.C1;
        if (i7 != -1 && (view = pj0Var.D1) != null) {
            pj0Var.k1(i7, view);
            pj0Var.invalidate();
        }
    }
}
