package org.telegram.ui;

import android.view.View;
public final class j60 extends v4.k {
    public final LanguageSelectActivity F;

    public j60(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(v4.f1 f1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f43061b.invalidate();
        org.telegram.ui.Components.ck0 ck0Var = languageSelectActivity.f43061b;
        int i7 = ck0Var.D1;
        if (i7 != -1 && (view = ck0Var.E1) != null) {
            ck0Var.k1(i7, view);
            ck0Var.invalidate();
        }
    }
}
