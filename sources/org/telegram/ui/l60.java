package org.telegram.ui;

import android.view.View;
public final class l60 extends v4.k {
    public final LanguageSelectActivity F;

    public l60(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(v4.d1 d1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f41255b.invalidate();
        org.telegram.ui.Components.qj0 qj0Var = languageSelectActivity.f41255b;
        int i7 = qj0Var.C1;
        if (i7 != -1 && (view = qj0Var.D1) != null) {
            qj0Var.k1(i7, view);
            qj0Var.invalidate();
        }
    }
}
