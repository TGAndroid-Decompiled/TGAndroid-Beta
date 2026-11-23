package org.telegram.ui;

import android.view.View;
public final class k60 extends v4.k {
    public final LanguageSelectActivity F;

    public k60(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(v4.f1 f1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f43106b.invalidate();
        org.telegram.ui.Components.ek0 ek0Var = languageSelectActivity.f43106b;
        int i7 = ek0Var.D1;
        if (i7 != -1 && (view = ek0Var.E1) != null) {
            ek0Var.k1(i7, view);
            ek0Var.invalidate();
        }
    }
}
