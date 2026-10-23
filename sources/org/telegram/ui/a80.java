package org.telegram.ui;

import android.view.View;
public final class a80 extends s4.k {
    public final LanguageSelectActivity F;

    public a80(LanguageSelectActivity languageSelectActivity) {
        this.F = languageSelectActivity;
    }

    @Override
    public final void P(s4.b1 b1Var) {
        View view;
        LanguageSelectActivity languageSelectActivity = this.F;
        languageSelectActivity.f33155b.invalidate();
        org.telegram.ui.Components.jm0 jm0Var = languageSelectActivity.f33155b;
        int i10 = jm0Var.C1;
        if (i10 != -1 && (view = jm0Var.D1) != null) {
            jm0Var.i1(i10, view);
            jm0Var.invalidate();
        }
    }
}
