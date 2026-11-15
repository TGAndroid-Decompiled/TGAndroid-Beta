package org.telegram.ui;

import android.view.View;
public final class i60 extends v4.k {
    public final LanguageSelectActivity F;

    public i60(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(v4.e1 e1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f42616b.invalidate();
        org.telegram.ui.Components.uj0 uj0Var = languageSelectActivity.f42616b;
        int i7 = uj0Var.D1;
        if (i7 != -1 && (view = uj0Var.E1) != null) {
            uj0Var.k1(i7, view);
            uj0Var.invalidate();
        }
    }
}
