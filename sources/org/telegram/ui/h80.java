package org.telegram.ui;

import android.view.View;
public final class h80 extends s4.l {
    public final LanguageSelectActivity F;

    public h80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.e1 e1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f35542b.invalidate();
        org.telegram.ui.Components.nm0 nm0Var = languageSelectActivity.f35542b;
        int i10 = nm0Var.C1;
        if (i10 != -1 && (view = nm0Var.D1) != null) {
            nm0Var.l1(i10, view);
            nm0Var.invalidate();
        }
    }
}
